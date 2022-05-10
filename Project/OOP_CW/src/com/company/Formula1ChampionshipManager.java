package com.company;
import java.io.*;
import java.util.*;
public class Formula1ChampionshipManager implements ChampionshipManager, Serializable{

    public ArrayList<Formula1Driver> arrDrivers = new ArrayList<>();

    public void menu(){
        System.out.println("                 Menu \n" +
                "1 - Insert New Driver \n" +
                "2 - Delete Driver \n" +
                "3 - Change Driver \n" +
                "4 - Display statistics for a Specific Driver \n" +
                "5 - Display the Formula 1 Driver Table \n" +
                "6 - Add a race \n" +
                "7 - Save Information \n" +
                "8 - Interface \n"+
                "9 - Exit");
    }


    //    Adds the Driver
    @Override
    public void newDriver(String driverName, String driverTeam, String location, int driverAge, int driverWeight, int firstPos, int secondPos, int thirdPos,
                          int driverSeasonPoints, int noOfRaces,String date) {
        Formula1Driver f1d = new Formula1Driver(driverName, driverTeam, location, driverAge, driverWeight, firstPos, secondPos, thirdPos, driverSeasonPoints, noOfRaces, date);
        arrDrivers.add(f1d);
    }

    //    Delete Driver
    @Override
    public void deleteDriver(String driverName) {

        for (int i = 0; i < arrDrivers.size(); i++) {
            if (arrDrivers.get(i).getDriverName().equals(driverName)) {
                arrDrivers.remove(i);
                System.out.println("Successfully Deleted");
            }
        }

    }

    //    change driver
    @Override
    public void changeDriver(String team, String newDriver) {

        for (int i = 0; i < arrDrivers.size(); i++) {
            if (arrDrivers.get(i).getDriverTeam().equals(team)) {
                arrDrivers.get(i).setName(newDriver);
                System.out.println("Successfully Changed");
            }
        }

    }

    //    Checks the statistics for a specific driver
    @Override
    public void statistics(String name) {
        System.out.println("\n"+"                   Drivers Information");

        for (int i = 0; i < arrDrivers.size(); i++) {
            if (arrDrivers.get(i).getDriverName().equals(name)) {
                System.out.println("Name: " + arrDrivers.get(i).getDriverName() + " \n" +
                        "Team: " + arrDrivers.get(i).getDriverTeam() + " \n" +
                        "Location: " + arrDrivers.get(i).getDriverLocation() + " \n" +
                        "Age: " + arrDrivers.get(i).getDriverAge() + " \n" +
                        "Weight: " + arrDrivers.get(i).getDriverWeight() + " \n" +
                        "No of 1st Positions: "+ arrDrivers.get(i).getFirstPosition() + " \n" +
                        "No of 2nd Positions: "+ arrDrivers.get(i).getSecondPosition() + " \n" +
                        "No of 3rd Positions: "+ arrDrivers.get(i).getThirdPosition() + " \n" +
                        "Total Season Points: "+ arrDrivers.get(i).getDriverSeasonPoints() + " \n" +
                        "No of Races: "+ arrDrivers.get(i).getNoOfRaces() + " \n");
            }
        }

    }

    //    Display the F1 Driver Table
    @Override
    public void driversTable() {

        System.out.printf("%s %20s %20s %8s %8s %15s %7s %7s %n", "Name", "TeamName"," Pos1"," Pos2", "Pos3", "SeasonPoints", "Races", "Date"," \n");

        arrDrivers.sort(Comparator.comparing(Formula1Driver::getDriverSeasonPoints).reversed());
        arrDrivers.sort(Comparator.comparing(Formula1Driver::getFirstPosition).reversed());

        for (int i = 0; i < arrDrivers.size(); i++) {
            System.out.printf("%s %15s %22d %7d %7d %15d %9d %16s %n", arrDrivers.get(i).getDriverName(), arrDrivers.get(i).getDriverTeam(),
                    arrDrivers.get(i).getFirstPosition(), arrDrivers.get(i).getSecondPosition(), arrDrivers.get(i).getThirdPosition(),
                    arrDrivers.get(i).getDriverSeasonPoints(), arrDrivers.get(i).getNoOfRaces(), arrDrivers.get(i).getDate()," \n");
        }
    }


    //    Add the positions and score of the drivers
    @Override
    public void addPoints(String racerName, int racerPosition, String date) {

        for (int i = 0; i < arrDrivers.size(); i++) {
            int raceNo = 1;
            if (arrDrivers.get(i).getDriverName().equals(racerName)) {
                if (racerPosition == 1) {
                    int addPoint = 25;
                    arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                    arrDrivers.get(i).setFirstPosition(racerPosition);
                    arrDrivers.get(i).setNoOfRaces(raceNo);
                    arrDrivers.get(i).setDate(date);
                } else if (racerPosition == 2) {
                    int addPoint = 18;
                    int secondPosPoint = 1;
                    arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                    arrDrivers.get(i).setSecondPosition(secondPosPoint);
                    arrDrivers.get(i).setNoOfRaces(raceNo);
                    arrDrivers.get(i).setDate(date);
                } else if (racerPosition == 3) {
                    int addPoint = 15;
                    int thirdPosPoint = 1;
                    arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                    arrDrivers.get(i).setThirdPosition(thirdPosPoint);
                    arrDrivers.get(i).setNoOfRaces(raceNo);
                    arrDrivers.get(i).setDate(date);
                } else if (racerPosition == 4) {
                    int addPoint = 12;
                    arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                    arrDrivers.get(i).setNoOfRaces(raceNo);
                    arrDrivers.get(i).setDate(date);
                } else if (racerPosition == 5) {
                    int addPoint = 10;
                    arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                    arrDrivers.get(i).setNoOfRaces(raceNo);
                    arrDrivers.get(i).setDate(date);
                } else if (racerPosition == 6) {
                    int addPoint = 8;
                    arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                    arrDrivers.get(i).setNoOfRaces(raceNo);
                    arrDrivers.get(i).setDate(date);
                } else if (racerPosition == 7) {
                    int addPoint = 6;
                    arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                    arrDrivers.get(i).setNoOfRaces(raceNo);
                    arrDrivers.get(i).setDate(date);
                } else if (racerPosition == 8) {
                    int addPoint = 4;
                    arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                    arrDrivers.get(i).setNoOfRaces(raceNo);
                    arrDrivers.get(i).setDate(date);
                } else if (racerPosition == 9) {
                    int addPoint = 2;
                    arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                    arrDrivers.get(i).setNoOfRaces(raceNo);
                    arrDrivers.get(i).setDate(date);
                } else if (racerPosition == 10) {
                    int addPoint = 1;
                    arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                    arrDrivers.get(i).setNoOfRaces(raceNo);
                    arrDrivers.get(i).setDate(date);
                }

            }
        }
    }

    //    Saving the Information stored
    @Override
    public void saveDriversData() {

        try{
            File save = new File("Data.txt");
            FileOutputStream fileOut = new FileOutputStream(save);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(arrDrivers);

            System.out.println("Successfully Saved \n");
            out.close();
            fileOut.close();

        }catch (Exception e){
            System.out.println("File not Found");
        }
    }

    //    Retrieve saved data
    @Override
    public void retrieveDriverData() {

        try {
            FileInputStream fileIn = new FileInputStream("Data.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<Formula1Driver> f = (ArrayList) in.readObject();

            for (int i = 0; i<f.size(); i++){
//                The info is saved in a new object and is added to the array
                Formula1Driver f2d = new Formula1Driver(f.get(i).getDriverName(),f.get(i).getDriverTeam(),f.get(i).getDriverLocation(),f.get(i).getDriverAge(),
                        f.get(i).getDriverWeight(),f.get(i).getFirstPosition(), f.get(i).getSecondPosition(), f.get(i).getThirdPosition(), f.get(i).getDriverSeasonPoints(),
                        f.get(i).getNoOfRaces(),f.get(i).getDate());
                arrDrivers.add(f2d);
            }

            in.close();
            fileIn.close();
        } catch (EOFException e){

        } catch ( IOException | ClassNotFoundException e) {
            System.out.println(e);
        }


    }
}