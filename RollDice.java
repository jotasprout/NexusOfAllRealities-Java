import java.util.Random;

public class RollDice 
{

    // roll one six-sided die
    void rollSixSided()
    {
        Random objGenerator = new Random();

        for (int iCount = 0; iCount < 10; iCount++)
        {
            int randomSixSidedNum = objGenerator.nextInt(6);
            System.out.println("Random six-sided dice roll = " + randomSixSidedNum + ".");
        }
    }

    // roll for abilities
    void rollForAbility()
    {
        int abilityRoll = 0;
        for (int die = 0;  die <= 3; die++){
            rollSixSided();
            abilityRoll = 

        }

        
    }
    
}
