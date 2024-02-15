package com.pack;

public class PaymentOptions 
{
	
	public void allPaymentOption() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  All Payment Options  <======\n");

		System.out.println("\t---------------------------------------------------------------------------------------------");
		System.out.println("\t1. UPI\n"
				+ "\t2. CREDIT/DEBIT  CARD\n"
				+ "\t3. Change Recharge Plan\n"
				+ "\t4. Return to Main Menu\n"
				+ "\t5. Cancel Payment & Exit");
		int paymentOption = GetUserOptionForSwitchCase.gettingOption();
		
		switch(paymentOption)
		{
			case 1:
				upiPaymentOptions();
				break;
			case 2:
				cardPayment();
				break;
			case 3:
				String operator = Variables.getOperator();
				switch(operator)
				{
				case "Jio":
					new Jio().getRechargePacksJio();
					break;
				case "Airtel":
					new Airtel().getRechargePacksAirtel();
					break;
				case "V!":
					new Vi().getRechargePacksVi();
					break;
				case "BSNL":
					new BSNL().getRechargePacksBSNL();
					break;
				default:
					new SelectSim().selectingSim();
					break;
				}
				break;
			case 4:
				MainClass.startingPoint();
				break;	
			case 5:
				printExitMeassage.userExitedWasDone();
				break;
			default:
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\tChoose a valid option only");
				allPaymentOption();
				break;
		}
	}
	
	public void upiPaymentOptions() throws Exception 
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  All UPI Payment Options  <======\n");

		System.out.println("\t---------------------------------------------------------------------------------------------");
		System.out.println("\t1.Google Pay\n"
				+ "\t2.Phone Pay\n"
				+ "\t3.Paytm\n"
				+ "\t4.Change Payment Option\n"
				+ "\t5.Return to Main Menu\n"
				+ "\t6.Cancel Payment and Exit");
		int upiOptions = GetUserOptionForSwitchCase.gettingOption();
		switch(upiOptions)
		{
		case 1:
			Variables.setUpiPlatform("GooglePay");
			new GooglePay().beginGooglePayTransaction(0);
			break;
		case 2:
			Variables.setUpiPlatform("PhonePay");
			new PhonePay().beginPhonePayTransaction(0);
			break;
		case 3:
			Variables.setUpiPlatform("Paytm");
			new Paytm().beginPaytmTransaction(0);
			break;
		case 4:
			allPaymentOption();
			break;
		case 5:
			MainClass.startingPoint();
			break;
		case 6:
			printExitMeassage.userExitedWasDone();
			break;
		default:
			System.out.println("\t-------------------------------------------------------");
			System.out.println("\tPlease select a Valid option ");
			upiPaymentOptions();
			break;
		}
	}
	
	public void cardPayment() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  All Card Payment Options  <======\n");

		System.out.println("\t---------------------------------------------------------------------------------------------");
		System.out.println("\t1.Credit Card\n"
				+ "\t2.Debit Card\n"
				+ "\t3.Change Payment Option\n"
				+ "\t4.Return to Main Menu\n"
				+ "\t5.Cancel Payment and Exit");
		
		int upiOptions = GetUserOptionForSwitchCase.gettingOption();
		
		switch (upiOptions)
		{
		case 1:
			new CreditCardPayment().processingCreditCardDetails(0);
			break;
		case 2:
			new DebitCardPayment().processingDebitCardDetails(0);
			break;
		case 3:
			new PaymentOptions().allPaymentOption();
			break;
		case 4:
			MainClass.startingPoint();
			break;
		case 5:
			printExitMeassage.userExitedWasDone();
			break;
		default:
			System.out.println("\t-------------------------------------------------------\n"
					+ "\tPlease Enter a valid option");
			cardPayment();
			break;
		}
	
	}
	
	
}
