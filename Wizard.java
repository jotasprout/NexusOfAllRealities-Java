public class Wizard {
    static Character beWizard (Character myChar){
        myChar.hitDice = 6;
        myChar.hitPoints = Combat.rollForHitPoints(myChar.hitDice, myChar.level);
        System.out.println("\nYou have " + myChar.hitPoints + " Hit Points.\n");
        int numWealthRolls = 4;
        myChar.goldPieces = Wealth.rollForStartingWealth(numWealthRolls);
        System.out.println("\nYou have " + myChar.goldPieces + " Gold Pieces.\n");
        return myChar;
    }    
    
    // HitPoints
    // Basic Equipment
}
