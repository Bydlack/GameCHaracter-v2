import entity.Hero;
import entity.Monster;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Name your hero!");

        String name = scanner.next();

        Hero hero = new Hero(name);
        hero.showStats();

        hero.chooseWeapon( 3);


        Monster monster = new Monster("Poporing", 30, 50, 5000);

        hero.attack(hero, monster);


    }


}


