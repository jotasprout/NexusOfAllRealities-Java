//import java.util.Random;

public class Dice {

    // 4, 6, 8, 10, 12, 20
    public int min;
    public int max;

    static int rollRandomNumber(int min, int max){
        return (int)((Math.random()*(max - min)) + min);
    }

    static int fourSidedRoll;

    // roll one four-sided die
    static int rollFourSided() {
        int randomFourSidedNum = rollRandomNumber(1,4);
        fourSidedRoll = randomFourSidedNum;
        return fourSidedRoll;
    }

    static int sixSidedRoll;

    // roll one six-sided die
    static int rollSixSided() {
        int randomSixSidedNum = rollRandomNumber(1,6);
        sixSidedRoll = randomSixSidedNum;
        System.out.println("Roll: " + sixSidedRoll + "\n");
        return sixSidedRoll;
    }

    static int eightSidedRoll;

    // roll one eight-sided die
    static int rollEightSided() {
        int randomEightSidedNum = rollRandomNumber(1,8);
        eightSidedRoll = randomEightSidedNum;
        return eightSidedRoll;
    }

    static int tenSidedRoll;

    // roll one ten-sided die
    static int rollTenSided() {
        int randomTenSidedNum = rollRandomNumber(1,10);
        tenSidedRoll = randomTenSidedNum;
        return tenSidedRoll;
    }

    static int twelveSidedRoll;

    // roll one twelve-sided die
    static int rollTwelveSided() {
        int randomTwelveSidedNum = rollRandomNumber(1,12);
        twelveSidedRoll = randomTwelveSidedNum;
        return twelveSidedRoll;
    }

    static int twentySidedRoll;

    // roll one twenty-sided die
    static int rollTwentySided() {
        int randomTwentySidedNum = rollRandomNumber(1,20);
        twentySidedRoll = randomTwentySidedNum;
        return twentySidedRoll;
    }

}
