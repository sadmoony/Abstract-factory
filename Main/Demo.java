package Main;

import Race.ElfFactory;
import Race.RaceFactory;
import classes.ClassFactory;

public class Demo {

    public static void main(String[] args){
        Character character = new Character("Moonlight", ClassFactory.getClass("classes.Paladin"), RaceFactory.getRace(new ElfFactory()));

        character.setAttributes(Stats.generate());
        character.addRaceBonuses();
        character.printSheet();

    }
}
