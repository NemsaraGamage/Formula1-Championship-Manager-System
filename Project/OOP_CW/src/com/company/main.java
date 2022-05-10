package com.company;
import java.util.*;

public class main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        Formula1ChampionshipManager f1 = new Formula1ChampionshipManager();

//        loads the saved info
        f1.retrieveDriverData();

        while (true){

//            Importing the Menu
            f1.menu();

            System.out.print("Enter option: ");
            String option = input.next();


//            checks if the input is Valid
            try {
                int x = Integer.parseInt(option);

                if (x >= 10){
                    System.out.println("Invalid Option \n");
                }

            }catch (NumberFormatException e){
                System.out.println("Invalid Option \n");
            }

//            Used to create a new driver
            if (option.equals("1")) {
                System.out.println(" \n"+"                New Driver");

                System.out.print("Enter Drivers Name: ");
                String name = input.next();

                System.out.print("Enter teamName: ");
                String teamName = input.next();

                System.out.print("Enter Location: ");
                String location = input.next();

                System.out.print("Enter Age: ");
                int age= input.nextInt();

                System.out.print("Enter Weight: ");
                int weight = input.nextInt();

                String defaultDate = "00/00/0000";

                f1.newDriver(name,teamName,location, age, weight, 0,0,0,0,0, defaultDate);
                System.out.println("Sucessfully Added \n"+" ");
            }

//            Used to delete a driver
            else if (option.equals("2")) {
                System.out.println(" \n"+"                Delete Driver");

                System.out.print("Name of the driver to Delete: ");
                String deleteName = input.next();

                f1.deleteDriver(deleteName);
                System.out.println(" ");
            }

//            Change Driver
            else if (option.equals("3")) {
                System.out.println(" \n"+"                Change Driver");

                System.out.print("Enter team Name: ");
                String team = input.next();

                System.out.print("Enter New Driver Names: ");
                String newDriver = input.next();

                f1.changeDriver(team,newDriver);
                System.out.println(" ");
            }

//            Display the statistics of a driver
            else if (option.equals("4")) {
                System.out.println(" \n"+"                Display statistics");

                System.out.print("Enter Name of the driver: ");
                String name = input.next();

                f1.statistics(name);
                System.out.println(" ");
            }

//            Displays all the drivers
            else if (option.equals("5")) {
                System.out.println(" \n"+"                                  F1 Driver Table");

                f1.driversTable();
                System.out.println(" ");
            }


//            Adding the race information
            else if (option.equals("6")) {
                System.out.println(" \n"+"               Add Race");

                while (true){
                    System.out.print("Enter Racers Name: ");
                    String racerName = input.next();

                    System.out.print("Enter Racers Position: ");
                    int racerPosition = input.nextInt();

                    System.out.print("Enter Date Of Race(DD/MM/YYYY): ");
                    String date = input.next();

                    f1.addPoints(racerName,racerPosition,date);

                    System.out.println(" ");

                    System.out.print("Would you like to add again(Y/N): ");
                    String ask = input.next();

                    if (ask.equals("y") || ask.equals("Y")){
                        System.out.println(" ");
                        continue;
                    }else {
                        break;
                    }
                }
                System.out.println(" ");
            }

//            Saving the information
            else if (option.equals("7")) {
                f1.saveDriversData();

                System.out.println(" ");
            }


//            opens the UI
            else if (option.equals("8")){
                UI ui = new UI(f1);
                System.out.println(" ");
            }

//            Exits the program
            else if (option.equals("9")){
                System.exit(0);
            }

        }

    }
}
