package Object.Project.Restaurant_Billing_System;

public class test {

public static void main(String[] args) {
	Restaurant_Billing R= new Restaurant_Billing ();
	R.getCustomerDetails();
	R.showMenu();
	 int menuchoice =R.getMenuchoice();
	 if(menuchoice<=3) {
    R.generateBill();
	R.applyDiscount();
	R.applyTax();
	R.printBill();
	
	}}
}
