// built-in   tanımlı paketler
import matematik.*;   // * matematik paketindeki herşeyi import et anlamına gelir (yaygın kullnım)
//import matematik.Logaritma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız:");

        String isim = scanner.nextLine();

        System.out.println("Dog = " +isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,3);

        Logaritma logaritma = new Logaritma();

    }
}