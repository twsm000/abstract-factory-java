package src.main.app;

import java.time.Instant;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import src.main.entities.characters.CharacterFactory;
import src.main.entities.characters.Enemy;
import src.main.entities.characters.KillableArmedCharacter;
import src.main.entities.characters.KillableCharacter;
import src.main.entities.characters.Player;
import src.main.universe.darksouls.DarkSoulsCharacterFactory;
import src.main.universe.lotr.LordOfTheRingsCharacterFactory;

public class Application {
  private static final Random random = new Random(Instant.now().toEpochMilli());
  private static final List<String> worlds = List.of("lotr", "darksouls");
  private static final List<Player> players = new LinkedList<>();
  private static final List<Enemy> enemies = new LinkedList<>();

  public static void main(String[] args) throws InterruptedException {
    selectWorld();    
    start();
  }

  public static void selectWorld() {
    var worldName = worlds.get(random.nextInt(worlds.size()));
    var factory = worldFactoryFrom(worldName);
    switch (worldName.toLowerCase()) {
      case "lotr":
        players.add(factory.createPlayer("ranger", "Aragorn"));
        players.add(factory.createPlayer("archer", "Legolas"));
        players.add(factory.createPlayer("dwarf", "Gimli"));   

        enemies.add(factory.createEnemy("orc"));
        enemies.add(factory.createEnemy("orc"));
        enemies.add(factory.createEnemy("troll"));
        return;

      case "darksouls":
        players.add(factory.createPlayer("warrior", "Chosen Undead"));
        players.add(factory.createPlayer("deprived", "Let me solo her"));
        enemies.add(factory.createEnemy("asylumdemon"));        
        return;

      default:
        throw new IllegalArgumentException(String.format(
            "World [%s] not located", worldName));
    }

  }

  public static CharacterFactory worldFactoryFrom(String name) {
    switch (name.toLowerCase()) {
      case "lotr":
        return new LordOfTheRingsCharacterFactory();
      case "darksouls":
        return new DarkSoulsCharacterFactory();
      default:
        throw new IllegalArgumentException(String.format(
            "World [%s] not located", name));
    }
  }

  private static void start() throws InterruptedException {
    int count = 1;    
    while (!players.isEmpty() && !enemies.isEmpty()) {
      KillableArmedCharacter attacker = null;
      KillableCharacter target = null;
      List<?> removable = null;

      if (random.nextInt(2) % 2 == 0) {
        attacker = players.get(random.nextInt(players.size()));
        target = enemies.get(random.nextInt(enemies.size()));
        removable = enemies;
      } else {
        attacker = enemies.get(random.nextInt(enemies.size()));
        target = players.get(random.nextInt(players.size()));
        removable = players;
      }

      System.out.println("Round: " + count++);
      attacker.attack(target);
      if (target.getHp() == 0) {
        removable.remove(target);
      }
      
      Thread.sleep(500);
      System.out.println();
    }

    if (enemies.isEmpty()) {
      System.out.println("You win!");
    } else {
      System.out.println("You died!");
    }    
  }  
}