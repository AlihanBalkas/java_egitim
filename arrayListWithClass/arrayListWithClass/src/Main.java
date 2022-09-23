import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer alihan = new Customer(1,"Alihan","Balkaş");
        customers.add(alihan);
        customers.add(new Customer(2,"Öykü","Kalay"));
        customers.add(new Customer(3,"Ezgi","Kalay"));

        //customers.remove(new Customer(1,"Alihan","Balkaş")); yanlış kullanım
        customers.remove(alihan);

        for (Customer customer:customers){
            System.out.println(customer.id + customer.firstName + customer.lastName );

        }

    }
}