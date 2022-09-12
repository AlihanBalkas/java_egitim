public class Main {
    public static void main(String[] args) {
        // reference type = referans tip  ! diziler referans tiptir !
        CustomerManeger customerManeger = new CustomerManeger();
        customerManeger.Add();
        customerManeger.Remove();
        customerManeger.Update();

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1 ;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6}; // 1, 2, 3
        sayilar2 = sayilar1 ;
        sayilar1 [0] = 10 ;   // 1 = 10 olmuş oldu
        System.out.println(sayilar2[0]);

    }
}