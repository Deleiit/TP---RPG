import java.util.ArrayList;
import java.util.List;

class Battler {
    private String name;
    public int hp;
    public int power;

    public Battler(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public void attack(Battler opponent) {
        opponent.looseHP(power);
    }

    public void looseHP(int amount) {
        this.hp -= amount;
    }
}