package Main;

import Main.Stats;
import Race.CharacterRace;
import classes.CharacterClass;

import java.util.Set;

public class Character {
    private String name;
    private CharacterClass dndClass;
    private CharacterRace race;
    private Stats attributes;
    private int hp;

    public Character(String name, CharacterClass dndClass, CharacterRace race){
        this.name = name;
        this.dndClass = dndClass;
        this.hp = dndClass.getDice();
        this.race = race;
    }

    public void setRace(CharacterRace race){
        this.race = race;
    }

    public CharacterRace getRace() {
        return race;
    }

    public String getName(){
        return name;
   }

    public void setName(String name) {
        this.name = name;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }

    public void addRaceBonuses(){
        Set <String> key = this.attributes.getStats().keySet();

        for(String title : key){

            int val = this.attributes.getStats().get(title) + this.race.getRaceBonuses(title);
            this.attributes.getStats().put(title, val);

        }

        this.hp += Math.floor(this.attributes.getStats().get("Constitution")/2) - 5;
    }


    public void printSheet(){
        System.out.println("Name of character: " + name + "\n"
                            + dndClass.toString() + "\n"
                            + "HP: " + hp);
        dndClass.printMagika();
        attributes.print();
    }
}
