package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * Stores state and provides operations for a simple calculator model. Internal
 * state consists of two numbers and an operator; accepts digit and operator input
 * as strings.
 * 
 * <p>Can handle decimal numbers of arbitrary size and rounds to 5 decimal places.
 * 
 * @author Jamie Ferguson Gunn
 */

public class MainModel implements Calculator{
	
	
	// The calculator's two numbers, represented as Strings
	private ArrayList<StringBuilder> numbers;
	// The operator
	private String operator;
	// Determines whether the two numbers already have decimals present
	private boolean[] hasDecimal;
	// The current state of the calculator
	private State state;
	
	//this comment does nothing
	
	private enum State {
		// Initial state - nothing entered
		NUMBER_0_EMPTY (0), 
		// First number has digit(s)
		NUMBER_0 (0), 
		// Operator entered
		NUMBER_1_EMPTY(1), 
		// Second number has digit(s)
		NUMBER_1(1), 
		// At least one calculation has been performed, and the calculator is ready
		// for a new calculation
		NEWSUM(0) {
			@Override
			public State next() {
				return NUMBER_1_EMPTY;
			}
		};
		
		private final int index;
		
		State(int index) {
			this.index = index;
		}
		
		public int index() { 
			return index; 
		}
		
		public State next() {
			return values()[ordinal() + 1];
		}
		
		public State previous() {
			return values()[ordinal() - 1];
		}
	}
	
	public MainModel() {	
		numbers = new ArrayList<StringBuilder>();
		numbers.add(new StringBuilder());
		numbers.add(new StringBuilder());
		operator = "";
		hasDecimal = new boolean[] {false, false};
		state = State.NUMBER_0_EMPTY;
	}
	
	/**
	 * Adds the submitted digit to the number currently accepting input. If there is no
	 * operator present this is the first number; else it is the second.
	 * 
	 * @param dig the digit to be added
	 */
	
	public void addDigit(final char dig) {
		String digit = "" + dig;
		
		if (state == State.NEWSUM) {
			reset(digit);
			return;
		}
		// If number is empty advance to non-empty state
		if (state == State.NUMBER_0_EMPTY || state == State.NUMBER_1_EMPTY)
			state = state.next();
		StringBuilder currentNum = numbers.get(state.index());
		// Trim leading 0
		if (currentNum.length() == 1 && currentNum.charAt(0) == '0')
			currentNum.deleteCharAt(0);
		currentNum.append(digit);
	}
	
	/**
	 * Adds an operator. If an operator is already present but the calculator
	 * only has one number, the operator is replaced. If an operator is present
	 * and the calculator has two numbers, the calculation is performed and 
	 * then next operator added.
	 * 
	 * @param op the operator to be added
	 */
	
	public void addOperator(final char op) {
		String operator = "" + op;
		
		switch (state) {
			case NUMBER_0_EMPTY:
				break;
			case NUMBER_0: case NEWSUM:
				this.operator = operator;
				state = state.next();
				break;
			case NUMBER_1_EMPTY:
				this.operator = operator;
				break;
			case NUMBER_1:
				calculate();
				this.operator = operator;
				state = State.NUMBER_1_EMPTY;
				break;			
		}
	}
	
	/**
	 * Adds a decimal place if the model is currently accepting number input
	 * and there is not already a decimal present.
	 */
		
	public void addDecimal() {
		// If number is empty or there is already a decimal place, do nothing
		if (state == State.NUMBER_0_EMPTY || state == State.NUMBER_1_EMPTY || 
		    state == State.NEWSUM  || hasDecimal[state.index()])
			return;
		numbers.get(state.index()).append(".");		
	}
	
	/**
	 * If the model is ready to calculate, calculates. Otherwise does nothing.
	 */
	
	public void equals() {
		if (state == State.NUMBER_1)
			calculate();
	}
	
	/** 
	 * Deletes the last character entered. If no characters present does nothing.
	 */
	
	public void delete() {
		switch (state) {
			case NUMBER_0_EMPTY: 
				break;
			case NUMBER_1_EMPTY:
				operator = "";
				state.previous();
				break;
			case NEWSUM: 
				reset("0");
				break;
			default: 
				StringBuilder currentNum = numbers.get(state.index());
				currentNum.deleteCharAt(currentNum.length() - 1);
				if (currentNum.length() == 0) {
					state = state.previous();
				}
				break;			
		}
	}
		
	/** 
	 * Returns the current state of the calculator, formatted as a string.
	 * 
	 * @return string representation of this calculator's current state in the format
	 * "number1 operator number2"
	 */
	
	public String display() {
		return String.format("%s %s %s", numbers.get(0).toString(), operator, numbers.get(1).toString());
	}
	
	// Performs calculation based on the numbers and operator submitted, stores
	// the result and readies the calculator for new input.	
	private void calculate() {	
		// Convert to BigDecimal to handle calculation
		BigDecimal num1 = new BigDecimal(numbers.get(0).toString());
		BigDecimal num2 = new BigDecimal(numbers.get(1).toString());		
		// Initialise result to 0
		BigDecimal result = new BigDecimal("0");
		
		switch (operator) {
			case "/": 
				// Handle dividing by 0
				if (numbers.get(1).toString().equals("0"))
					// Result already 0 so do nothing
					break;
				// Division rounds to 5 decimal places
				result = num1.divide(num2, 5, RoundingMode.HALF_UP); 
				break;
			case "*": result = num1.multiply(num2); break;
			case "-": result = num1.subtract(num2); break;
			case "+": result = num1.add(num2); break;
			default: break;
		}
		// Pass the result and ready the calculator for the next sum
		startNextSum(result.stripTrailingZeros().toPlainString());
	}
	
	// Prepares the calculator for the next sum
	private void startNextSum(String result) {
		numbers.add(0, new StringBuilder(result));
		numbers.add(1, new StringBuilder());
		operator = "";
		hasDecimal[0] = (numbers.get(0).toString().contains(".")) ? true : false;
		hasDecimal[1] = false;
		state = State.NEWSUM;
	}
	
	// Sets calculator to initial state
	private void reset(String digit) {
		numbers.add(0, new StringBuilder(digit));
		numbers.add(1, new StringBuilder());
		operator = "";
		hasDecimal = new boolean[] {false, false};
		state = State.NUMBER_0;
	}
}
