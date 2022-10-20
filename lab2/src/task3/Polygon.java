package task3;

public class Polygon {
    private int noSides;
    private Point[] vertex;

    public Polygon(int n) {
        noSides = n;
        vertex = new Point[n];
    }

    public Polygon(float[] points) {
        this(points.length / 2);
        for (int i = 0; i < points.length; i += 2) {
            vertex[i / 2] = new Point(points[i], points[i + 1]);
        }
    }

    public void showPolygon() {
        for (int i = 0; i < vertex.length; i++)
            vertex[i].showPoint();
    }
}
