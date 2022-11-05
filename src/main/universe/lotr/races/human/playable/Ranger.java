package src.main.universe.lotr.races.human.playable;

import src.main.entities.weapons.Weapon;
import src.main.entities.weapons.handedweapon.swords.ShortSword;
import src.main.universe.lotr.races.human.Human;

public class Ranger extends Human {
  public Ranger(String name) {
    super(name, 100);
  }

  @Override
  protected Weapon createInitialWeapon() {
    return new ShortSword();
  }
}
