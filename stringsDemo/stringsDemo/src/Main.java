public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel." ;

        /*System.out.println(mesaj);
        // Elaman sayısı nasıl bulunur
        System.out.println("Elaman sayısı = " + mesaj.length());

        // 5. elemanı bul
        System.out.println("5. Eleman = " + mesaj.charAt(4)); // 4 yazmamızın sebebi ise 0 dan başlaması

        // concat = birleştirmek
        // 2 metni birleştirme
        System.out.println(mesaj.concat(" Yaşasın!"));

        // startsWith = hangi harfle başladığını yazarız oda bize true veya false döndürür
        // endsWith = hangi harfle bittiğini yazarız oda bize true veya false döndürür
        System.out.println(mesaj.startsWith("B")); // not= büyük küçük harf uyumu önemli
        System.out.println(mesaj.endsWith("."));

        // getChars = karakterleri al
        // srcBegin= nerde başla
        // srcEnd = nerede bitir
        char[] karakterler = new char[5] ;
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        // indexOf = Karakterin mesaj içerisindeki kaçıncı eleman olduğunu bulmaya yarar (soldan başlar)
        // lastIndexOf = Karakterin mesaj içerisindeki kaçıncı eleman olduğunu bulmaya yarar (sağdan başlar)
        System.out.println(mesaj.indexOf("a")); // ister çift tırnak ister tek tırnak kullanabiliriz
        System.out.println(mesaj.lastIndexOf("a"));*/

        //  replace = değiştirme

        System.out.println(mesaj.replace(" " , "-"));
        // boşluk yerine - koymuş olduk
        // target = neyi değiştirmek istiyorsunuz demek
        // replacement = neyle değiştirmek istiyorsunuz demek

        // substring = bir metnin içerisinden parça almak
        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        // toLowerCase = mesajı küçük harfe çevirir
        System.out.println(mesaj.toLowerCase());
        // toUpperCase = mesajı büyük harfe çevirir
        System.out.println(mesaj.toUpperCase());

        // trim = boşlukları atmaya yarar
        String not = "   Bugün hava çok güzel.      " ;
        System.out.println(not.trim());
    }
}