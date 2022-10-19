package Race;

import Main.Stats;

public abstract class CharacterRace {

    protected String name;
    protected Stats bonuses;

    public abstract int getRaceBonuses(String type);

    public abstract void battleCry();
}
