package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();

        CandyBox candyBoxDefault = new CandyBox();
        CandyBox candyBox = new CandyBox(flavor, origin);

        System.out.println("Constructor with no parameters test:");
        System.out.println(candyBoxDefault + "\n");

        System.out.println("Constructor with parameters test:");
        System.out.println(candyBox + "\n");

        System.out.println("getVolume() test:");
        System.out.println(candyBox + " has volume " + candyBox.getVolume());
    }
}
