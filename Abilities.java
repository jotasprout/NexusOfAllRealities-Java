public class Abilities {

    static Character rollForAbilities(Character aChar) {

        Character myChar = new Character();

        myChar = aChar;

        String[] abilities = { "strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma" };

        for (String ability : abilities) {
            System.out.println("Rolling for " + ability + " ...");
            AbilityRoll thisRoll = new AbilityRoll();

            switch (ability) {
                case "strength":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                    myChar.strength = thisRoll.abilityRoll;
                    break;
                case "dexterity":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                    myChar.dexterity = thisRoll.abilityRoll;
                    break;
                case "constitution":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                    myChar.constitution = thisRoll.abilityRoll;
                    break;
                case "intelligence":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                    myChar.intelligence = thisRoll.abilityRoll;
                    break;
                case "wisdom":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                    myChar.wisdom = thisRoll.abilityRoll;
                    break;
                case "charisma":
                    System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                    myChar.charisma = thisRoll.abilityRoll;
                    break;
                default:
                    System.out.println("You need better dice.");
                    // need a custom exception here
            }

        }

        return myChar;
    }
}
