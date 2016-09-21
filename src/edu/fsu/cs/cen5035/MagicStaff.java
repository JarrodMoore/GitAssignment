package edu.fsu.cs.cen5035;

/**
 *
 * @author Jarrod
 */
public class Arrow extends BasicWeapon implements Weapon {

    public Arrow() {
        super(80);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = 0;
        int reduction = armor * .8;
        if (reduction > 0) {
            damage = DAMAGE - reduction;
        }
        else {
            damage = DAMAGE;
        }
        return damage;
    }

}
