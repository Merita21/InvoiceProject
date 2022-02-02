import java.util.List;

public class Invoice {
  public List<ItemQuantity> itemQuantities;
  public String description;
  public double totalCost;

  public Invoice(List<ItemQuantity> itemQuantities, String description, double totalCost) {
    this.itemQuantities = itemQuantities;
    this.description = description;
    this.totalCost = totalCost;
  }

  public List<ItemQuantity> getItemQuantities() {
    return itemQuantities;
  }

  public void setItemQuantities(List<ItemQuantity> itemQuantities) {
    this.itemQuantities = itemQuantities;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(double totalCost) {
    this.totalCost = totalCost;
  }

  public double getCost(ItemQuantity itemQuantity, Item item) {

      return totalCost = itemQuantity.quantity * item.price;
    }

}
