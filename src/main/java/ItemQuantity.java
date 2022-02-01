import java.util.ArrayList;
import java.util.List;

public class ItemQuantity {
  public List<Item>items=new ArrayList<>();
  public double quantity ;

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }
//  public  void getQuanity( Item item){
//    int quanity = 0;
//    for (int i = 0; i < items.toArray().length; i++) {
//      quanity =quanity + 1;
//    }
//
//
//  }
}
