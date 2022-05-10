package com.company;

public interface ChampionshipManager{

    void newDriver(String driverName, String driverTeam, String location, int driverAge, int driverWeight, int firstPosition, int secondPosition,
                   int thirdPosition,int driverSeasonPoints,int noOfRaces,String date);

    void deleteDriver(String driverName);

    void changeDriver(String oldDriver, String newDriver);

    void statistics(String name);

    void driversTable();

    void addPoints(String racerName, int racerPosition, String date);

    void saveDriversData();

    void retrieveDriverData();
}
