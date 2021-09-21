package laborator3.task1;

public class ChocAmor extends CandyBox{
    private float length;

    public ChocAmor() {
    }

    public ChocAmor(String flavor, String origin, float lenght) {
        super(flavor, origin);
        this.length = lenght;
    }

    @Override
    public float getVolume() {
        return length*length*length;
    }

    @Override
    public String toString() {
        return "The " + this.origin + " " + this.getFlavor() + " has volume " + this.getVolume();
    }

//    void printChocAmorDim() {
//        System.out.println("Lenght: " + length);
//    }

    public void print() {
        System.out.println("Lenght: " + length);
    }
}
