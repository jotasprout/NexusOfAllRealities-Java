public class ElfWood extends Elf {

    static Character beElfWood(Character myChar) {
        int oldWis = myChar.wisdom;
        int newWis = oldWis + 1;
        myChar.wisdom = newWis;
        System.out.println(
                "\nYour Wisdom roll was " + oldWis + ". Your wisdom as a Wood Elf is now " + newWis + ".\n");
        return myChar;
    }

    // Proficiencies

}
