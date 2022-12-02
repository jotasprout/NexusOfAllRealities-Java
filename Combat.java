public class Combat {

    static int rollForHitPoints (int hitDice, int level){
        int hitPoints = 0;
        for (int rolls = 0; rolls <= level; rolls++){
            switch(hitDice){
                case 6:
                    int sixSidedRoll = Dice.rollSixSided();
                    hitPoints += sixSidedRoll;
                    break;
                case 8:
                    int eightSidedRoll = Dice.rollEightSided();
                    hitPoints += eightSidedRoll;
                    break;  
                case 10:
                    int tenSidedRoll = Dice.rollTenSided();
                    hitPoints += tenSidedRoll;
                    break;                                      
            }
        }
        return hitPoints;
    }
    // Determine surprise
    // Establish positions
    // Roll initiative
    // Take turns
    // begin next round
}
