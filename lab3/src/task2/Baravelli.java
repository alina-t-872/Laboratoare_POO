package task2;

import task1.CandyBox;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Baravelli() {
        super();
        radius = 0;
        height = 0;
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    public float getVolume() {
        return radius * radius * (float) (Math.PI) * height;
    }

    public String toString() {
        return "Baravelli: The " +
                this.getOrigin() + " " +
                this.getFlavor() +
                " chocolate has volume " +
                this.getVolume();
    }

    // task5
    public void printBaravelliDim() {
        System.out.println("Baravelli: " + this.radius + " " + this.height);
    }

    // task6
    public void printDim() {
        System.out.println("Baravelli: " + this.radius + " " + this.height);
    }
}
