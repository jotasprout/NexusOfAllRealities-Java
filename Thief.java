public class Thief {
    static Character beThief (Character myChar){
        myChar.hitDice = 8;
        int numWealthRolls = 4;
        myChar.goldPieces = Wealth.rollForStartingWealth(numWealthRolls);
        return myChar;
    }    
    

    // HitPoints
    // Basic Equipment
}