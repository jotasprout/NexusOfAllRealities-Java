public class DwarfMountain extends Dwarf {

    static Character beDwarfMountain(Character myChar) {
        int oldStr = myChar.strength;
        int newStr = oldStr + 2;
        myChar.strength = newStr;
        myChar.myAbilityScores.put("strength", newStr);
        System.out.println(
                "\nYour Strength roll was " + oldStr + ". Your strength as a Mountain Dwarf is " + newStr + ".\n");

        return myChar;
    }

    // Proficiencies
}
