package weapon;

public abstract class AbstractWeapon {
    protected String name;
    protected int attack;
    protected boolean weaponIsEquipped = false;

    public AbstractWeapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
        if (attack <= 0) {
            throw new RuntimeException("Attack has to be above 0");
        } else {
            setAttack(this.attack);
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


}
