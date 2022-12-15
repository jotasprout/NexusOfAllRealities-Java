import java.util.*;

public class Menu

{
    public static void main(String args[]) {

            // What would you like to do?
    // Create a character
    // See a list of my characters
    // See a character
    // Fight a thing

        System.out.println(
                "We'll start creating your character by naming it -- you can always change the name later if you feel Dwarf parents would't really name their daughter Bernie.\n");

        // SCANNER CREATION
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your character's name?\n");

        String myName = scan.nextLine();

        Character myChar = new Character(myName);

        System.out.println("\nLet's see what " + myChar.name + " is good for.\n");

        myChar = Abilities.rollForAbilities(myChar);

        myChar = Race.chooseRace(myChar, scan);

        myChar = Career.chooseCareer(myChar, scan);

        System.out.println(myChar);

        for (String i : myChar.myAbilityScores.keySet()) {
            System.out.println(i + ": " + myChar.myAbilityScores.get(i));
        }
        // SCANNER CLOSE
        scan.close();
    }

}
