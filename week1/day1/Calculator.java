package week1.day1;

public class Calculator {

	public static void sub() {
		
		 int a=10;
		 int b=15;
		 System.out.println(b-a);
	}
	
		public int multiply(int a,int b) {
			 
			 return a*b;
		}
	public static void main(String[] args) {
		Calculator call = new Calculator();
		call.sub();
		int multiply=call.multiply(10, 20);
		System.out.println(multiply);
		
	}	
		
		
	  }

	
		 


