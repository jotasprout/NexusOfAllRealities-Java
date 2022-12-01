import java.util.HashMap;

public class Abilities {

    static String[] abilities = { "charisma", "constitution", "dexterity", "intelligence", "strength", "wisdom" };

    static Character rollForAbilities(Character myChar) {

        HashMap<String, Integer> abilityScores = new HashMap<String, Integer>();

        for (String ability : abilities) {
            System.out.println("Rolling for " + ability + " ...");
            AbilityRoll thisRoll = new AbilityRoll();

            switch (ability) {
                case "charisma":
                    System.out.println(ability + " is " + thisRoll.rollForAbility() + ".\n");
                    myChar.charisma = thisRoll.rollForAbility();
                    abilityScores.put(ability, thisRoll.rollForAbility());
                    break;                
                case "constitution":
                    System.out.println(ability + " is " + thisRoll.rollForAbility() + ".\n");
                    myChar.constitution = thisRoll.rollForAbility();
                    abilityScores.put(ability, thisRoll.rollForAbility());
                    break;                
                case "dexterity":
                    System.out.println(ability + " is " + thisRoll.rollForAbility() + ".\n");
                    myChar.dexterity = thisRoll.rollForAbility();
                    abilityScores.put(ability, thisRoll.rollForAbility());
                    break;
                case "intelligence":
                    System.out.println(ability + " is " + thisRoll.rollForAbility() + ".\n");
                    myChar.intelligence = thisRoll.rollForAbility();
                    abilityScores.put(ability, thisRoll.rollForAbility());
                    break;
                    case "strength":
                    System.out.println(ability + " is " + thisRoll.rollForAbility() + ".\n");
                    myChar.strength = thisRoll.rollForAbility();
                    abilityScores.put(ability, thisRoll.rollForAbility());
                    break;                    
                case "wisdom":
                    System.out.println(ability + " is " + thisRoll.rollForAbility() + ".\n");
                    myChar.wisdom = thisRoll.rollForAbility();
                    abilityScores.put(ability, thisRoll.rollForAbility());
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
