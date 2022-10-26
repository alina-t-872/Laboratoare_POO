package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();
        float radius = scanner.nextFloat();

        Lindt lindtBoxDefault = new Lindt();
        Lindt lindtCandyBox = new Lindt(flavor, origin, length, width, height);
        Baravelli baravelliCandyBox = new Baravelli(flavor, origin, radius, height);
        ChocAmor chocAmorCandyBox = new ChocAmor(flavor, origin, length);

        System.out.println(lindtBoxDefault);
        System.out.println(lindtCandyBox);
        System.out.println(baravelliCandyBox);
        System.out.println(chocAmorCandyBox);
    }
}
