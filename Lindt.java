package laborator3.task1;

public class Lindt extends CandyBox{
    private int length;
    private int width;
    private float height;

    public Lindt() {
    }

    public Lindt(String flavor, String origin, int length, int width, float height) {
        super(flavor,origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length*width*height;
    }

    @Override
    public String toString() {
        return "The " + this.origin + " " + this.getFlavor() + " has volume " + this.getVolume();
    }

//    public void printLindtDim() {
//        System.out.println("Length: " + this.length + " Width: " + this.width + " Height:  " + this.height);
//    }

    public void print() {
        System.out.println("Length: " + this.length + " Width: " + this.width + " Height:  " + this.height);
    }



}
