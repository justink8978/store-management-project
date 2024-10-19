public class Chicken {
  private double price;
  private String name;
  private String flavor;
  private int size;

// Makes the chicken variable
  
public Chicken() {
  this(7.0, "unknown", "unknown", 1);
}
  
// Makes the input the same as the variable
  
public Chicken(double price, String name, String flavor, int size) {
  this.price = price;
  this.name = name;
  this.flavor = flavor;
  this.size = size;
}
  
// Returns the variables value

  public double getPrice() {
    return price;
  }

public String getName() {
  return name;
  
}

  public String getFlavor(){
    return flavor;
  }

  public int getSize() {
    return size;
  }
  
// Sets the prices to the input
  
public void setPrice(double newPrice) {
  price = newPrice;
}

public void setName(String newName) {
  name = newName;
}

public void setFlavor(String newFlavor) {
  flavor = newFlavor;
}

public void setSize(int newSize) {
  size = newSize;
}
  
// Concatenates the info
  
public String toString() {
  return price + " (" + name +" " +flavor + " "+ size +")";
}
}