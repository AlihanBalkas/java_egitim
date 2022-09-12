public class Main {
    public static void main(String[] args) {
        for (int a = 1 ; a<=100; a++) {
            System.out.println(a);
        }
            System.out.println("İşlem Tamamlanmıştır");

            // for döngüsü ile 1 ' den 10 ' a kadar olan sayıları tek ve çift diye ayır.
        for (int b = 1 ; b<=100 ; b+=2) {
            System.out.println(b);
        }
            System.out.println("1 den 100 a kadar olan tek sayılar");
        for (int c = 2 ; c<=100 ; c+=2) {
            System.out.println(c);
        }
            System.out.println("1 den 100 a kadar olan çift sayılar");

            int d = 1 ;
            while (d<=10) {
                System.out.println(d);
                d++;
            }
                System.out.println("While döngüsü tamamlanmıştır");

            int e = 1 ;
            do {
                System.out.println(e);
                e++;
            } while (e<=10) ;
                System.out.println("Do-While Döngüsü Bitt");
    }
}