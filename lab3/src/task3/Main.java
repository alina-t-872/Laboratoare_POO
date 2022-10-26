package task3;

import task1.CandyBox;
import task2.Lindt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();

        CandyBox candyBox = new CandyBox(flavor, origin);
        CandyBox candyBoxCopy = new CandyBox(flavor, origin);
        CandyBox candyBox2 = new CandyBox("vanilla", "Belgium");

        Lindt lindtBox = new Lindt();
        Lindt lindtBoxCopy = new Lindt(0.0f, 0.0f, 0.0f);
        Lindt lindtBox2 = new Lindt("vanilla", "Belgium", 2.0f, 2.0f, 4.0f);

        System.out.println(candyBox.equals(candyBoxCopy));
        System.out.println(candyBox.equals(candyBox2));

        System.out.println(lindtBox.equals(lindtBoxCopy));
        System.out.println(lindtBox.equals(lindtBox2));
    }
}
