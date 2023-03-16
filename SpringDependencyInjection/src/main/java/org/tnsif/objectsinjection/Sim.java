package org.tnsif.objectsinjection;

public class Sim {

	private String simtype;
	private String company;
	
	//DI using setters
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//to string method
	@Override
	public String toString() {
		return "Sim [simtype=" + simtype + ", company=" + company + "]";
	}
	
	
}
