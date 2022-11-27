import java.util.*;

public class Main

{
        public static void main(String args[]) {

                // SCANNER CREATION
                Scanner scan = new Scanner(System.in);

                System.out.println("What is the name of your character?");
                String myName = scan.nextLine();

                Character myChar = new Character(myName);

                myChar.race = Race.chooseRace();

                // System.out.println("\nWhat race is your character (type a number)?\n"
                // + "[1] Human\n"
                // + "[2] Dwarf\n"
                // + "[3] Elf\n"
                // + "[4] Halfling\n");

                // int myRaceChoice = scan.nextInt();

                // switch(myRaceChoice) {
                // case 1: System.out.println("You chose human");
                // myChar.race = "human";
                // break;
                // case 2: System.out.println("You chose dwarf");
                // myChar.race = "dwarf";
                // break;
                // case 3: System.out.println("You chose elf");
                // myChar.race = "elf";
                // break;
                // case 4: System.out.println("You chose halfling");
                // myChar.race = "halfling";
                // break;
                // default: System.out.println("You chose snail. Excellent choice.");
                // need a custom exception here

                System.out.println("Let's see what " + myChar.name + " is good for.");

                // SHOULDN'T THE FOLLOWING BE A METHOD?

                String[] abilities = { "strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma" };

                for (String ability : abilities) {
                        System.out.println("Rolling for " + ability + " ...");
                        AbilityRoll thisRoll = new AbilityRoll();

                        switch (ability) {
                                case "strength":
                                        System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                                        myChar.strength = thisRoll.abilityRoll;
                                        break;
                                case "dexterity":
                                        System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                                        myChar.dexterity = thisRoll.abilityRoll;
                                        break;
                                case "constitution":
                                        System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                                        myChar.constitution = thisRoll.abilityRoll;
                                        break;
                                case "intelligence":
                                        System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                                        myChar.intelligence = thisRoll.abilityRoll;
                                        break;
                                case "wisdom":
                                        System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                                        myChar.wisdom = thisRoll.abilityRoll;
                                        break;
                                case "charisma":
                                        System.out.println(ability + " is " + thisRoll.abilityRoll + ".");
                                        myChar.charisma = thisRoll.abilityRoll;
                                        break;
                                default:
                                        System.out.println("You need better dice.");
                                        // need a custom exception here
                        }
                }

                System.out.println(myChar);

                scan.close();
        }

}
