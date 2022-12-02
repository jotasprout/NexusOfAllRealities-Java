public class Wizard {
    static Character beWizard (Character myChar){
        myChar.hitDice = 6;
        int numWealthRolls = 4;
        myChar.goldPieces = Wealth.rollForStartingWealth(numWealthRolls);

        return myChar;
    }    
    
    // HitPoints
    // Basic Equipment
}
