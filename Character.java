//import java.util.*;
import java.lang.Override;

public class Character {

    String name;

    public Character(){};

    public Character (String name, int level)
    {
        this.name = name;
        this.level = level;
    }
    
    String race;
    String profession;

    String[] morality = {"Evil", "Good", "Neutral"};
    String[] order = {"Chaotic", "Lawful", "True"};

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
    public String toString()
    {
        return "Name: " + name + ", is a Level " + level + " " + race + " with a strength score of " + strength;
        //return "Name: " + name + ", is a " + race + " Level " + level + " " + profession;
    }
}