import java.util.HashMap;
import java.util.List;

public class Storage {
  public HashMap<String, Item> storage;

  public Storage() {
    storage = new HashMap<>();
  }

  ItemQuantity itemQuantity =new ItemQuantity();

  public Storage(HashMap<String, Item> storage, ItemQuantity itemQuantity) {
    this.storage = storage;
    this.itemQuantity = itemQuantity;
  }

  public Integer getItemQuantity(String description) {
    Item item = storage.get(description);
    if (item == null) {
      return null;
    }
    else
    return itemQuantity.getQuantity();
  }

  public void addItemQuantity(Item item, int quantity) {
    itemQuantity.setQuantity(quantity);
    storage.put(item.getDescription(), item);
  }

}
