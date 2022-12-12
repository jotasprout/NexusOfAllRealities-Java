import java.util.Random;

public class Dice {

    // 4, 6, 8, 10, 12, 20

    static int fourSidedRoll;

    // roll one four-sided die
    static int rollFourSided() {
        Random objGenerator = new Random();
        int randomFourSidedNum = objGenerator.nextInt(4);
        fourSidedRoll = randomFourSidedNum;
        return fourSidedRoll;
    }

    static int sixSidedRoll;

    // roll one six-sided die
    static int rollSixSided() {
        Random objGenerator = new Random();
        int randomSixSidedNum = objGenerator.nextInt(6);
        sixSidedRoll = randomSixSidedNum;
        System.out.println("Roll: " + sixSidedRoll + "\n");
        return sixSidedRoll;
    }

    static int eightSidedRoll;

    // roll one eight-sided die
    static int rollEightSided() {
        Random objGenerator = new Random();
        int randomEightSidedNum = objGenerator.nextInt(8);
        eightSidedRoll = randomEightSidedNum;
        return eightSidedRoll;
    }

    static int tenSidedRoll;

    // roll one ten-sided die
    static int rollTenSided() {
        Random objGenerator = new Random();
        int randomTenSidedNum = objGenerator.nextInt(10);
        tenSidedRoll = randomTenSidedNum;
        return tenSidedRoll;
    }

    static int twelveSidedRoll;

    // roll one twelve-sided die
    static int rollTwelveSided() {
        Random objGenerator = new Random();
        int randomTwelveSidedNum = objGenerator.nextInt(12);
        twelveSidedRoll = randomTwelveSidedNum;
        return twelveSidedRoll;
    }

    static int twentySidedRoll;

    // roll one twenty-sided die
    static int rollTwentySided() {
        Random objGenerator = new Random();
        int randomTwentySidedNum = objGenerator.nextInt(20);
        twentySidedRoll = randomTwentySidedNum;
        return twentySidedRoll;
    }

}
