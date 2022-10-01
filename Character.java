//import java.util.*;
import java.lang.Override;

public class Character {

    String name;
    
    String race;
    String profession;

    String[] morality = {"Evil", "Good", "Neutral"};
    String[] order = {"Chaotic", "Lawful", "True"};

    int expPoints = 0;
    int level = 1;

    int armorClass;
    int hitPoints;

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
        return name + " is a " + race + " Level " + level + " " + profession;
    }
}