import java.util.*;

public class Race {

    static String race;

    static String chooseRace() {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nWhat race is your character (type a number)?\n"
                + "[1] Human\n"
                + "[2] Dwarf\n"
                + "[3] Elf\n"
                + "[4] Halfling\n");

        int myRaceChoice = scan.nextInt();

        switch (myRaceChoice) {
            case 1:
                System.out.println("\nYou chose human.\n");
                race = "human";
                break;
            case 2:
                System.out.println("\nYou chose dwarf.\n");
                race = "dwarf";
                break;
            case 3:
                System.out.println("\nYou chose elf.\n");
                race = "elf";
                break;
            case 4:
                System.out.println("\nYou chose halfling.\n");
                race = "halfling";
                break;
            default:
                System.out.println("You chose snail. Excellent choice.\n");
                // need a custom exception here
        }

        scan.close();
        return race;

    }

}
