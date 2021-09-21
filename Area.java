package laborator3.task1;

import java.util.ArrayList;

public class Area {
    CandyBag candyBag = null;
    int number;
    String street;

    public Area() {
    }

    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    void getBirthdayCard() {
        System.out.println("Adress: " + street);
        System.out.println("Happy birthday!");
    }

    void displayGift(ArrayList<CandyBox> candyBoxes) {
        for (CandyBox cb : candyBoxes) {
            System.out.println(cb.toString());
        }
    }
}
