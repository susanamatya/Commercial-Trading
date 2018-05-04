/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rozeep
 */
import java.util.Random;


// THIS CLASS WILL RANDOMIZE ALL OF THE DEPOT VALUES TO GENERATE AUTOMATIC TRADE
public class Randomize {
	static Random rand = new Random();
	
// it will randomize prices of the products from 1-10
	public static int randomizeProductPrice(){
		int price=(int) ((int)Constants.productPriceMinLimit+((long)(rand.nextDouble()*((Constants.productPriceMaxLimit)-(Constants.productPriceMinLimit)))));
		
//		rand=null;
		return price;
		
	}
//	it will randomize delivery price
	public static int randomizeDeliveryPrice(){
		int Delivery=(int) ((int)Constants.productDeliveryMinLimit+((long)(rand.nextDouble()*((Constants.productDeliveryMaxLimit)-(Constants.productDeliveryMinLimit)))));
		
//		rand=null;
		return Delivery;
		
	}
	public static int randomizeCashAllowance(){
		int Delivery=(int) ((int)Constants.cash_allowance_Min_Limit+((long)(rand.nextDouble()*((Constants.cash_allowance_Max_Limit)-(Constants.cash_allowance_Min_Limit)))));
		
//		rand=null;
		return Delivery;
		
	}
	
	//randomize product limit
	public static int randomizeOtherProductLimit(){
		int Delivery=(int) ((int)Constants.otherProductMinLimit+((long)(rand.nextDouble()*((Constants.otherProductMaxLimit)-(Constants.otherProductMinLimit)))));
		
//		rand=null;
		return Delivery;
		
	}
	
	//it will randomize product limit of my product
	public static int randomizeNativeProductLimit(){
		int Delivery=(int) ((int)Constants.nativeProductMinLimit+((long)(rand.nextDouble()*((Constants.nativeProductMaxLimit)-(Constants.nativeProductMinLimit)))));
		
//		rand=null;
		return Delivery;
		
	}
}
