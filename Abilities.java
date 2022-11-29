import java.util.HashMap;

public class Abilities {

    static String[] abilities = { "strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma" };

    HashMap<String, Integer> abilityRollScores = new HashMap<String, Integer>();

    static Character rollForAbilities(Character myChar) {

        //Character myChar = new Character();
        //myChar = aChar;

        for (String ability : abilities) {
            System.out.println("Rolling for " + ability + " ...");
            AbilityRoll thisRoll = new AbilityRoll();

            switch (ability) {
                case "strength":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.strength = thisRoll.abilityRoll;
                    // add this score to myChar.abilityScores
                    break;
                case "dexterity":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.dexterity = thisRoll.abilityRoll;
                    // add this score to myChar.abilityScores
                    break;
                case "constitution":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.constitution = thisRoll.abilityRoll;
                    // add this score to myChar.abilityScores
                    break;
                case "intelligence":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.intelligence = thisRoll.abilityRoll;
                    // add this score to myChar.abilityScores
                    break;
                case "wisdom":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.wisdom = thisRoll.abilityRoll;
                    // add this score to myChar.abilityScores
                    break;
                case "charisma":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.charisma = thisRoll.abilityRoll;
                    // add this score to myChar.abilityScores
                    break;
                default:
                    System.out.println("You need better dice.");
                    // need a custom exception here
            }

        }

        return myChar;
    }
}
