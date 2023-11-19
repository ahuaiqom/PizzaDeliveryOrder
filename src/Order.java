import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String invoice;
    private Date now;
    private Shop shop;
    private List<Item> items = new ArrayList<>();

    public Order(String invoice, Date now, Shop shop) {
        this.invoice = invoice;
        this.now = now;
        this.shop = shop;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void cetakStruk() {
        for(Item i : items){
            System.out.println(i.getProduct().getName());
        }
    }
}
