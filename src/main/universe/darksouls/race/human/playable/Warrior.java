package src.main.universe.darksouls.race.human.playable;

import src.main.entities.weapons.Weapon;
import src.main.entities.weapons.handedweapon.swords.ShortSword;
import src.main.universe.darksouls.race.human.Human;

public class Warrior extends Human {
  public Warrior(String name) {
    super(name, 150);
  }

  @Override
  protected Weapon createInitialWeapon() {
    return new ShortSword();
  }
}
