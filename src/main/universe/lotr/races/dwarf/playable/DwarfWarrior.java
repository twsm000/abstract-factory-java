package src.main.universe.lotr.races.dwarf.playable;

import src.main.entities.weapons.Weapon;
import src.main.entities.weapons.handedweapon.axes.ShortAxe;
import src.main.universe.lotr.races.dwarf.Dwarf;

public class DwarfWarrior extends Dwarf {

  public DwarfWarrior(String name) {
    super(name, 115);
  }

  @Override
  protected Weapon createInitialWeapon() {    
    return new ShortAxe();
  }
}
