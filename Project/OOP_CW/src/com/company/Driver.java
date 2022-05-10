package com.company;

import java.io.Serializable;

public abstract class Driver implements Serializable {

    private String driverName;
    private String driverTeam;
    private String driverLocation;
    private int driverAge;
    private int driverWeight;

    public Driver(String driverName, String driverTeam, String location, int driverAge, int driverWeight) {
        this.driverName = driverName;
        this.driverTeam = driverTeam;
        this.driverLocation = location;
        this.driverAge = driverAge;
        this.driverWeight = driverWeight;
    }


    public String getDriverName() {
        return driverName;
    }

    public String getDriverTeam() {
        return driverTeam;
    }

    public String getDriverLocation() {
        return driverLocation;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public int getDriverWeight() {
        return driverWeight;
    }

    public void setName(String newName){
        this.driverName = newName;
    }


}
