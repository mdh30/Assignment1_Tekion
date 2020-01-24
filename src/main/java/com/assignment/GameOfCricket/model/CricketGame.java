package com.assignment.GameOfCricket.model;

import java.util.HashMap;

public class CricketGame {

    public Match setupGame(){
        Match match = new Match();
        return match;
    }

    public static int firstInningRuns = Integer.MAX_VALUE;
    public static int teamRuns = 0;

    public int generateTeamScore(boolean first,HashMap<Integer,Player> firstTeam, HashMap<Integer,Player> secondTeam) {
        int runs = 0;
        int wicketsCount = 0;
        int playerScore = 0;
        int ballsPlayed = 1;
        int boundaries = 0;
        int bowlerCount = 0;
        int overRuns = 0;
        int bowlerWickets = 0;
        String[] scoreCheck = {"0", "1", "2", "3", "4", "5", "6", "W"};

        if (!(secondTeam.containsKey(0) && secondTeam.containsKey(1) && secondTeam.containsKey(2) && secondTeam.containsKey(3)
                && secondTeam.containsKey(4))){
            secondTeam.put(0, new Player());
        secondTeam.put(1, new Player());
        secondTeam.put(2, new Player());
        secondTeam.put(3, new Player());
        secondTeam.put(4, new Player());
    }

        for(int i=1;i<=300;i++){
            int rand = (int)(Math.random()*8);
            if(!scoreCheck[rand].equals("W")){
                runs+=Integer.parseInt(scoreCheck[rand]);
                overRuns += Integer.parseInt(scoreCheck[rand]);
                playerScore += Integer.parseInt(scoreCheck[rand]);
                ballsPlayed++;
                if(scoreCheck[rand].equals("4") || scoreCheck[rand].equals("6")){
                    boundaries += 1;
                }
            }
            else{
                if(!firstTeam.containsKey(wicketsCount)){
                    firstTeam.put(wicketsCount,new Player());
                }
                firstTeam.get(wicketsCount).setScore(playerScore);
                firstTeam.get(wicketsCount).setBallsPlayed(ballsPlayed);
                firstTeam.get(wicketsCount).setBoundaries(boundaries);

                wicketsCount++;
                playerScore = 0;
                boundaries = 0;
                ballsPlayed = 1;
                bowlerWickets++;

            }
            if(i%6==0){
               float mapOverValue = secondTeam.get(bowlerCount%5).getNoOfOvers();
                secondTeam.get(bowlerCount%5).setNoOfOvers(mapOverValue+1);
                secondTeam.get(bowlerCount%5).setRunsGiven(secondTeam.get(bowlerCount%5).getRunsGiven() + overRuns);
                bowlerCount++;
                if(overRuns==0){
                    secondTeam.get(bowlerCount%5).setMaidenOvers(secondTeam.get(bowlerCount%5).getMaidenOvers()+1);
                }
                secondTeam.get(bowlerCount%5).setWicketsTaken(secondTeam.get(bowlerCount%5).getWicketsTaken()+bowlerWickets);
                overRuns = 0;
                bowlerWickets = 0;

            }
            if(wicketsCount==10 || (!first && runs>firstInningRuns)){
                secondTeam.get(bowlerCount%5).setNoOfOvers(secondTeam.get(bowlerCount%5).getNoOfOvers()+(float)(i%6)/10);
                secondTeam.get(bowlerCount%5).setRunsGiven(secondTeam.get(bowlerCount%5).getRunsGiven()+overRuns);
                secondTeam.get(bowlerCount%5).setWicketsTaken(secondTeam.get(bowlerCount%5).getWicketsTaken()+bowlerWickets);
                break;
            }
        }

        firstInningRuns = runs;
        teamRuns = runs;
        return runs;
    }

}
