public class DwarfHill extends Dwarf {

    static Character beDwarfHill (Character myChar){
        int oldmaxHP = myChar.maxHitPoints;
        int newmaxHP = oldmaxHP + 1;
        myChar.maxHitPoints = newmaxHP;
        System.out.println(
                "\nAs a Hill Dwarf, your maximum Hit Points gain 1 every level.\n");
        // need method to add 1 to maxHP
        // need method to repeat this every level
        int oldWis = myChar.wisdom;
        int newWis = oldWis + 1;
        myChar.wisdom = newWis;
        System.out.println(
                "\nYour Wisdom roll was " + oldWis + ". Your wisdom as a Hill Dwarf is now " + newWis + ".\n");
        return myChar;
    }

    // Proficiencies

}
