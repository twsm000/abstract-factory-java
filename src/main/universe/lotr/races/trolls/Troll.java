package src.main.universe.lotr.races.trolls;

import src.main.entities.characters.Enemy;
import src.main.entities.weapons.Weapon;
import src.main.entities.weapons.handedweapon.greathammers.LargeClub;

public class Troll extends Enemy {
  private static long NUMBER = 1;
  public Troll() {
    super(String.format("Troll(%d)", NUMBER++), 200);
  }

  @Override
  protected Weapon createInitialWeapon() {
    return new LargeClub();
  }
}
