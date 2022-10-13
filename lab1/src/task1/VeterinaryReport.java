package task1;

public class VeterinaryReport {
    int dogs;
    int cats;

    public int getAnimalsCount() {
        return dogs + cats;
    }

    public void displayStatistics() {
        System.out.println("Total number of animals is " + getAnimalsCount());
    }
}
