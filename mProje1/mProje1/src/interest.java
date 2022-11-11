import java.util.Scanner;

public class interest {

    Scanner scan = new Scanner(System.in);



    //String aracAlimi;
    //String evAlimi;
    int anaPara;

    int taksit1 = 12;
    int taksit2 = 24;

    interest (int anaPara , int taksit1 , int taksit2) {

        //this.aracAlimi=aracAlimi;
        //this.evAlimi=evAlimi;
        this.anaPara=anaPara;
        this.taksit1=taksit1;
        this.taksit2=taksit2;







    }

    public int katilimPayi(){

        int katilimPayi = 25000;



        if (anaPara > 0){

        }

        return katilimPayi;

    }

    public double longTerm () {

        int taksit = taksit1 + taksit2;



        if (taksit <= 25){
            System.out.println(anaPara * 0.5 / 100);
        }

        return anaPara * 0.5 / 100;
    }

    public double delay () {



        if (taksit1 + taksit2 <= 3){
            return anaPara + 12500;
        }

            return (anaPara * 5) /100 ;


    }

    public void toString(interest interest) {

        int islem1;
        int islem2;
        String islem3;



        System.out.println("1. Araç Alma");
        System.out.println("2. Ev Alma");
        System.out.println("İşleminizi seçiniz : ");
        islem1 = scan.nextInt();

        if (islem1 == 1){
            System.out.println("Araç alma");
        } else if (islem1 == 2) {
            System.out.println("Ev alma");
        }else {
            System.out.println("1. veya 2. seçeneği seçiniz");
        }



        System.out.println("3. kaç ay vade yaptırmak istersiniz");
        islem2 = scan.nextInt();



        System.out.println("4. 3 ay erteleme istermisiniz");
        islem3 = scan.next();

        if (islem3 == "evet"){
            System.out.println(delay());
        }








        System.out.println("Katılım Payı : " +interest.katilimPayi());
        System.out.println("24 Aydan fazla vade : " +interest.longTerm());
        System.out.println("3 Ay Erteleme : "+interest.delay());

        double toplamTutar = interest.anaPara + interest.katilimPayi() + interest.longTerm() + interest.delay();
        System.out.println("Toplam tutar : " + toplamTutar);

    }


}