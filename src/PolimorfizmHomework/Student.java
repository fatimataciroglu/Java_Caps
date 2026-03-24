package PolimorfizmHomework;

public class Student extends Person {
    private String ixtisas;

    public Student(String ad, String soyad, int yash, String ixtisas) {
        super(ad, soyad, yash);
        setIxtisas(ixtisas);
    }


    public String getIxtisas() {
        return ixtisas;
    }

    public void setIxtisas(String ixtisas) {
        this.ixtisas = ixtisas;
    }
}
