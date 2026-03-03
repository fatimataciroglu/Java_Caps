import java.util.Scanner;
import java.util.TreeMap;

public class HomeWork {
    static void main(String[] args) {
        // Canli Luget yaratmaq istenilir (Map istifade edin)
        // Istifadeci ucun asagidaki kimi bir menyu cixmalidir
        // 1 - Elave et (Bu hissede soz ve menasi alinmalidir)
        // 2 - Redakte et (Bu secimde istifadeciden menasini deyismek istenilir)
        // 3 - Siyahini goster (Butun soz ve menalar)
        // 4 - Axtaris (Axtarilan sozun menasi cixmalidir)
        // 5 - Sil
        // 6 - Cixis

        //QEYD : Redakte et ucun -> Eyni key ucun yeni value teyin etmek mumkundur,
        // yeni value-ni put etmek ucun key oldugu kimi qalir, value-ni ferqli yazsaniz update olacaq

        int secim;
        TreeMap<String, String> luget = new TreeMap<>();

        do {
            Scanner readInt = new Scanner(System.in);
            Scanner readStr = new Scanner (System.in);
            System.out.println("Seciminizi edin:");
            System.out.println("1: Elave: \n2: Redakte: \n3. Siyahi: \n4. Axtaris: \n5. Sil \n6. Cixis");
            secim = readInt.nextInt();

            if (secim == 1) {
                System.out.println("Elave edilecek sozu daxil edin:");
                String soz = readStr.next();
                System.out.println("Menasi:");
                String mena = readStr.next();
                luget.put(soz,mena);
                System.out.println("Elave olundu!");
            } else if (secim == 2) {
                System.out.println("Redakte edilecek sozu daxil edin:");
                String soz = readStr.next();
                if (luget.containsKey(soz)) {
                    System.out.println("Yeni menasi:");
                    String yeniMena = readStr.next();
                    luget.put(soz, yeniMena);
                    System.out.println("Yenilendi!");
                } else {
                    System.out.println("Bele bir soz tapilmadi.");
                }
            } else if (secim == 3) {
                System.out.println("Butun lugetin siyahisi: " + luget);
            } else if (secim == 4) {
                System.out.println("Axtarilan soz:");
                String axtaris = readStr.next();
                if (luget.containsKey(axtaris)) {
                    System.out.println("Tapildi, menasi: " + luget.get(axtaris));
                    } else {
                    System.out.println("Tapilmadi.");
                }
            } else if (secim == 5) {
                System.out.println("Siyahidan cixarilacaq soz: ");
                String silinecek = readStr.next();
                luget.remove(silinecek);
                System.out.println("Siyahidan cixarildi!");
            } else if (secim == 6) {
                System.out.println("Proqram sonlandi.");
            } else {
                System.out.println("Bele bir secim movcud deyil.");
            }

        } while (secim != 6);

    }
}
