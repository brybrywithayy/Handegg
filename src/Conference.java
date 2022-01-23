package games.gainsay;

import java.util.List;

public class Conference {
    private String name;
    private String region;
    private int numberOfTeams = 4;
    private List<Team> teams;

    public Conference() {
        // this.name = build a method that inserts this (file)
        // this.region = need method to insert only specific ones (file)
        this.numberOfTeams = 4;
        // this.team = method to pull specific teams (LinkedList)
    }

    public Conference(String name, String region, int numberOfTeams, List<Team> teams) {
        this.name = name;
        this.region = region;
        this.numberOfTeams = numberOfTeams;
        this.teams = teams;

    }
}
