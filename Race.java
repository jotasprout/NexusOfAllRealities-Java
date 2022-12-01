import java.util.*;

public class Race {

    static String race;
    static String subRace;
    static String subDwarf;
    static String subElf;
    static String subHalfling;

    static String chooseRace(Character aChar) {

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
                chooseSubRace(myRaceChoice, aChar);
                break;
            case 2:
                System.out.println("\nYou chose dwarf.\n");
                race = "dwarf";
                chooseSubRace(myRaceChoice, aChar);
                break;
            case 3:
                System.out.println("\nYou chose elf.\n");
                chooseSubRace(myRaceChoice, aChar);
                race = "elf";
                break;
            case 4:
                System.out.println("\nYou chose halfling.\n");
                chooseSubRace(myRaceChoice, aChar);
                race = "halfling";
                break;
            default:
                System.out.println("You chose snail. Excellent choice.\n");
                // need a custom exception here
        }

        // need a custom exception here if int < 1 and int > 4

        scan.close();
        return race;

    }

    static String chooseSubRace(int myRaceChoice, Character myChar) {

        Scanner scan = new Scanner(System.in);
        // int mySubRaceChoice = scan.nextInt();

        switch (myRaceChoice) {
            case 1: // Human
                System.out.println("\nHumans have no sub-race.\n");
                subRace = "none";
                break;
            case 2: // Dwarf
                myChar.subRace = chooseSubDwarf();
                // subRace = mySubDwarf;
                // subRace = chooseSubDwarf();
                break;
            case 3: // Elf
                myChar.subRace = chooseSubElf();
                break;
            case 4: // Halfling
                myChar.subRace = chooseSubHalfling();
                // subRace = subHalfling;
                break;
            default:
                System.out.println("You didn't have a choice. Just keep saying that.\n");
                // need a custom exception here
        }

        scan.close();
        return subRace;
    }

    static String chooseSubDwarf() {

        // string mySubDwarf;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nChoose a Dwarf sub-race.\n"
                + "[1] Hill Dwarf\n"
                + "[2] Mountain Dwarf\n"
                + "[3] None\n");

        int mySubDwarfChoice = scan.nextInt();

        switch (mySubDwarfChoice) {
            case 1:
                System.out.println("\nYou chose Hill Dwarf.\n");
                subRace = "Hill Dwarf";
                break;
            case 2:
                System.out.println("\nYou chose Mountain Dwarf.\n");
                subRace = "Mountain Dwarf";
                break;
            case 3:
                System.out.println("\nYou chose none.\n");
                subRace = "none";
                break;
            default:
                System.out.println("You chose regular old Dwarf. Nothing wrong with that.\n");
        }
        // need a custom exception here if int < 1 and int > 3

        scan.close();
        return subRace;
    }

    static String chooseSubElf() {

        // String mySubElf;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nChoose an Elf sub-race.\n"
                + "[1] High Elf\n"
                + "[2] Wood Elf\n"
                + "[3] Dark Elf\n"
                + "[4] None\n");

        int mySubElfChoice = scan.nextInt();

        switch (mySubElfChoice) {
            case 1:
                System.out.println("\nYou chose High Elf.\n");
                subRace = "High Elf";
                break;
            case 2:
                System.out.println("\nYou chose Wood Elf.\n");
                subRace = "Wood Elf";
                break;
            case 3:
                System.out.println("\nYou chose Dark Elf.\n");
                subRace = "Dark Elf";
                break;
            case 4:
                System.out.println("\nYou chose none.\n");
                subRace = "none";
                break;
            default:
                System.out.println("You chose just Elf.\n");
        }
        // need a custom exception here if int < 1 and int > 4

        scan.close();
        return subRace;
    }

    static String chooseSubHalfling() {

        // String mySubHalfling;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nChoose a Halfling sub-race.\n"
                + "[1] Lightfoot Halfling\n"
                + "[2] Stout Halfling\n"
                + "[3] None\n");

        int mySubHalflingChoice = scan.nextInt();

        switch (mySubHalflingChoice) {
            case 1:
                System.out.println("\nYou chose Lightfoot Halfling.\n");
                subRace = "Lightfoot Halfling";
                break;
            case 2:
                System.out.println("\nYou chose Stout Halfling.\n");
                subRace = "Stout Halfling";
                break;
            case 3:
                System.out.println("\nYou chose none.\n");
                subRace = "none";
                break;
            default:
                System.out.println("You chose a humble Halfling. Good for you.\n");
        }
        // need a custom exception here if int < 1 and int > 3

        scan.close();
        return subRace;
    }
}
