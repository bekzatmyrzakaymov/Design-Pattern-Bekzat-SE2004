package com.company;

public class Main {

    public static void main(String[] args) {

        Character queen = new Queen();
        queen.fight();
        queen.setWeaponBehavior(new BowAndArrowBehavior());
        queen.fight();

        System.out.println("-----------------");
        Character king = new King();
        king.fight();
        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();
    }
}



