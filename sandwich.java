public class sandwich extends Chicken {
  private int mealNumber;
  private boolean hasFries;

public sandwich() {
  mealNumber = 0;
  hasFries = false;
}
  
// Makes the input the same as the variable
// Gets the variables for the subclass
  
public sandwich(double price, String name, String flavor, int size, int mealNumber, Boolean hasFries ) {
  super(price, name, flavor, size);
  this.mealNumber = mealNumber;
  this.hasFries = hasFries;
}

// Returns the values of the variables
  
public int getMealNumber(){
  return mealNumber;
}

  public void setMealNumber(int newMealNumber){
    mealNumber = newMealNumber;
  }

public Boolean getHasFries() {
  return hasFries;
}
  
// Sets the prices to the input values

public void sethasFries(Boolean newHasFries){
  hasFries = newHasFries;
}

// Concatenates the info
  
public String toString() {
  return super.toString() + "\nMealNumber: " + mealNumber + "\n has Fries? " + hasFries;
}
}