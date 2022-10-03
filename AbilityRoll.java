import java.util.Random;

public class AbilityRoll 
{
    public int sixSidedRoll;
    public int abilityRoll;

    public AbilityRoll()
    {
       rollForAbility();
    }

    // roll one six-sided die
    public int rollSixSided()
    {
        Random objGenerator = new Random();
        int randomSixSidedNum = objGenerator.nextInt(6);
        // for (int iCount = 0; iCount < 10; iCount++)
        // {
        //     randomSixSidedNum = objGenerator.nextInt(6);
        //System.out.println("Random six-sided dice roll = " + randomSixSidedNum + ".");
        // }
        return randomSixSidedNum;
    }

    // roll for abilities
    // Simulation of rolling three six-sided die for each ability
    public int rollForAbility()
    {
        for (int die = 0;  die <= 2; die++){
            sixSidedRoll = rollSixSided();
            abilityRoll += sixSidedRoll;
        }
        //System.out.println("Ability roll = " + abilityRoll + ".");
        return abilityRoll;
    } 

}
