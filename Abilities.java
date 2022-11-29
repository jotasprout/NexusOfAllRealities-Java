import java.util.HashMap;

public class Abilities {

    static String[] abilities = { "strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma" };

    static Character rollForAbilities(Character myChar) {

        HashMap<String, Integer> abilityScores = new HashMap<String, Integer>();

        // Character myChar = new Character();
        // myChar = aChar;

        for (String ability : abilities) {
            System.out.println("Rolling for " + ability + " ...");
            AbilityRoll thisRoll = new AbilityRoll();

            switch (ability) {
                case "strength":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.strength = thisRoll.abilityRoll;
                    abilityScores.put(ability, thisRoll.abilityRoll);
                    break;
                case "dexterity":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.dexterity = thisRoll.abilityRoll;
                    abilityScores.put(ability, thisRoll.abilityRoll);
                    break;
                case "constitution":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.constitution = thisRoll.abilityRoll;
                    abilityScores.put(ability, thisRoll.abilityRoll);
                    break;
                case "intelligence":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.intelligence = thisRoll.abilityRoll;
                    abilityScores.put(ability, thisRoll.abilityRoll);
                    break;
                case "wisdom":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.wisdom = thisRoll.abilityRoll;
                    abilityScores.put(ability, thisRoll.abilityRoll);
                    break;
                case "charisma":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".\n");
                    myChar.charisma = thisRoll.abilityRoll;
                    abilityScores.put(ability, thisRoll.abilityRoll);
                    break;
                default:
                    System.out.println("You need better dice.");
                    // need a custom exception here
            }

        }

        myChar.myAbilityScores = abilityScores;
        return myChar;
    }
}
