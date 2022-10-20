package task3;

public class Polygon {
    Point[] vertices;

    public Polygon(int n) {
        vertices = new Point[n];
    }

    public Polygon(float[] v) {
        this(v.length/2);
        for (int i = 0; i < v.length; i+=2) {
            this.vertices[i / 2] = new Point(v[i], v[i + 1]);
        }
    }

    public void showPolygon() {
        for(int i = 0; i < this.vertices.length; i++) {
            this.vertices[i].showPoint();
        }
    }

}
