package task2;

import task1.CandyBox;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Lindt() {
        length = 0;
        width = 0;
        height = 0;
    }

    public Lindt(float length, float width, float height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getVolume() {
        return length * width * height;
    }

    public String toString() {
        return "Lindt: The " +
                this.getOrigin() + " " +
                this.getFlavor() +
                " chocolate has volume " +
                this.getVolume();
    }

    // task5
    public void printLindtDim() {
        System.out.println("Lindt: " + this.length + " " + this.width + " " + this.height);
    }

    // task6
    public void printDim() {
        System.out.println("Lindt: " + this.length + " " + this.width + " " + this.height);
    }
}
