/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rozeep
 */

public class CompanyStatisticsInfo {
	Profit_Loss_Info comparer; //Object to get profit loss statement per class 
	Company_BigA a;
	Company_BigB b;
	Company_BigC c;
	
//	This COnstructor will take all three companies to compare them and make the result 
	public CompanyStatisticsInfo(Company_BigA a, Company_BigB b, Company_BigC c) {
//		super();
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public void compare(){
//		comparer.compareAll(a, b, c);
		
	}
	

}

