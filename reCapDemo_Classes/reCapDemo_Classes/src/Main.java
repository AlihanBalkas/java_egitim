public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int topla = dortIslem.Topla(3,4);
        System.out.println(topla);

        int cikar = dortIslem.Cikar(5,4);
        System.out.println(cikar);

        int carp = dortIslem.Carp(2,2);
        System.out.println(carp);

        int bol = dortIslem.Bol(6,3);
        System.out.println(bol);
    }
}

