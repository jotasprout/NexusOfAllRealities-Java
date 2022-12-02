public class ElfHigh extends Elf {

    static Character beElfHigh (Character myChar){
        int oldInt = myChar.intelligence;
        int newInt = oldInt + 1;
        myChar.intelligence = newInt;
        System.out.println("\nYour Intelligence roll was " + oldInt + ". Your intelligence as a High Elf is " + newInt + ".\n");
        return myChar;
    }

    // HitDice
    // HitPoints
    // AbilityScoreIncrease
    // SavingThrows 
    // Proficiencies 
    // Languages
    // Speed
    // Alignment
    // CombatProficiency
}
