package src.main.universe.lotr.races.elf.playable;

import src.main.entities.weapons.Weapon;
import src.main.entities.weapons.handedweapon.bows.ShortBow;
import src.main.universe.lotr.races.elf.Elf;

public class Archer extends Elf {

  public Archer(String name) {
    super(name, 125);
  }

  @Override
  protected Weapon createInitialWeapon() {
    return new ShortBow();
  }
}
