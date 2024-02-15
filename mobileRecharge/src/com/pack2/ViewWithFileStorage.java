package com.pack2;

import java.io.BufferedReader;
import java.io.FileReader;

import com.pack.printExitMeassage;

public class ViewWithFileStorage 
{
	void getingDetailsFromFileStorage() throws Exception
	{
		System.out.println("--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  File Storage  <======\n");

			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println("Select Below Options\n"
					+ "1. Card Details\n"
					+ "2. UPI Details\n"
					+ "3. Go To Main\n"
					+ "4. Exit");
			
			int option = GetOptionForSwitchCase.gettingOption();
			switch(option)
			{
			case 1:
				deatilsOfFileStorageCard();
				break;
			case 2:
				deatilsOfFileStorageUPI();
				break;
			case 3:
				new ShowDetailsOfRechargesDone().detailsShowing();
				break;
			case 4:
				printExitMeassage.userExitedWasDone();
				break;
			default:
				System.out.println("-------------------------------------------------------");
				System.out.println("Please Select a valid Option");
				getingDetailsFromFileStorage();
				break;
			}
		}
	public void deatilsOfFileStorageCard() throws Exception
	{
		
			FileReader fr = new FileReader("C:\\java\\cardDetails.txt");
			BufferedReader read = new BufferedReader(fr);
			int i;
			System.out.println("-------------------------------------------------------");
			System.out.println();
			while((i=read.read())!=-1)
			{
				System.out.print((char)i);
			}
			read.close();
			getingDetailsFromFileStorage();
	}
	public void deatilsOfFileStorageUPI() throws Exception
	{
		
			
			FileReader fr = new FileReader("C:\\java\\upiDetails.txt");
			BufferedReader read = new BufferedReader(fr);
			int i;
			System.out.println("-------------------------------------------------------");
			System.out.println();
			while((i=read.read())!=-1)
			{
				System.out.print((char)i);
			}
			read.close();
			getingDetailsFromFileStorage();
			
		
	}
	
}
