package com.gainsay;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

// is abstract to force subclass only object creation
// also helps enforce factory method which works through the subclass constructors
public abstract class Player {

    private String name;
    private String college;
    protected PlayerPositionType position;
    private int age;
    protected int speed;
    protected int strength;
    protected int stamina;
    protected int tackling;
    protected int blocking;
    protected int catching;
    protected int agility;
    protected int throwing;
    protected int kicking;

    private List<String> playerNames = retrieveDataFromFile("//home//bryan//Documents//Gainsay//Handegg" +
                                                            "//fileIO//player_names.txt");
    private List<String> collegeNames = retrieveDataFromFile("//home//bryan//Documents//Gainsay//Handegg" +
                                                             "//fileIO//college_names.txt");

    // default constructor that subtypes will call to automate player object creation
    public Player() {
        this.name = generateRandomName(playerNames.size(), 0, playerNames);
        this.college = generateRandomName(collegeNames.size(), 0, collegeNames);
        this.age = generateRandomInt(45, 18);
    }

    // allows manual entry of custom Player objects from subclasses
    public Player(String name, String college, PlayerPositionType position, int age, int speed,
                  int strength, int stamina, int catching, int blocking, int tackling,
                  int agility, int throwing, int kicking) {
        this.name = name;
        this.college = college;
        this.position = position;
        this.age = validateAttribute(age, 45, 18);
        this.speed = validateAttribute(speed);
        this.strength = validateAttribute(strength);
        this.stamina = validateAttribute(stamina);
        this.tackling = validateAttribute(tackling);
        this.blocking = validateAttribute(blocking);
        this.catching = validateAttribute(catching);
        this.agility = validateAttribute(agility);
        this.throwing = validateAttribute(throwing);
        this.kicking = validateAttribute(kicking);
    }

    // establishes range for player stats and catches values out of range within constructor
    private static int validateAttribute(int testAttribute, int max, int min) {
        if (testAttribute >= min && testAttribute <= max) {
            return testAttribute;
        } else {
            System.out.println("attribute out of range " + max + " - " + min + " reset to 0");
            return 0;
        }
    }

    // overwritten, handles all attributes where values do not need to be in a more specific range
    private static int validateAttribute(int testAttribute) {
        if (testAttribute >= 0 && testAttribute <= 100) {
            return testAttribute;
        } else {
            System.out.println("attribute out of range (0 - 100) reset to 0");
            return 0;
        }
    }

    // Pulls from the nameLists and gets random index
    private String generateRandomName(int max, int min, List<String> nameList) {
        int randomIndex = generateRandomInt(max, min);
        return nameList.get(randomIndex);
    }

    // TODO remember to run this method on initialization otherwise no data will be drawn
    // retrieves raw name lists and inputs into arrays within this class
    private List<String> retrieveDataFromFile(String filePath) {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        List<String> nameList = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            nameList = new LinkedList<>();
            String currentLine;

            // iterate through the document
            while ((currentLine = bufferedReader.readLine()) != null) {
                nameList.add(currentLine);
            }
        } catch (IOException e) {
            System.out.println("Error reading file. Path may be incorrect.");
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return nameList;
    }

    // many random generators in the code rely on this method
    public static int generateRandomInt(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }

    @Override
    public String toString() {
        return "Player{" +
               "name='" + name + '\'' +
               ", college='" + college + '\'' +
               ", age=" + age;
    }

    // TODO increment player age and add seasons played += 1
    // TODO abstract methods that govern player behavior

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

    public PlayerPositionType getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public int getTackling() {
        return tackling;
    }

    public int getBlocking() {
        return blocking;
    }

    public int getCatching() {
        return catching;
    }

    public int getAgility() {
        return agility;
    }

    public int getThrowing() {
        return throwing;
    }

    public int getKicking() {
        return kicking;
    }
}
