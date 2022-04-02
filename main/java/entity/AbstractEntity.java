package entity;

public abstract class AbstractEntity implements Entity {
    protected String name;
    protected int attack, maxHP, exp;

    public AbstractEntity(String name, int attack, int maxHP, int exp) {
        this.name = name;
        this.attack = attack;
        this.maxHP = maxHP;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public void showStats() {
        System.out.println("Name: " + getName());
        System.out.println("Attack: " + getAttack());
        System.out.println("Max HP: " + getMaxHP());
        System.out.println();
    }
}
