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
                    myChar.race = "human";
                    break;
            case 2: System.out.println("You chose dwarf");
                    myChar.race = "dwarf";
                    break;
            case 3: System.out.println("You chose elf");
                    myChar.race = "elf";
                    break;
            case 4: System.out.println("You chose halfling");
                    myChar.race = "halfling";
                    break;                    
            default: System.out.println("You chose snail. Excellent choice.");
            // need a custom exception here
        }

        System.out.println("Let's see what " + myChar.name + " is good for.");

        // STRENGTH
        System.out.println("Rolling for Strength first ... ");
        AbilityRoll strengthRoll = new AbilityRoll();
        System.out.println("Strength is " + strengthRoll.abilityRoll + ".");
        myChar.strength = strengthRoll.abilityRoll;

        // DEXTERITY
        System.out.println("Rolling for dexterity ... ");
        AbilityRoll dexterityRoll = new AbilityRoll();
        System.out.println("Dexterity is " + dexterityRoll.abilityRoll + ".");
        myChar.dexterity = dexterityRoll.abilityRoll;

        // CONSTITUTION
        System.out.println("Rolling for Constitution ... ");
        AbilityRoll constitutionRoll = new AbilityRoll();
        System.out.println("Constitution is " + constitutionRoll.abilityRoll + ".");
        myChar.constitution = constitutionRoll.abilityRoll;

        // INTELLIGENCE
        System.out.println("Rolling for Intelligence ... ");
        AbilityRoll intelligenceRoll = new AbilityRoll();
        System.out.println("Intelligence is " + intelligenceRoll.abilityRoll + ".");
        myChar.intelligence = intelligenceRoll.abilityRoll;

        // WISDOM
        System.out.println("Rolling for Wisdom ... ");
        AbilityRoll wisdomRoll = new AbilityRoll();
        System.out.println("Wisdom is " + wisdomRoll.abilityRoll + ".");
        myChar.wisdom = wisdomRoll.abilityRoll;

        // CHARISMA
        System.out.println("Rolling for Charisma ... ");
        AbilityRoll charismaRoll = new AbilityRoll();
        System.out.println("Charisma is " + charismaRoll.abilityRoll + ".");
        myChar.charisma = charismaRoll.abilityRoll;

        System.out.println(myChar);

        scan.close();
    }

    
}
