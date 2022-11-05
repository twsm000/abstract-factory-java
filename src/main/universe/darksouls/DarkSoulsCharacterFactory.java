package src.main.universe.darksouls;

import src.main.entities.characters.CharacterFactory;
import src.main.entities.characters.Enemy;
import src.main.entities.characters.Player;
import src.main.universe.darksouls.race.demon.AsylumDemon;
import src.main.universe.darksouls.race.human.playable.Deprived;
import src.main.universe.darksouls.race.human.playable.Warrior;

public class DarkSoulsCharacterFactory implements CharacterFactory {

  @Override
  public Player createPlayer(String className, String name) {
    switch (className.toLowerCase()) {
      case "warrior":
        return new Warrior(name);
      case "deprived":
        return new Deprived(name);
      default:
        return null;
    }
  }

  @Override
  public Enemy createEnemy(String name) {
    switch (name.toLowerCase()) {
      case "asylumdemon":
        return new AsylumDemon();
      default:
        return null;
    }
  }  
}
