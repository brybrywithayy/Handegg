package games.gainsay;

import java.util.LinkedList;
import java.util.List;

public class PlayerFactory extends Player {

    // for building one Player manually, AND used by overloaded method below
    public static Player buildPlayer(PlayerPositionType position) {
        Player newPlayer;
        if(position == PlayerPositionType.LEADER) {
            newPlayer = new Leader();
        } else if(position == PlayerPositionType.SCORER) {
            newPlayer = new Scorer();
        } else if(position == PlayerPositionType.BLOCKER) {
            newPlayer = new Blocker();
        } else if(position == PlayerPositionType.DEFENDER) {
            newPlayer = new Defender();
        } else if(position == PlayerPositionType.KICKER) {
            newPlayer = new Kicker();
        } else {
            throw new IllegalArgumentException(position + "is invalid input for position");
        }

        return newPlayer;
    }

    // for building multiple players automatically
    public static List<Player> buildPlayer(PlayerPositionType position, int numToBuild) {
        List<Player> newPlayers = new LinkedList<>();

        for (int i=0; i<=numToBuild; i++) {
            newPlayers.set(i, buildPlayer(position));
        }

        return newPlayers;
    }
}
