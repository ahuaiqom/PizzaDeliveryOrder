public class OrderTestUnit {
    public static void main(String[] args) {
        //usecase register product
        Shop shop = new Shop("GFT Store");
        Katalog katalog = new Katalog(shop);
        katalog.registerProduct(new Product("1","Pizza Meat lover",23));
        katalog.printAllProducts();
        katalog.findProductById("1");
        //usecase Order
    }
}
