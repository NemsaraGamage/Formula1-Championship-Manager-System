package com.company;

import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UI extends JFrame implements ActionListener {

    Formula1ChampionshipManager f1 ;

    JButton addRace;

    DefaultTableModel modle;
    JTable table;
    TableRowSorter sorter;

    JTextField txt;
    JButton searchBtn;

    JButton datebtn;

    public UI(Formula1ChampionshipManager f1c){
        f1 = f1c;

//        ---------------------------------------ArrayList---------------------------------------
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new GridLayout());
        tablePanel.setBounds(0,0,900,250);

        String columNames[] = {"Name","Team","Location","Age","Weight","1stPlace","2ndPlace","3rdPlace","SeasonPoints","Races","Date"};

        modle = new DefaultTableModel(columNames, 0);
        fillIn(modle);

        table = new JTable(modle);

         //        Table sorter
        sorter = new TableRowSorter<>(modle);
        table.setRowSorter(sorter);

        JScrollPane scroll = new JScrollPane(table);
        tablePanel.add(scroll);


//        ---------------------------------------search Record---------------------------------------
        JPanel searchPanel = new JPanel();
        searchPanel.setBounds(0,300,300,40);

        txt = new JTextField(17);

        searchBtn = new JButton();
        searchBtn.addActionListener(this);
        searchBtn.setText("Search");
        searchBtn.setFocusable(false);

        searchPanel.add(txt);
        searchPanel.add(searchBtn);


//        ---------------------------------------Race Add button---------------------------------------
        JPanel addRacePanel = new JPanel();
        addRacePanel.setBounds(0,380,200,40);

        JLabel lab = new JLabel("Race: ");

        addRace = new JButton();
        addRace.addActionListener(this);
        addRace.setText("Add Race");
        addRace.setFocusable(false);

        addRacePanel.add(lab);
        addRacePanel.add(addRace);

//        ---------------------------------------sort date using button---------------------------------------
        JPanel datePanel = new JPanel();
        datePanel.setBounds(0,450,200,40);

        JLabel lab2 = new JLabel("Sort: ");

        datebtn = new JButton();
        datebtn .addActionListener(this);
        datebtn .setText("Date");
        datebtn .setFocusable(false);

        datePanel.add(lab2);
        datePanel.add(datebtn);

//        ---------------------------------------Default---------------------------------------
        setTitle("Menu");
        setSize(910,550);
        setLayout(null);
        setResizable(false);

//        Adding the panels
        add(tablePanel);
        add(searchPanel);
        add(addRacePanel);
        add(datePanel);

//        All the components will be visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        generating a random race
        if (e.getSource() == addRace) {
            Random rand = new Random();

            ArrayList<String> driverNameCopy = new ArrayList<>();
            for (int i = 0; i < f1.arrDrivers.size(); i++) {
                driverNameCopy.add(f1.arrDrivers.get(i).getDriverName());
            }

            int minYear = 2021;
            int maxYear = 3000;

            int minMonth = 1;
            int maxMonth = 12;

            int minDay = 1;
            int maxDay = 31;

            int yearInt = rand.nextInt(maxYear-minYear)+minYear;
            int monthInt = rand.nextInt(maxMonth-minMonth)+minMonth;
            int  dayInt = rand.nextInt(maxDay-minDay)+minDay;

            String year = String.valueOf(yearInt);
            String month = String.valueOf(monthInt);
            String day = String.valueOf(dayInt);

            int racerName = rand.nextInt(driverNameCopy.size());
            int racerPosition = rand.nextInt(10) + 1;


            for (int i = 0; i < f1.arrDrivers.size(); i++) {

                int raceNo = 1;
                if (f1.arrDrivers.get(i).getDriverName().equals(driverNameCopy.get(racerName))) {

                    if (racerPosition == 1) {
                        int addPoint = 25;
                        f1.arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                        f1.arrDrivers.get(i).setFirstPosition(racerPosition);
                        f1.arrDrivers.get(i).setNoOfRaces(raceNo);
                        f1.arrDrivers.get(i).setDate(day+"/"+month+"/"+year);
                    } else if (racerPosition == 2) {
                        int addPoint = 18;
                        int secondPosPoint = 1;
                        f1.arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                        f1.arrDrivers.get(i).setSecondPosition(secondPosPoint);
                        f1.arrDrivers.get(i).setNoOfRaces(raceNo);
                        f1.arrDrivers.get(i).setDate(day+"/"+month+"/"+year);
                    } else if (racerPosition == 3) {
                        int addPoint = 15;
                        int thirdPosPoint = 1;
                        f1.arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                        f1.arrDrivers.get(i).setThirdPosition(thirdPosPoint);
                        f1.arrDrivers.get(i).setNoOfRaces(raceNo);
                        f1.arrDrivers.get(i).setDate(day+"/"+month+"/"+year);
                    } else if (racerPosition == 4) {
                        int addPoint = 12;
                        f1.arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                        f1.arrDrivers.get(i).setNoOfRaces(raceNo);
                        f1.arrDrivers.get(i).setDate(day+"/"+month+"/"+year);
                    } else if (racerPosition == 5) {
                        int addPoint = 10;
                        f1.arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                        f1.arrDrivers.get(i).setNoOfRaces(raceNo);
                        f1.arrDrivers.get(i).setDate(day+"/"+month+"/"+year);
                    } else if (racerPosition == 6) {
                        int addPoint = 8;
                        f1.arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                        f1.arrDrivers.get(i).setNoOfRaces(raceNo);
                        f1.arrDrivers.get(i).setDate(day+"/"+month+"/"+year);
                    } else if (racerPosition == 7) {
                        int addPoint = 6;
                        f1.arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                        f1.arrDrivers.get(i).setNoOfRaces(raceNo);
                        f1.arrDrivers.get(i).setDate(day+"/"+month+"/"+year);
                    } else if (racerPosition == 8) {
                        int addPoint = 4;
                        f1.arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                        f1.arrDrivers.get(i).setNoOfRaces(raceNo);
                        f1.arrDrivers.get(i).setDate(day+"/"+month+"/"+year);
                    } else if (racerPosition == 9) {
                        int addPoint = 2;
                        f1.arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                        f1.arrDrivers.get(i).setNoOfRaces(raceNo);
                        f1.arrDrivers.get(i).setDate(day+"/"+month+"/"+year);
                    } else if (racerPosition == 10) {
                        int addPoint = 1;
                        f1.arrDrivers.get(i).setDriverSeasonPoints(addPoint);
                        f1.arrDrivers.get(i).setNoOfRaces(raceNo);
                        f1.arrDrivers.get(i).setDate(day+"/"+month+"/"+year);
                    }
                }
            }

            fillIn(modle);
        }

//        Check the table of a record
        else if(e.getSource() == searchBtn){
            String input = txt.getText();
            sorter.setRowFilter(RowFilter.regexFilter(input));
        }

//        Sort by date
        else if(e.getSource() ==  datebtn){
            table.getRowSorter().toggleSortOrder(10);
        }

    }



//    To fill in the table
    public void fillIn(DefaultTableModel model){

        model.setRowCount(0);

        for (Formula1Driver driver:f1.arrDrivers) {
            model.addRow(new Object[] {
                    driver.getDriverName(),
                    driver.getDriverTeam(),
                    driver.getDriverLocation(),
                    driver.getDriverAge(),
                    driver.getDriverWeight(),
                    driver.getFirstPosition(),
                    driver.getSecondPosition(),
                    driver.getThirdPosition(),
                    driver.getDriverSeasonPoints(),
                    driver.getNoOfRaces(),
                    driver.getDate()
            });
        }
    }

}
