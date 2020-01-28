package com.assignment.GameOfCricket.model;

public class CricketGame {

    public Match setupGame(){
        return new Match();
    }

    public static int firstInningRuns = Integer.MAX_VALUE;
    public static int teamRuns = 0;

    private static String[] scoreCheck = {"0", "1", "2", "3", "4", "5", "6", "W"};
    private static int [] high={65,20,10,5,8,4,6,3};
    private static int [] good={60,7,5,2,6,2,4,8};
    private static int [] bad={80,12,5,2,4,2,2,12};

    private int ballResult(int[] freq)
    {
        int[] prefix =new int[8];
        int i;
        prefix[0] = freq[0];
        for (i = 1; i < 8; ++i)
            prefix[i] = prefix[i - 1] + freq[i];

        int r = (int)(Math.random() * prefix[7]);


        int indexc = findCeil(prefix, r, 0, 7);
        return indexc;
    }

    private int findCeil(int[] arr, int r, int l, int h)
    {
        int mid;
        while (l < h)
        {
            mid = l + ((h - l) >> 1);
            if(r > arr[mid])    l = mid + 1;
            else h = mid;
        }
        return (arr[l] >= r) ? l : -1;
    }

    private int ballDelivery(int rating){
        if(rating>=80){
            return ballResult(high);
        }
        else if(rating>=60){
            return ballResult(good);
        }
            return ballResult(bad);

    }
    public int generateTeamScore(boolean first,Player[] firstTeam, Player[] secondTeam) {
        int runs = 0;
        int wicketsCount = 0;
        int playerScore = 0;
        int ballsPlayed = 1;
        int boundaries = 0;
        int bowlerCount = 0;
        int overRuns = 0;
        int bowlerWickets = 0;
        String[] scoreCheck = {"0", "1", "2", "3", "4", "5", "6", "W"};

        for(int i=1;i<=300;i++){

            int rand = ballDelivery(firstTeam[wicketsCount].getPlayerRating());
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
                firstTeam[wicketsCount].setScore(playerScore);
                firstTeam[wicketsCount].setBallsPlayed(ballsPlayed);
                firstTeam[wicketsCount].setBoundaries(boundaries);

                wicketsCount++;
                playerScore = 0;
                boundaries = 0;
                ballsPlayed = 1;
                bowlerWickets++;

            }
            if(i%6==0){

                float mapOverValue = secondTeam[bowlerCount%5].getNoOfOvers();
                secondTeam[bowlerCount%5].setNoOfOvers(mapOverValue+1);
                secondTeam[bowlerCount%5].setRunsGiven(secondTeam[bowlerCount%5].getRunsGiven() + overRuns);
                bowlerCount++;
                if(overRuns==0){
                    secondTeam[bowlerCount%5].setMaidenOvers(secondTeam[bowlerCount%5].getMaidenOvers()+1);
                }
                secondTeam[bowlerCount%5].setWicketsTaken(secondTeam[bowlerCount%5].getWicketsTaken()+bowlerWickets);
                overRuns = 0;
                bowlerWickets = 0;

            }
            if(wicketsCount==10 || (!first && runs>firstInningRuns)){
                secondTeam[bowlerCount%5].setNoOfOvers(secondTeam[bowlerCount%5].getNoOfOvers()+(float)(i%6)/10);
                secondTeam[bowlerCount%5].setRunsGiven(secondTeam[bowlerCount%5].getRunsGiven()+overRuns);
                secondTeam[bowlerCount%5].setWicketsTaken(secondTeam[bowlerCount%5].getWicketsTaken()+bowlerWickets);
                break;
            }
        }

        firstInningRuns = runs;
        teamRuns = runs;
        return runs;
    }
}
