package week1.day1;

public class Bike {

	public void applyBrake() {
		  System.out.println("Applied brake"); 
	}
	
	public void soundHorn() {
		  System.out.println("Sound horn"); 
	}

	public static void main(String[] args) {
	       Car obj1 = new Car();
		      obj1.applyBrake();
		      obj1.soundHorn();
		    
		   Bike obj2 = new Bike();
		      obj2.applyBrake();
		      obj2.soundHorn();
	}
}
