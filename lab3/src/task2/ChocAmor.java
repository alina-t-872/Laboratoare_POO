package task2;

import task1.CandyBox;

public class ChocAmor extends CandyBox {
    private float length;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public ChocAmor() {
        super();
        length = 0;
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    public float getVolume() {
        return length * length * length;
    }

    public String toString() {
        return "ChocAmor: The " +
                this.getOrigin() + " " +
                this.getFlavor() +
                " chocolate has volume " +
                this.getVolume();
    }

    // task5
    public void printChocAmorDim() {
        System.out.println("ChocAmor: " + this.length);
    }

    // task6
    public void printDim() {
        System.out.println("ChocAmor: " + this.length);
    }
}
