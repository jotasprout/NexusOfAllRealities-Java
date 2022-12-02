public class Halfling {

    static Character beHalfling (Character myChar){
        int oldDex = myChar.dexterity;
        int newDex = oldDex + 2;
        myChar.dexterity = newDex;
        System.out.println("\nYour Dexterity roll was " + oldDex + ". Your Dexterity as a Halfling is " + newDex + ".\n");        
        myChar.speed = 25;
        myChar.languages.add("Common");
        myChar.languages.add("Halfling");

        return myChar;
    }
    // Minimum Dexterity = 9
    // Minimum Constitution = 9

    // Proficiencies

}