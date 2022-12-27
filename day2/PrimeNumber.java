package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		 int num = 13;
		  
		 boolean isPrime = false;
		 
		 for (int i=2; i<num/2; i++) {
			 
	if(num % i == 0) {
		isPrime = true;
			break;
		
	}
		 }
			
		 if(isPrime == false) {
			 System.out.println(num + "is a Prime Number");
		 }	 
		 else {
			 System.out.println(num + "is not a Prime Number");
		 }
	}
}


