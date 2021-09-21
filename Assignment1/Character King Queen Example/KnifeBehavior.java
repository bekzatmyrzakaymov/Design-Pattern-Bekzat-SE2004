package com.company;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("implementing cutting with a knife");
    }
}
