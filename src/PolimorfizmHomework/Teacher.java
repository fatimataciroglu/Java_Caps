package PolimorfizmHomework;

public class Teacher extends Person {
    private String fenn;


    public Teacher(String ad, String soyad, int yash, String fenn) {
        super(ad, soyad, yash);
        setFenn(fenn);
    }

    public String getFenn() {
        return fenn;
    }

    public void setFenn(String fenn) {
        this.fenn = fenn;
    }
}

