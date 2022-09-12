public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";

        //System.out.println(mesaj.substring(0,2));     ! benim yaptığım !

        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);

        int sayi = topla(10000,7500);
        System.out.println("İşleminizin sonucu :"+sayi);

        int toplam = topla2(1,2,5,4,3) ;
        System.out.println(toplam);

    }
    public static void ekle () {
        System.out.println("Eklendi");
    }

    public static void sil () {
        System.out.println("Silindi");
    }

    public static void guncelle () {
        System.out.println("Güncellendi");
    }
    public static String sehirVer () {
        return "İstanbul";
    }
    public static int topla (int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public  static int topla2 (int... sayilar) {
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
            return toplam ;
    }

}