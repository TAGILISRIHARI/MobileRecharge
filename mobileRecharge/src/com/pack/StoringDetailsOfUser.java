package com.pack;

import java.sql.Statement;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;

public class StoringDetailsOfUser implements JioPrintingThanksToUser,BSNLPrintingThanksToUser
{
	
	@Override
	public void printThanksJio() {
		// TODO Auto-generated method stub
		String operator = Variables.getOperator();
		System.out.println("\t------------------------------------------------------------------------------");
		System.out.println("\t\t\t Thanks For Choosing Us");
		System.out.println("\t\t\t         "+operator);
		
	}
	
	@Override
	public void printThanksBSNL() {
		// TODO Auto-generated method stub
		String operator = Variables.getOperator();
		System.out.println("\t------------------------------------------------------------------------------");
		System.out.println("\t\t\t Thanks For Choosing Us");
		System.out.println("\t\t\t         "+operator);
		
	}

	
	public void storingCardPayments(String cardName,int card,int amount,long refNo,long transId,String date) throws Exception
	{
		
		System.out.print(".\n");
		String operator = Variables.getOperator();
		long mobileNumber = new Variables().getMobileNumber();
		//Writing into a file
		BufferedWriter writeCardDetails = new BufferedWriter(new FileWriter("C:\\java\\cardDetails.txt",true));
		writeCardDetails.write(cardName+" XXXXXXXXXXXX"+card+", Operator : "+operator+", Mobile No : "+mobileNumber+", Amount "+amount+" Transaction ID: "+transId+" Reference No: "+refNo+" Date&Time: "+date+" ");
		writeCardDetails.newLine();
		writeCardDetails.close();
		
		//Storing into a database
		try
		{
			//Loading Server
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Creating Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##tagili", "tagili");
			//Preparing Statement
			Statement stm = con.createStatement();
			//Executing Query
			int q = stm.executeUpdate("insert into cardDetails values('"+cardName+"',"+card+",'"+operator+"',"+mobileNumber+","+amount+","+transId+","+refNo+",systimestamp)");
			//Closing Connection
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		callingOverridingMethods();//print thanks to user 
		askUsertoProceedOrNot();//ask user to continue or exit
		
	}
	public void storingUPIPayments(String paymentPlatform,long transId,long refNo,String date) throws Exception
	{
		long mobileNumber = new Variables().getMobileNumber();
		String operator = Variables.getOperator();
		long upiNumber = new Variables().getUpiNumber();
		int planAmount = Variables.getPlanAmount();
		BufferedWriter writeUPIDetails = new BufferedWriter(new FileWriter("C:\\java\\upiDetails.txt",true));
		//Write into a file
		writeUPIDetails.write(paymentPlatform+", Operator : "+operator+", Mobile No : "+mobileNumber+", UPI Number : "+upiNumber+", Amount : "+planAmount+" Transaction ID: "+transId+" Reference No : "+refNo+" Date&time : "+date);
		writeUPIDetails.newLine();
		writeUPIDetails.close();
		
		
		//Storing into a database
		try
		{
			//Loading Server
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Creating Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##tagili", "tagili");
			//Preparing Statement
			Statement stm = con.createStatement();
			//Executing Query
			int q = stm.executeUpdate("insert into upiDetails values('"+paymentPlatform+"','"+operator+"',"+mobileNumber+","+upiNumber+","+planAmount+","+transId+","+refNo+",systimestamp)");
			//Closing Connection
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		callingOverridingMethods();//print thanks to user
		askUsertoProceedOrNot();//ask user to continue or exit
		
		
	}
	
	public void callingOverridingMethods() throws Exception
	{
		String operator = Variables.getOperator();
		//switch case operating with the operator that user selected in the begining
		switch(operator)
		{
		case "Airtel":
			//Using Lambda Expression to give method body to the abstarct method present in the Function Interface AirtelPrintingThanksToUser
			//And We do not need Method Overriding for providing method Lambda Expression is alternative for Method Overriding
			
			AirtelPrintingThanksToUser airtelLambda = ()->{
				System.out.println("\t----------------------------------------------------------------------------");
				System.out.println("\t\t\t Thanks For Choosing Us");
				System.out.println("\t\t\t         "+operator);
			};
			
			airtelLambda.printThanksAirtel();
			break;
		case "Jio":
			//Inheritance 2 point child class object with parent class reference , we can call only parent class methods
			JioPrintingThanksToUser jioObject = new StoringDetailsOfUser();
			jioObject.printThanksJio();
			break;
		case "BSNL":
			//Inheritance 2 point child class object with parent class reference , we can call only parent class methods
			BSNLPrintingThanksToUser bsnlObject = new StoringDetailsOfUser();
			bsnlObject.printThanksBSNL();
			break;
		case "V!":
			//Using Lambda Expression to give method body to the abstarct method present in the Function Interface AirtelPrintingThanksToUser
			//And We do not need Method Overriding for providing method Lambda Expression is alternative for Method Overriding
			
			ViPrintingThanksToUser viLambda = ()->{
				System.out.println("\t------------------------------------------------------------------------------");
				System.out.println("\t\t\t Thanks For Choosing Us");
				System.out.println("\t\t\t         "+operator);
			};
			
			viLambda.printThanksVi();
			break;
		default:
			//If any gets wrong in runtime and  the operator name is correct then we this will redirect to mainpage
			System.out.println("\t-------------------------------------------------------");
			System.out.println("\tYour Recharge was Successfull, Thanks for Choosing us");
			askUsertoProceedOrNot();
			break;
		}
		
	}
	
	//method to ask user to continue or exit in project
	public void askUsertoProceedOrNot() throws Exception
	{
		System.out.println("\n\t-------------------------------------------------------");
		System.out.println("\tRecharge a different Mobile Number\n"
				+ "\t1. Yes\n"
				+ "\t2. No\n");
		//a number type of int well get and store in userOptin from the following class and method
		int userOption=GetUserOptionForSwitchCase.gettingOption();
		
		//switch case operating with the operator that user selected in the begining
		switch(userOption)
		{
		case 1:
			//Again process the project for the starting step
			new MainClass().getMobileNumber(0);
			break;
		case 2:
			//if user not interested then exits here
			printExitMeassage.userExitedWasDone();
			break;
		default:
			//limited options in switch case is other than options then again asking user to enter avaliable options
			System.out.println("\t-------------------------------------------------------\n"
					+ "\tPlease Choose a Valid option Only");
			askUsertoProceedOrNot();
			break;
			
			
			
		}
	}
}
