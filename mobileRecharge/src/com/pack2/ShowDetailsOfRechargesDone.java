package com.pack2;


import java.util.Scanner;
import com.pack.printExitMeassage;

public class ShowDetailsOfRechargesDone 
{
	static Scanner input = new Scanner(System.in);

	public void detailsShowing() throws Exception
	{
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Check Below Options\n"
				+ "1. View as File\n"
				+ "2. Connect to Database\n"
				+ "3. Exit");
		
		int option = GetOptionForSwitchCase.gettingOption();
		
		switch(option)
		{
		case 1:
			new ViewWithFileStorage().getingDetailsFromFileStorage();
			break;
		case 2:
			new ViewWithDatabase().getingDetailsFromDatabse();
			break;
		case 3:
			printExitMeassage.userExitedWasDone();
			break;
		default:
			System.out.println("-------------------------------------------------------");
			System.out.println("Please Select a valid Option");
			detailsShowing();
		}
		
	}
	
}
