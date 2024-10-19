public class tender extends Chicken{
  private Boolean hasFries;
  private String additionalFlavors;


public tender() {
hasFries = false;
  additionalFlavors = "none";
}
  
// Makes the input the variable
// Gets the variable from the superclass for the subclass

public tender (double price, String name, String flavor, int size, Boolean hasFries, String additionalFlavors) {
   super(price, name, flavor, size);
  this.hasFries = hasFries;
  this.additionalFlavors = additionalFlavors;
}
  
// Returns the values from the variables
  
public boolean getHasFries(){
  return hasFries;
}

  public void setHasFries(Boolean newHasFries){
    hasFries = newHasFries;
  }
  
// Sets the prices to the input

public String getAdditionalFlavors(){
  return additionalFlavors;
}

public void setAdditionalFlavors(String newAdditionalFlavors){
  additionalFlavors = newAdditionalFlavors;
}

// Concatenates the info

public String toString() {
  return super.toString() + "\nHas Fries? " + hasFries + "\n any additional Flavors? " + additionalFlavors;
}



}
