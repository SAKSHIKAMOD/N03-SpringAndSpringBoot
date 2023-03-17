package org.tnsif.usingautowiredanotation;

public class Cell {
	
	//private data members 
	private String Company;
	private String Size;
	
	//getters and setters
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		this.Company = company;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	
	//Default Constructor
	public Cell() {
		super();
		System.out.println("Default Constructor For Cell");
	}
	public void power() {
		
		System.out.println("Company of a cell :"+Company);
		System.out.println("Size of cell: "+Size);
	}
	
	
	
	

}
