public class Cleric {
    static Character beCleric(Character myChar) {
        myChar.hitDice = 8;
        int numWealthRolls = 5;
        myChar.goldPieces = Wealth.rollForStartingWealth(numWealthRolls);
        myChar.numCantrips = 3;
        myChar.numSpells = 1;
        return myChar;
    }

    // HitPoints
    // Basic Equipment
}