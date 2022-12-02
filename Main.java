import java.util.*;

public class Main

{
    public static void main(String args[]) {

        System.out.println("Are you old like me and tried to teach your children Dungeons & Dragons?\n");

        System.out.println("Felt even more stupid than when you try to help with their homework, right?\n");

        System.out.println(
                "This app does all those newfangled calculations -- that make the game both more realistic but also more of a pain in the buttocks -- for you.\n");

        System.out.println(
                "I'll sidestep the bummer that you don't get to roll the dice by saying, even if you didn't buy or lost your dice, the app takes care of that, too.\n");

        System.out.println(
                "We'll start creating your character by naming it -- you can always change the name later if you feel Dwarf parents would't really name their daughter Bernie.\n");

        // SCANNER CREATION
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your character's name?\n");

        String myName = scan.nextLine();

        Character myChar = new Character(myName);

        System.out.println("\nLet's see what " + myChar.name + " is good for.\n");

        myChar = Abilities.rollForAbilities(myChar);

        myChar = Race.chooseRace(myChar);

        myChar = Career.chooseCareer(myChar);

        System.out.println(myChar);

        for (String i : myChar.myAbilityScores.keySet()) {
            System.out.println(i + ": " + myChar.myAbilityScores.get(i));
        }

        scan.close();
    }

}
