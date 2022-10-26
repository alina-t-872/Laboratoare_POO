package task1;

public class CandyBox {
    private String flavor;
    private String origin;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public CandyBox() {
        flavor = "sugar-free";
        origin = "Switzerland";
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "The " + origin + " " +
                flavor + " chocolate";
    }

    // solution for task 3
    /* If both the flavor and the country of origin are the same,
    * both chocolates are the same */
    public boolean equals(CandyBox box) {
        if (this.flavor == box.flavor &&
                this.origin == box.origin)
            return true;
        return false;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return equals(object);
        }

        if (!(object instanceof CandyBox)) {
            return false;
        }

        return equals((CandyBox) object);
    }

        // task5

    public void printLindtDim() {
    }

    public void printBaravelliDim() {
    }

    public void printChocAmorDim() {
    }

    // task6
    public void printDim() {
    }
}
