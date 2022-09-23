public class Main {
    public static void main(String[] args) {

        String mesaj = "Vade oranı";

        Product product1 = new Product();
                // set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitPrice(3);
        product1.setImageUrl("bilmemne.jpg");

                    // get
        //System.out.println(product1.name);

        Product product2 = new Product();

        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitPrice(2);
        product2.setImageUrl("bilmemne2.jpg");


        Product product3 = new Product();

        product3.setName("Kitchen Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitPrice(4);
        product3.setImageUrl("bilmemne3.jpg");



        Product[] products = {product1,product2,product3} ;
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("052222222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Alihan");
        individualCustomer.setLastName("Balkaş");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("0533333333");
        corporateCustomer.setTaxNumber("111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};



    }
}