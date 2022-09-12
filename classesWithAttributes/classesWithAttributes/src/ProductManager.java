public class ProductManager {
    public void Add(Product product) {
        //JDBC
        System.out.println("Ürün Eklendi " + product.getName());
        System.out.println("Ürün Stoğu " + product.getStockAmount());

    }
}
