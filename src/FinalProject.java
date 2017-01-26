/**
 * Name: Hongjiao Hu
 * 
 * Teacher: Mr. Hardman
 * 
 * Assignment finalProject, Program 1.
 * 
 * Date Last Modified: 1/26/2016
 * 
 */

import java.util.Scanner;

/**
 * @author h.hu
 *
 */
public class FinalProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double[] currentNumber1 = new double[5];
		
		double[] currentNumber2 = new double[7];
		
		Boolean b1, b2;

		b1 = new Boolean(true);
	    b2 = new Boolean(false);
	    
	    char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      
		String helloString = new String(helloArray);  
	    System.out.println( helloString );

		
		System.out.println("Please enter five marks to start: ");
		
		for(int i = 0; i < currentNumber1.length; i++){
			currentNumber1[i] = userInput.nextDouble();
		}
		
		System.out.println("Please enter seven marks to compare: ");
		
		for(int i = 0; i < currentNumber2.length; i++){
			currentNumber2[i] = userInput.nextDouble();
		}
		
		double average1 = calcAverage( currentNumber1 );
		double average2 = calcAverage( currentNumber2 );
		
		if(average2 > average1){
			
			System.out.println("Your average is greater than student 1's by " + (average2 - average1) + " points." + "That is " + b2);
			
		} else if(average2 < average1){
			
			System.out.println("Your average is less than student 1's by " + (average1 - average2) + " points." + "That is " + b2);
			
		} else {
			
			System.out.println("Your average is equal to student 1's. " + "That is " + b1);
			
		}
		
		int userChoice;
		int factorialCalculation;
		
		calculatePi();
		
		
		
		System.out.println("\n" +"Next is the factorial and logarithm." + "\n" + "Please enter a number you want the factor of: ");
		userChoice = userInput.nextInt();
		
		factorialCalculation = calculateFactorial(userChoice);
		
		System.out.println("The factorial value of " + userChoice + "! is: " + factorialCalculation);
		
		System.out.println("\nRespectively logarithm (Base 10) and logarithm (Base e)");
		
		
		double x = userChoice;
			
			
		System.out.println(Math.log10(userChoice));
		
		System.out.println("Math.log(" + x + ")=" + Math.log(x));
		
		System.out.printf("sqrt(%.3f) is %.3f%n",x , Math.sqrt(x));
		
		System.out.println("\nWe will further, into the power of the calculation");
		
		System.out.print("Please enter your base at first: ");

		int base = userInput.nextInt();

		System.out.print("Please enter your exponent to continue : ");

		int power = userInput.nextInt();

		double result = mathPower(base, power);

		System.out.println(base + " to the power of " + power  + " is " + result + ".");

		double degrees = userChoice;
	    double radians = Math.toRadians(degrees);

	    System.out.println("\nThe second last one is calculate trigonometric function: ");
	    
	    System.out.format("The sine of %.1f degrees is %.4f%n", degrees, Math.sin(radians));
	    System.out.format("The cosine of %.1f degrees is %.4f%n", degrees, Math.cos(radians));
	    System.out.format("The tangent of %.1f degrees is %.4f%n", degrees, Math.tan(radians));
	    System.out.format("The arcsine of %.4f is %.4f degrees %n", Math.sin(radians),
	       Math.toDegrees(Math.asin(Math.sin(radians))));
	    System.out.format("The arccosine of %.4f is %.4f degrees %n", Math.cos(radians),
	       Math.toDegrees(Math.acos(Math.sin(radians))));
	    System.out.format("The arctangent of %.4f is %.4f degrees %n", Math.cos(radians), 
	       Math.toDegrees(Math.atan(Math.sin(radians))));

	    System.out.println("\nThe last one is calculate Permutations: ");
	    
	    char[] alphabet = new char[] {'a','b'};
		calcPermutation("", helloString);
		calcCombination(3, alphabet,"");
		


		userInput.close();
	
	}
		
	
	
	/**
	 * calcAverage will calculate the average of any number 
	 * pass to the methods
	 *
	 * @param marks are the number you calculate the average of
	 * @return the calculate average for  the given number
	 */
	
	public static double calcAverage( double[] marks ){
		
		double sum = 0;
		double average = 0;
		
		for(int i = 0; i < marks.length; i++){
		
			sum += marks[i];
	    
		}
	
	    average = sum / marks.length;
	
	    return average;
	 
	    
	}

	/**
	 *calculateFactorial calculate the factorial of any number
	 *pass to the methods
	 * 
	 * @param numberTofactorial is the number we calculate the factorial of
	 * @return the calculate factorial for the given number
	 */

	public static int calculateFactorial(int numberTofactorial){
		
		int calculation = 1;
		
		for(int i = numberTofactorial; i > 0; i--){
			
			calculation = calculation * i;
			
		}
		
		
		return calculation;
		
		
	
	}
	
	/**
	 *mathPower calculate the power of any number
	 *pass to the methods
	 * 
	 * @param mathPower is the number we calculate the power of
	 * @return the calculate power for the given number
	 */
	
	public static double mathPower(double a, int b) 
	{
	    double result = 1;

	    if (b < 0) {
	       a = 1.0 / a;
	       b = -b;
	    }

	    for (int  i = 0; i < b; i++) {
	        result = result * a;
	    }

	    return result;
	}

	/**
	 *calcPermutation calculate the permutation of any number
	 *pass to the methods
	 * 
	 * @param calcPermutation is the number we calculate the permutation of
	 * @return the calculate permutation for the given number
	 */
	
	public static void calcPermutation(String prefix, String str) {

		int n = str.length();

		if (n == 0) System.out.println(prefix);

		else {

		for (int i = 0; i < n; i++)

			
			calcPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));

		}
		
	}

	/**
	 *calcCombination calculate the combination of any number
	 *pass to the methods
	 * 
	 * @param calcCombination is the number we calculate the combination of
	 * @return the calculate combination for the given number
	 */
		
		public static void calcCombination(int maxLength, char[] alphabet, String curr) {
		
		if(curr.length() == maxLength) {
			System.out.println(curr);

	       
		} else {
	            
			for(int i = 0; i < alphabet.length; i++) {
	                
				String oldCurr = curr;
	            curr += alphabet[i];
	            calcCombination(maxLength,alphabet,curr);
	            curr = oldCurr;
	                
	                
	            }
	        }
	    }
	
		/**
		 *calculatePi is return the pi valve when people
		 *type it
		 * 
		 * @param pi is the number we need to return
		 * @return the pi valve
		 */

		public static double calculatePi(){
			
			double pi = 3.141519;
			
			return pi;
			
			
		
		
		}
     
  }
