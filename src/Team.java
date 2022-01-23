package games.gainsay;

import java.util.LinkedList;
import java.util.List;

// type parameters restrict team roster to only player objects
// must be from subclasses because player is abstract
public class Team {

    private String name;
//    private String city;
    private String stadium;
    private List<Player> roster;
    private int gamesPlayed;
    private int wins;
    private int losses;

    // used to generate teams automatically
    public Team() {
        // this.name = pull from file
        // this.stadium = pull from file
        this.roster = new LinkedList<>();
        this.gamesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
    }

    // manual entry of new Teams
    public Team(String name, String stadium, List<Player> roster) {
        this.name = name;
        this.stadium = stadium;
        this.roster = roster;
        this.gamesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
    }

    private boolean validateNewPlayer(Player player) {
        if (roster.contains(player)) {
            System.out.println(player.getName() + " is a duplicate entry");
            return false;
        } else {
            System.out.println(player.getName() + " added successfully");
            return true;
        }
    }

    // uses roster count and validation methods to get number of players needed at a given
    // position and generate them
    public void createNewPlayer(PlayerPositionType position, int min, int max) {
        int currentPlayersAtPosition = countNumPlayersAtPosition(position);

        if (!validatePlayersPerPosition(currentPlayersAtPosition, min, max)) {
            int playersNeeded = currentPlayersAtPosition - min;
            Player newPlayer = PlayerFactory.buildPlayer(position);
            for (int i=0; i<playersNeeded; i++) {
                while (validateNewPlayer(newPlayer)) {
                    roster.add(newPlayer);
                }
            }
        }
    }

    // check roster to count number of players per position
    private int countNumPlayersAtPosition(PlayerPositionType position) {
        int numPlayersAtPosition = 0;

        for (Player currentPlayer : roster) {
            if (currentPlayer.getPosition() == position) {
                numPlayersAtPosition += 1;
            }
        }

        return numPlayersAtPosition;
    }

    // validation for number of players at each position
    private boolean validatePlayersPerPosition(int numAtPosition, int min, int max) {
        if (numAtPosition >= min && numAtPosition <= max) {
            return true;
        } else {
            System.out.println("Number of players at position exceeds allowed range (" + min +
                               "-" + max + ")");
            return false;
        }
    }

    // get total count per position and validate in 1 method
    private boolean checkRosterPositionsFilled(PlayerPositionType position) {
        int numPlayersAtPosition = countNumPlayersAtPosition(position);

        if (position == PlayerPositionType.LEADER) {
            validatePlayersPerPosition(numPlayersAtPosition, 1, 2);
        } else if (position == PlayerPositionType.SCORER) {
            validatePlayersPerPosition(numPlayersAtPosition, 5, 12);
        } else if (position == PlayerPositionType.BLOCKER) {
            validatePlayersPerPosition(numPlayersAtPosition, 5, 8);
        } else if (position == PlayerPositionType.KICKER) {
            validatePlayersPerPosition(numPlayersAtPosition, 1, 1);
        } else if (position == PlayerPositionType.DEFENDER) {
            validatePlayersPerPosition(numPlayersAtPosition, 11, 22);
        } else {
            return false;
        }

        return false;  // code should not reach this point
    }

    public String getName() {
        return name;
    }

    public String getStadium() {
        return stadium;
    }

    public List<Player> getRoster() {
        return roster;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }
}
