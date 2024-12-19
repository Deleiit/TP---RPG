import java.util.ArrayList;
import java.util.List;

public class Game {
    private Team team1;
    private Team team2;
    private boolean isGameRunning;

    // Constructeur pour initialiser les équipes et l'état du jeu
    public Game(String team1Name, String team2Name) {
        this.team1 = new Team(team1Name);
        this.team2 = new Team(team2Name);
        this.isGameRunning = true;
    }

    // Méthode pour ajouter un combattant à l'équipe 1
    public void addBattlerToTeam1(Battler battler) {
        team1.addBattler(battler);
    }

    // Méthode pour ajouter un combattant à l'équipe 2
    public void addBattlerToTeam2(Battler battler) {
        team2.addBattler(battler);
    }

    // Méthode pour démarrer le jeu
    public void start() {
        // Sélectionne un attaquant et un défenseur aléatoires
        Battler currentAttacker = team1.getRandomBattler();
        Battler currentDefender = team2.getRandomBattler();

        // Boucle principale du jeu
        while (isGameRunning) {
            // L'attaquant attaque le défenseur
            attack(currentAttacker, currentDefender);
            // Vérifie l'état du jeu
            checkGameStatus();
            if (isGameRunning) {
                // Change les rôles d'attaquant et de défenseur
                Battler temp = currentAttacker;
                currentAttacker = currentDefender;
                currentDefender = temp;
            }
        }

        // Affiche le gagnant
        displayWinner();
    }

    // Méthode pour gérer une attaque
    private void attack(Battler attacker, Battler defender) {
        int damage = (int) (Math.random() * 10) + 1; // Dégâts aléatoires entre 1 et 10
        defender.takeDamage(damage);
        System.out.println(attacker.getName() + " attaque " + defender.getName() + " pour " + damage + " dégâts.");
        System.out.println("Santé de " + defender.getName() + " : " + defender.getHp());
    }

    // Méthode pour vérifier l'état du jeu
    private void checkGameStatus() {
        if (team1.isDefeated() || team2.isDefeated()) {
            isGameRunning = false;
        }
    }

    // Méthode pour afficher le gagnant
    private void displayWinner() {
        if (team1.isDefeated()) {
            System.out.println(team2.getName() + " gagne !");
        } else if (team2.isDefeated()) {
            System.out.println(team1.getName() + " gagne !");
        }
    }
}