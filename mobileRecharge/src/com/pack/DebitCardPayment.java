package com.pack;

import java.util.Scanner;

public class DebitCardPayment extends ForwardCardPayments 
{
	Scanner sc = new Scanner(System.in);
	
	public void processingDebitCardDetails(int count) throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  Debit Card Payment  <======\n");
		if(count<3)
		{
			while(true)
			{
				try
				{
					System.out.println("\t--------------------------------------------------------------------------------------------");
					System.out.print("\tEnter your Debit Card Number: ");
					Variables.setDebitCardNumber(sc.nextLong());
					break;
				}
				catch(Exception e)
				{
					System.out.println("\t--------------------------------------------------------------------------------------------");
//					System.out.println("\t"+e.toString());
					System.out.println("\tYour input is not valid, Please Re-Enter a valid Input");
				}
				sc.nextLine();
			}
			
			
			long debitCard = Variables.getDebitCardNumber();
			int cardDigits= VerifyMobileORUPINumber.countCardNumber(debitCard);
			
			if(cardDigits==16)
			{
				processMonthOfCard(0);
			}
			else 
			{
				count++;
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\tCard Number is Not Valid Re-Enter Your Card Number");
				processingDebitCardDetails(count);
				
			}
			
		}
		else
		{
			System.out.println("\n\t=========================================================================");
			System.out.println("\tYour have entered maximum number of wrong inputs, Redirecting back");
			System.out.println("\t===========================================================================");
			new PaymentOptions().cardPayment();
		}
		
		
	}
	
	public void processMonthOfCard(int count) throws Exception
	{
		if(count<3)
		{
			while(true)
			{
				try
				{
					System.out.println("\t-------------------------------------------------------");
					System.out.print("\tValid till \n"
							+ "\t MM: ");
					Variables.setMonthOfCard(sc.nextInt());
					break;
				}
				catch(Exception e)
				{
					System.out.println("\t--------------------------------------------------------------------------------------------");
//					System.out.println("\t"+e.toString());
					System.out.println("\tYour input is not valid, Please Re-Enter a valid Input");
					
				}
				sc.nextLine();
			}
			
			int monthOfCard = Variables.getMonthOfCard();
//			int countOfMonth = VerifyMobileORUPINumber.countCardTwoNumber(monthOfCard);
			if((monthOfCard<=12 && monthOfCard>=1))
			{
				processYearOfCard(0);
			}
			else
			{
				count++;
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\tNot valid Re-Enter Month");
				processMonthOfCard(count);
			}
			
		}
		else
		{
			System.out.println("\n\t=========================================================================");
			System.out.println("\tYour have entered maximum number of wrong inputs, Redirecting back");
			System.out.println("\t===========================================================================");
			new PaymentOptions().cardPayment();
		}
		
		
	}
	
	public void processYearOfCard(int count) throws Exception
	{
		if(count<3)
		{
			while(true)
			{
				try
				{
					System.out.print("\t YY: ");
					Variables.setYearOFCard(sc.nextInt());
					break;	
				}
				catch(Exception e)
				{
					System.out.println("\t-------------------------------------------------------");
					System.out.println("\tYour input is not valid, Please Re-Enter a valid Input");
				
				}
				sc.nextLine();
			}
				
			
			int yearOfCard = Variables.getYearOFCard();
			int countOfYear = VerifyMobileORUPINumber.countCardTwoNumber(yearOfCard);
			int currentYear = new Variables().currentYear;
			int currentMonth = new Variables().currentMonth-1;
			
			if(countOfYear==2 && yearOfCard>=currentYear)
			{
				if(Variables.getMonthOfCard()>currentMonth && Variables.getYearOFCard()==currentYear)
				{
					processCvvOfCard(0);
				}
				else if((Variables.getMonthOfCard()>=1 && Variables.getMonthOfCard()<=12)&&(Variables.getYearOFCard()>currentYear))
				{
					processCvvOfCard(0);
				}
				else
				{
					System.out.println("\t-------------------------------------------------------");
					System.out.println("\tNot valid Re-Enter Your Details");
					processMonthOfCard(0);
				}
			}
			else
			{
				count++;
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\tNot valid Re-Enter Year");
				processYearOfCard(count);
			}
			
		}
		else
		{
			System.out.println("\n\t=========================================================================");
			System.out.println("\tYour have entered maximum number of wrong inputs, Redirecting back");
			System.out.println("\t===========================================================================");
			new PaymentOptions().cardPayment();
		}
		
		
	}
	
	public void processCvvOfCard(int count) throws Exception
	{
		if(count<3)
		{
		
			int cvv = 0;
			while(true)
			{
				try
				{
					System.out.println("\t-------------------------------------------------------");
					System.out.print("\tEnter Your CVV : ");
					cvv=sc.nextInt();
					break;
				}
				catch(Exception e)
				{
					System.out.println("\t-------------------------------------------------------");
					System.out.println("\tYour input is not valid, Please Re-Enter a valid Input");
				
				}
				sc.nextLine();
			}
			
				int cvvCount = VerifyMobileORUPINumber.countCardTwoNumber(cvv);
				if(cvvCount==3)
				{
					System.out.println("\t------------------------------------------------------\n");

					System.out.print("\tVerifying Your Debit Card details");
					System.out.print("⌛");
					Thread.sleep(1000);
					System.out.print("⌛");
					Thread.sleep(500);
					System.out.print("⏳");
					Thread.sleep(1000);
					System.out.print("⌛");
					Thread.sleep(500);
					System.out.print("⏳\n");
					System.out.println("\t------------------------------------------------------\n");

					super.processingFinalCardPayment("Debit");
				}
				else
				{
					count++;
					System.out.println("\t-------------------------------------------------------");
					System.out.println("\tInvalid CVV ");
					processCvvOfCard(count);
				}
				
			}
			else
			{
				System.out.println("\n\t=========================================================================");
				System.out.println("\tYour have entered maximum number wrong input, Redirecting to All Card Options");
				System.out.println("\t==========================================================================");
				new PaymentOptions().cardPayment();
			}
	}
}
