public abstract class Elf {

    static Character beElf (Character myChar){
        int oldDex = myChar.dexterity;
        int newDex = oldDex + 2;
        myChar.dexterity = newDex;
        myChar.myAbilityScores.put("dexterity", newDex);
        System.out.println("\nYour Dexterity roll was " + oldDex + ". Your Dexterity as an Elf is " + newDex + ".\n");
        myChar.languages.add("Common");
        myChar.languages.add("Elvish");
        myChar.speed = 25;
        return myChar;
    }
    // Minimum Intelligence = 9
}