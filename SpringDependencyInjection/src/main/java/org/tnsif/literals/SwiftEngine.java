package org.tnsif.literals;

public class SwiftEngine implements IEngine {

	//1.DI in the form of literal
	private String company;
	private double cost;
	
	//DI using Constructor
	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	
	public double cost() {
		return cost;
	}
	public String display() {
		return "Nashik";
	}
	
	//DI using setters                                           
	/*public void setCompany(String company) {
		this.company = company;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	*/
	
	//to string method
	@Override
	public String toString() {
		return "Origin of company : " +company+ fuel;
	}

	
}
