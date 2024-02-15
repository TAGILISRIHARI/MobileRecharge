package com.pack;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass
{
//	Scanner  to take input from user
	static Scanner sc = new Scanner(System.in);
	
//	Method that asks user to ask Mobile number
	static public void startingPoint() throws Exception
	{
		
		System.out.println("\n\n"
				+ "\tWellcome User follow below Steps to continue");
		System.out.println("\t1.Recharge Your Mobile\n"
				+ "\t2.Exit\n");
		
//		Calling a method to get number that method return type is int and stores in variable userIput
		int userOption=GetUserOptionForSwitchCase.gettingOption();
		
		switch(userOption)
		{
		case 1:
//			If selects Option a asks user to enter his mobile number
			new MainClass().getMobileNumber(0);
			break;
			
		case 2:
//			If user selects Option 2 then he exits ,code will ended
			printExitMeassage.userExitedWasDone();
			break;
			
		default:
//			If user selects other than 1 and 2 options again displays same options until he he selects correct option
			System.out.println("\t-----------------------------------------------------------");
			System.out.println("\tPlease Select a valid Option Only");
			MainClass.startingPoint();
		}
		
	}
	
//	Method to take mobile number from user
	public void getMobileNumber(int count) throws Exception
	{
//		starting the count will be zero if user enter three wrong attempts of mobile number then he will be redirected back from were he came
		if(count<=2)
		{
//			Calling a method checkNumber() to get mobile number retun is boolean
			if(MainClass.checkNumber())
			{
//				Using sleep() method for small style
				System.out.println("\t--------------------------------------------------------\n");
				System.out.print("\tVerifying Mobile Number ");
				Thread.sleep(1000);
				System.out.print("⌛");
				Thread.sleep(500);
				System.out.print("⏳");
				Thread.sleep(1000);
				System.out.print("⌛");
				Thread.sleep(500);
				System.out.print("⏳\n");
				new SelectSim().selectingSim();
			}
			else 
			{
//				if user enter wrong mobile number count increase
				count++;
//				Using sleep() method for small style
				System.out.println("\t-------------------------------------------------------\n");
				System.out.print("\tVerifying Mobile Number ");
				Thread.sleep(1000);
				System.out.print("⌛");
				Thread.sleep(500);
				System.out.print("⏳");
				Thread.sleep(500);
				System.out.print("⌛");
				Thread.sleep(1000);
				System.out.print("⏳\n");
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\tPlease Enter a valid Mobile number");
//				Again calling same method to get mobile number
				getMobileNumber(count);
				
			}
		}
//		this else block is excecuted when user entered three wrong inputs
		else 
		{
//		Calling main method
		MainClass.startingPoint();	
		}
		
		
		
	}
//	Asks user to enter mobile number
	static public boolean checkNumber() throws Exception
	{
		
//		while executes until loops breaks
		while(true)
		{
			try
			{
//				mobile number is long data type so if user enter any string it raise exception so wrriten catch block
				System.out.println("\t-------------------------------------------------------");
				System.out.print("\tEnter your Mobile Number: ");
//				If user enter int or long type it accepts 
//				Stores the number
				new Variables().setMobileNumber(sc.nextLong());
//				while loop breaks here
				break;
			}
			catch(Exception e)
			{
//				Prints Input no valid
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\tYour input is not valid, Please Re-Enter a valid Input");
			}
//			Clears the scanner buffer so previous entered value is cleared form scanner
			sc.nextLine();
//			Again while is starts excecute because condition is true
		}
		
		
		
//		Geting mobile number to varibale number
		long number = new Variables().getMobileNumber();
//		Calling a method return type is int and storing that in varibale in count
		long count = VerifyMobileORUPINumber.countMobileNumber(number);
//		Geting first number of user mobile number
		boolean firstNumber = MainClass.getFirstNumber();
//		if count is 10 if block executed
		if(count==10 && firstNumber)
		{
//			Our method is boolean is returing it when if block is exccuted
			return true;
		}
		else 
		{
//			Our method is boolean is returing it when else block is excecuted
			return false;
		}
		
	}
//	Geting first digit of mobile number
	public static boolean getFirstNumber()
	{
		
		long mobileNumber = new Variables().getMobileNumber();
		long firstNumber=mobileNumber/1000000000;
		if(firstNumber==9 || firstNumber==8 || firstNumber==7 || firstNumber==6)
		{
			return true;
		}
		else 
		{
			
			return false;
			
		}
		
	}
	
//	Main method
	public static void main(String[] args)  throws Exception
	{
//		Calling a method that prints project method, ask user to enter project or exit
		new WellcomeText().printWellCome(0);
	}
	

}
