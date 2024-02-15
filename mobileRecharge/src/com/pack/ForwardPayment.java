package com.pack;

import java.util.Scanner;

public class ForwardPayment 
{
	static Scanner sc = new Scanner(System.in);
	
	public void paymentsConfrim(int count) throws Exception
	{
		String upiPlatform = Variables.getUpiPlatform();
		if(count<3)
		{
			int upiID=0;
			while(true)
			{
				try
				{
					
					System.out.println("\n\t---------------------------------------------------------\n");
					System.out.print("\tEnter Your UPI pin: ");
					upiID=sc.nextInt();
					break;
				}
				catch(Exception e)
				{
					System.out.println("\t-------------------------------------------------------");
					System.out.println("\t"+e.toString());
					System.out.println("\tYour Input is not valid , Please Re-Enter a valid input");
				}
				sc.nextLine();
			}
			
			boolean verifyupiid = verifyUpiIDMethod(upiID);
			if(verifyupiid)
			{
				switch(upiPlatform)
				{
				case "GooglePay":
					System.out.println("\t-------------------------------------------------------");
					succesedUpipayment("GooglePay");
					break;
				case "PhonePay":
					System.out.println("\t-------------------------------------------------------");
					succesedUpipayment("PhonePay");
					break;
				case "Paytm":
					System.out.println("\t-------------------------------------------------------");
					succesedUpipayment("Paytm");
					break;
				default:
					System.out.println("\t-------------------------------------------------------");
					System.out.println("\tSome Error Occured You been redirected to Paymen Option");
					new PaymentOptions().allPaymentOption();
					break;
				}
				
			}
			else
			{
				count++;
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\tYour UPI Pin  is not correct Enter again");
				paymentsConfrim(count);
			}
			
		}
		else
		{
			
			System.out.println("\n\t=========================================================================");
			System.out.println("\tYour have entered maximum number of wrong attempts, Redirecting back");
			System.out.println("\t===========================================================================");
			
			System.out.println("\tSelect below steps to continue\n"
					+ "\t1. Re-Enter UPI Pin\n"
					+ "\t2. Re-Enter UPI Number\n"
					+ "\t3. Cancel Payment and Exit");
			int userOption = GetUserOptionForSwitchCase.gettingOption();
			switch(userOption)
			{
			case 1:
				paymentsConfrim(0);
				break;
			case 2:
				switch(upiPlatform)
				{
				case "GooglePay":
					System.out.println("\t-------------------------------------------------------");
					new GooglePay().beginGooglePayTransaction(0);
					break;
				case "PhonePay":
					System.out.println("\t-------------------------------------------------------");
					new GooglePay().beginGooglePayTransaction(0);
					break;
				case "Paytm":
					System.out.println("\t-------------------------------------------------------");
					new Paytm().beginPaytmTransaction(0);
					break;
				default:
					System.out.println("\t-------------------------------------------------------");
					System.out.println("\tSome Error Occured You been redirected to Paymen Option");
					new PaymentOptions().upiPaymentOptions();
					break;
					
				}
				break;
			case 3:
				printExitMeassage.userExitedWasDone();
				break;
			default:
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\tSome Error Occured You been redirected to Paymen Option");
				new PaymentOptions().allPaymentOption();
				break;
			}		
			
		}
	}
	
	
	public void succesedUpipayment(String paymentPlatform) throws Exception
	{
		System.out.println("\t---------------------------------------------------------\n");

		System.out.print("\tConnecting Securly ");
		Thread.sleep(1000);
		System.out.print("🕕");
		Thread.sleep(1000);
		System.out.print("🕒");
		Thread.sleep(1000);
		System.out.print("🕓");
		Thread.sleep(1000);
		System.out.print("🕔");
		Thread.sleep(1000);
		System.out.print("🕕");
		Thread.sleep(1000);
		System.out.print("🕖\n");
		System.out.println("\t------------------------------------------------------------\n");

		String date=new Variables().formattedDate;
		long transId = GetRandomNumber.getTransId();
		long refNo = GetRandomNumber.getRefNo();
		System.out.println("\tRecharge of INR "+Variables.getPlanAmount()+".00 is successful for your "+Variables.operator+"  Mobile "+new Variables().getMobileNumber()+" \n\ton "+date+", Transaction ID "+transId+" (Reference No "+refNo+").");
		new StoringDetailsOfUser().storingUPIPayments(paymentPlatform, transId, refNo, date);
	}
	
	public boolean verifyUpiIDMethod(int upiID)
	{
		int count=0;
		boolean upi=false;
		while(upiID!=0)
		{
			count++;
			upiID=upiID/10;
		}
		if (count == 6 || count==4)
				upi=true;
		return upi;
	}

}
