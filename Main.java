import java.util.*;

public class Main 

{
    public static void main (String args[]) {

        // SCANNER CREATION
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the name of your character?");
        String myName = scan.nextLine();

        Character myChar = new Character(myName, 1);

        System.out.println("\nWhat race is your character (type a number)?\n"
                            + "[1] Human\n"
                            + "[2] Dwarf\n"
                            + "[3] Elf\n"
                            + "[4] Halfling\n");

        int myRaceChoice = scan.nextInt();

        switch(myRaceChoice) {
            case 1: System.out.println("You chose human");
                    break;
            case 2: System.out.println("You chose dwarf");
                    break;
            case 3: System.out.println("You chose elf");
                    break;
            case 4: System.out.println("You chose halfling");
                    break;                    
            default: System.out.println("You chose snail. Excellent choice.");
        }

        System.out.println("Let's see what " + myChar.name + " is good for.");
        System.out.println("Rolling for Strength first ... ");

        AbilityRoll strengthRoll = new AbilityRoll();

        System.out.println("Strength is " + strengthRoll.abilityRoll + ".");

        myChar.strength = strengthRoll.abilityRoll;
        System.out.println(myChar.name + " has a Strength score of " + myChar.strength + ".");
        System.out.println(myChar);

        scan.close();
    }

    
}
