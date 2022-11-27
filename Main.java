import java.util.*;

public class Main

{
        public static void main(String args[]) {

                // SCANNER CREATION
                Scanner scan = new Scanner(System.in);

                System.out.println("Are you old like me and tried to teach your children Dungeons & Dragons?");

                System.out.println("Felt even more stupid than when you try to help with their homework, right?");

                System.out.println(
                        "This app does all those newfangled calculations -- that make the game both more realistic but also more of a pain in the buttocks -- for you.");

                System.out.println(
                        "I'll sidestep the bummer that you don't get to roll the dice by saying, even if you didn't buy or lost your dice, the app takes care of that, too.");

                System.out.println(
                        "We create your character by naming it -- you can always change the name later if you feel Dwarf parents would't really name their daughter Bernie.");

                System.out.println("What is your character's name?");

                String myName = scan.nextLine();
                Character myChar = new Character(myName);

                System.out.println("Let's see what " + myChar.name + " is good for.");

                myChar = Abilities.rollForAbilities(myChar);

                myChar.race = Race.chooseRace();

                System.out.println(myChar);

                scan.close();
        }

}
