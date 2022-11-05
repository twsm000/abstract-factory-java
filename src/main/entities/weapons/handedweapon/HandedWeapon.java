package src.main.entities.weapons.handedweapon;

import src.main.entities.weapons.Weapon;

public abstract class HandedWeapon implements Weapon {
  private final int attack;
  private final String name;
  private final int hands;

  public HandedWeapon(String name, int attack, int hands) {
    this.name = name;
    this.attack = attack;
    this.hands = hands;
  }

  @Override
  public int attack() {
    return this.attack;
  }

  @Override
  public String name() {
    return this.name;
  } 

  protected int getHands() {
    return this.hands;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + attack;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + hands;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    HandedWeapon other = (HandedWeapon) obj;
    if (attack != other.attack)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (hands != other.hands)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "HandedWeapon [attack=" + attack + ", name=" + name + ", hands=" + hands + "]";
  }
}
