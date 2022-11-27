import java.util.*;

public class Main

{
        public static void main(String args[]) {

                // SCANNER CREATION
                Scanner scan = new Scanner(System.in);

                System.out.println("What is the name of your character?");
                String myName = scan.nextLine();

                Character myChar = new Character(myName);

                System.out.println("Let's see what " + myChar.name + " is good for.");

                myChar = Abilities.rollForAbilities(myChar);

                myChar.race = Race.chooseRace();

                System.out.println(myChar);

                scan.close();
        }

}
