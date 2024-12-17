import java.util.ArrayList;
import java.util.List;

class Team {
    private String name;
    public List<Battler> battlers;

    public Team(String name) {
        this.name = name;
        this.battlers = new ArrayList<>();
    }

    public void addBattler(Battler battler) {
        this.battlers.add(battler);
    }

    public List<Battler> getBattlers() {
        return battlers;
    }

    public boolean isLoose() {
        for (Battler battler : battlers) {
            if (battler.hp > 0) {
                return false;
            }
        }
        return true;
    }
}