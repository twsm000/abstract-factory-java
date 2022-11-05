package src.main.entities.weapons.handedweapon.hammers;

import src.main.entities.weapons.Weapon;

public interface Hammer extends Weapon {
  @Override
  default String type() {
    return "Hammer";
  }
}
