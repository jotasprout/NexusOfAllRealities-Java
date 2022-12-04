public class Human {

    static String[] abilities = { "charisma", "constitution", "dexterity", "intelligence", "strength", "wisdom" };

    static Character beHuman(Character myChar) {
        myChar.languages.add("Common");
        // Languages = offer to choose a second language from a list
        System.out.println(
                "\nAs a Human, each of your ability scores is increased by 1.\n");
        int oldCharisma = myChar.charisma;
        int newCharisma = oldCharisma + 1;
        myChar.charisma = newCharisma;
        myChar.myAbilityScores.put("charisma", newCharisma);
        System.out.println("\nYour Charisma roll was " + oldCharisma + ". Your charisma is now " + newCharisma + ".\n");

        int oldCon = myChar.constitution;
        int newCon = oldCon + 1;
        myChar.constitution = newCon;
        myChar.myAbilityScores.put("constitution", newCon);
        System.out.println(
                "\nYour Constitution roll was " + oldCon + ". Your constitution is now " + newCon + ".\n");

        int oldDex = myChar.dexterity;
        int newDex = oldDex + 1;
        myChar.dexterity = newDex;
        myChar.myAbilityScores.put("dexterity", newDex);
        System.out
                .println("\nYour Dexterity roll was " + oldDex + ". Your Dexterity is now " + newDex + ".\n");

        int oldInt = myChar.intelligence;
        int newInt = oldInt + 1;
        myChar.intelligence = newInt;
        myChar.myAbilityScores.put("intelligence", newInt);
        System.out.println(
                "\nYour Intelligence roll was " + oldInt + ". Your intelligence is now " + newInt + ".\n");

        int oldStr = myChar.strength;
        int newStr = oldStr + 1;
        myChar.strength = newStr;
        myChar.myAbilityScores.put("strength", newStr);
        System.out.println(
                "\nYour Strength roll was " + oldStr + ". Your strength is now " + newStr + ".\n");

        int oldWis = myChar.wisdom;
        int newWis = oldWis + 1;
        myChar.wisdom = newWis;
        myChar.myAbilityScores.put("wisdom", newWis);
        System.out.println(
                "\nYour Wisdom roll was " + oldWis + ". Your wisdom is now " + newWis + ".\n");

        return myChar;
    }
}
