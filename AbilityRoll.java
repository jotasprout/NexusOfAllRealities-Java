public class AbilityRoll {
    int sixSidedRoll;
    int abilityRoll;

    // Change so it rolls four and chooses highest three

    // roll for abilities
    // Simulation of rolling three six-sided die for each ability
    public int rollForAbility() {
        abilityRoll = 0;

        for (int die = 0; die <= 2; die++) {
            sixSidedRoll = Dice.rollSixSided();
            abilityRoll += sixSidedRoll;
        }
        return abilityRoll;
    }

}
