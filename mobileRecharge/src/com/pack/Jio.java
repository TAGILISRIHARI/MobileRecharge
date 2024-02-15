package com.pack;

public class Jio 
{
	public void getRechargePacksJio() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  Jio Recharge Plans  <======\n");

		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\n\tSelect Your Pack  \n"
				+ "\t1.  POPULAR\n"
				+ "\t2.  DATA ADD ON\n"
				+ "\t3.  ENTERTAINMENT\n"
				+ "\t4.  SMART PHONE\n"
				+ "\t5.  JIOBHARATH\n"
				+ "\t6.  JIOPHONE\n"
				+ "\t7.  ISD/ROAMING\n"
				+ "\t8.  TOP UP\n"
				+ "\t9.  ALL PLANS\n"
				+ "\t10. I know`My Plan\n"
				+ "\t11. Go To Main Menu\n"
				+ "\t12. Change Operator \n"
				+ "\t13. Change Mobile Number\n"
				+ "\t14. Exit\n");

		
		int packNameJio = GetUserOptionForSwitchCase.gettingOption();
		System.out.println("\t-------------------------------------------------------");

		switch(packNameJio)
		{
		case 1:
			popularPacksJio();
			break;
		case 2 :
			dataAddOnPacksJio();
			break;
		case 3:
			entertainmentPacksJio();
			break;
		case 4 :
			smartPhonePacksJio();
			break;
		case 5:
			jioBharatPacksJio();
			break;
		case 6 :
			jioPhonePacksJio();
			break;
		case 7:
			isdRoamingPacksJio();
			break;
		case 8 :
			topUpPacksJio();
			break;
		case 9:
			allPlansPacksJio();
			break;
		case 12 :
			new SelectSim().selectingSim();
			break;
		case 11:
			MainClass.startingPoint();
			break;
		case 10 :
			new VerifyPlan().verifyPlanValidOrNot(0);
			break;
		case 13:
			//Change Mobile Number 
			new MainClass().getMobileNumber(0);
			break;
		case 14:
			printExitMeassage.userExitedWasDone();
			break;
		default:
			System.out.println("\t-------------------------------------------------------");
			System.out.println("\tPlease choose a valid Pack");
			getRechargePacksJio();
			break;
		}
		
	}
	public void popularPacksJio() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n"
				+"\t\t\t\t======>  POPULAR  <======\n"
				+"\t--------------------------------------------------------------------------------------------\n");
		
		System.out.println("\tBest Seller (Data Addon)\n"
				+ "\t₹19		Data:			Validity:\n"
				 + "\t     		1 GB/day		Base Plan\n"
				 + "\tFor users with active validity plan");
		System.out.println("\t----------------------------------------------");
		System.out.println("\tFavourite | 2GB/day\n"
				+ "\t₹299		Data:			Validity:\n"
				 + "\t     		2 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tBest Seller\n"
				+ "\t₹749		Data:			Validity:\n"
			+ "\t     		2 GB/day		 90 Days\n"
			+ "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
			+ "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tTrending | 1.5GB/day\n"
				+ "\t₹239		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹388		Data:			Validity:\n"
				 + "\t     		2 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹2,999		Data:			Validity:\n"
				 + "\t     		2.5 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tNetflix Mobile\n"
				+ "\t₹1,099		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Netflix (Basic)\n"
				 + "\tAdditional Benefits: Netflix (Basic) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹808		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tOffer: Extra Data\n"
				+ "\t₹399		Data:			Validity:\n"
				 + "\t     		3GB/day+6GB		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tFavourite | 2GB/day\n"
				+ "\t₹719		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tTrending | 1.5GB/day\n"
				+ "\t₹666		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹219		Data:			Validity:\n"
				 + "\t     		3GB/day+2GB		14 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
	}
	public void dataAddOnPacksJio() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n"
				+"\t\t\t\t======>  DATA ADD ON  <======\n"
				+"\t--------------------------------------------------------------------------------------------\n");
		
		System.out.println("\tData Addon (Enjoy Sports, Movies, etc)\n"
				+ "\t₹15		Data:			Validity:\n"
				 + "\t     		1 GB/day		Base Plan\n"
				 + "\tFor users with active validity plan");
		System.out.println("\t----------------------------------------------");
		System.out.println("\tData Addon (Enjoy Sports, Movies, etc)\n"
				+ "\t₹25		Data:			Validity:\n"
				 + "\t     		2 GB/day		Base Plan\n"
				 + "\tFor users with active validity plan");
		System.out.println("\t----------------------------------------------");
		System.out.println("\tNew Value Pack)\n"
				+ "\t₹29		Data:			Validity:\n"
				 + "\t     		2.5 GB/day		Base Plan\n"
				 + "\tFor users with active validity plan");
		System.out.println("\t----------------------------------------------");
		System.out.println("\t₹61		Data:			Validity:\n"
				 + "\t     		6 GB/day		Base Plan\n"
				 + "\tFor users with active validity plan");
		System.out.println("\t----------------------------------------------");
		System.out.println("\t₹121		Data:			Validity:\n"
				 + "\t     		12 GB/day		Base Plan\n"
				 + "\tFor users with active validity plan");
		System.out.println("\t----------------------------------------------");
		System.out.println("\t₹181		Data:			Validity:\n"
				 + "\t     		30 GB/day		30 Days\n"
				 + "\tVoice: NA  |  SMS: NA");
		System.out.println("\t----------------------------------------------");
		System.out.println("\t₹241		Data:			Validity:\n"
				 + "\t     		40 GB/day		30 Days\n"
				 + "\tVoice: NA  |  SMS: NA");
		System.out.println("\t----------------------------------------------");
		System.out.println("\t₹301		Data:			Validity:\n"
				 + "\t     		50 GB/day		30 Days\n"
				 + "\tVoice: NA  |  SMS: NA");
		System.out.println("\t----------------------------------------------");
		System.out.println("\tBest Seller (Data Addon)\n"
				+ "\t₹19		Data:			Validity:\n"
				 + "\t     		1 GB/day		Base Plan\n"
				 + "\tFor users with active validity plan");
		System.out.println("\t----------------------------------------------");
		System.out.println("\t₹222		Data:			Validity:\n"
				 + "\t     		50 GB/day		Base Plan validity\n"
				 + "\tData Only Pack"
				 + "\tVoice: NA  |  SMS: NA");
		System.out.println("\t----------------------------------------------");
		System.out.println("\tTrending-Best Value\n"
				+ "\t₹444		Data:			Validity:\n"
				 + "\t     		100 GB/day		60 Days\n"
				 + "\tData Only Pack\n"
				 + "\tVoice: NA  |  SMS: NA");
		System.out.println("\t----------------------------------------------");
		System.out.println("\t₹667		Data:			Validity:\n"
				 + "\t     		150 GB/day		90 Days\n"
				 + "\tData Only Pack\n"
				 + "\tVoice: NA  |  SMS: NA");
		System.out.println("\t----------------------------------------------");
		System.out.println("\t₹301		Data:			Validity:\n"
				 + "\t     		50 GB/day		30 Days\n"
				 + "\tVoice: NA  |  SMS: NA\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
	}
	public void entertainmentPacksJio() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n"
				+"\t\t\t\t======>  ENTERTAINMENT  <======\n"
				+"\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹388		Data:			Validity:\n"
				 + "\t     		2 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹808		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tNetflix Mobile\n"
				+ "\t₹1,099		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Netflix (Basic)\n"
				 + "\tAdditional Benefits: Netflix (Basic) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹789		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to JioSaavn Pro\n"
				 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
				 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹909		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Zee5 & Sony LIV \n"
				 + "\tAdditional Benefits: Zee5 , Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹805		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Zee5\n"
				 + "\tAdditional Benefits: Zee5 , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹806		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Sony LIV\n"
				 + "\tAdditional Benefits: Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tNetflix Mobile\n"
				+ "\t₹1,499		Data:			Validity:\n"
				 + "\t     		3 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Netflix (Basic)\n"
				 + "\tAdditional Benefits: Netflix (Basic) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹529		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		56 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to JioSaavn Pro\n"
				 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
				 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹758		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹589		Data:			Validity:\n"
				 + "\t     		2 GB/day		56 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to JioSaavn Pro"
				 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
				 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t----------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹598 		Data:			Validity:\n"
				 + "\t     		2 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹3,225		Data:			Validity:\n"
				 + "\t     		2 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Zee5\n"
				 + "\tAdditional Benefits: Zee5 , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹3,226		Data:			Validity:\n"
				 + "\t     		2 GB/day	 365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Sony LIV\n"
				 + "\tAdditional Benefits: Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹3,178		Data:			Validity:\n"
				 + "\t     		2 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 1 Year\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹739		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to JioSaavn Pro\n"
				 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
				 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹328		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹269		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to JioSaavn Pro\n"
				 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
				 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t₹3,227		Data:			Validity:\n"
				 + "\t     		2 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAmazon Prime Video Mobile Edition(Included)\n"
				 + "\tAdditional Benefits: Amazon Prime Video Mobile Edition , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
		
		
	}
	public void smartPhonePacksJio() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n"
				+"\t\t\t\t======>  SMART PHONE  <======\n"
				+"\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\tTrending | 1.5GB/day\n"
				+ "\t₹239		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹2,999		Data:			Validity:\n"
				 + "\t     		2.5 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tFavourite | 2GB/day\n"
				+ "\t₹299		Data:			Validity:\n"
				 + "\t     		2 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tOffer: Extra Data\n"
				+ "\t₹399		Data:			Validity:\n"
				 + "\t     		3GB/day+6GB		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹249		Data:			Validity:\n"
				 + "\t     		2 GB/day		23 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹999		Data:			Validity:\n"
				 + "\t     		3 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tBest Seller\n"
				+ "\t₹749		Data:			Validity:\n"
			+ "\t     		2 GB/day		 90 Days\n"
			+ "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
			+ "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹479		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		56 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
	
		System.out.println("\tTrending | 1.5GB/day\n"
				+ "\t₹666		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹199		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		23 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹2,545		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		336 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹179		Data:			Validity:\n"
				 + "\t     		1 GB/day		24 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹219		Data:			Validity:\n"
				 + "\t     		3GB/day+2GB		14 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tFavourite | 2GB/day\n"
				+ "\t₹719		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹149		Data:			Validity:\n"
				 + "\t     		1 GB/day		20 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹533		Data:			Validity:\n"
				 + "\t     		2 GB/day		56 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹3,227		Data:			Validity:\n"
				 + "\t     		2 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAmazon Prime Video Mobile Edition(Included)\n"
				 + "\tAdditional Benefits: Amazon Prime Video Mobile Edition , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
	}
	public void jioBharatPacksJio() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n"
				+"\t\t\t\t======>  JIOBHARAT  <======\n"
				+"\t--------------------------------------------------------------------------------------------\n");
			
		System.out.println("\t₹1,234		Data:			Validity:\n"
				 + "\t     		0.5 GB/day 		336 Days\n"
				 + "\tFor JioBharat Phone user only \n"
				 + "\tVoice: Unlimited Calls | SMS: 300 SMS/ 28 days\n"
				 + "\tSubscription to Jio Apps");
		System.out.println("\t---------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹123		Data:			Validity:\n"
				 + "\t     		0.5 GB/day 		28 Days\n"
				 + "\tFor JioBharat Phone user only \n"
				 + "\tVoice: Unlimited Calls | SMS: 300 SMS\n"
				 + "\tSubscription to Jio Apps");
		System.out.println("\t---------------------------------------------------------------------------------------------------");
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator befor you proceed");
		AfterViewingPackDetails.getOptionFromUser();
		
	}
	public void jioPhonePacksJio() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n"
				+"\t\t\t\t======>  JIOPHONE  <======\n"
				+"\t--------------------------------------------------------------------------------------------\n");
				
				System.out.println("\t₹895		Data:					Validity:\n"
						 + "\t     		2 GB/28 days (12 cycles)		336 Days (28 days*12 cycles\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: Unlimited Calls | SMS: 50 SMS for 28 days(12 cycles)\n"
						 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
				System.out.println("\t-------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹223		Data:			Validity:\n"
						 + "\t     		56GB (2GB/day)		28 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
						 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
				System.out.println("\t--------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹152		Data:			Validity:\n"
						 + "\t     		0.5 GB/day 		28 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: Unlimited Calls | SMS: 300\n"
						 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
				System.out.println("\t---------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹186		Data:			Validity:\n"
						 + "\t     		1 GB/day		28 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
						 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
				System.out.println("\t--------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹125		Data:			Validity:\n"
						 + "\t     		0.5 GB/day		23 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
						 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
				System.out.println("\t--------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹182		Data:			Validity:\n"
						 + "\t     		2 GB/day)		28 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: NA | SMS: NA");
				System.out.println("\t--------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹122		Data:			Validity:\n"
						 + "\t     		1 GB/day)		28 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: NA | SMS: NA");
				System.out.println("\t--------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹91		Data:			Validity:\n"
						 + "\t     		3GB (0.1GB/day+200MB)	28 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: Unlimited Calls | SMS: 50\n"
						 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
				System.out.println("\t--------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹62		Data:			Validity:\n"
						 + "\t     		6 GB)			28 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: NA | SMS: NA");
				System.out.println("\t--------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹26		Data:			Validity:\n"
						 + "\t     		2 GB)			28 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: NA | SMS: NA");
				System.out.println("\t--------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹86		Data:			Validity:\n"
						 + "\t     		0.5 GB/day)		28 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: NA | SMS: NA");
				System.out.println("\t--------------------------------------------------------------------------------------------------");
				
				System.out.println("\t₹75		Data:				Validity:\n"
						 + "\t     		2.5 GB (0.1GB/day+200MB)	23 Days\n"
						 + "\tFor JioPhone Customers only \n"
						 + "\tVoice: Unlimited Calls | SMS: 50\n"
						 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
				System.out.println("\t--------------------------------------------------------------------------------------------------");
				System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
				AfterViewingPackDetails.getOptionFromUser();
	}
	public void isdRoamingPacksJio() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n"
				+"\t\t\t\t======>  ISD/ROAMING  <======\n"
				+"\t--------------------------------------------------------------------------------------------\n");
			
		System.out.println("\tISD Plan\n"
				+ "\t₹501		Validity:\n"
				 + "\t     		28 Days\n"
				 + "\tISD Talktime Rs.424.58 and 5 ISD SMS\n"
				 + "\tTalktime can be used only for making ISD calls and ISD SMS while in India.\n"
				 + "\tFor ISD Call rates, visit https://www.jio.com/jio-isd-recharge-plans");
		System.out.println("\t----------------------------------------------------------------------------------");
		
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
		
		System.out.println("\t₹1,101		Validity:\n"
				 + "\t     		28 Days\n"
				 + "\tGlobal Pack without WIfi Calling\n"
				 + "\tMonetary value of Rs.933.05 and 5 ISD SMS. Monetary Value can be used\n"
				 + "\ton International Roaming in around 130+ countries. Validity =: 28 days. \n"
				 + "\tFor more information on covered countries , visit https://www.jio.com/\n"
				 + "\t/selfcare/plans/mobility/jio-international-roaming-plans/?country=check");
		System.out.println("\t----------------------------------------------------------------------------------");
		
		
		System.out.println("\t₹1,102		Validity:\n"
				 + "\t     		28 Days\n"
				 + "\tGlobal Pack with WIfi Calling\n"
				 + "\tMonetary value of Rs.933.90 and 5 ISD SMS. Monetary Value can be used\n"
				 + "\ton International Roaming in around 130+ countries. Validity =: 28 days. \n"
				 + "\tFor more information on covered countries , visit https://www.jio.com/\n"
				 + "\t/selfcare/plans/mobility/jio-international-roaming-plans/?country=check");
		System.out.println("\t----------------------------------------------------------------------------------");
		
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
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
		
	}
	public void topUpPacksJio() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n"
				+"\t\t\t\t======>  TOP UP  <======\n"
				+"\t--------------------------------------------------------------------------------------------\n");
				
		System.out.println("\t₹1,000		Talktime:	Validity:\n"
				 + "\t     		₹844.46		Unlimited\n"
				 + "\tTalktime can be also be used for International Services");
		System.out.println("\t---------------------------------------------------");
		
		System.out.println("\t₹100		Talktime:	Validity:\n"
				 + "\t     		₹81.75		Unlimited\n"
				 + "\tTalktime can be also be used for International Services");
		System.out.println("\t----------------------------------------------------");
		
		System.out.println("\t₹50		Talktime:	Validity:\n"
				 + "\t     		₹39.37		Unlimited\n"
				 + "\tTalktime can be also be used for International Services");
		System.out.println("\t-----------------------------------------------------");
		
		System.out.println("\t₹20		Talktime:	Validity:\n"
				 + "\t     		₹14.95		Unlimited\n"
				 + "\tTalktime can be also be used for International Services");
		System.out.println("\t-----------------------------------------------------");
		
		System.out.println("\t₹10		Talktime:	Validity:\n"
				 + "\t     		₹7.47		Unlimited\n"
				 + "\tTalktime can be also be used for International Services");
		System.out.println("\t------------------------------------------------------");
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
		
	}
	
	public void allPlansPacksJio() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n"
		+"\t\t\t\t======>  ALL PLANS  <======\n"
		+"\t--------------------------------------------------------------------------------------------\n");
		
		System.out.println("\t₹2,545		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		336 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tBest Seller\n"
				+ "\t₹749		Data:			Validity:\n"
			+ "\t     		2 GB/day		 90 Days\n"
			+ "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
			+ "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹533		Data:			Validity:\n"
				 + "\t     		2 GB/day		56 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tFavourite | 2GB/day\n"
				+ "\t₹719		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹479		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		56 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tTrending | 1.5GB/day\n"
				+ "\t₹666		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tFavourite | 2GB/day\n"
				+ "\t₹479		Data:			Validity:\n"
				 + "\t     		2 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹199		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		23 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹296		Data:			Validity:\n"
				 + "\t     		25 GB		30 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹179		Data:			Validity:\n"
				 + "\t     		1 GB/day		24 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹249		Data:			Validity:\n"
				 + "\t     		2 GB/day		23 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tTrending | 1.5GB/day\n"
				+ "\t₹239		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹149		Data:			Validity:\n"
				 + "\t     		1 GB/day		20 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹259		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		1 Month\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹2,999		Data:			Validity:\n"
				 + "\t     		2.5 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹269		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to JioSaavn Pro\n"
				 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
				 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tNew Plan\n"
				+ "\t₹349		Data:			Validity:\n"
				 + "\t     		2.5 GB/day		30 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹399		Data:			Validity:\n"
				 + "\t     		3GB/day+6GB		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹529		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		56 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to JioSaavn Pro\n"
				 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
				 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹589		Data:			Validity:\n"
				 + "\t     		2 GB/day		56 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to JioSaavn Pro"
				 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
				 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t----------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹739		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to JioSaavn Pro\n"
				 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
				 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹789		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to JioSaavn Pro\n"
				 + "\tNote: To activate JioSaavn Pro subscription login to JioSaavn app with your Jio number\n"
				 + "\tAdditional Benefits: JioSaavn Pro (Music & More) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹999		Data:			Validity:\n"
				 + "\t     		3 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹219		Data:			Validity:\n"
				 + "\t     		3GB/day+2GB		14 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAdditional Benefits: JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹328		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹388		Data:			Validity:\n"
				 + "\t     		2 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹598 		Data:			Validity:\n"
				 + "\t     		2 GB/day		28 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹758		Data:			Validity:\n"
				 + "\t     		1.5 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹805		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Zee5\n"
				 + "\tAdditional Benefits: Zee5 , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹806		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Sony LIV\n"
				 + "\tAdditional Benefits: Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹808		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 3 Months\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹909		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Zee5 & Sony LIV \n"
				 + "\tAdditional Benefits: Zee5 , Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tNetflix Mobile\n"
				+ "\t₹1,099		Data:			Validity:\n"
				 + "\t     		2 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Netflix (Basic)\n"
				 + "\tAdditional Benefits: Netflix (Basic) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\tNetflix Mobile\n"
				+ "\t₹1,499		Data:			Validity:\n"
				 + "\t     		3 GB/day		84 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Netflix (Basic)\n"
				 + "\tAdditional Benefits: Netflix (Basic) , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹3,178		Data:			Validity:\n"
				 + "\t     		2 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription Dinsney+ Hotstar Mobile for 1 Year\n"
				 + "\tDisney+ Hotstar T&C: http://tiny.jio.com/r457tjl\n"
				 + "\tAdditional Benefits: Disney+ Hotstar Mobile , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹3,225		Data:			Validity:\n"
				 + "\t     		2 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Zee5\n"
				 + "\tAdditional Benefits: Zee5 , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹3,226		Data:			Validity:\n"
				 + "\t     		2 GB/day	 365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Sony LIV\n"
				 + "\tAdditional Benefits: Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹3,227		Data:			Validity:\n"
				 + "\t     		2 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tAmazon Prime Video Mobile Edition(Included)\n"
				 + "\tAdditional Benefits: Amazon Prime Video Mobile Edition , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹3,662		Data:			Validity:\n"
				 + "\t     		2.5 GB/day		365 Days\n"
				 + "\tVoice: Unlimited Calls | SMS: 100 SMS/day\n"
				 + "\tSubscription to Zee5 & Sony LIV \n"
				 + "\tAdditional Benefits: Zee5 , Sony LIV , JioCinema(Sports & Movies) , Jio TV (Your daily dose of entertainment) , JioCould");
		System.out.println("\t-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
	}
	
	
	

}
