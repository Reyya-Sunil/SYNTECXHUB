package Object.Project.Restaurant_Billing_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Burger extends FoodItems {
private boolean comboAvailable;
Scanner sc = new Scanner(System.in);
ArrayList<Burger> burgers = new ArrayList<>();
private String itemName;
private double price;
private int quantity;



	///array list usage
    public Burger(String itemName, double price,  boolean comboAvailable) {
        this.itemName = itemName;
        this.price = price;
        
        this.comboAvailable = comboAvailable;
   
}
    
    
;
public Burger() {
	
	}

public void displayItem() {
	System.out.println("Choose Burger Type:");
	System.out.println("1. 🟢 Veg Burger");
	System.out.println("2. 🔴 Non-Veg Burger");
	int choice ;
	while(true) {
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();
		if(choice>=1 && choice<=2) {
			break;
		}else {
			System.err.println("❌ Invalid choice! Please select from menu.");
		}
	}
	
	switch(choice) {
	case 1 :{
		display_VegBurger();
		break;
	        }
	case 2:{
		display_NonVegBurger();
		break;
	}
	default :{
		System.err.println("Invalid Option Choose !");
		break;
	}
	}
	
}
public void display_VegBurger() {

	System.out.println("====== 🟢 VEG BURGERS ======");
	burgers.add(new Burger(" 🍔 Veg Burger            ", 80,  false));
    burgers.add(new Burger(" 🧀 Cheese Veg Burger     ", 100, true));
    burgers.add(new Burger(" 🥙 Paneer Burger         ", 120, true));
    burgers.add(new Burger(" 🥔 Aloo Tikki Burger     ", 90,  false));
    burgers.add(new Burger(" 🌽 Corn & Cheese Burger  ", 110,  true));
    burgers.add(new Burger(" 🥬 Green Veggie Burger   ", 95,  false));
    burgers.add(new Burger(" 🍄 Mushroom Burger       ", 130,  true));
    burgers.add(new Burger(" 🧀🥔 Cheese Aloo Burger  ", 105,  true));
    burgers.add(new Burger(" 🥕 Mix Veg Deluxe Burger ", 140,  false));
    burgers.add(new Burger(" 🌶️ Spicy Veg Burger      ", 115,  true));
    System.out.println("==============================");
    for (int i = 0; i < burgers.size(); i++) {
        System.out.println((i + 1) 
            + burgers.get(i).getItemName() 
            + " : ₹" + burgers.get(i).getPrice());
    }
    takinginput();

	
}
public boolean isComboAvailable() {
	return comboAvailable;
}

public void setComboAvailable(boolean comboAvailable) {
	this.comboAvailable = comboAvailable;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public void display_NonVegBurger() {
	burgers.add(new Burger(" 🍗 Chicken Burger             ", 130,  false));
	burgers.add(new Burger(" 🍗🧀 Chicken Cheese Burger    ", 150,  true));
	burgers.add(new Burger(" 🔥 Spicy Chicken Burger       ", 160,  false));
	burgers.add(new Burger(" 🥓 BBQ Chicken Burger         ", 200,  true));
	burgers.add(new Burger(" 🍗🍔 Double Chicken Burger    ", 190,  true));
	burgers.add(new Burger(" 🌶️🍗 Peri Peri Chicken Burger ", 175,  false));
	burgers.add(new Burger(" 🍤 Fish Burger                ", 180,  false));
	burgers.add(new Burger(" 🍤🧀 Fish Cheese Burger       ", 200,  true));
	burgers.add(new Burger(" 🥚 Egg Burger                 ", 110,  false));
	burgers.add(new Burger(" 🍗🥚 Chicken Egg Burger       ", 170,  true));
	burgers.add(new Burger(" 🍗🔥 Hot Wings Burger         ", 210,  true));
	burgers.add(new Burger(" 🥓 Bacon Burger               ", 220,  true));
	burgers.add(new Burger(" 🍗🍖 Grilled Chicken Burger   ", 195,  false));
	burgers.add(new Burger(" 🍗🧀 Loaded Chicken Burger    ", 230,  true));
	burgers.add(new Burger(" 🌶️🥓 Spicy Bacon Burger       ", 240,  true));
	System.out.println("==============================");
	 for (int i = 0; i < burgers.size(); i++) {
	        System.out.println((i + 1) 
	            + burgers.get(i).getItemName() 
	            + " : ₹" + burgers.get(i).getPrice());
	    }
	 takinginput();
	 

	 
	 
}
//if i take pizza the all it come here to take input 
public void takinginput() {
	int choice;

	while(true) {
	 System.out.print("👉Enter your choice : ");
	  choice = sc.nextInt();
	

     if (choice >= 1 && choice <= burgers.size()) {
         break; // valid input → exit loop
     } else {
         System.err.println("❌ Invalid choice! Please select from menu.");
     }}
	 
	 System.out.print("Enter a quantity :");
	 int quantity = sc.nextInt();
	 setQuantity(quantity);

	 System.out.println("==============================");
 
	   String itemName = burgers.get(choice-1).getItemName();
	    setItemName(itemName);
	 double price = burgers.get(choice-1).getPrice();
	    setPrice(price);
	    boolean isAvailabl = burgers.get(choice-1).isComboAvailable();
	    setComboAvailable(isAvailabl);
}
public double calculateBill() {
	double total = price * quantity;

    if (comboAvailable) {
        total += 70; // combo extra cost
    }
 
    return total;
	
}
public int  isComboAvalable() {
	int total =0;
	 if (comboAvailable) {
	        total += 70*quantity; // combo extra cost
	    }
	 return total;
}
 

}
