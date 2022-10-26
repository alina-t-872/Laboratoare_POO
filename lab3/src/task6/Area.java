package task6;

import task2.Lindt;
import task2.Baravelli;
import task2.ChocAmor;
import task4.CandyBag;

public class Area {
    private CandyBag presentBag;
    private int number;
    private String street;
    private String message;

    public CandyBag getCandyBag() {
        return presentBag;
    }

    public void setCandyBag(CandyBag candyBag) {
        this.presentBag = candyBag;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Area() {
        number = 0;
        street = "nowhere";
        message = "nowhere";
        presentBag = new CandyBag();
    }

    public Area(int number, String street, String message, CandyBag presentBag) {
        this.number = number;
        this.street =  street;
        this.message = message;
        this.presentBag = presentBag;
    }

    public void getBirthdayCard() {
        System.out.println("Street " + street + ", number " + number + "\n");
        System.out.println(message + "\n");

        for (int i = 0; i < presentBag.getCandies().size(); i++) {
            if (presentBag.getCandies().get(i) instanceof  Lindt) {
                presentBag.getCandies().get(i).printLindtDim();
            } else if (presentBag.getCandies().get(i) instanceof Baravelli) {
                presentBag.getCandies().get(i).printBaravelliDim();
            } else if (presentBag.getCandies().get(i) instanceof ChocAmor) {
                presentBag.getCandies().get(i).printChocAmorDim();
            }
        }
    }

    public void getBirthdayCardv2() {
        System.out.println("Street " + street + ", number " + number + "\n");
        System.out.println(message + "\n");

        for (int i = 0; i < presentBag.getCandies().size(); i++) {
            presentBag.getCandies().get(i).printDim();
        }
    }
}
