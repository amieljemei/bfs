package vfl;

import java.io.Console;
import java.io.IOException;

public class vendingMachine {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Boolean adminLevel = true;
		while (adminLevel){
			//Runtime.getRuntime().exec("cls");
			System.out.println("Select one of the following options by typing the coresponding number:");
			System.out.println("1) Add Snack");
			System.out.println("2) Start Vending machine");
			String adminOption = System.console().readLine();
			if (adminOption == "1" ){
				//run snack input method
				addSnacks();
			}
			else if (adminOption == "2"){
				//this will start the vending machine for normal users
				vendingMachineRunning();
			}
		}
		int r = 0;

	}
	
	public static void vendingMachineRunning()
	{
		Boolean running = true;
		
		while (running){
			
		}
	}
	
	public static void addSnacks(){
		System.out.println("adding snacks");
		
	}

}
