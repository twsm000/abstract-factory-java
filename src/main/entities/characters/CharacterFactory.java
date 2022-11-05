package src.main.entities.characters;

public interface CharacterFactory {
  Player createPlayer(String race, String name);
  Enemy createEnemy(String race);
}
