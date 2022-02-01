public class Item {
  public String description;
  public String typeOfItem;
  public double price;
  public int yearOfProduction;
  public String capacityOfItem;
  public String processing;

  public Item(String description, String typeOfItem, double price, int yearOfProduction, String capacityOfItem, String processing) {
    this.description = description;
    this.typeOfItem = typeOfItem;
    this.price = price;
    this.yearOfProduction = yearOfProduction;
    this.capacityOfItem = capacityOfItem;
    this.processing = processing;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTypeOfItem() {
    return typeOfItem;
  }

  public void setTypeOfItem(String typeOfItem) {
    this.typeOfItem = typeOfItem;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getYearOfProduction() {
    return yearOfProduction;
  }

  public void setYearOfProduction(int yearOfProduction) {
    this.yearOfProduction = yearOfProduction;
  }

  public String getCapacityOfItem() {
    return capacityOfItem;
  }

  public void setCapacityOfItem(String capacityOfItem) {
    this.capacityOfItem = capacityOfItem;
  }

  public String getProcessing() {
    return processing;
  }

  public void setProcessing(String processing) {
    this.processing = processing;
  }
}
