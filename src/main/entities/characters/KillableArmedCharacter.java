package src.main.entities.characters;

import src.main.entities.weapons.Weapon;

public abstract class KillableArmedCharacter extends KillableCharacter {
  private int strength;
  private Weapon weapon;

  public KillableArmedCharacter(String name, int hp) {
    super(name, hp);
    this.weapon = createInitialWeapon();
    this.strength = 1;
  }  

  protected abstract Weapon createInitialWeapon();
  
  protected int calculateAttackDamage() {
    return getWeapon().attack() * (int) (strength / 100 + 1);
  }

  public Weapon getWeapon() {
    return weapon;
  }  

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public void attack(KillableCharacter enemy) {
    var weapon = getWeapon();
    System.out.printf("%s used %s[%s] to attack %s\n", 
      getName(), weapon.name(), weapon.type(), enemy.getName());
    enemy.receiveDamage(calculateAttackDamage());
  }
}
