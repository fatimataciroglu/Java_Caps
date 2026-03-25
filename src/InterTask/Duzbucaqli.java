package InterTask;

public class Duzbucaqli implements IHendesiFiqur{


    private int width;
   private int length;

    @Override
    public void sahesi() {

        System.out.println("Duzbucaqlinin sahesi: " + (this.width* this.length));
    }

    @Override
    public void perimetri() {

        System.out.println("Duzbucaqlinin perimetri: " + ((this.width+this.length)*2));
    }

    public Duzbucaqli(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
