package com.pack2;

import java.util.Scanner;

public class AdminLogin
{
	static Scanner input = new Scanner(System.in);
	public void loginToCheckDetails(int count) throws Exception
	{
		System.out.println("WellCome Admin\n");
		
		String id="";
		while(true)
		{
			try
			{
				System.out.println("-------------------------------------------------------");
				System.out.print("Enter ID: ");
				id=input.next();
				break;
			}
			catch(Exception e)
			{
				System.out.println("-----------------------------------------------------------------------------------------------------");
//				System.out.println("\t"+e.toString());
				System.out.println("Your ID is not valid input , Re-Enter a valid input");
			}
			input.nextLine();
		}
		
		
		if(count<2)
		{
			if(id.equals(VariablesAdminCls.id))
			{
				passwordCheck(0);
			}
			else
			{
				count++;
				System.out.println("-------------------------------------------------------");
				System.out.println("Invalid ID ");
				loginToCheckDetails(count);
			}
			
		}
		else
		{
			System.out.println("\n\t=========================================================================");
			System.out.println("\tYour have entered maximum number wrong input, Refresh page to continue");
			System.out.println("\t==========================================================================");
			
		}
		
		
		
	}
	public void passwordCheck(int count) throws Exception
	{
		
		String password;
		
		while(true)
		{
			try
			{
				System.out.println("-------------------------------------------------------");
				System.out.print("Enter Password: ");
				password=input.next();
				break;
			}
			catch(Exception e)
			{
				System.out.println("-----------------------------------------------------------------------------------------------------");
//				System.out.println("\t"+e.toString());
				System.out.println("Your Password is not valid input, Re-Enter it");
			}
			input.nextLine();
		}
		if(count<2)
		{
			if(password.equals(VariablesAdminCls.password))
			{
				new ShowDetailsOfRechargesDone().detailsShowing();
			}
			else 
			{
				count++;
				System.out.println("-------------------------------------------------------");
				System.out.println("Invalid Password");
				passwordCheck(count);
			}
		}
		
		else
		{
			System.out.println("\n\t=========================================================================");
			System.out.println("\tYour have entered maximum number wrong input, Refresh page to continue");
			System.out.println("\t==========================================================================");
			
		}
		
	}
	public static void main(String[] args) throws Exception
	{
	new AdminLogin().loginToCheckDetails(0);	
	}

}
