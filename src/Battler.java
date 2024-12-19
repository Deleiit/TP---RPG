public class Battler {
    private String name;
    private int health;
    private int power;

    // Constructeur pour initialiser un combattant avec un nom, des points de vie et de la puissance
    public Battler(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    // Méthode pour obtenir le nom du combattant
    public String getName() {
        return name;
    }

    // Méthode pour obtenir les points de vie du combattant
    public int getHp() {
        return health;
    }

    // Méthode pour obtenir la puissance du combattant
    public int getPower() {
        return power;
    }

    // Méthode pour infliger des dégâts au combattant
    public void takeDamage(int damage) {
        health -= damage;
    }

    // Méthode pour vérifier si le combattant est vivant
    public boolean isAlive() {
        return health > 0;
    }
}