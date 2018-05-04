/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rozeep
 */

public class Depot {
	
	
	private String native_product_name=null;
	private String first_product_name=null;
	private String second_product_name=null;
	private int nativeProduct_Limit=0;
	private int otherProductOverallLimit=0;
	private int productOne_Import_Limit=0;
	private int productTwo_Import_Limit=0;
	private int delivery_price_of_native_product=0;
	private int costOfNativeProduct=0;
	private int costOfImportedProductOne=0;
	private int costOfImportedProductTwo=0;
	
	private int totalCostOfNativeProduct=0;
	private int totalCostOfImportedProductOne=0;
	private int totalCostOfImportedProductTwo=0;
	
//	single depot per company
	public Depot(String native_product_name, String first_product_name, String second_product_name) {
//		System.out.println("Depot Constructor Has Been Called");
		
		this.native_product_name = native_product_name;
		this.first_product_name = first_product_name;
		this.second_product_name = second_product_name;
		otherProductOverallLimit=Randomize.randomizeOtherProductLimit();
		productOne_Import_Limit=otherProductOverallLimit/2;
		productTwo_Import_Limit=otherProductOverallLimit/2;
		nativeProduct_Limit=Randomize.randomizeNativeProductLimit();
		
		delivery_price_of_native_product=Randomize.randomizeDeliveryPrice();
		costOfNativeProduct=Randomize.randomizeProductPrice();
		costOfImportedProductOne=Randomize.randomizeProductPrice();
		costOfImportedProductTwo=Randomize.randomizeProductPrice();
		totalCostOfNativeProduct=costOfNativeProduct * nativeProduct_Limit;
		totalCostOfImportedProductOne=costOfImportedProductOne * productOne_Import_Limit;
		totalCostOfImportedProductTwo = costOfImportedProductTwo * productTwo_Import_Limit;
	}
	
	//overrided toString to print each depot over 100 depots for a single company 
	@Override
	public String toString() {
		return "Depot [native_product_name=" + native_product_name + ", First Imported Product Name: " + first_product_name
				+ ", Second Imported Product Name:" + second_product_name + ", Native Product Delivered Ammount: " + nativeProduct_Limit
				+ ", First Product Imported Ammount:" + productOne_Import_Limit + ", Second Product Imported Ammount:"
				+ productTwo_Import_Limit + ", Delivery_price_of_native_product=" + delivery_price_of_native_product
				+ ", Total Cost Of Native Product=" + totalCostOfNativeProduct + ", Total Cost Of Imported Product One=" + totalCostOfImportedProductOne + ", Total Cost Of Imported Product Two=" + totalCostOfImportedProductTwo
				+ "]";
	}
	
	
	//Getters and setters
	public String getNative_product_name() {
		return native_product_name;
	}
	public String getFirst_product_name() {
		return first_product_name;
	}
	public String getSecond_product_name() {
		return second_product_name;
	}
	public int getNativeProduct_Limit() {
		return nativeProduct_Limit;
	}
	public int getProductOne_Import_Limit() {
		return productOne_Import_Limit;
	}
	public int getProductTwo_Import_Limit() {
		return productTwo_Import_Limit;
	}
	public int getDelivery_price_of_native_product() {
		return delivery_price_of_native_product;
	}
	public int getCostOfNativeProduct() {
		return costOfNativeProduct;
	}
	public int getCostOfImportedProductOne() {
		return costOfImportedProductOne;
	}
	public int getCostOfImportedProductTwo() {
		return costOfImportedProductTwo;
	}
	public int getTotalCostOfNativeProduct() {
		return totalCostOfNativeProduct;
	}
	public int getTotalCostOfImportedProductOne() {
		return totalCostOfImportedProductOne;
	}
	public int getTotalCostOfImportedProductTwo() {
		return totalCostOfImportedProductTwo;
	}
	
	
	
	


	
	

	
	

}

