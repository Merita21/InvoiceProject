import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
  private static List<ItemQuantity> itemQuantities = new ArrayList<>();
  public HashMap<String, ItemQuantity> allItems = new HashMap<>();


  public static List<ItemQuantity> getItemQuantity(String description) {
    if (itemQuantities.quantity >= 1) {
      return itemQuantities;
    } else
      return null;
  }

  private Map<Item,Number>Storage(List<Item> items){
    final Map<Item,Number>
  }
}
