package src.main.entities.weapons.handedweapon.greathammers;

import src.main.entities.weapons.Weapon;

public interface GreatHammer extends Weapon {
  @Override
  default String type() {
    return "GreatHammer";
  }
}
