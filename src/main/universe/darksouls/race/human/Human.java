package src.main.universe.darksouls.race.human;

import java.time.Instant;
import java.util.Random;

import src.main.entities.characters.Player;

public abstract class Human extends Player {
  private static final Random random = new Random(Instant.now().toEpochMilli());
  public Human(String name, int hp) {
    super(name, hp);
  }

  @Override
  public int receiveDamage(int damage) {
    var value = random.nextInt(damage);
    if (value % 2 == 0) {
      System.out.printf("%s is rolling and avoided %d of damage\n", getName(), damage);
      return 0;
    } if (value % 3 == 0) {
      System.out.printf("%s blocked the attack and avoided %d of damage\n", getName(), damage);
      return 0;
    } else {
      return super.receiveDamage(damage);
    }
  }
}
