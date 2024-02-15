package com.pack;

import java.util.Scanner;

public class GetUserOptionForSwitchCase 
{
	static Scanner sc = new Scanner(System.in);
	
	static public int gettingOption()
	{
		
		while(true)
		{
			try 
			{
				System.out.println("\t--------------------------------------------------------");
				System.out.print("\tChoose Your  Option : ");
				Variables.setUserOption(sc.nextInt());
				break;
			}
			
			catch (Exception e) 
			{
				
				// TODO: handle exception
				System.out.println("\t--------------------------------------------------------");
//				System.out.println("\t"+e.toString());
				System.out.println("\tYour input is not valid, Please Re-Enter a valid Input");
			}
			sc.nextLine();
		}
		int option =  Variables.getUserOption();
		return option;
			
	}
	
	static public int gettingPlanAmount()
	{
		while(true)
		{
			try 
			{
				System.out.println("\t-----------------------------------------------------------------------------------------------------");
				System.out.print("\tEnter Your Plan Amount : ");
				Variables.setPlanAmount(sc.nextInt());
				break;
			}
			
			catch (Exception e) 
			{
				
				// TODO: handle exception
				System.out.println("\t--------------------------------------------------------");
//				System.out.println("\t"+e.toString());
				System.out.println("\tYour input is not valid, Please Re-Enter a valid Input");
			}
			sc.nextLine();
		}
		int planAMount =  Variables.getPlanAmount();
		return planAMount;
	}

	

}
