package com.javad.strategy.character;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performWeapon(){
        weaponBehavior.perform();
    }
}
