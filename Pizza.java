package Object.Project.Restaurant_Billing_System;



import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {
private boolean extraCheese;
Scanner sc = new Scanner(System.in);
ArrayList<Pizza>Pizzas = new ArrayList<>();
private String itemName;
private double price;
private int quantity;




public Pizza(String itemName,double price) {
	this.itemName=itemName;
	this.price=price;

}

public Pizza() {
	
}

public boolean isExtraCheese() {
	return extraCheese;
}

public void setExtraCheese(boolean extraCheese) {
	this.extraCheese = extraCheese;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public void displayItem() {
	System.out.println("Choose pizza Type:");
	System.out.println("1. 🟢🍕 VEG PIZZA ");
	System.out.println("2. 🔴🍕 NON-VEG PIZZA ");
	int choice;
	while(true) {
		System.out.println("Enter your Choice :");
		choice = sc.nextInt();
		if(choice>=1 &&choice<=2) {
			break;
		}else {
			System.err.println("❌ Invalid choice! Please select from menu.");
		}
	}
	switch(choice) {
	case 1 :{
		display_vegPizza();
		break;
	}
	case 2 :{
		display_NonvegPizza();
		break;
	}
	default :{
		System.err.println("Invalid option choose !");
		break;
	}
	}
}
public  void display_vegPizza() {
	Pizzas.add(new Pizza("🟢🍕 Margherita Pizza     ", 200));
	Pizzas.add(new Pizza("🟢🍕 Farmhouse Pizza      ", 250));
	Pizzas.add(new Pizza("🟢🍕 Veggie Delight Pizza ", 230));
	Pizzas.add(new Pizza("🟢🍕 Paneer Tikka Pizza   ", 280));
	Pizzas.add(new Pizza("🟢🍕 Cheese Burst Pizza   ", 300 ));
	Pizzas.add(new Pizza("🟢🍕 Corn & Cheese Pizza  ", 260));
	Pizzas.add(new Pizza("🟢🍕 Mushroom Pizza       ", 270));
	Pizzas.add(new Pizza("🟢🍕 Mexican Green Wave   ", 290));
	Pizzas.add(new Pizza("🟢🍕 Deluxe Veggie Pizza  ", 310));
	Pizzas.add(new Pizza("🟢🍕 Spicy Veg Pizza      ", 240));
	System.out.println("=============================="); 
	for(int i =0;i<Pizzas.size();i++) {
		System.out.println((i+1)+Pizzas.get(i).getItemName()+ " :  ₹"+Pizzas.get(i).getPrice());
	}
	takinginput();
	
}
public void display_NonvegPizza() {
	
	Pizzas.add(new Pizza("🔴🍕 Chicken Tikka Pizza        ", 320));
	Pizzas.add(new Pizza("🔴🍕 Chicken Pepperoni Pizza    ", 350));
	Pizzas.add(new Pizza("🔴🍕 BBQ Chicken Pizza          ", 340));
	Pizzas.add(new Pizza("🔴🍕 Chicken Sausage Pizza      ", 310));
	Pizzas.add(new Pizza("🔴🍕 Chicken Keema Pizza        ", 360));
	Pizzas.add(new Pizza("🔴🍕 Spicy Chicken Fiesta Pizza ", 330));
	Pizzas.add(new Pizza("🔴🍕 Chicken Supreme Pizza      ", 380));
	Pizzas.add(new Pizza("🔴🍕 Chicken & Corn Pizza       ", 300));
	Pizzas.add(new Pizza("🔴🍕 Peri Peri Chicken Pizza    ", 345));
	Pizzas.add(new Pizza("🔴🍕 Chicken Mushroom Pizza     ", 335));
	Pizzas.add(new Pizza("🔴🍕 Double Chicken Cheese Pizza", 400));
	Pizzas.add(new Pizza("🔴🍕 Hot & Spicy Chicken Pizza  ", 325));
	Pizzas.add(new Pizza("🔴🍕 Chicken BBQ Feast Pizza    ", 390));
	Pizzas.add(new Pizza("🔴🍕 Chicken Onion Pizza        ", 295));
	Pizzas.add(new Pizza("🔴🍕 Chicken Deluxe Pizza       ", 410));
	System.out.println("==============================");
	for(int i = 0;i<Pizzas.size();i++) {
		System.out.println((i+1)+Pizzas.get(i).getItemName()+ " :  ₹"+Pizzas.get(i).getPrice());
	}
	
	takinginput();
}
public void takinginput() {

    int choice;

    while (true) {
        System.out.print("Enter your Choice : ");
        choice = sc.nextInt();

        if (choice >= 1 && choice <= Pizzas.size()) {
            break; // valid input → exit loop
        } else {
            System.err.println("❌ Invalid choice! Please select from menu.");
        }
    }

    

    System.out.print("Enter quantity : ");
    int quantity = sc.nextInt();
    sc.nextLine(); // consume leftover

    System.out.println("Do you want extra cheese? (Yes/No)");
    String input = sc.nextLine();

    System.out.println("==============================");

    if (input.equalsIgnoreCase("Yes")) {
        extraCheese = true;
    } else {
        extraCheese = false;
    }

    String itemName = Pizzas.get(choice - 1).getItemName();
    setItemName(itemName);

    double price = Pizzas.get(choice - 1).getPrice();
    setPrice(price);

    setQuantity(quantity);
}

public double calculateBill() {
	
	double total = price*quantity;
	
	 
	
	return total;
	
}
public double isExtracheese() {
	double res =0;
	if(extraCheese) {
	 res = 50*(quantity);
		
	}
	
	return res;
	
	
	
}
}
