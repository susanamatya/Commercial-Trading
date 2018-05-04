/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rozeep
 */
import java.util.ArrayList;
import java.util.List;

public class DoDepot {
	private List <Depot> depot; // a list of 100 depots
	private String myProductName=null;
	private String firstProductName=null;
	private String secondProductName=null;
	private int OverAllCostEarnedByUsFromOurProduct=0;
	private int overAllProductAmount=0;
	private int overAllFirstImportedProductAmount=0;
	private int overAllSecondImportedProductAmount=0;
	private int overAllDeliveryPrice=0;
	private int OverAllCostOfProductOne=0;
	private int OverAllCostOfProductTwo=0;
	private int totalImportPrice=0;
	private int overAllCostOfBusiness=0;
 DoDepot(String myProductName, String firstProductName, String secondProductName) {
		depot= new ArrayList<>(); // initializing the list 
		this.myProductName = myProductName;
		this.firstProductName = firstProductName;
		this.secondProductName = secondProductName;
	}
 
 //this mill make a cpmplete trade
	public void doTrade(){
		
		for (int i = 0; i < Constants.numOfDepots; i++) {
//			System.out.println("doTrade has been called from DoDepot: "+ i);
			depot.add(new Depot(myProductName, firstProductName, secondProductName));
			
		}
	}
	
	//this will print the trade results
	public void printTrade(){
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < depot.size(); i++) {
//			System.out.println("printTrade has been called from DoDepot: "+ i);
			System.out.println(depot.get(i));
			
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
	}
	
	//it calculates all the depots and makes a statement
	public void calculateProfitLoss(){
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		for (int i = 0; i <depot.size(); i++) {
			overAllProductAmount=overAllProductAmount+depot.get(i).getNativeProduct_Limit();
			overAllFirstImportedProductAmount=overAllFirstImportedProductAmount+depot.get(i).getProductOne_Import_Limit();
			overAllSecondImportedProductAmount=overAllSecondImportedProductAmount+depot.get(i).getProductTwo_Import_Limit();
			
			OverAllCostEarnedByUsFromOurProduct=OverAllCostEarnedByUsFromOurProduct+depot.get(i).getTotalCostOfNativeProduct();
			OverAllCostOfProductOne=OverAllCostOfProductOne+depot.get(i).getTotalCostOfImportedProductOne();
			OverAllCostOfProductTwo=OverAllCostOfProductTwo+depot.get(i).getTotalCostOfImportedProductTwo();
			overAllDeliveryPrice=overAllDeliveryPrice+depot.get(i).getDelivery_price_of_native_product();
			
			
		}
		overAllCostOfBusiness=OverAllCostEarnedByUsFromOurProduct+OverAllCostOfProductOne+OverAllCostOfProductTwo+overAllDeliveryPrice;
		totalImportPrice=OverAllCostOfProductOne+OverAllCostOfProductTwo;
//		System.out.println(OverAllCostEarnedByUsFromOurProduct +" "+totalImportPrice+" "+overAllDeliveryPrice+" ");
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		
	}
	
	
	
	
	//getters and setters
	
	
	public List<Depot> getDepot() {
		return depot;
	}
	public String getMyProductName() {
		return myProductName;
	}
	public String getFirstProductName() {
		return firstProductName;
	}
	public String getSecondProductName() {
		return secondProductName;
	}
	public int getOverAllCostEarnedByUsFromOurProduct() {
		return OverAllCostEarnedByUsFromOurProduct;
	}
	public int getOverAllProductAmount() {
		return overAllProductAmount;
	}
	public int getOverAllFirstImportedProductAmount() {
		return overAllFirstImportedProductAmount;
	}
	public int getOverAllSecondImportedProductAmount() {
		return overAllSecondImportedProductAmount;
	}
	public int getOverAllDeliveryPrice() {
		return overAllDeliveryPrice;
	}
	public int getOverAllCostOfProductOne() {
		return OverAllCostOfProductOne;
	}
	public int getOverAllCostOfProductTwo() {
		return OverAllCostOfProductTwo;
	}
	public int getTotalImportPrice() {
		return totalImportPrice;
	}
	public int getOverAllCostOfBusiness() {
		return overAllCostOfBusiness;
	}
	
	
	
	

	
	

}

