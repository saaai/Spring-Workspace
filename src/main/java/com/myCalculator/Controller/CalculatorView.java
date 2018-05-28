package com.myCalculator.Controller;

//CalculatorView.java 
//this is the most difficult part of it, it's because of the interface part. the actual code that is part of the view is very simple.

import java.awt.event.ActionListener; //for catching events when user clicks on something

import javax.swing.*;//for making ourselves an interface

public class CalculatorView extends JFrame{
	
	//here we put the java stuff for making the interface.
	//now, we are building an interface right here, exactly how we want it on the screen
	private JTextField firstNumber = new JTextField(10);//for putting a block to enter the  number 
	private JLabel additionLabel = new JLabel(" + "); //addition sign 
	private JTextField secondNumber = new JTextField(10);//another block for entering the second number
	private JButton calculateButton = new JButton("Calculate");// button to perform the calculation
	private JTextField calcSolution = new JTextField(10);//block for solution.

	CalculatorView(){
	JPanel calcPanel = new JPanel(); //display on teh screen

	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to make sure the application is closed in deed after clicking closing
	this.setSize(600, 200); //wide, tall
	
	//to add all of the components that we created above to the panel
	calcPanel.add(firstNumber);
	calcPanel.add(additionLabel);
	calcPanel.add(secondNumber);
	calcPanel.add(calculateButton);
	calcPanel.add(calcSolution);


	this.add(calcPanel);//adding calcpanel to the JFrame becos thats where calculator view is 

	//and this is  end of adding all the components, that is whats gonna be displayed
	
	}
	
	//providing way to get access to firstNumber
	public int getFirstNumber(){
			return Integer.parseInt(firstNumber.getText()); 
	}

	public int getsecondNumber(){
			return Integer.parseInt(secondNumber.getText());
	}


	public int getCalcSolution(){
			return Integer.parseInt(calcSolution.getText());
	}


	public void setCalculation(int solution){

	calcSolution.setText(Integer.toString(solution));

	}

	void addCalculationListener(ActionListener listenerForCalcButton){
	calculateButton.addActionListener(listenerForCalcButton);
	}

	void displayErrorMessage(String errorMessage)
	{
	JOptionPane.showMessageDialog(this, errorMessage);
	}

}