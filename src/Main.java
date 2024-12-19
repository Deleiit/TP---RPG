import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande les noms des équipes
        System.out.print("Entrez le nom de l'équipe 1: ");
        String team1Name = scanner.nextLine();
        System.out.print("Entrez le nom de l'équipe 2: ");
        String team2Name = scanner.nextLine();

        // Crée un nouveau jeu avec les noms des équipes
        Game game = new Game(team1Name, team2Name);

        // Ajoute des combattants aux équipes
        game.addBattlerToTeam1(new Battler("Player1_Team1", 50, 5));
        game.addBattlerToTeam1(new Battler("Player2_Team1", 50, 5));
        game.addBattlerToTeam2(new Battler("Player1_Team2", 50, 5));
        game.addBattlerToTeam2(new Battler("Player2_Team2", 50, 5));

        // Démarre le jeu
        game.start();

        scanner.close();
    }
}