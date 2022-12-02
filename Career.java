import java.util.*;

public class Career {

    static String career;

    static String chooseCareer(Character aChar) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nWhat is your character's Career? [type a number]\n"
                + "[1] Cleric\n"
                + "[2] Fighter\n"
                + "[3] Thief\n"
                + "[4] Wizard\n");

        int myCareerChoice = scan.nextInt();

        switch (myCareerChoice) {
            case 1:
                System.out.println("\nYou chose Cleric.\n");
                aChar.career = "Cleric";
                Cleric.beCleric(aChar);
                break;
            case 2:
                System.out.println("\nYou chose Fighter.\n");
                aChar.career = "Fighter";
                Fighter.beFighter(aChar);
                break;
            case 3:
                System.out.println("\nYou chose Thief.\n");
                Thief.beThief(aChar);
                aChar.career = "Thief";
                break;
            case 4:
                System.out.println("\nYou chose Wizard.\n");
                Wizard.beWizard(aChar);
                aChar.career = "Wizard";
                break;
            default:
                System.out.println("You chose lobster. Excellent choice.\n");
                // need a custom exception here
        }

        // need a custom exception here if int < 1 and int > 4

        scan.close();
        return career;

    }

}
