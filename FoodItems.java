package Object.Project.Restaurant_Billing_System;

public abstract class FoodItems extends Restaurant_Billing {
private String itemName;
private double price;
private int quantity;
public FoodItems() {
	
}

public  abstract void displayItem();
	


public abstract double calculateBill();
	


public String getItemName() {

	return itemName;
}
public double getPrice() {
	
	return price;
}
public int getQuantity() {
	return quantity;
}

}