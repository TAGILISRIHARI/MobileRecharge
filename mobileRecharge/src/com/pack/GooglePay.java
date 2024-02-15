package com.pack;

import java.util.Scanner;

public class GooglePay 
{
	static Scanner sc = new Scanner(System.in);
	
	public void beginGooglePayTransaction(int variableCount) throws Exception
	{	
		if(variableCount<3)
		{
			System.out.println("\t--------------------------------------------------------------------------------------------\n");
			System.out.println("\t\t\t\t======>  Wellcome to Google Pay  <======\n");

			 Variables variableObjectGooglePay= new Variables();
			 while(true)
			 {
				 try
				 {
					 System.out.println("\t------------------------------------------------------------------------------------------");
					 System.out.print("\tEnter UPI number: ");
					 variableObjectGooglePay.setUpiNumber(sc.nextLong());
					break; 
				 }
				 catch(Exception e)
				 {
					 System.out.println("\t-----------------------------------------------------------------------------------------------------");
//					 System.out.println("\t"+e.toString());
					 System.out.println("\tYour input is not valid, Please Re-Enter a valid Input");
					 
				 }
				 sc.nextLine();
			 }
			 
			 
			 long upiNumber=variableObjectGooglePay.getUpiNumber();
			 
			 int count = VerifyMobileORUPINumber.countMobileNumber(upiNumber);
			 boolean firstNumbrer = getFirstNumber();
			 if (count ==10 && firstNumbrer)
			 {
				 	System.out.println("\t--------------------------------------------------------------------------------------------\n");
					System.out.print("\tVerifying UPI Number ");
					Thread.sleep(1000);
					System.out.print("⌛");
					Thread.sleep(1000);
					System.out.print("⏳");
					Thread.sleep(1000);
					System.out.print("⌛");
					Thread.sleep(1000);
					System.out.print("⏳");
					Thread.sleep(1000);
					System.out.print("⌛");
					Thread.sleep(1000);
					System.out.print("⏳\n");
				 confirmGooglePay();
			 }
			 else
			 {
				 variableCount++;
				 	System.out.println("\t--------------------------------------------------------------------------------------------\n");
					System.out.print("\tVerifying UPI Number ");
					Thread.sleep(1000);
					System.out.print("⌛");
					Thread.sleep(1000);
					System.out.print("⏳");
					Thread.sleep(1000);
					System.out.print("⌛");
					Thread.sleep(1000);
					System.out.print("⏳\n");
				 System.out.println("\t-------------------------------------------------------");
				 System.out.println("\tPlease Enter a valid UPI Number Only");
				 beginGooglePayTransaction(variableCount);
			 }
		}
		else
		{
			
			System.out.println("\n\t=========================================================================");
			System.out.println("\tYour have entered maximum number of wrong attempts, Redirecting back");
			System.out.println("\t===========================================================================");
			new PaymentOptions().upiPaymentOptions();
			
		}
	}
	public static boolean getFirstNumber()
	{
		
		long mobileNumber = new Variables().getUpiNumber();
		long firstNumber=mobileNumber/1000000000;
		if(firstNumber==9 || firstNumber==8 || firstNumber==7 || firstNumber==6)
		{
			return true;
		}
		else 
		{
			return false;
			
		}
	}
	public void confirmGooglePay() throws Exception
	{
			System.out.println("\t-------------------------------------------------------");
			 System.out.println("\t1. Procced for payment\n"
			 		+ "\t2. Re-Enter UPI Number\n"
			 		+ "\t3. Go Back to All UPI Payments Options\n"
			 		+ "\t4. Main Menu\n"
			 		+ "\t5. Exit\n");
			 int option = GetUserOptionForSwitchCase.gettingOption();
			 
			 
			 switch (option) 
			 {
			 case 1:
				 System.out.println("\t--------------------------------------------------------------------------------------------\n");
					System.out.print("\tInitaiting  transaction ");
					Thread.sleep(1000);
					System.out.print("⌛");
					Thread.sleep(1000);
					System.out.print("⏳");
					Thread.sleep(1000);
					System.out.print("⌛");
					Thread.sleep(1000);
					System.out.print("⏳");
				new ForwardPayment().paymentsConfrim(0);
				break;
			 case 3:
				 new PaymentOptions().allPaymentOption();
				 break;
			 case 2:
				 beginGooglePayTransaction(0);
				 break;
			 case 4:
				 MainClass.startingPoint();
				 break;
			 case 5:
				 printExitMeassage.userExitedWasDone();
				break;
			 default:
				System.out.println("\t-------------------------------------------------------");
				System.out.println("Please Select a Valid Option");
				this.confirmGooglePay();
				break;
				
			}
			
			
			
	}

}
