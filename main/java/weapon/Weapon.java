package weapon;

public class Weapon extends AbstractWeapon{

    public Weapon(String name) {
        super(name, 1);
        if (name == null) {
            System.out.println("There is no such weapon!");
        } else {
            switch (name) {
                case "mace":
                    setAttack(10);
                    break;
                case "axe":
                    setAttack(12);
                    break;
                case "sword":
                    setAttack(15);
                    break;
            }
        }
    }
}
