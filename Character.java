
//import java.util.*;
import java.lang.Override;

public class Character {

    String name;

    public Character() {
    };

    public Character(String name) {
        this.name = name;
        level = 1;
        strength = 0;
        dexterity = 0;
        constitution = 0;
        intelligence = 0;
        wisdom = 0;
        charisma = 0;
    }

    String race;
    String career;

    String[] morality = { "Evil", "Good", "Neutral" };
    String[] order = { "Chaotic", "Lawful", "True" };

    int expPoints;
    int level;

    int armorClass;
    int hitPoints;

    // ABILITIES

    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    int proficiencyBonus;

    int goldPieces;
    int silverPieces;
    int copperPieces;

    @Override
    public String toString() {
        return "Name: " + name + ", Level: " + level + ", Race: " + race + ", Strength: " + strength + ", Dexterity: "
                + dexterity + ", Constitution: " + constitution + ", Intelligence: " + intelligence + ", Wisdom: "
                + wisdom + ", Charisma: " + charisma;
        // return "Name: " + name + ", is a " + race + " Level " + level + " " +
        // profession;
    }
}