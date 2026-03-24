package PolimorfizmHomework;

public class Person {
    String ad;
    String soyad;
    int yash;

    public Person(String ad, String soyad, int yash) {
        setAd(ad);
        setSoyad(soyad);
        setYash(yash);
    }

    public void showInfo (Person p1) {
        System.out.println(p1.ad);
        System.out.println(p1.soyad);
        System.out.println(p1.yash);

        if (p1 instanceof Student) {
            System.out.println(((Student) p1).getIxtisas());
        }
        if (p1 instanceof Teacher) {
            System.out.println(((Teacher) p1).getFenn());
        }
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYash() {
        return yash;
    }

    public void setYash(int yash) {
        this.yash = yash;
    }
}
