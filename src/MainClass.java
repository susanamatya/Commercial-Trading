/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rozeep
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		
		// JUST A HELPER CLASS , ONLY FOR PROGRAMMERS USE
		
		
		
		
		
//		System.out.println(Randomize.randomizeProductPrice());
//		System.out.println(Randomize.randomizeCashAllowance());
//		System.out.println(Randomize.randomizeDeliveryPrice());
//		System.out.println(Randomize.randomizeNativeProductLimit());
//		System.out.println(Randomize.randomizeOtherProductLimit());
		Company_BigA a = new Company_BigA();
		Company_BigB b= new Company_BigB();
		Company_BigC c= new Company_BigC();
		b.makeA_Trade();
		a.makeA_Trade();
		c.makeA_Trade();
		a.getEachTradeResults();
		b.getEachTradeResults();
		c.getEachTradeResults();
		a.getResults();
		c.getResults();
		b.getResults();
		a.makePL_Statement();
		b.makePL_Statement();
		c.makePL_Statement();
		Profit_Loss_Info.compareAll();
	
		
//		System.out.println("jiojjo");
		

	}

}
