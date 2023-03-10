package com;

import java.lang.String;
class Canteen1 {
	//Attributes of Canteen1 class- eatable, CostPrice, TotalPrice and quantity
	String eatable;
	double CostPrice;
	static double TotalPrice;
	int quantity;
	
	Canteen1(String ET,double CP, int QTY)
	{
		eatable = ET;
		CostPrice = CP;
		quantity = QTY;
	}
	public void display() {
		System.out.println("Bought " + quantity +" " + eatable + 
				" at Rs" +  CostPrice + "/unit. for Rs" + quantity * CostPrice);
		TotalPrice +=(quantity*CostPrice);
	}
	public void total() {
		System.out.println("The total price is: "+TotalPrice);
	}
}
class Main {

	public static void main(String[] args) {
		Canteen1 item[];
		item = new Canteen1[5];
		
		item[0] = new Canteen1("Vada Pav", 12.5 , 200 );
	    item[1] = new Canteen1("Cold drink can" , 14 , 400);
	    item[2] = new Canteen1("Pastries" , 20.25 , 50);
	    item[3] = new Canteen1("Burgers" , 11 , 200);
	    item[4] = new Canteen1("Pav Bhaji" , 40 , 170);
	    
	    for(int i=0;i<item.length;i++){
	        item[i].display();
	      }
	      item[4].total();
	}

}
