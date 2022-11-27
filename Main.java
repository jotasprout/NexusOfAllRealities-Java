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

                myChar.race = Race.chooseRace();

                System.out.println(myChar);

                scan.close();
        }

}
