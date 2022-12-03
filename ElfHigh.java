public class ElfHigh extends Elf {

    static Character beElfHigh(Character myChar) {
        int oldInt = myChar.intelligence;
        int newInt = oldInt + 1;
        myChar.intelligence = newInt;
        myChar.myAbilityScores.put("intelligence", newInt);
        System.out.println(
                "\nYour Intelligence roll was " + oldInt + ". Your intelligence as a High Elf is " + newInt + ".\n");
        System.out.println("\nAs a High Elf, you gain one more language.\n");
        // Languages = offer to choose a third language from a list
        myChar.numCantrips = 1;
        System.out.println("\nAs a High Elf, you gain one cantrip.\n");
        // Cantrips = offer to choose a cantrip from a list
        return myChar;
    }

}
