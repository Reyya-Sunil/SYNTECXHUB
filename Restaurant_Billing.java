package Object.Project.Restaurant_Billing_System;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;



public class Restaurant_Billing implements BillingSystem {
private String  customerName;
private String phoneNumber;
private int billId;
 private int menuchoice;
public int getMenuchoice() {
	return menuchoice;
}
 public void setMenuchoice(int menuchoice) {
	this.menuchoice = menuchoice;
 }
private LocalDate date;
private LocalTime time;
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public LocalTime getTime() {
	return time;
}
public void setTime(LocalTime time) {
	this.time = time;
}
private String paymentMethod;
private double subtotal;
private double discount;
private double tax;
private double finalAmount;
private double isExtrachesse;
private int isComboAvailable;


public int getIsComboAvailable() {
	return isComboAvailable;
}
public void setIsComboAvailable(int isComboAvailable) {
	this.isComboAvailable = isComboAvailable;
}
public double getExtrachesse() {
	return isExtrachesse;
}
public void setExtrachesse(double isExtrachesse) {
	this.isExtrachesse = isExtrachesse;
}
private List<FoodItems>items;
public Restaurant_Billing() {
	items = new ArrayList<>();
}
Scanner sc = new Scanner(System.in);
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public int getBillId() {
	return billId;
}
public void setBillId(int billId) {
	this.billId = billId;
}




public String getPaymentMethod() {
	return paymentMethod;
}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
}


public double getSubtotal() {
	return subtotal;
}
public void setSubtotal(double subtotal) {
	this.subtotal = subtotal;
}


public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}


public double getTax() {
	return tax;
}
public void setTax(double tax) {
	this.tax = tax;
}


public double getFinalAmount() {
	return finalAmount;
}
public void setFinalAmount(double finalAmount) {
	this.finalAmount = finalAmount;
}

public List<FoodItems> getItems() {
	return items;
}
public void setItems(List<FoodItems> items) {
	this.items = items;
}

//methods
public void getCustomerDetails() {
System.out.println("🧾 Enter Customer Details");
System.out.print("👤 Enter Name: ");	
String customerName = sc.nextLine();
setCustomerName(customerName);
System.out.print("📱 Enter Mobile Number: ");
String phoneNumber = sc.nextLine();
setPhoneNumber( phoneNumber);
//geting cuurent date and time 
LocalDateTime now =LocalDateTime.now();
LocalDate date = now.toLocalDate();
LocalTime time = now.toLocalTime().withNano(0);
setDate( date);
setTime( time);



int  billidgenerator =BillIdGenerator.generateBillId();

setBillId(billidgenerator);


}
public void showMenu() {
	System.out.println("🍽️ ====== MENU ====== 🍽️");
	System.out.println("1️. Pizza");
	System.out.println("2️. Burger");
	System.out.println("3️. Drinks");

    int choice ;
    while(true) {
    	System.out.print("Enter your choice :");
    	choice = sc.nextInt();
    	if(choice>=1 &&choice<=2) {
    		break;
    	}else {
    		System.err.println("❌ Invalid choice! Please select from menu.");
    	}
    }
    setMenuchoice(choice); 
    
	System.out.println("======================");
	switch(choice) {
	case 1:{
		Pizza p = new Pizza();
		p.displayItem();
		 ///taking total ammmount from pizza class and set in Restarunt bill
		  double total =p.calculateBill();
		  setSubtotal(total);
	
		  double extracheeseTotal= p.isExtracheese();
		  setExtrachesse(extracheeseTotal);
		  break;
		  
		}
	case 2 :{
		Burger b = new Burger();
		b.displayItem();
		 ///taking total ammmount from Burger class and set in Restarunt bill
		 double total = b.calculateBill();
         int comboAvailable = b.isComboAvalable();
         setIsComboAvailable( comboAvailable);
		 setSubtotal(total);
		 break;
	}
	case 3 :{
		Drinks d = new Drinks();
		d.displayitem();
		 ///taking total ammmount from Burger class and set in Restarunt bill
		double total =d.calculateBill();
		setSubtotal(total);
		break;
	}default :{
		
		System.err.println("Invalid option choose!");
		break;
	}
	//construction going on
	}
	
}

public void generateBill() {
	

	  //  Apply discount
	    if(subtotal > 500) {
	        discount = subtotal * 0.10;
	    }

	  //  Apply tax
	    double amountAfterDiscount = subtotal - discount;
	    tax = amountAfterDiscount * 0.05;

	   
	}

public void printBill() {
double finalamount =(subtotal-discount+tax+getExtrachesse()+getIsComboAvailable());
	    System.out.println("====== RESTAURANT BILL ======");
	    System.out.println("⌛ Please wait, Bill is generating...");
	    System.out.println("\n====== Bill Summary ======");
	    System.out.println("Bill ID           : " + billId);
	    System.out.println("Date              : " + date);
	    System.out.println("Time              : " +time);
	    System.out.println("Customer Name     : " +customerName);
	    System.out.println("Phone Number      : " + phoneNumber);
	    System.out.println("Subtotal          : ₹" + subtotal);
	    System.out.println("Discount          : ₹" + discount);
	    System.out.println("Tax(5%)           : ₹" + tax);
	    System.out.println("Extra Cheese 🧀 ➕: " +getExtrachesse() );
	    System.out.println("🔥 Combo Available: " +getIsComboAvailable());
	    System.out.println("Final Amount      : ₹" + finalamount);
	    System.out.println("==============================");
        selectPayment();//going to payment method

	   
	
}
public void applyDiscount() {
	if(subtotal >500) {
		discount = subtotal *0.10;
	}else {
		discount = 0;
	}
}
public void applyTax() {
	double taxrate = 5;
	tax= subtotal*taxrate/100;
}
public void  selectPayment() {
	int n;
	///looping statement
	while(true) {
	System.out.println("💰 ----- Select Payment Option ----- 💰");
	System.out.println("1️. Cash Payment 💵");
	System.out.println("2️. Credit Card  💳");
	System.out.println("3️. Debit Card   🏧");
	System.out.println("4️. UPI Payment  📱");
	
	
	System.out.print("👉 Enter your choice: ");
	 n = sc.nextInt();
	 if(n>=1 && n<=4) {
		 break;
	 }else {
         System.err.println("❌ Invalid choice! Please select from menu.");
	 }}
	
	switch(n) {
	case 1 :{
		String paymentMethod ="Cash Payment";
		System.out.println("⌛ Please wait, Processing Payment...");
		this.paymentMethod=paymentMethod;
		break;
	}
	case 2 :{
		String paymentMethod ="Credit Card ";
		System.out.println("⌛ Please wait, Processing Payment...");
		this.paymentMethod=paymentMethod;
		break;
	}
	case 3 :{
		String paymentMethod =" Debit Card";
		System.out.println("⌛ Please wait, Processing Payment..."); 
		this.paymentMethod=paymentMethod;
		break;
	}
	case 4 :{
		String paymentMethod =" UPI Payment";
		System.out.println("⌛ Please wait, Processing Payment...");	
		this.paymentMethod=paymentMethod;
		break;
	}
	default :{
		System.err.println("Invalid option Choose !");
		break;
	}
 
	}
	
	System.out.println("\u001B[32m✅ Payment Successful!\u001B[0m");
	System.out.println("\nThank You! Visit Again 😊");
	System.out.println("==============================");
	}
}

