package week1.day1;

import io.cucumber.java.ca.Cal;

public class Calculator1 {

	public void addTwoNumbers(int n1,int n2) {
		System.out.println(n1+" + "+n2 + "=" + (int)(n1+n2));
	}
	
	public void addThreeNumbers(int n1,int n2,int n3) {
		System.out.println(n1+"_"+n2+ "+"+n3+"_"+(int)(n1+n2+n3));
	}
	
	public void subTwoIntegers(int n1,int n2) {
		System.out.println(n1+"_"+n2+"="+(n1-n2));
	}
	public void subTwoDouble(double n1, double n2) {
		System.out.println(n1+"-"+n2+"="+ (double)(n1-n2));
	}
	public void mulTwoIntegers(int n1,int n2) {
		System.out.println(n1+"X"+n2+"="+ n1*n2);
	}
	public void mulIntAndDouble(int n1, double n2) {
		System.out.println(n1+"X"+n2+"="+ (double)n1*n2);
	}
	public void divTwoIntegers(int n1,int n2) {
		System.out.println(n1+"/"+n2+"="+n1/n2);
	}
	public void divIntAndDouble(int n1,int n2) {
		System.out.println(n1+"/"+n2+"="+(double)n1/n2);
	}
	
	public static void main(String[] args) {
		 Calculator1 cal = new Calculator1();
		 
		 
		 System.out.println("ADDITION");
		 cal.addTwoNumbers(10, 20);
		 cal.addThreeNumbers(5,10, 20);
		 
		 System.out.println("\nSUBTRACTION");
		 cal.subTwoIntegers(25,50);
		 cal.subTwoDouble(10.5, 20.5);
		 
		 System.out.println("\nMULTIPLICATION");
		 cal.mulTwoIntegers(20, 10);
		 cal.mulIntAndDouble(2, 15.5);
		 
		 System.out.println("\nDIVISION");
		 cal.divTwoIntegers(4,12);
		 cal.divIntAndDouble(2,5);
		 
		 
	}	 
		
	}
		
		
	

	

