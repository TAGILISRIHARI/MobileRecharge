package com.pack2;

import java.util.Scanner;

import com.pack.Variables;

public class GetOptionForSwitchCase 
{
static Scanner sc = new Scanner(System.in);
	
	static public int gettingOption()
	{
		
		while(true)
		{
			try 
			{
				System.out.println("--------------------------------------------------------");
				System.out.print("Choose Your  Option : ");
				Variables.setUserOption(sc.nextInt());
				break;
			}
			
			catch (Exception e) 
			{
				
				// TODO: handle exception
				System.out.println("--------------------------------------------------------");
//				System.out.println("\t"+e.toString());
				System.out.println("Your input is not valid, Please Re-Enter a valid Input");
			}
			sc.nextLine();
		}
		int option =  Variables.getUserOption();
		return option;
	}
	static public long transaction()
	{
		long transactionId = 0;
		while(true)
		{
			try 
			{
				System.out.println("--------------------------------------------------------");
				System.out.print("Enter Transaction Id : ");
				transactionId=sc.nextLong();
				break;
			}
			
			catch (Exception e) 
			{
				
				// TODO: handle exception
				System.out.println("--------------------------------------------------------");
//				System.out.println("\t"+e.toString());
				System.out.println("Your input is not valid, Please Re-Enter a valid Input");
			}
			sc.nextLine();
		}
		
		return transactionId;
}
	
}
