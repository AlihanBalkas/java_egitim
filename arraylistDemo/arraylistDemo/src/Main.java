import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("İstanbul");
        //System.out.println(sayilar.size()); // size= eleman sayısnı verir
        //sayilar.set(0,100); // set= index'i  değiştirir

        //sayilar.remove(0);    // remove= listeden eleman siler
        //sayilar.clear(); // clear= tüm elemanları siler
        //System.out.println(sayilar.get(0));

        for (Object i: sayilar) {
            System.out.println(i); // listeyi döner
        }

    }
}