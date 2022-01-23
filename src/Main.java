package games.gainsay;

/*
 * Intergalactic Collegiate Handegg? Need a college handegg league name
 */

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Team team = new Team("Testtown Demos", "TrialDome", new LinkedList<>());

        System.out.println(team.getName());

        team.createNewPlayer(PlayerPositionType.DEFENDER, 11, 22);

        team.getRoster().toString();

    }
}
