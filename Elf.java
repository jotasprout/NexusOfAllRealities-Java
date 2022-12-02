public abstract class Elf {

    static Character beElf (Character myChar){
        int oldDex = myChar.dexterity;
        int newDex = oldDex + 2;
        myChar.dexterity = newDex;
        System.out.println("\nYour Dexterity roll was " + oldDex + ". Your Dexterity as an Elf is " + newDex + ".\n");
        return myChar;
    }
    // Hit Dice
    // Hit Point maximum increase
    // Ability Score increase
    // Saving Throw Proficiencies 
    // Saving Throws
    // Other proficiencies
    // Languages
    // Speed
    // Alignment
    // Combat proficiency
}