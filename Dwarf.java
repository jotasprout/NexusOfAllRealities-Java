public class Dwarf {

    static Character beDwarf(Character myChar) {
        int oldCon = myChar.constitution;
        int newCon = oldCon + 2;
        myChar.constitution = newCon;
        myChar.myAbilityScores.put("constitution", newCon);
        System.out.println(
                "\nYour Constitution roll was " + oldCon + ". Your constitution as a Dwarf is " + newCon + ".\n");
        myChar.languages.add("Common");
        myChar.languages.add("Dwarvish");

        myChar.speed = 25;

        return myChar;
    }
    // Minimum Constitution = 9

    // Proficiencies
    // Languages
    // Speed
}