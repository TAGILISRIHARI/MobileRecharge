package com.pack2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UPIViewWithTransationId 
{
	public void gettingDetailsUPIWithTransactionId() throws Exception
	{
		try
		{
			long transactionId = GetOptionForSwitchCase.transaction();
			//Loading Server
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Creating Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##tagili", "tagili");
			//Preparing Statement
			Statement stm = con.createStatement();
			//Executing query
			ResultSet rs = stm.executeQuery("select  * from upiDetails where TRANSACTIONID="+transactionId+"");
			//CARDNAME,CARDLASTFOUR,OPERATOR,MOBILENUMBER,PLANAMOUNT,TRANSACTIONID,REFERENCENUMBER
			if(rs.next())
			{
				System.out.println("===================================================\n");
				System.out.println("UPI Platfrom   : "+rs.getString(1)+"\n"
								  +"Operator       : "+rs.getString(2)+"\n"
								  +"Mobile  Number : "+rs.getLong(3)+"\n"
								  +"UPI Number     : "+rs.getLong(4)+"\n"
								  +"Plan Amount    : ₹"+rs.getInt(5)+"\n"
								  +"Transaction ID : "+rs.getLong(6)+"\n"
								  +"Reference No   : "+rs.getLong(7)+"\n"
								  +"Date and Time  : "+rs.getString(8));
				
			}
			else
			{
				System.out.println("--------------------------------------------------------");
				System.out.println("No records found \n");
				
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
