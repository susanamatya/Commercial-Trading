/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rozeep
 */

public class DTInfo {
	private final int typeOfProducts=3;
	private String [] productNames={"A","B","C"};
	private String nameOfSellingCompany;
	private String costOfProduct;
	private String costOfDelivery;
	private String totalCostOfDoingBusiness;
	
	
	
	//Two Constructors based on the requirements
	public DTInfo(String[] productNames, String nameOfSellingCompany, String costOfProduct, String costOfDelivery,
			String totalCostOfDoingBusiness) {
		super();
		this.productNames = productNames;
		this.nameOfSellingCompany = nameOfSellingCompany;
		this.costOfProduct = costOfProduct;
		this.costOfDelivery = costOfDelivery;
		this.totalCostOfDoingBusiness = totalCostOfDoingBusiness;
	}
	public DTInfo() {
		super();
	}
	//Getter Setters
	
	
	public String[] getProductNames() {
		return productNames;
	}
	public int getTypeOfProducts() {
		return typeOfProducts;
	}
	public void setProductNames(String[] productNames) {
		this.productNames = productNames;
	}
	public String getNameOfSellingCompany() {
		return nameOfSellingCompany;
	}
	public void setNameOfSellingCompany(String nameOfSellingCompany) {
		this.nameOfSellingCompany = nameOfSellingCompany;
	}
	public String getCostOfProduct() {
		return costOfProduct;
	}
	public void setCostOfProduct(String costOfProduct) {
		this.costOfProduct = costOfProduct;
	}
	public String getCostOfDelivery() {
		return costOfDelivery;
	}
	public void setCostOfDelivery(String costOfDelivery) {
		this.costOfDelivery = costOfDelivery;
	}
	public String getTotalCostOfDoingBusiness() {
		return totalCostOfDoingBusiness;
	}
	public void setTotalCostOfDoingBusiness(String totalCostOfDoingBusiness) {
		this.totalCostOfDoingBusiness = totalCostOfDoingBusiness;
	}
	
	

}

