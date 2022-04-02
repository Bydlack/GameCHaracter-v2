package entity;

public class Monster extends AbstractEntity {

    public Monster(String name, int attack, int maxHP, int exp) {
        super(name, attack, maxHP, exp);
        if (attack <= 0) {
            throw new RuntimeException("Attack has to be above 0");
        } else {
            this.attack =attack;
        }
    }

}
