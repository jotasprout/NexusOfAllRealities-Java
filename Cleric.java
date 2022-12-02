public class Cleric {
    static Character beCleric(Character myChar) {
        myChar.hitDice = 8;
        myChar.hitPoints = Combat.rollForHitPoints(myChar.hitDice, myChar.level);
        System.out.println("\nYou have " + myChar.hitPoints + " Hit Points.\n");
        int numWealthRolls = 5;
        myChar.goldPieces = Wealth.rollForStartingWealth(numWealthRolls);
        System.out.println("\nYou have " + myChar.goldPieces + " Gold Pieces.\n");
        myChar.numCantrips = 3;
        myChar.numSpells = 1;
        return myChar;
    }

    // HitPoints
    // Basic Equipment
}