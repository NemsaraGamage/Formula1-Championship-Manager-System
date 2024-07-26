# **Formula 1 Championship Manager**

## Overview

This Java program simulates the manipulation of a Formula 1 racing car championship. It includes functionalities to manage drivers, constructors, races, and various statistics through a text-based console interface and a graphical user interface (GUI) using Java Swing.

## Features

1. **Driver Management:**
   - **Create New Driver:** Add a new driver associated with a unique constructor team.
   - **Delete Driver:** Remove a driver and their associated team.
   - **Change Driver:** Replace a driver for an existing constructor team.
   - **Driver Statistics:** Display detailed statistics for a selected driver.

2. **Race Management:**
   - **Add Race:** Record a completed race with its date and driver positions. Updates statistics and championship table.
   - **Random Race Generation:** Generate random races with random positions or probabilistic outcomes based on starting positions.

3. **Statistics and Table Display:**
   - **Driver Table:** Display all drivers in descending order of points, with options to sort by points or number of first positions.
   - **Race History:** View all completed races sorted by date.
   - **Driver Race Participation:** Search for all races a specific driver participated in.

4. **Data Persistence:**
   - **Save and Load Data:** Save all information to a file and recover the previous state upon restarting the application.

5. **GUI:**
   - **Swing Interface:** Provides functionalities to display driver tables, sort by different criteria, generate random races, and manage races and driver statistics interactively.

## Class Details

### Driver (Abstract Class)
- Holds driver information including name, location, team, and race statistics.
- Subclass `Formula1Driver` includes additional statistics like race positions, points, and number of races participated.

### Formula1ChampionshipManager
- Implements the `ChampionshipManager` interface.
- Manages drivers, teams, and races.
- Provides console-based menu options and interacts with the GUI for various functionalities.

## How to Run

1. **Compile and Run:**
   - Ensure you have Java installed.
   - Compile the program using `javac`:
     ```sh
     javac Formula1ChampionshipManager.java Driver.java Formula1Driver.java
     ```
   - Run the program using `java`:
     ```sh
     java Formula1ChampionshipManager
     ```

2. **GUI Launch:**
   - Use the console menu to launch the GUI and interact with the graphical interface.
