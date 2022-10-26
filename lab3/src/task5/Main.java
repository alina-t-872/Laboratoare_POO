package task5;

import java.util.*;

import task1.CandyBox;
import task2.Lindt;
import task2.Baravelli;
import task2.ChocAmor;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();
        float radius = scanner.nextFloat();

        CandyBox lindtBox = new Lindt(flavor, origin, length, width, height);
        CandyBox baravelliBox = new Baravelli(flavor, origin, radius, height);
        CandyBox chocAmorBox = new ChocAmor(flavor, origin, length);

        lindtBox.printLindtDim();
        baravelliBox.printBaravelliDim();
        chocAmorBox.printChocAmorDim();
    }
}
