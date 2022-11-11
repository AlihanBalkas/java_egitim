import java.util.Scanner;

public class Teacher {


    public static void Teacher() {

    Scanner scan = new Scanner(System.in);

    String[] ogretmenler = new String[10];



        while (true){
            String islem = scan.next();

            if (islem.equals("öa")){
                System.out.println("Lütfen aramak istediğiniz öğretmenin adını giriniz");
                String öğretmenAdı = scan.next();

                for (int i = 0; i < ogretmenler.length; i++) {
                    String item = ogretmenler[i];

                    if (öğretmenAdı.equals(item)){
                        System.out.println("Öğretmen bulundu : " +item);
                    }
                }
            }

            if (islem.equals("ös")){
                System.out.println("Lütfen silmek istediğiniz öğretmenin adını giriniz");
                String öğretmensilme = scan.next();

                for (int i = 0; i < ogretmenler.length; i++) {
                    String item = ogretmenler[i];

                    if (item != null && item.equals(öğretmensilme)){
                        ogretmenler[i] = "";
                        System.out.println("Öğretmen silindi : " +item);
                    }
                }
            }

            if (islem.equals("öl")){
                for (int i = 0; i < ogretmenler.length; i++) {
                    if (ogretmenler[i] != null) {
                        System.out.println((i + 1) + "Öğretmen Adı : " + ogretmenler[i]);
                    }
                }
            }

            if (islem.equals("öe")){
                System.out.println("Adı giriniz");
                String ogretmenEkleme = scan.next();

                for (int i = 0; i < ogretmenler.length; i++){

                    if (ogretmenler[i] == null){
                        ogretmenler[i] = ogretmenEkleme;
                        System.out.println("Öğretmen eklendi : " +ogretmenEkleme);
                        break;
                    }

                    if (ogretmenler[i] == ""){
                        ogretmenler[i] = ogretmenEkleme;
                        System.out.println("Öğretmen eklendi : " +ogretmenEkleme);
                        break;
                    }
                }
            }


        }




    }

}
