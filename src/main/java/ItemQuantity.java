import java.util.ArrayList;
import java.util.List;

public class ItemQuantity {
  public Item item;
  public int quantity;

  public ItemQuantity() {
  }

  ;

  public ItemQuantity(Item item, int quantity) {
    this.item = item;
    this.quantity = quantity;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    //If the quantity is not positive, it should be set to zero
    if (quantity > 0) {
      this.quantity = quantity;
    } else {
      this.quantity = 0;
    }
  }
}
