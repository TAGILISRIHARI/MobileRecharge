package com.pack;

public class PrintJioSelectedPack 
{
	public void printingJioPack() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

//		System.out.println("\tJio servers are Under Maintainence pack details cannot be shown but\n"
//				+ "\tYou can continue with your recharge plan follow below steps");
//		new VerifyPlan().verifyPlanValidOrNot();
		
		System.out.println("\t\t\t\t======>  Your Pack Details  <======");
		System.out.println("\t\t\t\t======>        Jio          <======");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		
		int packAmout = Variables.getPlanAmount();
		switch(packAmout)
		{
		case 10:
			System.out.println("\t₹10		Talktime:	Validity:\n"
					 + "\t     		₹7.47		Unlimited\n"
					 + "\tTalktime can be also be used for International Services");
			System.out.println("\t------------------------------------------------------");
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 15:
			System.out.println("\tData Addon (Enjoy Sports, Movies, etc)\n"
					+ "\t₹15		Data:			Validity:\n"
					 + "\t     		1 GB/day		Base Plan\n"
					 + "\tFor users with active validity plan");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 19:
			System.out.println("\tBest Seller (Data Addon)\n"
					+ "\t₹19		Data:			Validity:\n"
					 + "\t     		1 GB/day		Base Plan\n"
					 + "\tFor users with active validity plan");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 20:
			System.out.println("\t₹20		Talktime:	Validity:\n"
					 + "\t     		₹14.95		Unlimited\n"
					 + "\tTalktime can be also be used for International Services");
			System.out.println("\t-----------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 25:
			System.out.println("\tData Addon (Enjoy Sports, Movies, etc)\n"
					+ "\t₹25		Data:			Validity:\n"
					 + "\t     		2 GB/day		Base Plan\n"
					 + "\tFor users with active validity plan");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 26:
			System.out.println("\t₹26		Data:			Validity:\n"
					 + "\t     		2 GB)			28 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: NA | SMS: NA");
			System.out.println("\t--------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 29:
			System.out.println("\tNew Value Pack)\n"
					+ "\t₹29		Data:			Validity:\n"
					 + "\t     		2.5 GB/day		Base Plan\n"
					 + "\tFor users with active validity plan");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 50:
			System.out.println("\t₹50		Talktime:	Validity:\n"
					 + "\t     		₹39.37		Unlimited\n"
					 + "\tTalktime can be also be used for International Services");
			System.out.println("\t-----------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 61:
			System.out.println("\t₹61		Data:			Validity:\n"
					 + "\t     		6 GB/day		Base Plan\n"
					 + "\tFor users with active validity plan");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 62:
			System.out.println("\t₹62		Data:			Validity:\n"
					 + "\t     		6 GB)			28 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: NA | SMS: NA");
			System.out.println("\t--------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 75:
			System.out.println("\t₹75		Data:				Validity:\n"
					 + "\t     		2.5 GB (0.1GB/day+200MB)	23 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: Unlimited Calls | SMS: 50\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t--------------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 86:
			System.out.println("\t₹86		Data:			Validity:\n"
					 + "\t     		0.5 GB/day)		28 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: NA | SMS: NA");
			System.out.println("\t--------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 91:
			System.out.println("\t₹91		Data:			Validity:\n"
					 + "\t     		3GB (0.1GB/day+200MB)	28 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: Unlimited Calls | SMS: 50\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t--------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 100:
			System.out.println("\t₹100		Talktime:	Validity:\n"
					 + "\t     		₹81.75		Unlimited\n"
					 + "\tTalktime can be also be used for International Services");
			System.out.println("\t----------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 121:
			System.out.println("\t₹121		Data:			Validity:\n"
					 + "\t     		12 GB/day		Base Plan\n"
					 + "\tFor users with active validity plan");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 122:
			System.out.println("\t₹122		Data:			Validity:\n"
					 + "\t     		1 GB/day)		28 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: NA | SMS: NA");
			System.out.println("\t--------------------------------------------------------------------------------------------------");

			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 123:
			System.out.println("\t₹123		Data:			Validity:\n"
					 + "\t     		0.5 GB/day 		28 Days\n"
					 + "\tFor JioBharat Phone user only \n"
					 + "\tVoice: Unlimited Calls | SMS: 300 SMS\n"
					 + "\tSubscription to Jio Apps");
			System.out.println("\t---------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 125:
			System.out.println("\t₹125		Data:			Validity:\n"
					 + "\t     		0.5 GB/day		23 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t--------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 149:
			System.out.println("\t₹149		Data:			Validity:\n"
					 + "\t     		1 GB/day		20 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 152:
			System.out.println("\t₹152		Data:			Validity:\n"
					 + "\t     		0.5 GB/day 		28 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: Unlimited Calls | SMS: 300\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t---------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 179:
			System.out.println("\t₹179		Data:			Validity:\n"
					 + "\t     		1 GB/day		24 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 181:
			System.out.println("\t₹181		Data:			Validity:\n"
					 + "\t     		30 GB/day		30 Days\n"
					 + "\tVoice: NA  |  SMS: NA");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 182:
			System.out.println("\t₹182		Data:			Validity:\n"
					 + "\t     		2 GB/day)		28 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: NA | SMS: NA");
			System.out.println("\t--------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 186:
			System.out.println("\t₹186		Data:			Validity:\n"
					 + "\t     		1 GB/day		28 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t--------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 199:
			System.out.println("\t₹199		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		23 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 219:
			System.out.println("\t₹219		Data:			Validity:\n"
					 + "\t     		3GB/day+2GB		14 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 222:
			System.out.println("\t₹222		Data:			Validity:\n"
					 + "\t     		50 GB/day		Base Plan validity\n"
					 + "\tData Only Pack"
					 + "\tVoice: NA  |  SMS: NA");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 223:
			System.out.println("\t₹223		Data:			Validity:\n"
					 + "\t     		56GB (2GB/day)		28 Days\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t--------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 239:
			System.out.println("\tTrending | 1.5GB/day\n"
					+ "\t₹239		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		28 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 241:
			System.out.println("\t₹241		Data:			Validity:\n"
					 + "\t     		40 GB/day		30 Days\n"
					 + "\tVoice: NA  |  SMS: NA");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 249:
			System.out.println("\t₹249		Data:			Validity:\n"
					 + "\t     		2 GB/day		23 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 259:
			System.out.println("\t₹259		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		1 Month\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 269:
			System.out.println("\t₹269		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		28 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to JioSaavn Pro\n"
					 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
					 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 296:
			System.out.println("\t₹296		Data:			Validity:\n"
					 + "\t     		25 GB		30 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 299:
			System.out.println("\tFavourite | 2GB/day\n"
					+ "\t₹299		Data:			Validity:\n"
					 + "\t     		2 GB/day		28 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 301:
			System.out.println("\t₹301		Data:			Validity:\n"
					 + "\t     		50 GB/day		30 Days\n"
					 + "\tVoice: NA  |  SMS: NA");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 328:
			System.out.println("\t₹328		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		28 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
					 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
					 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 349:
			System.out.println("\tNew Plan\n"
					+ "\t₹349		Data:			Validity:\n"
					 + "\t     		2.5 GB/day		30 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 388:
			System.out.println("\tDisney+ Hotstar\n"
					+ "\t₹388		Data:			Validity:\n"
					 + "\t     		2 GB/day		28 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
					 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
					 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 399:
			System.out.println("\tOffer: Extra Data\n"
					+ "\t₹399		Data:			Validity:\n"
					 + "\t     		3GB/day+6GB		28 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 444:
			System.out.println("\tTrending-Best Value\n"
					+ "\t₹444		Data:			Validity:\n"
					 + "\t     		100 GB/day		60 Days\n"
					 + "\tData Only Pack\n"
					 + "\tVoice: NA  |  SMS: NA");
			System.out.println("\t----------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 479:
			System.out.println("\t₹479		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		56 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 499:
			System.out.println("\t₹499		Validity:\n"
					 + "\t     		1 Day\n"
					 + "\tIR Travel Pass\n"
					 + "\tOutgoing Calls to INdia & Local : 100mins\n"
					 + "\tIncoming Call: FREE\n"
					 + "\tMobile Data: 250 MB/day high speed data thereafter unlimited at 64kbs\n"
					 + "\tSMS: 100\n"
					 + "\tValidity: 1day\n"
					 + "\tApplicable in top 32 countries including US, UK, UAE, Saudi, Canada,\n"
					 + "\tThailand, Singapore, Germany etc.\n"
					 + "\tPlease visit https://www.jio.com/selfcare/plans/mobility/jio-international\n"
					 + "\t-roaming-plans/?country=check for more details on country and partner network.");
			System.out.println("\t----------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 501:
			System.out.println("\tISD Plan\n"
					+ "\t₹501		Validity:\n"
					 + "\t     		28 Days\n"
					 + "\tISD Talktime Rs.424.58 and 5 ISD SMS\n"
					 + "\tTalktime can be used only for making ISD calls and ISD SMS while in India.\n"
					 + "\tFor ISD Call rates, visit https://www.jio.com/jio-isd-recharge-plans");
			System.out.println("\t----------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 529:
			System.out.println("\t₹529		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		56 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to JioSaavn Pro\n"
					 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
					 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 533:
			System.out.println("\t₹533		Data:			Validity:\n"
					 + "\t     		2 GB/day		56 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 589:
			System.out.println("\t₹589		Data:			Validity:\n"
					 + "\t     		2 GB/day		56 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to JioSaavn Pro"
					 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
					 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t----------------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 598:
			System.out.println("\t₹598 		Data:			Validity:\n"
					 + "\t     		2 GB/day		28 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
					 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
					 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;	
		case 666:
			System.out.println("\tTrending | 1.5GB/day\n"
					+ "\t₹666		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 667:
			System.out.println("\t₹667		Data:			Validity:\n"
					 + "\t     		150 GB/day		90 Days\n"
					 + "\tData Only Pack\n"
					 + "\tVoice: NA  |  SMS: NA");
			System.out.println("\t----------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 719:
			System.out.println("\tFavourite | 2GB/day\n"
					+ "\t₹719		Data:			Validity:\n"
					 + "\t     		2 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 739:
			System.out.println("\t₹739		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to JioSaavn Pro\n"
					 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
					 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 749:
			System.out.println("\tBest Seller\n"
					+ "\t₹749		Data:			Validity:\n"
				+ "\t     		2 GB/day		 90 Days\n"
				+ "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				+ "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 758:
			System.out.println("\t₹758		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
					 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
					 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 789:
			System.out.println("\t₹789		Data:			Validity:\n"
					 + "\t     		2 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to JioSaavn Pro\n"
					 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
					 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 805:
			System.out.println("\t₹805		Data:			Validity:\n"
					 + "\t     		2 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to Zee5\n"
					 + "\tAdditional Benefits: Zee5 , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 806:
			System.out.println("\t₹806		Data:			Validity:\n"
					 + "\t     		2 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to Sony LIV\n"
					 + "\tAdditional Benefits: Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 808:
			System.out.println("\tDisney+ Hotstar\n"
					+ "\t₹808		Data:			Validity:\n"
					 + "\t     		2 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
					 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
					 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 895:
			System.out.println("\t₹895		Data:					Validity:\n"
					 + "\t     		2 GB/28 days (12 cycles)		336 Days (28 days*12 cycles\n"
					 + "\tFor JioPhone Customers only \n"
					 + "\tVoice: Unlimited Calls | SMS: 50 SMS for 28 days(12 cycles)\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 909:
			System.out.println("\t₹909		Data:			Validity:\n"
					 + "\t     		2 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to Zee5 & Sony LIV \n"
					 + "\tAdditional Benefits: Zee5 , Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 999:
			System.out.println("\t₹999		Data:			Validity:\n"
					 + "\t     		3 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1000:
			System.out.println("\t₹1,000		Talktime:	Validity:\n"
					 + "\t     		₹844.46		Unlimited\n"
					 + "\tTalktime can be also be used for International Services");
			System.out.println("\t---------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1099:
			System.out.println("\tNetflix Mobile\n"
					+ "\t₹1,099		Data:			Validity:\n"
					 + "\t     		2 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to Netflix (Basic)\n"
					 + "\tAdditional Benefits: Netflix (Basic) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1101:
			System.out.println("\t₹1,101		Validity:\n"
					 + "\t     		28 Days\n"
					 + "\tGlobal Pack without WIfi Calling\n"
					 + "\tMonetary value of Rs.933.05 and 5 ISD SMS. Monetary Value can be used\n"
					 + "\ton International Roaming in around 130+ countries. Validity =: 28 days. \n"
					 + "\tFor more information on covered countries , visit https://www.jio.com/\n"
					 + "\t/selfcare/plans/mobility/jio-international-roaming-plans/?country=check");
			System.out.println("\t----------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1102:
			System.out.println("\t₹1,102		Validity:\n"
					 + "\t     		28 Days\n"
					 + "\tGlobal Pack with WIfi Calling\n"
					 + "\tMonetary value of Rs.933.90 and 5 ISD SMS. Monetary Value can be used\n"
					 + "\ton International Roaming in around 130+ countries. Validity =: 28 days. \n"
					 + "\tFor more information on covered countries , visit https://www.jio.com/\n"
					 + "\t/selfcare/plans/mobility/jio-international-roaming-plans/?country=check");
			System.out.println("\t----------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1234:
			System.out.println("\t₹1,234		Data:			Validity:\n"
					 + "\t     		0.5 GB/day 		336 Days\n"
					 + "\tFor JioBharat Phone user only \n"
					 + "\tVoice: Unlimited Calls | SMS: 300 SMS/ 28 days\n"
					 + "\tSubscription to Jio Apps");
			System.out.println("\t---------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1499:
			System.out.println("\tNetflix Mobile\n"
					+ "\t₹1,499		Data:			Validity:\n"
					 + "\t     		3 GB/day		84 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to Netflix (Basic)\n"
					 + "\tAdditional Benefits: Netflix (Basic) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2499:
			System.out.println("\t₹2,499		Validity:\n"
					 + "\t     		10 Days\n"
					 + "\tIR Travel Pass\n"
					 + "\tOutgoing Calls to INdia & Local : 100mins/day\n"
					 + "\tIncoming Call: FREE\n"
					 + "\tMobile Data: 250 MB/day high speed data thereafter unlimited at 64kbs\n"
					 + "\tSMS: 100/day\n"
					 + "\tValidity: 10days\n"
					 + "\tApplicable in top 32 countries including US, UK, UAE, Saudi, Canada,\n"
					 + "\tThailand, Singapore, Germany etc.\n"
					 + "\tPlease visit https://www.jio.com/selfcare/plans/mobility/jio-international\n"
					 + "\t-roaming-plans/?country=check for more details on country and partner network.");
			System.out.println("\t----------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2545:
			System.out.println("\t₹2,545		Data:			Validity:\n"
					 + "\t     		1.5 GB/day		336 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2999:
			System.out.println("\t₹2,999		Data:			Validity:\n"
					 + "\t     		2.5 GB/day		365 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 3178:
			System.out.println("\t₹3,178		Data:			Validity:\n"
					 + "\t     		2 GB/day		365 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription Dinsney+ Hotstar Mobile for 1 Year\n"
					 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
					 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 3225:
			System.out.println("\t₹3,225		Data:			Validity:\n"
					 + "\t     		2 GB/day		365 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to Zee5\n"
					 + "\tAdditional Benefits: Zee5 , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 3226:
			System.out.println("\t₹3,226		Data:			Validity:\n"
					 + "\t     		2 GB/day	 365 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to Sony LIV\n"
					 + "\tAdditional Benefits: Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 3327:
			System.out.println("\t₹3,227		Data:			Validity:\n"
					 + "\t     		2 GB/day		365 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tAmazon Prime Video Mobile Edition(Included)\n"
					 + "\tAdditional Benefits: Amazon Prime Video Mobile Edition , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 3662:
			System.out.println("\t₹3,662		Data:			Validity:\n"
					 + "\t     		2.5 GB/day		365 Days\n"
					 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
					 + "\tSubscription to Zee5 & Sony LIV \n"
					 + "\tAdditional Benefits: Zee5 , Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
			System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 4999:
			System.out.println("\t₹4,999		Validity:\n"
					 + "\t     		30 Days\n"
					 + "\tIR Travel Pass\n"
					 + "\tOutgoing Calls to INdia & Local : 1500 mins/\n"
					 + "\tIncoming Call: FREE\n"
					 + "\tMobile Data: 5 GB  high speed data thereafter unlimited at 64kbs\n"
					 + "\tSMS: 1500/day\n"
					 + "\tValidity: 30days\n"
					 + "\tApplicable in top 32 countries including US, UK, UAE, Saudi, Canada,\n"
					 + "\tThailand, Singapore, Germany etc.\n"
					 + "\tPlease visit https://www.jio.com/selfcare/plans/mobility/jio-international\n"
					 + "\t-roaming-plans/?country=check for more details on country and partner network.");
			System.out.println("\t----------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		default:
			System.out.println("Your Reacharge Amount : "+Variables.getPlanAmount());
			System.out.println("\t--------------------------------------------------------------------------------------------\n");
			break;
			
		}
	}
}
