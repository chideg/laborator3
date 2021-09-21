package laborator3.task1;

public class Gift{
    public static void main(String[] args) {

        CandyBox cb1 = new Lindt("banana", "Belgium", 25, 12, 2f);
        CandyBox cb2 = new Baravelli("cherry", "UK", 12, 10);
        CandyBox cb3 = new ChocAmor("mango", "Romania" , 20);
        CandyBag candyBag = new CandyBag();
        candyBag.candyBoxes.add(cb1);
        candyBag.candyBoxes.add(cb2);
        candyBag.candyBoxes.add(cb3);

        Area a1 = new Area(candyBag, 6, "Padurea Neagra");

//        a1.displayGift(candyBag.candyBoxes);
//        a1.getBirthdayCard();
//        System.out.println(candyBag.candyBoxes.toString());

//        for (CandyBox gift: candyBag.candyBoxes) {
//            if (gift instanceof Lindt) {
//                ((Lindt) gift).printLindtDim();
//            }
//            if (gift instanceof ChocAmor) {
//                ((ChocAmor) gift).printChocAmorDim();
//            }
//            if (gift instanceof Baravelli) {
//                ((Baravelli) gift).printBaravelliDim();
//            }
//        }

        for (CandyBox gift: candyBag.candyBoxes) {
            gift.print();
        }



    }
}
