public class Wealth {
    // starting wealth by class (aka profession)
    static int rollForStartingWealth(int numWealthRolls) {
        int wealthScore = 0;
        for (int rolls = 0; rolls <= numWealthRolls; rolls++) {
            int fourSidedRoll = Dice.rollFourSided();
            wealthScore += fourSidedRoll;
        }
        int goldPieces = wealthScore * 10;
        return goldPieces;
    }

    // exchange rates

    // track wealth of character
}
