package com.pack;

import java.util.Scanner;

public class WellcomeText extends MainClass
{
	static Scanner sc = new Scanner(System.in);
	
	public  void printWellCome(int count) throws Exception
	{
		if(count<3)
		{
			System.out.println("\t---------------------------------------------------------\n"
					   +"\t---------------------------------------------------------\n");
		System.out.println("\t\t========> RELAX AND RECHARGE <==========\n");
		System.out.println("\t----------------------------------------------------------\n"
				  +"\t----------------------------------------------------------\n");
		String entry="";
		while(true)
		{
			try
			{
				System.out.print("\tEnter Yes OR [Y] to continue,  No OR [N] to exit : ");
				entry = sc.next().toLowerCase();
				break;
			}
			catch(Exception e)
			{
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\tYour input is not valid, Please Re-Enter a valid Input");
			}
			sc.nextLine();
		}
		
		
		
		if(entry.equalsIgnoreCase("Yes") || entry.equalsIgnoreCase("Y"))
			entry="y";
		else if (entry.equalsIgnoreCase("No") || entry.equalsIgnoreCase("N"))
			entry="n";
		else
			entry="Not Valid";
		
			switch(entry)
			{
			case "y":
				super.startingPoint();
				break;
			case "n":
				printExitMeassage.userExitedWasDone();
				break;
			default:
				count++;
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\tInvalid Option\n");
				printWellCome(count);
				break;
			}
			
		}
		
		else
		{
			System.out.println("\n\t=========================================================================");
			System.out.println("\tYour have entered maximum number wrong inputs, Refresh the page to continue");
			System.out.println("\t===========================================================================");
				
		}
		sc.close();
	}
}
