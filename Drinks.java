package Object.Project.Restaurant_Billing_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Drinks {
	Scanner sc = new Scanner(System.in);
ArrayList<Drinks>Drink = new ArrayList<>();
private String itemName;
private double itemPrice;
private int quantity;
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getItemPrice() {
	return itemPrice;
}
public void setItemPrice(double itemPrice) {
	this.itemPrice = itemPrice;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Drinks() {
	
}
public Drinks(String itemName , double price) {
	this.itemName=itemName;
	this.itemPrice=price;
	
}
public void displayitem() {


	Drink.add(new Drinks("🥤 Coke          ", 40));
	Drink.add(new Drinks("🍹 Mango Juice   ", 60));
	Drink.add(new Drinks("🍵 Green Tea     ", 30));
	Drink.add(new Drinks("☕ Coffee        ", 50));
	Drink.add(new Drinks("🥛 Milk Shake    ", 70));
	Drink.add(new Drinks("🍸 Lemon Soda    ", 35));
	Drink.add(new Drinks("🧋 Bubble Tea    ", 80));
	Drink.add(new Drinks("🍺 Cold Drink    ", 45));
	Drink.add(new Drinks("🍷 Mocktail      ", 90));
	Drink.add(new Drinks("🥥 Coconut Water ", 50));
	for(int i =0;i<Drink.size();i++) {
		System.out.println((i+1)+Drink.get(i).getItemName()+ " :  ₹"+Drink.get(i).getItemPrice());
		
	}
	int choice;
	while(true) {
	System.out.print("Enter your choice : ");
	 choice =sc.nextInt();
	 if(choice>=1 && choice<=Drink.size()) {
		 break;
	 }else {
		  System.err.println("❌ Invalid choice! Please select from menu.");
	 }
	}
	System.out.print("Enter quantity :");
	int quantity = sc.nextInt();
	setQuantity( quantity);
	
	//if user choice 1 then in array list index start with 0 so we take (choice-1)
	String itemNames = Drink.get(choice-1).getItemName();
	setItemName(itemNames);
	double itemprice =Drink.get(choice-1).getItemPrice();
	setItemPrice( itemprice);
	

	
}
public double calculateBill() {
	double total =itemPrice*quantity;
	System.out.println("Drink total price"+total);//for testing removed it
	return total;
	
}
}
