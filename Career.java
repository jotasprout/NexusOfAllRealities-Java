import java.util.*;

public class Career {

    static String career;

    static Character chooseCareer(Character thisChar, Scanner scan) {

        // Scanner scan = new Scanner(System.in);

        System.out.println("\nWhat is your character's Career? [type a number]\n"
                + "[1] Cleric\n"
                + "[2] Fighter\n"
                + "[3] Thief\n"
                + "[4] Wizard\n");

        String myCareerChoice = scan.nextLine();
        // int nextInt = Integer.parseInt(nextIntString);
        // int myCareerChoice = nextInt;

        switch (myCareerChoice) {
            case "Cleric":
                System.out.println("\nYou chose Cleric.\n");
                thisChar.career = "Cleric";
                Cleric.beCleric(thisChar);
                break;
            case "Fighter":
                System.out.println("\nYou chose Fighter.\n");
                thisChar.career = "Fighter";
                Fighter.beFighter(thisChar);
                break;
            case "Thief":
                System.out.println("\nYou chose Thief.\n");
                Thief.beThief(thisChar);
                thisChar.career = "Thief";
                break;
            case "Wizard":
                System.out.println("\nYou chose Wizard.\n");
                Wizard.beWizard(thisChar);
                thisChar.career = "Wizard";
                break;
            default:
                System.out.println("You chose lobster. Excellent choice.\n");
                // need a custom exception here
        }

        // need a custom exception here if int < 1 and int > 4

        // scan.close();
        return thisChar;

    }

}
