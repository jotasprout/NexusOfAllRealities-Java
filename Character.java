import java.lang.Override;
import java.util.HashMap;

public class Character {

    String name;

    public Character() {
    };

    public Character(String name) {
        this.name = name;
        level = 1;
        charisma = 0;
        constitution = 0;
        dexterity = 0;
        intelligence = 0;
        strength = 0;
        wisdom = 0;
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

    int getStrength() {
        return strength;
    };

    void setStrength(int strengthScore) {
        strength = strengthScore;
    }

    int dexterity;

    int getDexterity() {
        return dexterity;
    };

    void setDexterity(int dexterityScore) {
        dexterity = dexterityScore;
    }

    int constitution;

    int getConstitution() {
        return constitution;
    };

    void setConstitution(int constitutionScore) {
        constitution = constitutionScore;
    }

    int intelligence;

    int getIntelligence() {
        return intelligence;
    };

    void setIntelligence(int intelligenceScore) {
        intelligence = intelligenceScore;
    }

    int wisdom;

    int getWisdom() {
        return wisdom;
    };

    void setWisdom(int wisdomScore) {
        wisdom = wisdomScore;
    }

    int charisma;

    int getCharisma() {
        return charisma;
    };

    void setCharisma(int charismaScore) {
        charisma = charismaScore;
    }

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