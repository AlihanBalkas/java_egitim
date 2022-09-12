public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Alihan" ;
        String ogrenci2 = "Muhammet" ;
        String ogrenci3 = "Emre" ;
        String ogrenci4 = "Eren" ;

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------------------------------------------");

        String [] ogrenciler = new String[4] ;
        ogrenciler [0] = "Alihan" ;
        ogrenciler [1] = "Muhammet" ;
        ogrenciler [2] = "Emre" ;
        ogrenciler [3] = "Eren" ;

        for (int i=0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------------------------------------------");

        // YUKARIDAKİ FOR DÖNGSÜYLE ALTTAKİ FOR DÖNGÜSÜ AYNI ANLAMA GELİYOR 2' SİDE AYNI

        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}