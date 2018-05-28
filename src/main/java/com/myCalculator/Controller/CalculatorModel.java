package com.myCalculator.Controller;


//CalculatorModel.java

//Model is just simply gonna hold the data and perform all the calculations and that is it it wont even know view exists.

public class CalculatorModel{
	
	private int calculationValue;
 
	public void addTwoNumbers(int firstNumber, int secondNumber) //performing the calculation methods needed
	{
	calculationValue= firstNumber + secondNumber;

	}

	public int getCalculationValue() //provides access to the data 
	{
	return calculationValue;

	}
} 

// model is done, what it does is it contains the data which is just calculation value, it performs the methods needed and it provides access to the data
