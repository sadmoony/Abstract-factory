package classes;

public abstract class CharacterClass {

    protected String name;
    protected int dice;

    public int getDice() {
        return dice;
    }

    @Override
    public String toString() {
        return "Class: " + name + " (uses " + dice + "D dice to roll hp)";
    }

    public abstract void printMagika();
}
