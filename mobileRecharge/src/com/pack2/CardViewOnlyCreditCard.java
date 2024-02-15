package com.pack2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CardViewOnlyCreditCard 
{
	public void getingCreditCardPayments() throws Exception
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
			ResultSet rs = stm.executeQuery("select  * from cardDetails where CARDNAME='Credit'");
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
}
