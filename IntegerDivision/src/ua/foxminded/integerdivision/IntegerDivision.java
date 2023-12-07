package ua.foxminded.integerdivision;

import java.util.Scanner;

public class IntegerDivision {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the dividend
	        System.out.print("Enter the dividend (numerator): ");
	        int dividend = scanner.nextInt();

	        // Input the divisor
	        System.out.print("Enter the divisor (denominator): ");
	        int divisor = scanner.nextInt();

	        // Perform custom long division
	        int quotient = 0;
	        StringBuilder result = new StringBuilder();
	        String dividendStr = String.valueOf(dividend);

	        int partialDividend = 0;

	        for (int i = 0; i < dividendStr.length(); i++) {
	            int currentDigit = Character.getNumericValue(dividendStr.charAt(i));
	            partialDividend = partialDividend * 10 + currentDigit;

	            if (partialDividend < divisor && i != 0) {
	                result.append(" " + currentDigit);
	            } 
	                int currentQuotient = partialDividend / divisor;
	                int currentProduct = currentQuotient * divisor;

	              
	                result.append(" _" + partialDividend + " |" + divisor + "\n");
	                result.append("   " + currentProduct + "\n" + "   " +  "         |-----" + currentQuotient);
	                result.append("\n");

	                partialDividend -= currentProduct;
	                quotient = (quotient * 10) + currentQuotient;
	            
	        }
	        

	        // Display the final result
	        System.out.println("Result:");
	        System.out.println(result.toString());
	        System.out.println("Quotient: " + quotient);

	        // Close the scanner
	        scanner.close();
	    }
	}
