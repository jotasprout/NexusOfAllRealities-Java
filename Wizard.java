public class Wizard {
    static Character beWizard (Character myChar){
        myChar.hitDice = 6;
        myChar.hitPoints = Combat.rollForHitPoints(myChar.hitDice, myChar.level);
        int numWealthRolls = 4;
        myChar.goldPieces = Wealth.rollForStartingWealth(numWealthRolls);

        return myChar;
    }    
    
    // HitPoints
    // Basic Equipment
}
