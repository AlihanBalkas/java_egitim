import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] ogrenciler = new String[10];


        while (true) {
            System.out.print("Yapmak istediğiniz işlemi yazınız: ");
            String islem = scan.next();
            if (islem.equals("a")) {
                System.out.print("Lütfen aramak istediğiniz öğrencinin adını giriniz :");
                String ogrenciAdi = scan.next();
                for (int i = 0; i < ogrenciler.length; i++) {
                    String item = ogrenciler[i];
                    if (ogrenciAdi.equals(item)) {
                        System.out.println("Öğrenci bulundu :" + item);
                    }
                }
            }
            if (islem.equals("s")) {
                System.out.println("Lütfen silmek istediğiniz öğrencinin adını giriniz");
                String ogrenciSilme = scan.next();
                for (int i = 0; i < ogrenciler.length; i++) {
                    String item = ogrenciler[i];
                    if (item != null && item.equals(ogrenciSilme)) {
                        ogrenciler[i] = "";
                        System.out.println("Öğrenci silindi :" + item);
                    }
                }
            }
            if (islem.equals("l")) {
                for (int i = 0; i < ogrenciler.length; i++) {
                    if (ogrenciler[i] != null) {
                        System.out.println((i + 1) + " Öğrenci Adı : " + ogrenciler[i]);
                    }
                }
            }


            if (islem.equals("e")) {
                System.out.println("Adı giriniz");
                String ogrenciEkleme = scan.next();
                for (int i = 0; i < ogrenciler.length; i++) {
                    if (ogrenciler[i] == null) {
                        ogrenciler[i] = ogrenciEkleme;
                        System.out.println("Öğrenci eklendi :" + ogrenciEkleme);
                        break;

                    }
                    if (ogrenciler[i] == "") {
                        ogrenciler[i] = ogrenciEkleme;
                        System.out.println("Öğrenci eklendi :" +ogrenciEkleme);
                        break;
                    }



                }

            }
        }


    }
}