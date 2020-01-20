package com.assignment.GameOfCricket.model;

public class CricketGame {

    public Match setupGame(){
        Match match = new Match();
        return match;
    }

    public static int firstInningRuns = Integer.MAX_VALUE;
    public int teamScore(){
        return generateTeamScore();
    }

    private int generateTeamScore(){
        int runs = 0;
        int wicketsCount = 0;
        String[] scoreCheck= {"0","1","2","3","4","5","6","W"};
        for(int i=1;i<=300;i++){
            int rand = (int)(Math.random()*8);
            if(!scoreCheck[rand].equals("W")){
                runs+=Integer.parseInt(scoreCheck[rand]);
            }
            else{
                wicketsCount++;
            }
            if(wicketsCount==10)break;
            if(runs>firstInningRuns){
                break;
            }
        }
        firstInningRuns = runs;
        return runs;
    }
}
