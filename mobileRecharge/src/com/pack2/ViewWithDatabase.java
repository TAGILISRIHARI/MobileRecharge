package com.pack2;

import java.sql.Statement;

import com.pack.printExitMeassage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ViewWithDatabase 
{
	public void getingDetailsFromDatabse() throws Exception
	{
		System.out.println("--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  Database Storage  <======\n");

		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Select Below Options\n"
				+ "1. Card Details\n"
				+ "2. UPI Details\n"
				+ "3. Exit\n");
		
		int option = GetOptionForSwitchCase.gettingOption();
		switch(option)
		{
		case 1:
			gettingOnlySelectedDetailsInCard();
			break;
		case 2:
			gettingOnlySelectedDetailsInUPI();
			break;
		case 3:
			printExitMeassage.userExitedWasDone();
			break;
		default:
			System.out.println("-------------------------------------------------------");
			System.out.println("Please Select a valid Option");
			getingDetailsFromDatabse();
			break;
		}
	}
	public static void gettingOnlySelectedDetailsInCard() throws Exception
	{
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Select Below Options\n"
				+ "1. View All Card Payments\n"
				+ "2. View Only Credit Card Payments\n"
				+ "3. View Only Debit Card Payments\n"
				+ "4. Get With Transaction ID\n"
				+ "5. Get All Options of Database\n"
				+ "6. GO To Main\n"
				+ "7. Exit\n");
		int option = GetOptionForSwitchCase.gettingOption();
		switch(option)
		{
		case 1:
			new ViewWithDatabase().deatilsOfDatabaseCard();
			break;
		case 2:
			new CardViewOnlyCreditCard().getingCreditCardPayments();
			break;
		case 3:
			new CardViewOnlyDebitCard().getingDebitCardPayments();
			break;
		case 4:
			new CardGetWithTransactionID().getingDetailsWithTransactionId();
			break;
		case 5:
			new ViewWithDatabase().getingDetailsFromDatabse();
			break;
		case 6:
			new ShowDetailsOfRechargesDone().detailsShowing();
			break;
		case 7:
			printExitMeassage.userExitedWasDone();
			break;
		default:
			System.out.println("-------------------------------------------------------");
			System.out.println("Please Select a valid Option");
			ViewWithDatabase.gettingOnlySelectedDetailsInCard();
			break;
		}
	}
	
	public static void gettingOnlySelectedDetailsInUPI() throws Exception
	{
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Select Below Options\n"
				+ "1. View All UPI Payments\n"
				+ "2. View Only PhonePay Payments\n"
				+ "3. View Only GooglePay Payments\n"
				+ "4. View Only Paytm Payments\n"
				+ "5. Get With Transaction ID\n"
				+ "6. Get All Options of Database\n"
				+ "7. Go to Main\n"
				+ "8. Exit\n");
		int option = GetOptionForSwitchCase.gettingOption();
		switch(option)
		{
		case 1:
			new  ViewWithDatabase().deatilsOfDatabaseUPI();
			break;
		case 2:
			new UPIViewOnlyPhonePay().getingPhonePayPayments();
			break;
		case 3:
			new UPIViewOnlyGooglePay().getingGooglePayments();
			break;
		case 4:
			new UPIViewOnlyPaytm().getingPaytmPayments();
			break;
		case 5:
			new UPIViewWithTransationId().gettingDetailsUPIWithTransactionId();
			break;
		case 6:
			new ViewWithDatabase().getingDetailsFromDatabse();
			break;
		case 7:
			new ShowDetailsOfRechargesDone().detailsShowing();
			break;
		case 8:
			printExitMeassage.userExitedWasDone();
			break;
		default:
			System.out.println("-------------------------------------------------------");
			System.out.println("Please Select a valid Option");
			ViewWithDatabase.gettingOnlySelectedDetailsInUPI();
			break;
		}
	}
	
	public void deatilsOfDatabaseCard() throws Exception
	{
		try
		{
			//Loading Server
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Creating Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##tagili", "tagili");
			//Preparing Statement
			Statement stm = con.createStatement();
			//Executing query
			ResultSet rs = stm.executeQuery("select  * from cardDetails");
			//CARDNAME,CARDLASTFOUR,OPERATOR,MOBILENUMBER,PLANAMOUNT,TRANSACTIONID,REFERENCENUMBER
			int i=1;
			while(rs.next())
			{
				System.out.println("===================================================\n"
						+ "Customer : "+i+"\n"
								  +"===================================================");
				System.out.println("Card Name      : "+rs.getString(1)+" Card\n"
								  +"Card Number    : XXXXXXXXXXXX"+rs.getInt(2)+"\n"
								  +"Operator       : "+rs.getString(3)+"\n"
								  +"Mobile Number  : "+rs.getLong(4)+"\n"
								  +"Plan Amount    : ₹"+rs.getInt(5)+"\n"
								  +"Transaction ID : "+rs.getLong(6)+"\n"
								  +"Reference No   : "+rs.getLong(7)+"\n"
								  +"Date and Time  : "+rs.getString(8));
				i++;
			}
			//Closing Connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		ViewWithDatabase.gettingOnlySelectedDetailsInCard();
	}
	public void deatilsOfDatabaseUPI() throws Exception
	{
		try
		{
			//Loading Server
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Creating Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##tagili", "tagili");
			//Preparing Statement
			Statement stm = con.createStatement();
			//Executing query
			ResultSet rs = stm.executeQuery("select  * from upiDetails");
			//CARDNAME,CARDLASTFOUR,OPERATOR,MOBILENUMBER,PLANAMOUNT,TRANSACTIONID,REFERENCENUMBER
			int i=1;
			while(rs.next())
			{
				System.out.println("===================================================\n"
						+ "Customer : "+i+"\n"
								  +"===================================================");
				System.out.println("UPI Platfrom   : "+rs.getString(1)+"\n"
								  +"Operator       : "+rs.getString(2)+"\n"
								  +"Mobile  Number : "+rs.getLong(3)+"\n"
								  +"UPI Number     : "+rs.getLong(4)+"\n"
								  +"Plan Amount    : ₹"+rs.getInt(5)+"\n"
								  +"Transaction ID : "+rs.getLong(6)+"\n"
								  +"Reference No   : "+rs.getLong(7)+"\n"
								  +"Date and Time  : "+rs.getString(8));
				i++;
			}
			//Closing Connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		ViewWithDatabase.gettingOnlySelectedDetailsInUPI();
	}

}
