package com.assignment.GameOfCricket.model;

public class Player extends Team{

    //Player for further enhancements
    private String name;
    private int age;
    private String playingRole;
    private int score;
    private int wickets;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPlayingRole(String playingRole){
        this.playingRole = playingRole;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPlayingRole(){
        return playingRole;
    }

    public void setScore(int scores){
        this.score = scores;
    }

    public void setWickets(int wickets){
        this.wickets = wickets;
    }

}
