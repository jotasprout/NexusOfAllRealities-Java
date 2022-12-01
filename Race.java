import java.util.*;

public class Race {

    static String race;
    static String subRace;

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

    static string chooseSubDwarf() {

        Scanner scan = new Scanner(System.in);
        int mySubRaceChoice = scan.nextInt();

        switch (myRaceChoice) {
            case 1:
                System.out.println("\nHumans have no sub-race.\n");
                subRace = "none";
                break;
            case 2:
                System.out.println("\nChoose a Dwarf sub-race.\n");
                + "[1] Hill Dwarf\n"
                + "[2] Mountain Dwarf\n"
                + "[3] None\n";
                subRace = mySubDwarf;
                break;
            case 3:
                System.out.println("\nChoose an Elf sub-race.\n");
                + "[1] High Elf\n"
                + "[2] Wood Elf\n"
                + "[3] None\n";            
                subRace = subElf;
                break;
            case 4:
                System.out.println("\nChoose a Halfling sub-race.\n");
                + "[1] Lightfoot Halfling\n"
                + "[2] Stout Halfling\n"
                + "[3] None\n";  
                subRace = subHalfling;
                break;
            default:
                System.out.println("You chose a pureblood. Excellent choice.\n");
                // need a custom exception here
        }
    }

    static string chooseSubElf() {

        Scanner scan = new Scanner(System.in);
        int mySubRaceChoice = scan.nextInt();

        switch (myRaceChoice) {
            case 1:
                System.out.println("\nHumans have no sub-race.\n");
                subRace = "none";
                break;
            case 2:
                System.out.println("\nChoose a Dwarf sub-race.\n");
                + "[1] Hill Dwarf\n"
                + "[2] Mountain Dwarf\n"
                + "[3] None\n";
                subRace = mySubDwarf;
                break;
            case 3:
                System.out.println("\nChoose an Elf sub-race.\n");
                + "[1] High Elf\n"
                + "[2] Wood Elf\n"
                + "[3] None\n";            
                subRace = subElf;
                break;
            case 4:
                System.out.println("\nChoose a Halfling sub-race.\n");
                + "[1] Lightfoot Halfling\n"
                + "[2] Stout Halfling\n"
                + "[3] None\n";  
                subRace = subHalfling;
                break;
            default:
                System.out.println("You chose a pureblood. Excellent choice.\n");
                // need a custom exception here
        }
    }

    static string chooseSubHalfling() {

        Scanner scan = new Scanner(System.in);
        int mySubRaceChoice = scan.nextInt();

        switch (myRaceChoice) {
            case 1:
                System.out.println("\nHumans have no sub-race.\n");
                subRace = "none";
                break;
            case 2:
                System.out.println("\nChoose a Dwarf sub-race.\n");
                + "[1] Hill Dwarf\n"
                + "[2] Mountain Dwarf\n"
                + "[3] None\n";
                subRace = mySubDwarf;
                break;
            case 3:
                System.out.println("\nChoose an Elf sub-race.\n");
                + "[1] High Elf\n"
                + "[2] Wood Elf\n"
                + "[3] None\n";            
                subRace = subElf;
                break;
            case 4:
                System.out.println("\nChoose a Halfling sub-race.\n");
                + "[1] Lightfoot Halfling\n"
                + "[2] Stout Halfling\n"
                + "[3] None\n";  
                subRace = subHalfling;
                break;
            default:
                System.out.println("You chose a pureblood. Excellent choice.\n");
                // need a custom exception here
        }
    }

    static string chooseSubRace(int myRaceChoice) {

        Scanner scan = new Scanner(System.in);
        int mySubRaceChoice = scan.nextInt();

        switch (myRaceChoice) {
            case 1:
                System.out.println("\nHumans have no sub-race.\n");
                subRace = "none";
                break;
            case 2:
                System.out.println("\nChoose a Dwarf sub-race.\n");
                + "[1] Hill Dwarf\n"
                + "[2] Mountain Dwarf\n"
                + "[3] None\n";
                subRace = mySubDwarf;
                break;
            case 3:
                System.out.println("\nChoose an Elf sub-race.\n");
                + "[1] High Elf\n"
                + "[2] Wood Elf\n"
                + "[3] None\n";            
                subRace = subElf;
                break;
            case 4:
                System.out.println("\nChoose a Halfling sub-race.\n");
                + "[1] Lightfoot Halfling\n"
                + "[2] Stout Halfling\n"
                + "[3] None\n";  
                subRace = subHalfling;
                break;
            default:
                System.out.println("You chose a pureblood. Excellent choice.\n");
                // need a custom exception here
        }
    }
}
