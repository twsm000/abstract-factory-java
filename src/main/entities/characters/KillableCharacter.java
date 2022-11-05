package src.main.entities.characters;

public abstract class KillableCharacter extends Character {
  private int hp;
  
  public KillableCharacter(String name, int hp) {
    super(name);
    this.hp = hp;
  }  

  public int getHp() {
    return hp;
  }

  public int receiveDamage(int damage) {
    if (hp == 0) {
      return 0;
    }

    System.out.printf("%s received %d of damage\n", getName(), damage);
    hp = Math.max(0, hp - damage);
    if (hp == 0) {
      System.out.printf("%s is dead!\n", getName());
    }

    return hp;
  }
}
