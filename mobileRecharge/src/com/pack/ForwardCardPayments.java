package com.pack;

import java.util.Scanner;

public class ForwardCardPayments
{
	Scanner sc = new Scanner(System.in);
	
	public long getCardNumber(String cardName)
	{
		long card;
		switch (cardName)
		{
		case "Credit":
			card=Variables.getCreditCardNumber();
			break;
		case "Debit":
			card=Variables.getDebitCardNumber();
			break;
		default:
			card=0;
		}
		return card%10000;
		
	}
	
	public void processingFinalCardPayment(String cardName) throws Exception
	{
		
		
		System.out.println("\t-------------------------------------------------------");
		System.out.println("\t1. Proceed Payment\n"
				+ "\t2. Re-Enter Card Details\n"
				+ "\t3. Return to All Payments Option\n"
				+ "\t4. Cancel Payment And Exit");
		int userOption = GetUserOptionForSwitchCase.gettingOption();
		
		switch(userOption)
		{
		case 1:
			displayOtpForUserToConfrimPayment(cardName);
			break;
			
		case 2:
				switch (cardName)
				{
					case "Credit":
						new CreditCardPayment().processingCreditCardDetails(0);
						break;
					case "Debit":
						new DebitCardPayment().processingDebitCardDetails(0);
						break;
					default:
						System.out.println("\t-------------------------------------------------------\n");
						System.out.println("\tSome Unknown Error Occured You been redirected to Payment Options");
						new PaymentOptions().cardPayment();
						break;
				}
		break;
			
		case 3:
			new PaymentOptions().allPaymentOption();
			break;
		case 4:
			printExitMeassage.userExitedWasDone();
			break;
		default:
			System.out.println("\t-------------------------------------------------------\n"					
				+ "\tPlease Choose a Valid Option");
			processingFinalCardPayment(cardName);
			break;
		}
		
	}
	
	public void displayOtpForUserToConfrimPayment(String cardName) throws Exception
	{
		int otp = GetRandomNumber.getSixdigitOTP();
		System.out.println("\t-------------------------------------------------------\n");
		System.out.println("\tCustomer, "+otp+" is the OTP for your autenticatication for"
				+ " amount Rs."+Variables.getPlanAmount()+".00 \n\tof your "+cardName+" card transaction for making payment.\n"
				+ "\tDo Not Share OTP.");
		paymentDone(cardName,otp,0);
	}
	public void paymentDone(String cardName,int otp,int count) throws Exception
	{
		if(count<3)
		{
			int userOTP =0;
			while(true)
			{
				try
				{
					System.out.println("\t-------------------------------------------------------\n");
					System.out.print("\tPlease Enter Your OTP Number: ");
					userOTP= sc.nextInt();
					break;
				}
				catch(Exception e)
				{
					System.out.println("\t--------------------------------------------------------------------------------------------");
					System.out.println("\t"+e.toString());
					System.out.println("\tOnly Enter \"Integer\" type");
				}
				sc.nextLine();
			}
			
			
			
			long card=getCardNumber(cardName);
			long refNo=GetRandomNumber.getRefNo();
			long transId=GetRandomNumber.getTransId();
			String date=new Variables().formattedDate;
			boolean value = false;
			if(userOTP==otp)
			{
				System.out.println("\t----------------------------------------------------------------------------\n");

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

				System.out.println("\tYour "+cardName+" card no. XXXXXXXXXXXX"+card+" is debited for Rs."+Variables.getPlanAmount()+".00 on \n"
						+ "\t"+date+" (Ref no "+refNo+").\n\n");
				System.out.println("\tRecharge of INR "+Variables.getPlanAmount()+".00 is successful for your "+Variables.operator+"  Mobile "+new Variables().getMobileNumber()+"\n "
						+ "\ton "+new Variables().formattedDate+", Transaction ID "+transId);
				value=true;

			}
			else
			{
				System.out.println("\t----------------------------------------------------------------------------\n");

				System.out.print("\tVerifying OTP ");
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

				count++;
				System.out.println("\t-------------------------------------------------------\n");
				System.out.println("\tOTP is In-correct Re-Enter Your OTP Number");
				paymentDone(cardName,otp,count);
			}
			
			if(value)
			{
				new StoringDetailsOfUser().storingCardPayments(cardName,(int)card, Variables.getPlanAmount(),refNo,transId,date);
	
			}
		
		}
		else
		{
			System.out.println("\n\t==============================================================================");
			System.out.println("\tYour have entered maximum number of wrong attempts , Redirecting back Please try again");
			System.out.println("\t================================================================================");
			
			System.out.println("\tSelect below options to continue\n"
							  +"\t1. Re-Send OTP\n"
							  +"\t2. Re-Enter card Details\n"
							  +"\t3. Cancel Payment and Exit");
			
			int userOption =  GetUserOptionForSwitchCase.gettingOption();
			System.out.println("\n\t-------------------------------------------------------\n");
			
			switch(userOption)
			{
			case 1:
				displayOtpForUserToConfrimPayment(cardName);
				break;
			case 2:
				switch(cardName)
					{
					case "Credit":
						new CreditCardPayment().processingCreditCardDetails(0);
						break;
					case "Debit":
						new DebitCardPayment().processingDebitCardDetails(0);
						break;
					default:
						System.out.println("\t-------------------------------------------------------\n");
						System.out.println("\tSome Unknown Error Occured You been redirected to Payment Options");
						new PaymentOptions().cardPayment();
						break;
					}
				break;
			case 3:
				printExitMeassage.userExitedWasDone();
				break;
			default:
				System.out.println("\n\t-------------------------------------------------------\n");
				System.out.println("Something went wrong you have been redirected to All Payment Options");
				new PaymentOptions().allPaymentOption();
				break;
			}
				
			
		}
	}

}
