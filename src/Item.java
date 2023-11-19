public class Item {
    private Product product;
    private int jumlah;

    public Item(Product product, int jumlah) {
        this.product = product;
        this.jumlah = jumlah;
    }

    public Product getProduct() {
        return product;
    }

    public int getJumlah() {
        return jumlah;
    }
}
