import java.util.Random;

public class Dice {
    static int sixSidedRoll;

    // roll one six-sided die
    static int rollSixSided() {
        Random objGenerator = new Random();
        int randomSixSidedNum = objGenerator.nextInt(6);
        sixSidedRoll = randomSixSidedNum;
        return sixSidedRoll;
    }

}
