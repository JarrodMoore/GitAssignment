/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        int armor = 20;
        System.out.println("Arrows was able to do " + arrow.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        Weapon axe = WeaponFactory.getWeapon("axe");
        System.out.println("Axe has " + axe.hit() + " of damage.");
        int armor = 20;
        System.out.println("Axes was able to do " + axe.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        Weapon magic_staff = WeaponFactory.getWeapon("magicstaff");
        System.out.println("Magic Staff has " + magic_staff.hit() + " of damage.");
        int armor = 20;
        System.out.println("Magic Staffs was able to do " + magic_staff.hit(armor) + " of damage due to an armor with "+armor+ " points.");

    }
}
