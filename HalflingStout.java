public class HalflingStout extends Halfling {

    static Character beHalflingStout(Character myChar) {
        int oldCon = myChar.constitution;
        int newCon = oldCon + 1;
        myChar.constitution = newCon;
        myChar.myAbilityScores.put("constitution", newCon);
        System.out.println(
                "\nYour Constitution roll was " + oldCon + ". Your constitution as a Stout Halfling is " + newCon
                        + ".\n");

        return myChar;
    }

    // AbilityScoreIncrease
    // Proficiencies
    // Languages
    // Speed
}
