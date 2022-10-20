package task3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();

        Point point = new Point(x1, y1);
        point.showPoint();

        point.changeCoords(x2, y2);
        point.showPoint();

        int n = scanner.nextInt();
        float[] points = new float[n];

        for(int i = 0; i < n; i++) {
            points[i] = i;
        }

        Polygon polygon = new Polygon(points);
        System.out.println("Poligonul are urmatoarele coordonate:");
        polygon.showPolygon();
    }
}
