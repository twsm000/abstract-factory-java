package src.main.universe.darksouls.race.demon;

import src.main.entities.weapons.Weapon;
import src.main.entities.weapons.handedweapon.greathammers.LargeClub;

public class AsylumDemon extends Demon {
  public AsylumDemon() {
    super("AsylumDemon", 825);
  }

  @Override
  protected Weapon createInitialWeapon() {
    return new LargeClub();
  }
}
