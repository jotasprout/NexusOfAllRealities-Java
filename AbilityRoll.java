//import java.util.Random;

public class AbilityRoll {
    int sixSidedRoll;
    int abilityRoll;

    public AbilityRoll() {
        rollForAbility();
    }

    // roll one six-sided die
    // public int rollSixSided() {
    // Random objGenerator = new Random();
    // int randomSixSidedNum = objGenerator.nextInt(6);
    // return randomSixSidedNum;
    // }

    // roll for abilities
    // Simulation of rolling three six-sided die for each ability
    public int rollForAbility() {
        for (int die = 0; die <= 2; die++) {
            sixSidedRoll = Dice.rollSixSided();
            abilityRoll += sixSidedRoll;
        }
        return abilityRoll;
    }

}
