import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Ankara");
        sehirler.add("Kayseri");

        sehirler.remove(0);
        Collections.sort(sehirler);

        for (String sehir : sehirler){
            System.out.println(sehir);
        }

    }
}