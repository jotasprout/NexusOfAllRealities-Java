public class HalflingLightfoot extends Halfling {

    static Character beHalflingLightfoot (Character myChar){
        int oldCharisma = myChar.charisma;
        int newCharisma = oldCharisma + 1;
        myChar.charisma = newCharisma;
        System.out.println("\nYour Charisma roll was " + oldCharisma + ". Your charisma as a Lightfoot Halfling is " + newCharisma + ".\n");          

        return myChar;
    }

    // Proficiencies

}
