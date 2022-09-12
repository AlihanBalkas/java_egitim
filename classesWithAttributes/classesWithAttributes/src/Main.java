public class Main {
    public static void main(String[] args) {

        Product product = new Product(123456789,"Laptop","Asus Laptop", 17.500, 5);
        /*product.setName("Laptop");
        product.setId(123456789);
        product.setDescription("HP Laptop");
        product.setPrice(17.500);
        product.setStockAmount(5);*/



        ProductManager productManager = new ProductManager() ;
        productManager.Add(product);



    }
}