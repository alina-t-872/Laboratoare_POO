package task4;

import java.util.*;

import task1.CandyBox;
import task2.Lindt;
import task2.Baravelli;
import task2.ChocAmor;

public class CandyBag {
    private ArrayList<CandyBox> candies = new ArrayList<CandyBox>();

    public ArrayList<CandyBox> getCandies() {
        return candies;
    }

    public void setCandies(ArrayList<CandyBox> candies) {
        this.candies = candies;
    }

    public CandyBag() {
        Lindt firstBox = new Lindt("cherry", "Austria", 20.0f, 5.4f, 19.2f);
        Lindt secondBox = new Lindt("apricot", "Austria", 20.0f, 5.4f, 19.2f);
        Lindt thirdBox = new Lindt("strawberry", "Austria", 20.0f, 5.4f, 19.2f);

        candies.add(firstBox);
        candies.add(secondBox);
        candies.add(thirdBox);

        Baravelli forthBox = new Baravelli("grape", "Italy", 6.7f, 8.7f);

        candies.add(forthBox);

        ChocAmor fifthBox = new ChocAmor("coffee", "France", 5.5f);
        ChocAmor sixthBox = new ChocAmor("vanilla", "France", 5.5f);

        candies.add(fifthBox);
        candies.add(sixthBox);
    }
}
