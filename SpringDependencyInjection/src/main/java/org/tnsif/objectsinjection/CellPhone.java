package org.tnsif.objectsinjection;
//program to demonstrate on DI in the form of object
public class CellPhone {

	    //2.DI in the form of object
		Charger charger;

		//DI using setters
		public void setCharger(Charger charger) {
			this.charger = charger;
		}
		//Injecting the object of charger class
		public void accept()
		{
			charger.power();   
		}
		
		
	
}
