import java.util.ArrayList;
import java.util.List;

public class InvoiceTest {
  public static void main(String[] args) {

    Item item1 = new Item("item1", "monitor", 399.1, 1999, "aaaa", "hhhh");
    Item item2 = new Item("item2", "usb", 9.9, 2013, "aa", "ggg");
    Item item3 = new Item("item3", "ggg", 99.1, 2009, "jjhhh", "hjhhh");
    Item item4 = new Item("item4", "ffff", 55.44, 2020, "kkkkh", "gikjhf");
    Item item5 = new Item("item5", "tttt", 39.1, 1999, "hhllh", "hhkkkh");
    Item item6 = new Item("item6", "tv", 134.4, 2, "jmdmdj", "nd");


    Storage storage = new Storage();
    storage.addItemQuantity(item1, 2);
    storage.addItemQuantity(item2, 3);
    storage.addItemQuantity(item3, 1);
    storage.addItemQuantity(item4, 5);
    storage.addItemQuantity(item5, 3);

    Invoice invoice = new Invoice();
    List<Item> itemList1 = new ArrayList<>();
    int index = 0;
    for (Item item : itemList1) {
      if (storage.getItemQuantity(item.description).equals("usb")) {
        invoice.getItemQuantities().add(index, storage.itemQuantity);
        index++;
      }
    }
    System.out.println("Item description " + invoice.getDescription() + " Item Quantity " + invoice.getItemQuantities() + " Item Cost " + invoice.getTotalCost());
  }
}

