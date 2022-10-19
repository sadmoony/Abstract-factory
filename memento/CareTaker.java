package memento;

import java.util.*;
import Main.Stats;

public class CareTaker {
    protected List<Stats> mementoList = new ArrayList<Stats>();
    static int saveId = 0;

    protected void add(Stats state){
        mementoList.add(state);
        System.out.println("\nState saved. Save id: " + saveId);
        System.out.println("--------------");
        System.out.println();
        saveId++;
    }

    protected Stats get(int index){
        System.out.println("\nLoading from save id" + index + "...");
        return mementoList.get(index);
    }
}
