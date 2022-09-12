public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;

        if (enBuyuk<sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk<sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En Büyük ="+enBuyuk);

        int a = 20;
        int b = 30;
        int c = 10;
        int enKucuk = a ;
        int fazla = a;

        if (enKucuk>b) {
            enKucuk = b ;
        } else if (enKucuk>c){
            enKucuk = c ;
        }
        if (fazla<b) {
            fazla = b ;
        } else if (fazla<c)
            fazla = c ;

        System.out.println("En küçük ="+enKucuk);
        System.out.println("En Büyük1 ="+fazla);



    }
}