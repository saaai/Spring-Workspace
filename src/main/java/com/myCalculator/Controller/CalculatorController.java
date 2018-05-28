package com.myCalculator.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//CalculatorController.java

//this handles interactions between the model and the view everything 

public class CalculatorController
{
	
		private CalculatorView theView;
		private CalculatorModel theModel;


		//creating constructor 
		public CalculatorController(CalculatorView theView, CalculatorModel theModel)
		{
				this.theView = theView;
				this.theModel = theModel;


		//Now, what we need to tell the view is that whenever the calculate button is clicked to execute the action performed method that is going to be in the inner class called calculateListener below.

		this.theView.addCalculationListener(new CalculateListener());
		//theView refer's to the objects version of theView, not theView that is passed in here.
		}

		//creating inner class
		class CalculateListener implements ActionListener {
 
 		public void actionPerformed(ActionEvent arg0)
 		{
 				int firstNumber, secondNumber =0;

 				//since, we dont know if the user is gonna enter both numbers to calculatso we have to surround everything in the try, catch block.

 				try{
 						firstNumber = theView.getFirstNumber();
 						secondNumber = theView.getsecondNumber();

 						theModel.addTwoNumbers(firstNumber, secondNumber);

 						theView.setCalculation(theModel.getCalculationValue());

 				}
 				catch(NumberFormatException ex){
 				theView.displayErrorMessage("You Need to Enter 2 Integer inorder to perform the action");


 				}
 		}

				//now we need to create all these objects and we r gonna do that in MVCCalculator.java
}
}
