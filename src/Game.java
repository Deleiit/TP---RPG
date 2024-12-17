import java.util.ArrayList;
import java.util.List;

class Game {
    Team team1 = new Team("Team 1");

    team1.addBattler(new Battler("Adolph", 100, 50));

    public void play() {
        while (!team1.isLoose() && !team2.isLoose()) {
            int playerTeamPower = 0;
            for (battlers : getBattlers()) {
                playerTeamPower += battler.power;
            }
            if (team2.isLoose()) {
                break;
            }

        }
    }

    public Team getWinnerTeam() {
        if (team1.isLoose()) {
            return team2;
        } else {
            return team1;
        }
    }
}