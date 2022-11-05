package src.main.universe.lotr;

import src.main.entities.characters.CharacterFactory;
import src.main.entities.characters.Enemy;
import src.main.entities.characters.Player;
import src.main.universe.lotr.races.dwarf.playable.DwarfWarrior;
import src.main.universe.lotr.races.elf.playable.Archer;
import src.main.universe.lotr.races.human.playable.Ranger;
import src.main.universe.lotr.races.orcs.Orc;
import src.main.universe.lotr.races.trolls.Troll;

public class LordOfTheRingsCharacterFactory implements CharacterFactory {

  @Override
  public Enemy createEnemy(String race) {
    switch (race.toLowerCase()) {
      case "orc": 
        return new Orc();
      case "troll":
        return new Troll();
      default:
        return null;
    }
  }

  @Override
  public Player createPlayer(String race, String name) {
    switch (race.toLowerCase()) {
      case "ranger": 
        return new Ranger(name);
      case "archer":
        return new Archer(name);
      case "dwarf":
        return new DwarfWarrior(name);
      default:
        return null;
    }
  }  
}
