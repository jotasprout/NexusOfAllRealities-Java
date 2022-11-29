import java.lang.Override;
import java.util.HashMap;

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

    String getRace() {
        return race;
    };

    void setRace(String aRace) {
        race = aRace;
    }

    String subRace;

    String getSubRace() {
        return subRace;
    };

    void setSubRace(String aSubRace) {
        subRace = aSubRace;
    }

    String career;

    String getCareer() {
        return career;
    };

    void setCareer(String aCareer) {
        career = aCareer;
    }

    // ALIGNMENT
    String[] morality = { "Evil", "Good", "Neutral" };
    String[] order = { "Chaotic", "Lawful", "True" };

    int expPoints;
    int level;

    int armorClass;
    int hitPoints;
    int hitDie;

    // ABILITIES

    HashMap<String, Integer> myAbilityScores = new HashMap<String, Integer>();

    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    int proficiencyBonus;

    // MAGIC
    boolean magicUser;

    // EQUIPMENT

    // WEALTH
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