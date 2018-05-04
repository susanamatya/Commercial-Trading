/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rozeep
 */

public class Company_BigA {
	
	// COmpany Stats
	DoDepot trade; // A class wich makes all 100 depots 
	Profit_Loss_Info statement; // A class which
	private String productName= Constants.companyNames[0];
	private String firstImportedProductName= Constants.companyNames[1];
	private String SecondImportedProductName= Constants.companyNames[2];
	
	// Constructor for this specific class
	public Company_BigA() {
		// TODO Auto-generated constructor stub
		trade= new DoDepot(productName, firstImportedProductName, SecondImportedProductName);
		statement=new Profit_Loss_Info(trade);
		
	}
	//This will make trades
	public void makeA_Trade(){
//		System.out.println("makeA_Trade() has been called from Company_BigA");
		trade.doTrade();
		
	}
	//This will fetch result per depot 
	public void getEachTradeResults(){
//		System.out.println("getEachTradeResults has been called from Company_BigA");
		trade.printTrade();
		
	}
	//this will get all the joined results of 100 depots
	public void getResults(){
//		System.out.println("getEachTradeResults has been called from Company_BigA");
//		trade.calculateProfitLoss();
		statement.printInfo();
		
	}
	
	//This will makee profit loss statwements 
	public void makePL_Statement(){
		
		statement.make_PL_Statement();
	}

}

