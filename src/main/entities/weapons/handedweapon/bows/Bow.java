package src.main.entities.weapons.handedweapon.bows;

import src.main.entities.weapons.Weapon;

public interface Bow extends Weapon {
  @Override
  default String type() {
    return "Bow";
  }
}
