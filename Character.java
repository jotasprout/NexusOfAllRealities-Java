import java.lang.Override;
import java.util.HashMap;
import java.util.ArrayList;

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
        this.race = aRace;
    }

    String subRace;

    String getSubRace() {
        return subRace;
    };

    void setSubRace(String aSubRace) {
        this.subRace = aSubRace;
    }

    String career;

    String getCareer() {
        return career;
    };

    void setCareer(String aCareer) {
        career = aCareer;
    }

    // ALIGNMENT
    String alignment;

    // EXPERIENCE
    int expPoints;
    int level;

    // COMBAT
    int armorClass;
    int hitPoints;
    int hitDice;

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

    // SKILLS and PROFICIENCIES
    int numLanguages = 2;
    ArrayList<String> languages = new ArrayList<String>();
    int proficiencyBonus;

    // MAGIC
    boolean magicUser = false;

    // EQUIPMENT

    // WEALTH
    int goldPieces;
    int silverPieces;
    int copperPieces;

    @Override
    public String toString() {
        return "Name: " + name + ", Level: " + level + ", Race: " + race + ", SubRace: " + subRace + ", Charisma: "
                + charisma + ", Constitution: " + constitution + ", Dexterity: "
                + dexterity + ", Intelligence: " + intelligence + ", Strength: " + strength + ", Wisdom: "
                + wisdom;

    }
}