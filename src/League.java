package games.gainsay;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class League implements DataTransfer {
    private String name;
    private int seasonYear;
    private List<Conference> league;
    private int seasonsCompleted;

    public League() {
        this.name = "Intergalactic Technically Collegiate Handegg";
        this.seasonYear = 2021;  // will increment
        this.league = new LinkedList<>();  // will automate
        this.seasonsCompleted = 0;  // will increment
    }

    public League(String name, int seasonYear, List<Conference> league, int seasonsCompleted) {
        this.name = name;
        this.seasonYear = seasonYear;
        this.league = new ArrayList<>();
        this.seasonsCompleted = seasonsCompleted;
    }

    // TODO remember to run this method on initialization otherwise no data will be drawn
    // retrieves raw name lists and inputs into arrays within this class
    public List<String> retrieveDataFromFile(String filePath) {
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

    @Override
    public void saveDataToFile(List<Object> objectList) {

    }

    public String getName() {
        return name;
    }

    public int getSeasonYear() {
        return seasonYear;
    }

    public List<Conference> getLeague() {
        return league;
    }

    public int getSeasonsCompleted() {
        return seasonsCompleted;
    }
}
