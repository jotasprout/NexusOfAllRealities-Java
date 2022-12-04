import java.util.HashMap;

public class Abilities {

    static String[] abilities = { "charisma", "constitution", "dexterity", "intelligence", "strength", "wisdom" };

    static Character rollForAbilities(Character myChar) {

        HashMap<String, Integer> abilityScores = new HashMap<String, Integer>();

        for (String ability : abilities) {
            // System.out.println("Rolling for " + ability + " ...");
            AbilityRoll thisRoll = new AbilityRoll();

            switch (ability) {
                case "charisma":
                    System.out.println("Rolling for " + ability + " ...");
                    myChar.charisma = thisRoll.rollForAbility();
                    System.out.println(ability + " is " + myChar.charisma + ".\n");
                    abilityScores.put(ability, myChar.charisma);
                    break;
                case "constitution":
                    System.out.println("Rolling for " + ability + " ...");
                    myChar.constitution = thisRoll.rollForAbility();
                    System.out.println(ability + " is " + myChar.constitution + ".\n");
                    abilityScores.put(ability, myChar.constitution);
                    break;
                case "dexterity":
                    System.out.println("Rolling for " + ability + " ...");
                    myChar.dexterity = thisRoll.rollForAbility();
                    System.out.println(ability + " is " + myChar.dexterity + ".\n");
                    abilityScores.put(ability, thisRoll.rollForAbility());
                    break;
                case "intelligence":
                    System.out.println("Rolling for " + ability + " ...");
                    myChar.intelligence = thisRoll.rollForAbility();
                    System.out.println(ability + " is " + myChar.intelligence + ".\n");
                    abilityScores.put(ability, myChar.intelligence);
                    break;
                case "strength":
                    System.out.println("Rolling for " + ability + " ...");
                    myChar.strength = thisRoll.rollForAbility();
                    System.out.println(ability + " is " + myChar.strength + ".\n");
                    abilityScores.put(ability, myChar.strength);
                    break;
                case "wisdom":
                    System.out.println("Rolling for " + ability + " ...");
                    myChar.wisdom = thisRoll.rollForAbility();
                    System.out.println(ability + " is " + myChar.wisdom + ".\n");
                    abilityScores.put(ability, myChar.wisdom);
                    break;
                default:
                    System.out.println("You need better dice.");
                    // need a custom exception here
            }

        }
        // Add methods that check for sucky rolls

        myChar.myAbilityScores = abilityScores;
        // does the above still work? or does it mess with the HashMap?
        return myChar;
    }
}
