public class ProductManager {
    public void add(Product product) {
        ProductVlidator vlidator = new ProductVlidator();
        if (ProductVlidator.isValid(product)){
            System.out.println("Eklendi");
        }else {
            System.out.println("ürün bilgileri geçersizdir.");
        }



    }
}
