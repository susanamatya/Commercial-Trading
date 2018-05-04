/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rozeep
 */


public class Profit_Loss_Info {
	
	
	
	
	

	
	DoDepot calc;
	
//	-------------------------------------------
	public static int A_productRevenueEarned;
	public static int A_importedProductsSpentMoney;
	public static int A_Remaining_Amount_After_Business;
//	--------------------------------------------
	
//	-------------------------------------------
	public static int B_productRevenueEarned;
	public static int B_importedProductsSpentMoney;
	public static int B_Remaining_Amount_After_Business;
//	--------------------------------------------
	
//	-------------------------------------------
	public static int C_productRevenueEarned;
	public static int C_importedProductsSpentMoney;
	public static int C_Remaining_Amount_After_Business;
//	--------------------------------------------

	public Profit_Loss_Info(DoDepot calc) {
		
		this.calc = calc;
	}
	
	public void printInfo(){
		calc.calculateProfitLoss();
		System.out.println("Our Product Name = "+ calc.getMyProductName()+"\n"+ "Imported Product= "+calc.getFirstProductName()+" and "+calc.getSecondProductName()+"\n"
				+"Over All Cost of Product Delivered to Other Companies: "+calc.getOverAllCostEarnedByUsFromOurProduct() +"\n"+" Number Of Our Products "+calc.getOverAllProductAmount()+"\n"+" Number Of Product: "+calc.getFirstProductName()+ " imported: "+calc.getOverAllFirstImportedProductAmount()+"\n"
				 +" Number Of Product "+calc.getSecondProductName()+ " imported: "+calc.getOverAllSecondImportedProductAmount()+"\n"
				 +" Total Delivery Price of Our Product: " + calc.getOverAllDeliveryPrice()+"\n"
				 +" Total Import Price Incured with Delivery: "+ calc.getTotalImportPrice()+"\n"
				 +"Total Cost of Doing Business: "+ calc.getOverAllCostOfBusiness()+"\n"
				);
		
	}
	
//	/ this will make Profit loss statements
	public void make_PL_Statement(){
		int productRevenueEarned =calc.getOverAllCostEarnedByUsFromOurProduct() -calc.getOverAllDeliveryPrice();
		int importedProductsSpentMoney=calc.getTotalImportPrice();
		int Remaining_Amount_After_Business= productRevenueEarned - importedProductsSpentMoney;
		System.out.println("-----------"+calc.getMyProductName()+"-----------");
		System.out.println(" ");

		System.out.println(" ");

		System.out.println(" Actual Revenue Earned: "+ productRevenueEarned+"\n"
				+" Money ,Spent on Imported Product: "+importedProductsSpentMoney+"\n"
				+" Remaining Amount in the Business: "+Remaining_Amount_After_Business+"\n"
				
				);
		
		if (calc.getMyProductName().equals(Constants.companyNames[0])){
			A_productRevenueEarned=productRevenueEarned;
			A_importedProductsSpentMoney=importedProductsSpentMoney;
			A_Remaining_Amount_After_Business=Remaining_Amount_After_Business;
			
			
		}else if (calc.getMyProductName().equals(Constants.companyNames[1])){
			B_productRevenueEarned=productRevenueEarned;
			B_importedProductsSpentMoney=importedProductsSpentMoney;
			B_Remaining_Amount_After_Business=Remaining_Amount_After_Business;
			
		}
		else if (calc.getMyProductName().equals(Constants.companyNames[2])){
			C_productRevenueEarned=productRevenueEarned;
			C_importedProductsSpentMoney=importedProductsSpentMoney;
			C_Remaining_Amount_After_Business=Remaining_Amount_After_Business;
			
		}
	}
	
	//it will compare all the three companies 
	public static void compareAll(){
		if(A_productRevenueEarned>B_productRevenueEarned && A_productRevenueEarned>C_productRevenueEarned ){
			System.out.print("Product A Generated Maximum Sales With Revenue");
			}else if (B_productRevenueEarned>A_productRevenueEarned && B_productRevenueEarned>A_productRevenueEarned){
				System.out.print("Product B Generated Maximum Sales With Revenue");
			}
			else if (C_productRevenueEarned>B_productRevenueEarned && C_productRevenueEarned>B_productRevenueEarned){
				System.out.print("Product C Generated Maximum Sales With Revenue");
			}
		System.out.print(" AND ");
		
		if(A_importedProductsSpentMoney>B_importedProductsSpentMoney && A_importedProductsSpentMoney>C_importedProductsSpentMoney){
			System.out.print("Product A Spent the Most");
			}else if(B_importedProductsSpentMoney>A_importedProductsSpentMoney && B_importedProductsSpentMoney>C_importedProductsSpentMoney){
				System.out.print("Product B Spent the Most");
				}
			else if(C_importedProductsSpentMoney>B_importedProductsSpentMoney && C_importedProductsSpentMoney>A_importedProductsSpentMoney){
				System.out.print("Product C Spent the Most");
				}else{
					System.out.println("There is some error");
				}
		
		
	}
	
	

}