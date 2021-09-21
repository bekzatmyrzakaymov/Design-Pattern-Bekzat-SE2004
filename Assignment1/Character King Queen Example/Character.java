package com.company;

public abstract class Character {

      WeaponBehavior weaponBehavior;

    public Character(){

    }

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight(){
       weaponBehavior.useWeapon();
    }


    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

}
