package com.pack;

public class Vi 
{
	public void getRechargePacksVi() throws Exception
	{
			System.out.println("\t--------------------------------------------------------------------------------------------\n");
			System.out.println("\t\t\t\t======>  V! Recharge Plans  <======\n");

			System.out.println("\t--------------------------------------------------------------------------------------------");
			System.out.println("\n\tSelect Your Pack  \n"
					+ "\t1.  121 MADE FOR YOU\n"
					+ "\t2.  POPULAR\n"
					+ "\t3.  CRICKET PLANS\n"
					+ "\t4.  HERO UNLIMITED\n"
					+ "\t5.  ADD ON DATA\n"
					+ "\t6.  UNLIMITED\n"
					+ "\t7.  COMBO\n"
					+ "\t8.  PLAN VOUCHER\n"
					+ "\t9.  TALKTIME\n"
					+ "\t10. INTERNATIONAL ROAMING\n"
					+ "\t11. I know`My Plan\n"
					+ "\t12. Change Operator\n"
					+ "\t13. Go To Main Menu\n"
					+ "\t14. Change Mobile Number \n"
					+ "\t15. Exit\n");

			
			int packNameAirtel=GetUserOptionForSwitchCase.gettingOption();
			System.out.println("\t--------------------------------------------------------------------------------------------------------");

			switch(packNameAirtel) {
				case 1:
					madeForYouPacksVi();
					break;
				case 2:
					popularPacksVi();
					break;
				case 3:
					cricketPlansVi();
					break;
				case 4:
					heroUnlimited();
					break;
				case 5:
					addOnDataPacksVi();
					break;
				case 6:
					unlimitedPacksVi();
					break;
				case 7:
					comboPacksVi();
					break;
				case 8:
					planVoucherPacksVi();
					break;
				case 9:
					talktimePacksVi();
					break;
				case 10:
					internationalRoamingPacksVi();
					break;
				case 14:
					new MainClass().getMobileNumber(0);
					break;
				case 12:
					new SelectSim().selectingSim();
					break;
				case 13:
					MainClass.startingPoint();
					break;
				case 11:
					new VerifyPlan().verifyPlanValidOrNot(0);
					break;
				case 15:
					printExitMeassage.userExitedWasDone();
					break;
				default:
					System.out.println("\t-------------------------------------------------------");
					System.out.println("\tPlease choose a valid Pack");
					getRechargePacksVi();
			}
		}
//	121 MADE FOR YOU
	public void madeForYouPacksVi() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  121 MADE FOR YOU  <======\n");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹151		Data:			Validity:\n"
				 + "\t      		8GB			30 days\n"
				 + "\tADD-ON Data pack-8 GB Data for 30 days & Dinsey+ Hotstar Mobile subscription\n"
				 + "\tfor 3 months. No Service Validity\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹181		Data:			Validity:\n"
				 + "\t      		1GB/day			30 days\n"
				 + "\tADD-ON Data pack- 1GB/day for 30 Days. NO Service Validity.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹839		Data:			Validity:\n"
				 + "\t      		2GB/Day			84 Days\n"
				 + "\t3 months Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹1,799		Data:			Validity:\n"
				 + "\t      		24GB			365 Days\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹2,999		Data:			Validity:\n"
				 + "\t      		850GB			365 Days\n"
				 + "\tExclusive\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tTruly Unlimited Local & National calls + 300 SMS\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹3,099		Data:			Validity:\n"
				 + "\t      		2GB/Day			365 Days\n"
				 + "\t1yr Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
		
	}
//	POPULAR
	public void popularPacksVi() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  POPULAR  <======\n");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		System.out.println("\t₹19		Data:			Validity:\n"
				 + "\t      		1GB			 24 Hours\n"
				 + "\tADD-ON Data pack- 1GB for 24 hours. NO Service Validity. No Outgoing SMS. \n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹299		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		28 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹99		Talktime:		Data:			Validity:\n"
				 + "\t      		₹99			200MB			15 Days\n"
				 + "\tNO OUTGOING SMS. Rs 99 Limited validity talktime, L+N Calls at 2.5p/sec,\n"
				 + "\t200MB Data. Standard tariff for SMS tp 1900. 15 Day Service Validty");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹239		Data:			Validity:\n"
				 + "\t      		1GB/Day			18 Days\n"
				 + "\tTruly Unlimited Local & National Calls + 100 SMS/Day");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t~₹240 per 28 Days\n"
				+ "\t₹479		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		56 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println( "\t₹666		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		77 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t~₹240 per 28 Days\n"
				+ "\t₹719		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		84 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
		
	}
//	CRICKET PLANS
	public void cricketPlansVi() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  CRICKET PLANS  <======\n");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹151		Data:			Validity:\n"
				 + "\t      		8GB			30 days\n"
				 + "\tADD-ON Data pack-8 GB Data for 30 days & Dinsey+ Hotstar Mobile subscription\n"
				 + "\tfor 3 months. No Service Validity\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\tSuper Day\n"
				+ "\t₹49		Data:			Validity:\n"
				 + "\t      		6GB			24 Hours\n"
				 + "\tADD-ON Data pack-6 GB Data for 24 Hours. No service Validity. No \n"
				 + "\tOutgoing SMS\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹118		Data:			Validity:\n"
				 + "\t      		12 GB			28 days\n"
				 + "\tNo Service Validity. No Outgoing SMS. Standard tariff for SMS to 1900. \n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹39		Data:			Validity:\n"
				 + "\t      		3GB			 3days\n"
				 + "\tADD-ON Data pack- 3GB for 3 days. NO Service Validity. No Outgoing SMS. \n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹29		Data:			Validity:\n"
				 + "\t      		2GB			 2 days\n"
				 + "\tADD-ON Data pack- 2GB for 2 days. NO Service Validity. No Outgoing SMS. \n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹19		Data:			Validity:\n"
				 + "\t      		1GB			 24 Hours\n"
				 + "\tADD-ON Data pack- 1GB for 24 hours. NO Service Validity. No Outgoing SMS. \n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹298		Data:			Validity:\n"
				 + "\t      		50GB			 28 days\n"
				 + "\tVi Movies & TV Classic Access. \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
		
	}
//	HERO UNLIMITED
	public void heroUnlimited() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  HERO UNLIMITED  <======\n");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		
		System.out.println(
				 "\t₹359		Data:			Validity:\n"
				 + "\t      		3GB/Day			28 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹299		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		28 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t3GB per Day\n"
				+ "\t₹699		Data:			Validity:\n"
				 + "\t      		3GB/Day			56 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t~₹240 per 28 Days\n"
				+ "\t₹719		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		84 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t~₹240 per 28 Days\n"
				+ "\t₹479		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		56 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println( "\t₹368		Data:			Validity:\n"
				 + "\t      		2GB/Day			30 Days\n"
				 + "\t30 Day SUNNXT Subscription\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tNew Pack\n"
				 +"\t₹903		Data:			Validity:\n"
				 + "\t      		2GB/Day			90 Days\n"
				 + "\t90 Day SunNXT Subscription\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t~₹270 per 28 Days\n"
				+ "\t₹539		Data:			Validity:\n"
				 + "\t      		2GB/Day			56 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹839		Data:			Validity:\n"
				 + "\t      		2GB/Day			84 Days\n"
				 + "\t3 months Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹1,066		Data:			Validity:\n"
				 + "\t      		2GB/Day			84 Days\n"
				 + "\t1yr Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹3,099		Data:			Validity:\n"
				 + "\t      		2GB/Day			365 Days\n"
				 + "\t1yr Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		

		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
		
	}
//	ADD ON DATA
	public void addOnDataPacksVi() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  ADD ON DATA  <======\n");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		
		System.out.println("\tSuper Day\n"
				+ "\t₹49		Data:			Validity:\n"
				 + "\t      		6GB			24 Hours\n"
				 + "\tADD-ON Data pack-6 GB Data for 24 Hours. No service Validity. No \n"
				 + "\tOutgoing SMS\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹151		Data:			Validity:\n"
				 + "\t      		8GB			30 days\n"
				 + "\tADD-ON Data pack-8 GB Data for 30 days & Dinsey+ Hotstar Mobile subscription\n"
				 + "\tfor 3 months. No Service Validity\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹118		Data:			Validity:\n"
				 + "\t      		12 GB			28 days\n"
				 + "\tNo Service Validity. No Outgoing SMS. Standard tariff for SMS to 1900. \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹75		Data:			Validity:\n"
				 + "\t      		6GB			 3 days\n"
				 + "\tADD-ON Data pack- 6GB for 7 days. NO Service Validity. No Outgoing SMS. \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹39		Data:			Validity:\n"
				 + "\t      		3GB			 3days\n"
				 + "\tADD-ON Data pack- 3GB for 3 days. NO Service Validity. No Outgoing SMS. \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹24		Data:			Validity:\n"
				 + "\t      		Unlimited			 1 Hour\n"
				 + "\tADD-ON Data pack- Unlimited Data 1 Hour. No Service Validity. No Outgoing SMS \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹17		Data:			Validity:\n"
				 + "\t      		Night Free			 1 Day\n"
				 + "\tADD-ON Night Data pack- Unlimited Night Data between 12am - 6am for 1 day. No Service Validity. No Outgoing SMS \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		
		System.out.println("\t₹29		Data:			Validity:\n"
				 + "\t      		2GB			 2 days\n"
				 + "\tADD-ON Data pack- 2GB for 2 days. NO Service Validity. No Outgoing SMS. \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹19		Data:			Validity:\n"
				 + "\t      		1GB			 24 Hours\n"
				 + "\tADD-ON Data pack- 1GB for 24 hours. NO Service Validity. No Outgoing SMS. \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹57		Data:			Validity:\n"
				 + "\t      		Night Free			7 days\n"
				 + "\tADD-ON Night Data pack- Unlimited Night Data between 12am - 6am for 7 days. \n"
				 + "\tNo Service Validity. No Outgoing SMS \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹298		Data:			Validity:\n"
				 + "\t      		50GB			 28 days\n"
				 + "\tVi Movies & TV Classic Access. \n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹418		Data:			Validity:\n"
				 + "\t      		100GB			 56 days\n"
				 + "\tVi Movies & TV Classic Access. \n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹98		Data:			Validity:\n"
				 + "\t      		9GB			 21 days\n"
				 + "\tADD-ON Data pack- 9GB for 21 days. NO Service Validity. No Outgoing SMS. \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹82		Data:			Validity:\n"
				 + "\t      		4GB			 14 days\n"
				 + "\tEnjoy Sony Liv mobile only membership for 28 days. \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹58		Data:			Validity:\n"
				 + "\t      		3GB			 28 days\n"
				 + "\tADD-ON Data pack-6 GB Data for 24 Hours. No service Validity \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹108		Data:			Validity:\n"
				 + "\t      		6GB			15 days\n"
				 + "\tFree Sony Liv mobile only Annual pack membership \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹999		Data:			Validity:\n"
				 + "\t      		50GB			365 days\n"
				 + "\tNO Service Validity. A pack offering service validity needs to be active to \n"
				 + "\tuse benefits of this pack. \n"
		+"\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\t₹25		Data:			Validity:\n"
				 + "\t      		1.1GB			1 day\n"
				 + "\tAd Free Music Subscription for 7 days\n"
				 + "\tEnjoy Music without Ads, HD Quality Music, Videos, Podcasts & more\n"
				 + "\tNO Service Validity. A pack offering service validity needs to be active to \n"
				 + "\tuse benefits of this pack.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹181		Data:			Validity:\n"
				 + "\t      		1GB/day			30 days\n"
				 + "\tADD-ON Data pack- 1GB/day for 30 Days. NO Service Validity.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹155		Data:			Validity:\n"
				 + "\t      		1GB			24 Days\n"
				 + "\tGet MORE for LESS! Recharge with Rs.155 instead of Rs99 and enjoy\n"
				 + "\tUnlimited Local & National Calls + 300 SMS for 24 days");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
		
	}
//	UNLIMITED
	public void unlimitedPacksVi() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  UNLIMITED <======\n");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		System.out.println("\t₹198		Talktime:		Data:			Validity:\n"
				 + "\t      		₹198			500 MB			30 Days\n"
				 + "\tCall charges apply at 2.5p/sec. Post quota usage, data charges apply at\n"
				 + "\t50p/MB");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹299		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		28 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹155		Data:			Validity:\n"
				 + "\t      		1GB			24 Days\n"
				 + "\tGet MORE for LESS! Recharge with Rs.155 instead of Rs99 and enjoy\n"
				 + "\tUnlimited Local & National Calls + 300 SMS for 24 days");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹269		Data:			Validity:\n"
				 + "\t      		 1GB/day		28 Days\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹239		Data:			Validity:\n"
				 + "\t      		1GB/Day			18 Days\n"
				 + "\tTruly Unlimited Local & National Calls + 100 SMS/Day");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹199		Data:			Validity:\n"
				 + "\t      		1GB/Day			18 Days\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t----------------------------------------------------------------------------------------------");
		System.out.println("\t₹599		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		70 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV, Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t3GB per Day\n"
				+ "\t₹699		Data:			Validity:\n"
				 + "\t      		3GB/Day			56 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println( "\t₹409		Data:			Validity:\n"
				 + "\t      		3.5GB/Day		28 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println( "\t₹475		Data:			Validity:\n"
				 + "\t      		4GB/Day			28 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println( "\t₹2899		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		365 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println( "\t₹666		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		77 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹399		Data:			Validity:\n"
				 + "\t      		2.5GB/Day		28 Days\n"
				 + "\t3 months Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t~₹270 per 28 Days\n"
				+ "\t₹539		Data:			Validity:\n"
				 + "\t      		2GB/Day			56 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹839		Data:			Validity:\n"
				 + "\t      		2GB/Day			84 Days\n"
				 + "\t3 months Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println( "\t₹1,449		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		180 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹601		Data:				Validity:\n"
				 + "\t      		3GB/Day+ 16 GB Extra		28 Days\n"
				 + "\t1yr Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹901		Data:				Validity:\n"
				 + "\t      		2GB/Day	+ 48 GB Extra	 	70 Days\n"
				 + "\t1yr Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹3,099		Data:			Validity:\n"
				 + "\t      		2GB/Day			365 Days\n"
				 + "\t1yr Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹1,799		Data:			Validity:\n"
				 + "\t      		24GB			365 Days\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹209		Data:			Validity:\n"
				 + "\t      		4GB			28 Days\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹329		Data:			Validity:\n"
				 + "\t      		4GB			56 Days\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹459		Data:			Validity:\n"
				 + "\t      		6GB			84 Days\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹219		Data:			Validity:\n"
				 + "\t      		1GB/Day			21 Days\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹537		Data:			Validity:\n"
				 + "\t      		50GB			60 Days\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t~₹240 per 28 Days\n"
				+ "\t₹479		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		56 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println( "\t₹368		Data:			Validity:\n"
				 + "\t      		2GB/Day			30 Days\n"
				 + "\t30 Day SUNNXT Subscription\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹195		Data:			Validity:\n"
				 + "\t      		3GB			1 Month\n"
				 + "\tTruly Unlimited Local & National calls + 300 SMS\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹296		Data:			Validity:\n"
				 + "\t      		25GB			30 Days\n"
				 + "\tTruly Unlimited Local & National calls + 300 SMS\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println(
				 "\t₹319		Data:			Validity:\n"
				 + "\t      		2GB/Day			1 Month\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println(
				 "\t₹359		Data:			Validity:\n"
				 + "\t      		3GB/Day			28 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹499		Data:			Validity:\n"
				 + "\t      		3GB/Day			28 Days\n"
				 + "\t3 months Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t~₹240 per 28 Days\n"
				+ "\t₹719		Data:			Validity:\n"
				 + "\t      		1.5GB/Day		84 Days\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println(
				 "\t₹902		Data:			Validity:\n"
				 + "\t      		2GB/Day			90 Days\n"
				 + "\t90 Day SunNXT Subscription\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tNew Pack\n"
				 +"\t₹903		Data:			Validity:\n"
				 + "\t      		2GB/Day			90 Days\n"
				 + "\t90 Day SunNXT Subscription\n"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹949		Data:			Validity:\n"
				 + "\t      		12GB			84 Days\n"
				 + "\tTruly Unlimited Local & National calls + 300 SMS\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\tDisney+ Hotstar\n"
				+ "\t₹1,066		Data:			Validity:\n"
				 + "\t      		2GB/Day			84 Days\n"
				 + "\t1yr Disney+ Hotstar Mobile subcription"
				 + "\tExclusive- Vi Hero Unlimited\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tCarry unused Data from Mon-Fri into the weekend\n"
				 + "\tUp to 2 GB backup data/month\n"
				 + "\tTruly Unlimited Local & National calls + 100 SMS/Day\n"
				 + "\tAdditional Benefits : Binge All Night,  Vi Movies & TV , Weekend Data Rollover, Data Delights");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹2,999		Data:			Validity:\n"
				 + "\t      		850GB			365 Days\n"
				 + "\tExclusive\n"
				 + "\t12am to 6 am Unlimited Data\n"
				 + "\tTruly Unlimited Local & National calls + 300 SMS\n"
				 + "\tAdditional Benefits : Vi Movies & TV");
		System.out.println("\t--------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
	}
//	COMBO
	public void comboPacksVi() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  COMBO  <======\n");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		System.out.println("\t₹99		Talktime:		Data:			Validity:\n"
				 + "\t      		₹99			200MB			15 Days\n"
				 + "\tNO OUTGOING SMS. Rs 99 Limited validity talktime, L+N Calls at 2.5p/sec,\n"
				 + "\t200MB Data. Standard tariff for SMS tp 1900. 15 Day Service Validty");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹198		Talktime:		Data:			Validity:\n"
				 + "\t      		₹198			500 MB			30 Days\n"
				 + "\tCall charges apply at 2.5p/sec. Post quota usage, data charges apply at\n"
				 + "\t50p/MB");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹204		Talktime:		Data:			Validity:\n"
				 + "\t      		₹204			500 MB			1 Month\n"
				 + "\tCall charges apply at 2.5p/sec. Post quota usage, data charges apply at\n"
				 + "\t50p/MB");
		System.out.println("\t--------------------------------------------------------------------------------------------------------");
		
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed\n");
		AfterViewingPackDetails.getOptionFromUser();
	}
//	PLAN VOUCHER
	public void planVoucherPacksVi() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  PLAN VOUCHER  <======\n");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		System.out.println("\t₹224		Data:			Validity:\n"
				 + "\t      		4GB			30 Days\n"
				 + "\tGet Unlimited Calls + 4GB data for 30 days. Data Tarrif post quota\n"
				 + "\tcompletion will be charged at 50p/MB");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹232		Data:			Validity:\n"
				 + "\t      		4GB			1 Month\n"
				 + "\tGet Unlimited Calls + 4GB data for 30 days. Data Tarrif post quota\n"
				 + "\tcompletion will be charged at 50p/MB");
		System.out.println("\t--------------------------------------------------------------------------------------------------------");
		
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed\n");
		AfterViewingPackDetails.getOptionFromUser();
	}
//	TALKTIME
	public void talktimePacksVi() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  TALKTIME  <======\n");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		System.out.println("\t₹10		Talktime:\n"
				 + "\t      		₹7.47\n"
				 + "\tTalktime of Rs. 7.47, Talktime validity Unrestricted; No Service Validity");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹20		Talktime:\n"
				 + "\t      		₹14.95\n"
				 + "\tTalktime of Rs. 14.95, Talktime validity Unrestricted; No Service Validity");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹30		Talktime:\n"
				 + "\t      		₹22.42\n"
				 + "\tTalktime of Rs. 22.42, Talktime validity Unrestricted; No Service Validity");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹50		Talktime:\n"
				 + "\t      		₹39.37\n"
				 + "\tTalktime of Rs. 39.37, Talktime validity Unrestricted; No Service Validity");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹100		Talktime:\n"
				 + "\t      		₹81.75\n"
				 + "\tTalktime of Rs. 81.75, Talktime validity Unrestricted; No Service Validity");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		System.out.println("\t₹500		Talktime:		Validity:\n"
				 + "\t      		₹423.73			28 Days\n"
				 + "\tTalktime of Rs. 423.73, Talktime validity Unrestricted; No Service Validity");
		System.out.println("\t--------------------------------------------------------------------------------------------");
		
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed\n");
		AfterViewingPackDetails.getOptionFromUser();
	}
//	INTERNATIONAL ROAMING
	public void internationalRoamingPacksVi() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======>  INTERNATIONAL ROAMING  <======\n");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		System.out.println("\tNew Plan\n"
				+ "\t₹1,199		Data:		Validity:\n"
				 + "\t      		₹423.73		20 Days\n"
				 + "\tGet FREE INCOMING CALLS + 150 outgoing mins + 2GB Data when\n"
				 + "\troaming aboard in Saudi,UAE & Iraq. Validity 20 days. T&C Apply, Call rates \n"
				 + "\tRs 10/Min, Data rates 10/MB post the free quota.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹1,495		Validity:\n"
				 + "\t      		14 Days\n"
				 + "\tGet FREE 300 miniutes on outgoing and incoming calls & 500MB when\n"
				 + "\troaming aboard in 11 Countries. Also get FREE 100 miniutes outgoing and\n"
				 + "\tincoming & 100 MB in 30 Countries Validity 7 days. T&C To check\n"
				 + "\tcountry specific benefits, please visit international Roaming section on Vi app.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹995		Validity:\n"
				 + "\t      		7 Days\n"
				 + "\tGet FREE 150 miniutes on outgoing and incoming calls & 500MB when\n"
				 + "\troaming aboard in 11 Countries. Also get FREE 100 miniutes outgoing and\n"
				 + "\tincoming & 100 MB in 30 Countries Validity 7 days. T&C To check\n"
				 + "\tcountry specific benefits, please visit international Roaming section on Vi app.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹495		Validity:\n"
				 + "\t      		30 Days\n"
				 + "\tGet FREE 50 mins outgoing and incoming calls when roaming aboard in \n"
				 + "\tUS, UK,Singapore,Thailand, Malaysia, Europe (Germany,France, Romania,\n"
				 + "\tPortugal Greece), Austrila,NZ, turkey, UAE, Saudi arabia and indonesia\n"
				 + "\tand more. Validity 30 days T&C Apply.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹695		Validity:\n"
				 + "\t      		1 Day\n"
				 + "\t120 OG min (Local + call back home), Free IC, 1GB Data in 22 countries;\n "
				 + "\t50 OG (Local + call back home), Free IC, 300MB Data in 47 countries; OG \n"
				 + "\tInternational Calls at Standard Rates; Post quota OG/IC rates- Rs.3/min;\n "
				 + "\tData after your quota is over would be kept OFF. Too check the country\n"
				 + "\t specific benefit, please visit International roaming section on Vi app or website. \n"
				 
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹2,695		Validity:\n"
				 + "\t      		4 Days\n"
				 + "\t120 OG min/day (Local + call back home), Free IC, 4GB Data in 22 \n"
				 + "\tcountries; 200 OG (Local + call back home), Free IC, 1.2GB Data in 47\n"
				 + "\tcountries; OG International Calls at Standard Rates; Post quota OG/IC \n"
				 + "\trates- Rs 3/min; Data after your quota is over would be kept OFF. To check \n"
				 + "\tcountry specific benefit, please visit International Roaming section on Vi App. \n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹3,495		Validity:\n"
				 + "\t      		7 Days\n"
				 + "\tUnlimited Free outgoing (Local + call back home) & Incoming calls \n "
				 + "\tUnlimited Data for 22 Countries; 200 OG (Local + call back home), Free IC,\n "
				 + "\t2GB Data for 47 Countries; OG International Calls at Standard Rates; Post \n"
				 + "\tquota OG/IC rates- Rs 10/min; Post quota Data charges - Rs 10/MB & \n"
				 + "\tSMS charges Rs 15/SMS. To check country specific benefits, please visit \n"
				 + "\tInternational roaming section on Vi App.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹4,695		Validity:\n"
				 + "\t      		10 Days\n"
				 + "\tUnlimited Free outgoing (Local + call back home) & Incoming calls + \n"
				 + "\tUnlimited Data in 22 countries; 300 OG (Local + call back home), Free IC, \n"
				 + "\t3GB Data in 47 countries; OG International Calls at Standard Rates; Post \n"
				 + "\tquota OG / IC rates- Rs 10/min; Post quota Data charges - Rs 10/MB & \n"
				 + "\tSMS charges - Rs 15/SMS. To check country specific benefits, please visit \n"
				 + "\tInternational Roaming section on Vi app.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹6,995		Validity:\n"
				 + "\t      		10 Days\n"
				 + "\t120 OG min/day (Local + call back home), Free IC, 15GB Data in 22 \n"
				 + "\tcountries; 500 OG (Local + call back home)minutes, Free IC, 5GB Data in \n"
				 + "\t47 countries; OG International Calls at Standard Rates; Post quota OG / IC \n"
				 + "\trates- Rs 3/min; Data after your quota is over would be kept OFF. To check \n"
				 + "\tcountry specific benefits, please visit International Roaming section on Vi App.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹295		Validity:\n"
				 + "\t      		10 Days\n"
				 + "\tGet FREE 40 mins outgoing and incoming calls when roaming abroad in \n"
				 + "\tUS,UK, Singapore, Thailand, Malaysia, Europe (Germany, France, Romania, \n"
				 + "\tPortugal Greece), Australia, NZ, Turkey, UAE, Saudi arabia and Indonesia \n"
				 + "\tand more. Validity 3 days. T&C Apply\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹27		Validity:\n"
				 + "\t      		10 Days\n"
				 + "\tUSA & Canada calling at 12p/s.Pack Validity for 28 days\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹755		Validity:\n"
				 + "\t      		5 Days\n"
				 + "\tGet 1 GB Data while roaming abroad in 11 countries; Also, Get 500 MB while \n"
				 + "\troaming abroad in 30 countries; OG International Calls at Standard Rates; \n"
				 + "\tPost quota OG / IC rates- Rs 10/min; Data after your quota is over would \n"
				 + "\tbe kept OFF. To check country specific benefits, please visit International \n"
				 + "\tRoaming section on Vi App..\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹2,388		Data:		Validity:\n"
				 + "\t      		4GB		10 Days\n"
				 + "\tGet FREE INCOMING CALLS + 300 mins outgoing Min + 4GB Data when \n"
				 + "\troaming abroad in Saudi, UAE & Iraq. Validity 40 days. T&C Apply. Call rates \n"
				 + "\tRs 10/Min, Data rates 10/MB post the free quota.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹2,998		Validity:\n"
				 + "\t      		30 Days\n"
				 + "\t200 OG + IC minutes (Local + call back home), 5 GB Data in 11 countries; \n"
				 + "\tAlso get 100 OG + IC minutes (Local + call back home), 1GB Data in 30 \n"
				 + "\tcountries; OG International Calls at Standard Rates; Post quota OG / IC \n"
				 + "\trates- Rs 10/min; Data after your quota is over would be kept OFF. To check \n"
				 + "\tcountry specific benefits, please visit International Roaming section on Vi App.\n"
		+"\t--------------------------------------------------------------------------------------------");
		System.out.println(
				   "\t₹5,195		Validity:\n"
				 + "\t      		14 Days\n"
				 + "\tUnlimited Free outgoing (Local + call back home) & Incoming calls + \n"
				 + "\tUnlimited Data in 22 countries; 500 OG (Local + call back home)minutes, \n"
				 + "\tFree IC, 5GB Data in 47 countries; OG International Calls at Standard Rates; \n"
				 + "\tPost quota OG / IC rates- Rs 10/min; Post quota Data charges - Rs 10/MB & \n"
				 + "\tSMS charges - Rs 15/SMS. To check country specific benefits, please visit \n"
				 + "\tInternational Roaming section on Vi app.\n"
		+"\t--------------------------------------------------------------------------------------------");
		
		
		System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");
		AfterViewingPackDetails.getOptionFromUser();
	}
	
}


