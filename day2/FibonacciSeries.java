package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8, firstNum = 0, secNum = 1, sum = 0;
		
    System.out.println(firstNum + " is the First number ");
    System.out.println(firstNum + " " + secNum + " ");
    
        for ( int i = 3; i <= range; i++) {
        	
        	sum = firstNum + secNum;
        	
        	firstNum = secNum;
        	
        	secNum = sum;
        	
         // print sum
        	System.out.println(sum + " ");
        }

	}

}
