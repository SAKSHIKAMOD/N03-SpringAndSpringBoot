package org.tnsif.autowiredexample;

public class Board {

	//DI in the form of object
	Marker m;
	
	//DI using setters
	/*public void setb(Marker m) {
		this.m=m;
	}*/

	//injecting the object of marker
	public void accept()
	{
		m.ink();
	}
	
	//DI using constructor
	public Board(Marker m) {
		super();
		System.out.println("Autowired using constructor");
		this.m=m;
	}
}
