package InterTask;

public class Kvadrat implements IHendesiFiqur {

    private int teref;

    public Kvadrat(int teref) {
        setTeref(teref);
    }

    public int getTeref() {
        return teref;
    }

    public void setTeref(int teref) {
        this.teref = teref;
    }

    @Override
    public void sahesi() {

        System.out.println("Kvadrati sahesi: " + (this.teref * this.teref));

    }

    @Override
    public void perimetri() {
        System.out.println("Kvadratin perimetri: " + (this.teref * 4));
    }
}
