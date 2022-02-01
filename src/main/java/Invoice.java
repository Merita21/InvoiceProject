import java.util.List;

public class Invoice {
  public List<ItemQuantity> itemQuantities;
  public String description;
  public static double totalCost;

  public static double getCost(ItemQuantity itemQuantity, Item item) {
    if (itemQuantity.quantity < 0) {
      return itemQuantity.quantity = 0.0;
    } else if (item.price < 0) {
      return item.price = 0.0;
    } else {
      double amount = itemQuantity.quantity * item.price;
      return totalCost = amount;
    }
  }
}
