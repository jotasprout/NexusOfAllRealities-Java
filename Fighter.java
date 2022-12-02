public class Fighter {
    static Character beFighter (Character myChar){
        myChar.hitDice = 10;
        myChar.hitPoints = Combat.rollForHitPoints(myChar.hitDice, myChar.level);
        int numWealthRolls = 5;
        myChar.goldPieces = Wealth.rollForStartingWealth(numWealthRolls);
        return myChar;
    }    
    
    // HitPoints
    // Basic Equipment
}