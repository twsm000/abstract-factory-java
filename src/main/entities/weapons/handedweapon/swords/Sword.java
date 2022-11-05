package src.main.entities.weapons.handedweapon.swords;

import src.main.entities.weapons.Weapon;

public interface Sword extends Weapon {
  @Override
  default String type() {
    return "Sword";
  }
}
