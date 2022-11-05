package src.main.universe.lotr.races.orcs;

import src.main.entities.characters.Enemy;
import src.main.entities.weapons.Weapon;
import src.main.entities.weapons.handedweapon.hammers.Club;

public class Orc extends Enemy {
  private static long NUMBER = 1;
  public Orc() {
    super(String.format("Orc(%d)", NUMBER++), 65);
  }

  @Override
  protected Weapon createInitialWeapon() {
    return new Club();
  }
}
