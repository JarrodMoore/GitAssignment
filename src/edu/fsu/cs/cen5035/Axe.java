package edu.fsu.cs.cen5035;

/**
 *
 * @author Jarrod
 */
public class Axe extends BasicWeapon implements Weapon {

    public Axe() {
        super(60);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = 0;
        int reduction = 0;
        if (armor > 0){
            if (armor < 60){
                return DAMAGE;
            }
        }
        damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
