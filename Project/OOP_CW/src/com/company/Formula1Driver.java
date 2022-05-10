package com.company;

import java.io.Serializable;

public class Formula1Driver extends Driver implements Serializable {

    private int firstPosition ;
    private int secondPosition;
    private int thirdPosition;
    private int driverSeasonPoints;
    private int noOfRaces;
    private String date;



    public Formula1Driver(String driverName, String driverTeam, String location, int driverAge, int driverWeight, int firstPosition, int secondPosition,
                          int thirdPosition, int driverSeasonPoints,int noOfRaces,String date){
        super(driverName, driverTeam, location, driverAge, driverWeight);
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.thirdPosition = thirdPosition;
        this.driverSeasonPoints = driverSeasonPoints;
        this.noOfRaces = noOfRaces;
        this.date = date;
    }

//    1st Position
    public void setFirstPosition(int racerPosition){
        this.firstPosition += racerPosition;
    }

    public int getFirstPosition() {
        return firstPosition;
    }

//    Second Position
    public void setSecondPosition(int secondPosPoint){
        this.secondPosition += secondPosPoint;
    }

    public int getSecondPosition() {
        return secondPosition;
    }

//    Third position
    public void setThirdPosition(int thirdPosPoint){
        this.thirdPosition += thirdPosPoint;
    }

    public int getThirdPosition() {
        return thirdPosition;
    }

//    Total season points
    public void setDriverSeasonPoints(int addPoint) {
        this.driverSeasonPoints += addPoint;
    }
    
    public int getDriverSeasonPoints () {
        return driverSeasonPoints ;
    }

//    number of race
    public void setNoOfRaces(int raceNo){
        this.noOfRaces += raceNo;
    }

    public int getNoOfRaces(){
        return noOfRaces;
    }

//    Date of race
    public void setDate(String raceDate){
        this.date = raceDate;
    }

    public String getDate(){
        return date;
    }

}
