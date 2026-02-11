
/*
 ---------------------------------------------------------
Program 01:
-----------
Write a Program on OOPs to define Product class properties and behaviour.

Properties/Field/Attribute :

productId : int
productName : String
productPrice : double

 Initialize these properties with the help of method using parameter variable.

behavior/Method:
setProductData(int id, String name, double price) : public void
getProductInfo() : public void
 */
package com.jru.oop;

public class StoreProduct {

	int productId;
	String productName;
	double productPrice;

	public void setProductData(int id, String name, double price) {

		this.productId = id;
		this.productName = name;
		this.productPrice = price;
	}

	public void getProductInfo() {
		System.out.println("Id of the Product : "+this.productId);
		System.out.println("Name of The Product : "+this.productName);
		System.out.println("Price of The Product : "+this.productPrice);
	}

	public static void main(String[] args) {
		StoreProduct SP = new StoreProduct();
		 int id =Integer.parseInt(IO.readln("Enter Product Id : "));
		 String name = IO.readln("Enter Product Name :");
		 double price = Double.parseDouble(IO.readln("Enter Price Of the Product "));
		SP.setProductData(id, name, price);
		SP.getProductInfo();

	}
}
