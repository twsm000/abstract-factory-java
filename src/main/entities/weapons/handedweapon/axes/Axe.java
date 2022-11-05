package src.main.entities.weapons.handedweapon.axes;

import src.main.entities.weapons.Weapon;

public interface Axe extends Weapon {  
  @Override
  default String type() {
    return "Axe";
  }
}
