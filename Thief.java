public class Thief {
    static Character beThief (Character myChar){
        myChar.hitDice = 8;
        myChar.hitPoints = Combat.rollForHitPoints(myChar.hitDice, myChar.level);
        int numWealthRolls = 4;
        myChar.goldPieces = Wealth.rollForStartingWealth(numWealthRolls);
        return myChar;
    }    
    

    // HitPoints
    // Basic Equipment
}