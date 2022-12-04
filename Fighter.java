public class Fighter {
    static Character beFighter (Character myChar){
        myChar.hitDice = 10;
        myChar.hitPoints = Combat.rollForHitPoints(myChar.hitDice, myChar.level);
        System.out.println("\nYou have " + myChar.hitPoints + " Hit Points.\n");
        int numWealthRolls = 5;
        myChar.goldPieces = Wealth.rollForStartingWealth(numWealthRolls);
        System.out.println("\nYou have " + myChar.goldPieces + " Gold Pieces.\n");
        return myChar;
    }    
    
    // Basic Equipment
}