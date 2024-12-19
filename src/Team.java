import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Battler> battlers;

    // Constructeur pour initialiser l'équipe avec un nom
    public Team(String name) {
        this.name = name;
        this.battlers = new ArrayList<>();
    }

    // Méthode pour ajouter un combattant à l'équipe
    public void addBattler(Battler battler) {
        battlers.add(battler);
    }

    // Méthode pour vérifier si l'équipe est vaincue
    public boolean isDefeated() {
        return battlers.stream().allMatch(battler -> !battler.isAlive());
    }

    // Méthode pour obtenir un combattant vivant aléatoire
    public Battler getRandomBattler() {
        List<Battler> aliveBattlers = battlers.stream().filter(Battler::isAlive).toList();
        return aliveBattlers.get((int) (Math.random() * aliveBattlers.size()));
    }

    // Méthode pour obtenir le nom de l'équipe
    public String getName() {
        return name;
    }
}