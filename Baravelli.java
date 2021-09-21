package laborator3.task1;

public class Baravelli extends CandyBox{
    private int radius;
    private float height;

    public Baravelli() {
    }

    public Baravelli(String flavor, String origin, int radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI*radius*radius*height);
    }

    @Override
    public String toString() {
        return "The " + this.origin + " " + this.getFlavor() + " has volume " + this.getVolume();
    }

//    void printBaravelliDim() {
//        System.out.println("Radius: " + radius + " Height: " + height);
//    }

    public void print() {
        System.out.println("Radius: " + radius + " Height: " + height);
    }
}
