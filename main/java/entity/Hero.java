package entity;

import weapon.Weapon;

import java.util.Scanner;

public class Hero extends AbstractEntity {
    private int level;
    private Weapon weapon;

    public Hero(String name) {
        super(name, 10, 100, 0);
        this.level = 1;
    }

    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    private void lvlUp() {
        while (exp >= level * 100) {
            System.out.println("Level UP!");
            setLevel(++level);
            exp = exp - (level * 100);
            attack++;
            setMaxHP(maxHP + 20);
        }
        System.out.println(this.getName() + " is level " + getLevel() + "!");
    }

    public void attack(Hero hero, Monster monster) {
        int heroHP = hero.getMaxHP();
        int monsterHP = monster.getMaxHP();
        int i = 1;
        while (heroHP > 0 && monsterHP > 0) {
            System.out.println("Round " + i + "!");
            heroHP -= monster.getAttack();
            monsterHP -= hero.getAttack();
            System.out.println(hero.getName() + " ma " + heroHP + " HP!");
            System.out.println(monster.getName() + " ma " + monsterHP + " HP!\n");
            i++;
        }

        if (heroHP > 0) {
            System.out.println(hero.getName() + " won!");
            System.out.println(hero.getName() + " got " + monster.exp + " EXP!\n");
            hero.setExp(hero.exp + monster.exp);
            if (this.exp >= level * 100) {
                lvlUp();
            }
        } else if (monsterHP > 0) {
            System.out.println(monster.getName() + " won!");
        } else {
            System.out.println("Double K.O.");
        }
    }

    public void chooseWeapon(int userChoices) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("Choose weapon!");
            System.out.println("You can choose from: 1 - sword, 2 - mace, 3 - axe.");
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter the number!");
            }
        } while (input < 1 || input > userChoices);
        switch (input) {
            case 1:
                System.out.println("You chose a sword!");
                attack += 10;
                break;
            case 2:
                System.out.println("You chose a mace!");
                attack += 12;
                break;
            case 3:
                System.out.println("You chose an axe!");
                attack += 15;
                break;

        } return;
    }
}







