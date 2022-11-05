package src.main.universe.darksouls.race.human.playable;

import src.main.entities.weapons.Weapon;
import src.main.entities.weapons.handedweapon.hammers.Club;
import src.main.universe.darksouls.race.human.Human;

public class Deprived extends Human {
  public Deprived(String name) {
    super(name, 100);
  }

  @Override
  protected Weapon createInitialWeapon() {
    return new Club();
  }
}
