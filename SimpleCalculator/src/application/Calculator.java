package application;

/** 
 * Defines an interface for a basic calculator model; accepts digit and operator input as chars and displays the 
 * current state as a String.
 * 
 * <p>How the calculator handles input and formats output is down to the specific implementation.
 * 
 * @author Jamie Ferguson Gunn
 */

public interface Calculator {
	
	/**
	 * Adds a digit. Accepts digit input as a char.
	 * 
	 * @param digit the digit to be added
	 */
	
	void addDigit(char dig);
	
	/**
	 * Adds an operator. Accepts operator input as a char.
	 * 
	 * @param op the operator to be added
	 */
	
	void addOperator(char op);
	
	/**
	 * Adds a decimal.
	 */
	
	void addDecimal();
	
	/**
	 * Requests that calculation is performed.
	 */
	
	void equals();
	
	/**
	 * Delete the last character added.
	 */
	
	void delete();
	
	/**
	 * Display the current state of the calculator.
	 * 
	 * @return a String representing the current state of the calculator.
	 */
	
	String display();
	
}
