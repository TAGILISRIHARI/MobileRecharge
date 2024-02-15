package com.pack;


public class PrintBSNLSelectedPack 
{
	public void printingBSNLPack() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

//		System.out.println("\tBSNL servers are Under Maintainence pack details cannot be shown but\n"
//				+ "\tYou can continue with your recharge plan follow below steps");
//		new VerifyPlan().verifyPlanValidOrNot();
		System.out.println("\t\t\t\t======>  Your Pack Details  <======");
		System.out.println("\t\t\t\t======>       BSNL          <======");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		int packAmout = Variables.getPlanAmount();
		switch(packAmout)
		{
		case 10:
			System.out.println("\t₹10		Talktime:\n"
					+ "\t     		₹7.47\n"
					+ "\tTalk Value:  7.47");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 16:
			System.out.println("\t₹16		Data:			Validity:\n"
					 + "\t     		2 GB 			1 Day\n"
					 + "\t2GB DATA.Plan extension cannot be done with this voucher");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 18:
			System.out.println("\t₹18		Data:			Validity:\n"
					+ "\t     		Unlimited(1GB/day) 	2 Days\n"
					+ "\tTruly unlimited voice including MTNL roaming area of Delhi and Mumbai+ U/L Data with speed \n"
					+ "\treduced to 40 Kbps after 1GB/day");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 19:
			System.out.println("\t₹19		Validity:\n"
					+ "\t     		21 Days\n"
					+ "\tVAS Package including SMS and WAP Plan extension cannot be done with this VAS dedicated STV");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 20:
			System.out.println("\t₹20		Talktime:\n"
					+ "\t     		₹14.95\n"
					+ "\tTalk Value:  14.95");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 23:
			System.out.println("\t₹23		Validity:\n"
					+ "\t     		30 Days\n"
					+ "\t23 minutes of consultation on IVR.No charge till free minutes and Rs.9/ min will be charged after \n"
					+ "\tavailing free minutes from dedicated STVs.Plan Validity extension cannot be done with this VAS dedicated STVs");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 30:
			System.out.println("\t₹30		Talktime:\n"
					+ "\t     		₹22.42\n"
					+ "\tTalk Value:  22.42");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 31:
			System.out.println("\t₹31		Validity:\n"
					+ "\t     		30Days\n"
					+ "\t31 minutes of consultation on IVR.No charge till free minutes and Rs.9/ min will be charged after availing \n"
					+ "\tfree minutes from dedicated STVs.Plan Validity extension cannot be done with this VAS dedicated STVs");
			System.out.println("\t--------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 35:
			System.out.println("\t₹35		Validity:\n"
					+ "\t     		30 Days\n"
					+ "\tSTV is exclusively for the M/S APSRTC Enterprise customers only.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 36:
			System.out.println("\t₹36		Validity:\n"
					+ "\t     		30 Days\n"
					+ "\tSTV is exclusively for the M/S TSRTC Enterprise customers only.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 37:
			System.out.println("\t₹37		Validity:\n"
					+ "\t     		30 Days\n"
					+ "\tSMS(News Pack: Sports Pack: Jokes Pack: Love Pack: Shayari Pack)");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 48:
			System.out.println("\t₹48		Talktime:	Validity:\n"
					+ "\t     		₹10 		30 Days\n"
					+ "\tRs.10 usage value in main account + 20 paisa/min on-net calls + 20 paisa/ min off-net calls in \n"
					+ "\thome LSA and National roaming including MTNL network in Mumbai and Delhi.Plan extension \n"
					+ "\tcannot be done with this voucher");
			System.out.println("\t--------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 49:
			System.out.println("\t₹49		Data:			Validity:\n"
					+ "\t     		1 GB 			15 Days\n"
					+ "\t100mins Calls +1 GB Data for 15 days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 50:
			System.out.println("\t₹50		Talktime:\n"
					+ "\t     		₹39.37\n"
					+ "\tTalk Value:  39.37");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 57:
			System.out.println("\t₹57		Validity:\n"
					+ "\t     		30 Days\n"
					+ "\tSTV for Activation/extension of pre-paid International roaming.It is\n"
					+ "\tmandatory to replace Normal SIM with International Roaming SIM to avail \n"
					+ "\tInternational Roaming services.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 65:
			System.out.println("\t₹65		Validity:\n"
					+ "\t     		30 Days\n"
					+ "\tVoice calls @Rs.1.49/min to Canada USA Singapore and China. Voice calls @Rs.2.49/min for \n"
					+ "\tBangladesh Malaysia Hong Kong Voice calls @Rs.6.49 /min to Bahrain.Voice calls to \n"
					+ "\tNepal @Rs.9.50/min International SMS to these countries @ Rs.3/SMS.This STV will not be \n"
					+ "\tapplicable in MTNL area of Mumbai and Delhi.This STV will be available in BSNL Home PLMN \n"
					+ "\tand national roaming in BSNL network only.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 73:
			System.out.println("\t₹73		Data:			Validity:\n"
					+ "\t     		200 MB 			21 Days\n"
					+ "\tBundled free usage 200MB Offered for a promotional period of 60days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 87:
			System.out.println("\t₹87		Data:			Validity:\n"
					+ "\t     		Unlimited(1GB/day) 	14 Days\n"
					+ "\tU/L voice calls (Local/STD) any-net in Home LSA and National Roaming (incl. Mumbai and \n"
					+ "\tDelhi)+ 1GB/day (Speed reduced to 40Kbps after 1GB/ day)");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 94:
			System.out.println("\t₹94		Data:			Validity:\n"
					+ "\t     		3 GB 			30 Days\n"
					+ "\t200 Minutes voice Calls(LOCAL/NATIONAL) + 3GB Data for 30 days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 97:
			System.out.println("\t₹97		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	15 Days\n"
					+ "\tUnlimited Local/STD/roaming calls incl. Mumbai and Delhi + Unlimited Data \n"
					+ "\tspeed reduced to 40kbps after 2GB/day + Lokdhun content.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 98:
			System.out.println("\t₹98		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	22 Days\n"
					+ "\tUnlimited Data with speed reduced to 40 Kbps after 2 GB data/Day for 22 days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 99:
			System.out.println("\t₹99		Validity:\n"
					+ "\t     		18 Days\n"
					+ "\tUnlimited Voice calls (local/STD) any-net in home LSA and national \n"
					+ "\troaming including Delhi and Mumbai");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 100:
			System.out.println("\t₹100		Talktime:\n"
					+ "\t     		₹81.75\n"
					+ "\tTalk Value:  81.75");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 105:
			System.out.println("\t₹105		Data:			Validity:\n"
					+ "\t     		2 GB 			18 Days\n"
					+ "\tUnlimited voice (Local/STD) any-net in Home LSA and National roaming incl. MTNL network in \n"
					+ "\tMumbai and Delhi + Unlimited data with speed reduced to 40Kbps after 1GB/day + 100 SMS/day to \n"
					+ "\tAny N/w Including while Roaming in Mumbai and New Delhi + Free PRBT Charges after freebies are \n"
					+ "\tas follows: Voice call charges: Local calls Rs 1/min, STD calls Rs 1.3/min Video Calls: \n"
					+ "\tLocal/STD- Rs 2/min SMS: Local 80p/SMS, National: Rs 1.20/SMS International: Rs 5/SMS \n"
					+ "\tData Charges 25p/MB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 107:
			System.out.println("\tTrending\n"
					+ "\t₹107		Data:			Validity:\n"
					+ "\t     		3 GB 			35 Days\n"
					+ "\t3GB free data + 200 Min free voice anynet Local/STD/Roaming incl. MTNL network+ \n"
					+ "\tfree BSNL Tune for 35 days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 118:
			System.out.println("\tBest Seller\n"
					+ "\t₹118		Data:			Validity:\n"
					+ "\t     		Unlimited(0.5GB/day) 	20 Days\n"
					+ "\t");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 120:
			System.out.println("\t₹120		Talktime:\n"
					+ "\t     		₹98.69\n"
					+ "\tTalk Value:  98.69");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 139:
			System.out.println("\t₹139		Data:			Validity:\n"
					+ "\t     		Unlimited(1.5GB/day) 	28 Days\n"
					+ "\tUnlimited Voice calls anynet Local/STDRoaming incl. Mumbai and Delhi + Unlimited data with speed \n"
					+ "\treduced to 40 kbps after 1.5GB/day. Only for GP2 and beyond GP2 subscribers");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 147:
			System.out.println("\t₹147		Data:			Validity:\n"
					+ "\t     		10 GB 			30 Days\n"
					+ "\tUnlimited Local/STD calls to Any Network while in Home LSA and in National roaming including \n"
					+ "\tMTNL network roaming area of New Delhi and Mumbai + 10 GB Data + BSNL tunes");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 150:
			System.out.println("\t₹150		Talktime:\n"
					+ "\t     		₹124.12\n"
					+ "\tTalk Value:  124.12");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 151:
			System.out.println("\t₹151		Data:			Validity:\n"
					+ "\t     		40 GB 			28 Days\n"
					+ "\t40 GB free Data + Zing");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 153:
			System.out.println("\tTop Pack\n"
					+ "\t₹153		Data:			Validity:\n"
					+ "\t     		Unlimited(1GB/day) 	26 Days\n"
					+ "\tUnlimited voice (Local/STD) any-net in Home LSA and National roaming incl. MTNL network \n"
					+ "\tin Mumbai and Delhi + Unlimited data with speed reduced to 40Kbps after 1GB/day + 100 SMS/day \n"
					+ "\tto Any N/w Including while Roaming in Mumbai and New Delhi + Free PRBT Charges after freebies \n"
					+ "\tare as follows: Voice call charges: Local calls Rs 1/min, STD calls Rs 1.3/min Video Calls: \n"
					+ "\tLocal/STD- Rs 2/min SMS: Local 80p/SMS, National: Rs 1.20/SMS International: Rs 5/SMS Data \n"
					+ "\tCharges 25p/MB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 167:
			System.out.println("\t₹167		Validity:\n"
					+ "\t     		90 Days\n"
					+ "\tActivation/extension of pre-paid International roaming-It is mandatory to replace Normal SIM \n"
					+ "\twith International Roaming SIM to avail International Roaming services.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 181:
			System.out.println("\t₹181		Validity:\n"
					+ "\t     		30 Days\n"
					+ "\t23800 Sec Local/STD Voice Calls to Any N/w");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 184:
			System.out.println("\t₹184		Data:			Validity:\n"
					+ "\t     		Unlimited(1GB/day) 	28 Days\n"
					+ "\tunlimited voice calls + Unlimited Data with speed reduced to 40 Kbps after 1GB/Day + 100 SMS/day+ \n"
					+ "\tBSNL Tunes for 28 days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 185:
			System.out.println("\t₹185		Data:			Validity:\n"
					+ "\t     		Unlimited(1GB/day) 	28 Days\n"
					+ "\tUnlimited voice calls (Any Net) in Home LSA and National Roaming including MTNL network in Mumbai \n"
					+ "\tand Delhi + Unlimited data with speed reduced to 40kbps after 1GB/day +100 SMS to any nw incl. while \n"
					+ "\troaming in Mumbai and New Delhi + Bundling of Challenges Arena Mobile Gaming Service on Progressive \n"
					+ "\tweb APP(PWA) by M/S Onmobile Global limited + BSNL Tunes.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 186:
			System.out.println("\t₹186		Data:			Validity:\n"
					+ "\t     		Unlimited(1GB/day) 	28 Days\n"
					+ "\tUnlimited voice calls (Any Net) in Home LSA and National Roaming including MTNL network in Mumbai \n"
					+ "\tand Delhi + Unlimited data with speed reduced to 40kbps after 1GB/day +100 SMS to any nw incl. while \n"
					+ "\troaming in Mumbai and New Delhi + Hardy Games service + BSNL Tunes");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 187:
			System.out.println("\tBest Seller"
					+ "\t₹187		Data:		Validity:\n"
					+ "\t     		Unlimited(1.5GB/day) 		28 Days\n"
					+ "\tUnlimited Voice calls anynet Local/STDRoaming incl. Mumbai and Delhi + Unlimited data with \n"
					+ "\tspeed reduced to 40 kbps after 1.5GB/day + 100 SMS/ day + Free PRBT.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 197:
			System.out.println("\t₹197		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	70 Days\n"
					+ "\tunlimited voice calls + Unlimited Data with speed reduced to 40 Kbps after 2GB/day+ 100SMS/day. \n"
					+ "\tAll freebies valid for first 15 days only. Main Validity 70 days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 198:
			System.out.println("\t₹198		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	40 Days\n"
					+ "\tUnlimited DATA with speed reduced to 40 Kbps after 2GB/Day + Bundling of Challenges Arena Mobile \n"
					+ "\tGaming Service on Progressive Web App(PWA) by M/s Onmobile Global Limited");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 199:
			System.out.println("\t₹199		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	30 Days\n"
					+ "\tUnlimited voice calls(Local/STD) any-net in Home LSA and national roaming including MTNL network in Mumbai \n"
					+ "\tand Delhi + Unlimited data with speed reduced to 40Kbps after 2GB/day + 100 SMS/day to Any N/w Including while \n"
					+ "\tRoaming in Mumbai and New Delhi.Charges after freebies are as follows: Voice call charges: Local calls Rs 1/min, \n"
					+ "\tSTD calls Rs 1.3/ min Video Calls : Local/STD:- Rs 2/min SMS: Local 80p/SMS, National: Rs 1.20/SMS International: \n"
					+ "\tRs 5/SMS Data Charges 25p/MB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 200:
			System.out.println("\t₹200		Talktime:\n"
					+ "\t     		₹164.49\n"
					+ "\tTalk Value:  164.49");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 201:
			System.out.println("\t₹201		Data:			Validity:\n"
					+ "\t     		6 GB 			90 Days\n"
					+ "\tPV for GP-II and beyond GP-II customers only. Free voice 300 min.6GB data.99 SMS.All other terms and conditions as \n"
					+ "\tper plan 107.Freebies will be applicable for whole validity period.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 209:
			System.out.println("\t₹209		Talktime:		Validity:\n"
					+ "\t     		 ₹25			84 Days\n"
					+ "\tRs.25 + Rate cutter all calls @ 1p/2sec in home LSA for 84 days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 220:
			System.out.println("\t₹220		Talktime:\n"
					+ "\t     		₹220\n"
					+ "\tFull Talk value offer equal to Rs.220");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 228:
			System.out.println("\t₹228		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	30 Days\n"
					+ "\tUnlimited voice calls Local/STD/Roaming incl. MTNL network+ Unlimited data with speed reduced \n"
					+ "\tto 40 kbps after 2GB/day + 100 SMS/day + Bundling of Challenges Arena Mobile Gaming Service on \n"
					+ "\tProgressive Web App (PWA) by M/s Onmobile Global Limited");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 229:
			System.out.println("\t₹229		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	30 Days\n"
					+ "\tUnlimited voice (Local/STD) any-net in Home LSA and national roaming incl. MTNL network in\n"
					+ "\tMumbai and Delhi + Unlimited data with speed reduced to 40 Kbps after 2GB/day + free 100 SMS/day + \n"
					+ "\tBundling of Challenges Arena Mobile Gaming Service on Progressive Web App(PWA)");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 239:
			System.out.println("\t₹239		Talktime:		Data:			Validity:\n"
					 + "\t     		₹10			Unlimited(2GB/day) 	30 Days\n"
			+ "\tUnlimited voice calls Local/STD/Roaming incl.MTNL network+ Unlimited data with speed reduced to \n"
			+ "\t40 kbps after 2GB/day+ 100 SMS/day+ Bundling of Challenges Arena Mobile Gaming Service on Progressive \n"
			+ "\tWeb App (PWA) by M/s Onmobile Global Limited + Rs.10 Talk value in Main Account balance Freebies \n"
			+ "\tvalidity of 1 month is not applicable to Rs.10 in main account balance");
	System.out.println("\t--------------------------------------------------------------------------------------------");
	
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 247:
			System.out.println("\t₹247		Talktime:		Data:			Validity:\n"
					 + "\t     		₹10			Unlimited	 	30 Days\n"
			+ "\tRs.10 Talk Value in Main account balance + 50GB Data at high speed (Post which unlimited @ 40 Kbps) + U/L voice + 100SMS/day + BSNL Tunes and \n"
			+ "\tEROS now entertainment services. Freebies Validity of 30 days is not applicable for Rs.10 in main account balance");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 251:
			System.out.println("\t₹251		Data:			Validity:\n"
					+ "\t     		70 GB 			28 Days\n"
					+ "\t70GB +Zing for 28 days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 269:
			System.out.println("\t₹269		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	28 Days\n"
					+ "\tU/L voice calls (Local/STD) any-net in Home LSA and National Roaming (incl. Mumbai and Delhi) + \n"
					+ "\tU/L Data with speed reduced to 40Kbps after 2GB/day + 100 SMS/ day incl. MTNL area Mumbai and Delhi \n"
					+ "\t+ BSNL Tunes + EROS Now service + Hardy Mobile Games service by M/S ONE97 communications limited + \n"
					+ "\tChallenges Arena Mobile Gaming Service on Progressive Web App(PWA) by M/s Onmobile Global Ltd + \n"
					+ "\tAstrotell and GameOn services by M/s Ubarri Marketing Private Limited + GAMEIUM premium gaming \n"
					+ "\tapplication by M/S ADVYSORS INC.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 279:
			System.out.println("\t₹279		Validity:\n"
					+ "\t     		28 Days\n"
					+ "\tInternational Roaming STV for Singapore(This pack is valid for roaming \n"
					+ "\tinto network of M/s StarHub in Singapore) Free Data/ Data Charges Rs \n"
					+ "\t0.5/MB.Free Voice/ Voice charges 30 mins of International Roaming calls \n"
					+ "\twhich include Outgoing local calls, calls back to India and Incoming Calls \n"
					+ "\tonly. Call back to India(Rs/min):- Rs 10.90/min. Outgoing Local call (Rs/ \n"
					+ "\tmin): Rs 4.6/min. Outgoing International (Rs/min): Rs 52.8/min. Incoming \n"
					+ "\tcall (Rs/min): Rs 2/min. Outgoing SMS (Rs/SMS) Rs 2/SMS.International \n"
					+ "\tRoaming services it is is mandatory to replace Normal SIM with \n"
					+ "\tInternational Roaming SIM & recharge of IR STV 57&167");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 298:
			System.out.println("\t₹298		Data:			Validity:\n"
					+ "\t     		Unlimited(3GB/day) 	30 Days\n"
					+"\tUnlimited Voice calls (Local/STD/Roaming-including while roaming in Mumbai and Delhi) to any network + \n"
					+ "\tUnlimited free Data with speed reduced to 40 Kbps after 1GB/day+ 100 SMS/day Local/STD/ Roaming-incl\n"
					+ "\twhile roaming in Mumbai and Delhi to any network+ EROS NOW Entertainment Services");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 299:
			System.out.println("\t₹299		Data:			Validity:\n"
					+ "\t     		Unlimited(3GB/day) 	30 Days\n"
					+ "\tunlimited voice calls+Unlimited Data with speed reduced to 40 Kbps after 3GB/day+100SMS/day For30 days.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 319:
			System.out.println("\t₹319		Data:			Validity:\n"
					+ "\t     		10 GB 			65 Days\n"
					+ "\tU/L Voice calls (Local/STD) Any-Net in Home LSA and National Roaming including MTNL network Mumbai and \n"
					+ "\tDelhi + 300 SMS + 10 GB DATA");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 347:
			System.out.println("\t₹347		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	54 Days\n"
					+ "\tUnlimited voice calls (Any Net) in Home LSA and National Roaming including MTNL network in Mumbai and \n"
					+ "\tDelhi + Unlimited data with speed reduced to 40kbps after 2GB/day +100 SMS to any nw incl. while roaming \n"
					+ "\tin Mumbai and New Delhi + Bundling of Challenges Arena Mobile Gaming Service on Progressive web APP(PWA) \n"
					+ "\tby M/S Onmobile Global limited");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 396:
			System.out.println("\t₹396		Data:			Validity:\n"
					+ "\t     		Unlimited	 	90 Days\n"
					+ "\tUnlimited calls to Any Network, including while roaming in Mumbai & New Delhi+100 SMS/day to Any Network, \n"
					+ "\tincluding while roaming in Mumbai & New Delhi + 120 GB (Speed reduced to 40kbps after 120 GB) & U/I free night \n"
					+ "\tdata during (0000 hours to 0500hours). Validity 90 days.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 397:
			System.out.println("\t₹397		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	150 Days\n"
					+ "\tUnlimited Voice calls Local/STD/roaming incl. MTNL network for 30 days + Unlimited Data with speed reduced to \n"
					+ "\t40 kbps after 2 GB/day for 30 days +100 SMS/day for 30 days. All Freebies valid for 30 days only. Plan validity is 150 days.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 398:
			System.out.println("\t₹398		Data:			Validity:\n"
					+ "\t     		Unlimited 		70 Days\n"
					+ "\tUnlimited Data with speed reduced to 40 kbps after 120 GB + unlimited voice calls +100 SMS/day for 30 days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 399:
			System.out.println("\t₹399		Data:			Validity:\n"
					+ "\t     		Unlimited(1GB/day) 	70 Days\n"
					+ "\t");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 401:
			System.out.println("\t₹401		Validity:\n"
					+ "\t     		60 Days\n"
					+ "\tFree 800 Min Local or STD Calls to any Network while in Home LSA");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 411:
			System.out.println("\t₹411		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 		90 Days\n"
					+ "\tUnlimited data with speed reduced to 40 kbps after 2GB/day");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 439:
			System.out.println("\t₹439		Validity:\n"
					+ "\t     		90 Days\n"
					+ "\tUnlimited voice calls (Local/STD) any-net in Home LSA and national roaming including MTNL network in\n"
					+ "\tMumbai and Delhi + 300 SMS");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 485:
			System.out.println("\t₹485		Data:			Validity:\n"
					+ "\t     		Unlimited(1.5GB/day) 	82 Days\n"
					+ "\tUnlimited voice calls/Day any-net (Local/STD) in Home LSA and Roaming including Mumbai and Delhi +  \n"
					+ "\tUnlimited Data with speed restricted to 40 Kbps after 1.5GB Data/day+ 100 SMS/day to Any N/w Including \n"
					+ "\twhile Roaming in Mumbai and New Delhi.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 497:
			System.out.println("\t₹497		Validity:\n"
					+ "\t     		1 Day\n"
					+ "\tRoaming STV for UAE.40min Mobile Originated Call(Local).40min Mobile \n"
					+ "\tOriginated Call to India,30min Mobile Terminated Call Data 100MB. To avail \n"
					+ "\tInternational Roaming services it is is mandatory to replace Normal SIM \n"
					+ "\twith International Roaming SIM and recharge of IR STV 57 or 167");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 499:
			System.out.println("\t₹499		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	75 Days\n"
					+ "\tUnlimited voice calls (Local/STD) any-net in Home LSA and National Roaming (including \n"
					+ "\tMumbai and Delhi) + U/L Data with speed reduced to 40Kbps after 2GB/day+ 100 SMS/day is including \n"
					+ "\tMTNL area Mumbai and Delhi + BSNL Tunes + GAMEIUM premium gaming application by M/s ADVYSORS INC.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 500:
			System.out.println("\t₹500		Talktime:\n"
					+ "\t     		₹500\n"
					+ "\tFull Talk value offer equal to Rs.500");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 511:
			System.out.println("\t₹511		Validity:\n"
					+ "\t     		1 Day\n"
					+ "\tInternational roaming calls which includes outgoing/incoming local calls \n"
					+ "\tand calls back to India only: 50mins. Calls back to India @ Rs.10.90/ \n"
					+ "\tmin.Outgoing local call @ Rs.4.6/min.Outgoing International call @ Rs.52.8/ \n"
					+ "\tmin.Incoming call @ Rs.2/min.Outgoing SMS @ Rs.2/SMS.Free data \n"
					+ "\t200MB Data Charges beyond free Data @ Rs0.5/MB.To avail International \n"
					+ "\tRoaming services it is is mandatory to replace Normal SIM with \n"
					+ "\tInternational Roaming SIM and recharge of IR STV 57 or 167");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 550:
			System.out.println("\t₹550		Talktime:\n"
					+ "\t     		₹550\n"
					+ "\tFull Talk value offer equal to Rs.550");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 599:
			System.out.println("\t₹599		Data:			Validity:\n"
					+ "\t     		Unlimited(3GB/day) 	84 Days\n"
					+ "\tunlimited voice calls + Unlimited Data (speed restricted to 40 Kbps after 3GB/day) + 100 SMS/day for\n"
					+ "\t 84 days +BSNL Tunes (PRBT) + ZING+ PRBT + Astrotell andGameOn services by M/s Ubarri Marketing Private\n"
					+ "\t Limited+along with unlimited free night data during (00:00 hours to 05:00hours)");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 659:
			System.out.println("\t₹659		Validity:\n"
					+ "\t     		1 Day\n"
					+ "\tSTV for Prepaid International Roaming 20min Mobile Originated \n"
					+ "\tCall(Local).20min Mobile Originated Call to India. 20min Mobile Terminated \n"
					+ "\tCall.Data 50MB.To avail International Roaming services it is mandatory to \n"
					+ "\treplace Normal SIM with International Roaming SIM and recharge of IR STV \n"
					+ "\t57 or 167.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 666:
			System.out.println("\t₹666		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	105 Days\n"
					+ "\tUnlimited voice calls/Day any-net (Local/STD) in Home LSA and Roaming incl. Mumbai and Delhi + Unlimited \n"
					+ "\tdata (speed restricted to 40 kbps after 2GB/day) + 100 SMS/day is including MTNL area Mumbai and Delhi \n"
					+ "\t+ BSNL tune + Bundling of Astrotell and GameOn services by M/s Ubarri Marketing Private Limited");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 696:
			System.out.println("\t₹699		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	130 Days\n"
					+ "\tUnlimited free voice calls in home and national roaming including MTNL network roaming area of Delhi and \n"
					+ "\tMumbai.Unlimited free data with speed reduced to 40 kbps after 0.5GB/day.100 SMS/day is including MTNL area \n"
					+ "\tMumbai and Delhi.Free PRBT for first 60 days.Base plan/All other tariff terms and Conditions as per \"Per Min \n"
					+ "\tplan\". Charges after freebies are as follows: Voice call charges: Local calls Rs 1/min, STD calls Rs 1.3/min \n"
					+ "\tVideo Calls: Local/STD:- Rs 2/min SMS: Local 80p/SMS, National: Rs 1.20/ SMS International: Rs 5/SMS Data Charges 25p/MB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 705:
			System.out.println("\t₹705		Validity:\n"
					+ "\t     		1 Day\n"
					+ "\tFree Data/Data Charges: 200 MB/after freebies data to be charged \n"
					+ "\t@Rs.0.65/MB.Free Voice/Voice Charges: 30 Free mins to India/ \n"
					+ "\tLocal outgoing and incoming and 5 sms free.Outgoing SMS charges \n"
					+ "\tbeyond free SMS @ Rs.3.9/SMS./-Call back to India (Rs./Min) :-Rs.15.6/ \n"
					+ "\tmin.-Outgoing Local Call (Rs./Min) :-Rs.5.2/min.-Outgoing International \n"
					+ "\t(Rs./Min)-Rs.52/min.-Incoming call (Rs./Min) :-Rs.11/min.-Outgoing SMS (\n"
					+ "\tRs./SMS) :-Rs.3.9/SMS.To avail International Roaming services it is is \n"
					+ "\tmandatory to replace Normal SIM with International Roaming SIM and \n"
					+ "\trecharge of IR STV 57 or 167");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 769:
			System.out.println("\t₹769		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	84 Days\n"
					+ "\tU/L voice + U/L Data with speed reduced to 40Kbps after 2GB/day +100SMS/day + BSNL Tunes + EROS\n"
					+ "\t Now Entertainment service + Hardy Mobile Games service by M/S ONE97 communications limited + \n"
					+ "\tChallenges Arena Mobile Gaming Service on Progressive Web App(PWA) by M/s Onmobile Global Ltd + \n"
					+ "\tLystn music services provided by M/s Tellyfonic Digital Media + Lokdhun+ Zing + Astrotell and GameOn \n"
					+ "\tservices by M/s Ubarri Marketing Private Limited + GAMEIUM premium gaming application by M/s ADVYSORS INC");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 788:
			System.out.println("\t₹788		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	180 Days\n"
					+ "\tUnlimited data with speed reduced to 40 kbps after 2GB/day");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 797:
			System.out.println("\t₹797		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	300 Days\n"
					+ "\tUnlimited Voice calls Local/STD/roaming incl.MTNL network for 60days + Unlimited Data with speed\n"
					+ "\treduced to 40 kbps after 2 GB/day for 60days + 100 SMS/day for 60days. Freebies valid for first 60 days \n"
					+ "\tonly. Plan validity is 300 days");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 895:
			System.out.println("\t₹895		Validity:\n"
					+ "\t     		1 Day\n"
					+ "\tInternational Roaming STV for Bhutan. (This pack is valid for roaming into \n"
					+ "\tnetwork of M/s B Mobile in Bhutan.). Free Data/ Data Charges:- 200MB \n"
					+ "\tafter free data to be charged at Rs.1.3/MB.Free Voice/ Voice charges:-40 \n"
					+ "\tFree Mins to India and local outgoing and incoming.30 Free SMSs.call \n"
					+ "\tback to India(Rs/min):- Rs 10.4/min.Outgoing Local call (Rs/min):- Rs \n"
					+ "\t10.4/min.Outgoing International (Rs/min): Rs 54.6/min.Incoming call \n"
					+ "\t(Rs/min):- Rs 4.1/min.Outgoing SMS (Rs/SMS):-Rs 2/SMS.To avail International \n"
					+ "\tRoaming services it is is mandatory to replace Normal SIM with International \n"
					+ "\tRoaming SIM and recharge of IR STV 57 or 167.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 898:
			System.out.println("\t₹898		Validity:\n"
					+ "\t     		3 Days\n"
					+ "\tRoaming STV for UAE.120min Mobile Originated Call(Local).60min Mobile \n"
					+ "\tOriginated Call to India. 50min Mobile Terminated Call.Data 250MB. To avail \n"
					+ "\tInternational Roaming services it is is mandatory to replace Normal SIM \n"
					+ "\twith International Roaming SIM and recharge of IR STV 57 or 167.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 997:
			System.out.println("\t₹997		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	160 Days\n"
					+ "\tUnlimited voice (Local/STD) (on-net/off-net) in Home LSA and national roaming incl. Mumbai and Delhi\n"
					+ "\t + Unlimited Data speed reduced to 40kbps after 2GB/day + 100 SMS/day to Any N/w Including while \n"
					+ "\tRoaming in Mumbai and New Delhi for 160 days. PRBT for 2 months. Charges after freebies are as follows: \n"
					+ "\tVoice call: Local 2p/sec.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 999:
			System.out.println("\t₹999		Validity:\n"
					+ "\t     		200 Days\n"
					+ "\tUnlimited voice Local/STD calls any net in Home LSA and national roaming including MTNL network \n"
					+ "\tin Mumbai and Delhi for 200 days + PRBT for 2 months. Charges after freebies are as follows:\n"
					+ "\t Voice call charges: Local calls Rs 1/min, STD calls Rs 1.3/min Video Calls : Local/STD:- Rs 2/min SMS: \n"
					+ "\tLocal 80p/SMS, National: Rs 1.20/SMS International: Rs 5/SMS Data Charges 25p/MB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1000:
			System.out.println("\t₹1,000		Talktime:\n"
					+ "\t     		₹844.46\n"
					+ "\tTalk Value:  844.46");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1100:
			System.out.println("\t₹1,100		Talktime:\n"
					+ "\t     		₹1,100\n"
					+ "\tFull Talk value offer equal to Rs.1,100");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1198:
			System.out.println("\t₹1198		Data:			Validity:\n"
					+ "\t     		36 GB 			365 Days\n"
					+ "\t300min any-net voice calls in Home LSA national roaming including MTNL area of Mumbai and Delhi+3GB \n"
					+ "\tData+30SMS) per month for 12 months/ 365days.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1199:
			System.out.println("\t₹1999		Data:			Validity:\n"
					+ "\t     		Unlimited 		365 Days\n"
					+ "\t600GB (regular) Data at high speed (Post which unlimited @ 40 Kbps) + U/ L voice + 100SMS/day + \n"
					+ "\tFree PRBT with unlimited song change option(30 days) + Lokdhun content (30 days) + EROS NOW Entertainment \n"
					+ "\tService. (30 days). Charges after freebies are as follows: Voice call charges: Local calls Rs 1/min, \n"
					+ "\tSTD calls Rs 1.3/min Video Calls: Local/STD:- Rs 2/min SMS: Local 80p/SMS, National: Rs 1.20/SMS \n"
					+ "\tInternational: Rs 5/SMS Data Charges 25p/MB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1359:
			System.out.println("\t₹1,359		Validity:\n"
					+ "\t     		3 Days\n"
					+ "\tSTV for Prepaid International Roaming.60min Mobile Originated \n"
					+ "\tCall (Local).30min Mobile Originated Call to India.30min Mobile Terminated \n"
					+ "\tCall.Data 100MB.To avail International Roaming services it is is mandatory \n"
					+ "\tto replace Normal SIM with International Roaming SIM and recharge of IR \n"
					+ "\tSTV 57 or 167.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1379:
			System.out.println("\t₹1,379		Validity:\n"
					 + "\t     	 	7 Days\n"
					 + "\tInternational Roaming STV for Singapore(M/s StarHub in Singapore).Free \n"
					 + "\tData/Data Charges 500MB after free Data to be charged at Rs.0.5/ \n"
					 + "\tMB.Free Voice charges 140 mins of International Roaming calls which \n"
					 + "\tinclude.Outgoing local calls and calls back to India and Incoming Calls \n"
					 + "\tonly.Call back to India(Rs/min):- Rs 10.90/min.Outgoing Local call (Rs/ \n"
					 + "\tmin): Rs 4.6/min.Outgoing International (Rs/min): Rs 52.8/min.Incoming \n"
					 + "\tcall (Rs/min):- Rs 2/min.Outgoing SMS (Rs/SMS):-Rs 2/SMS. To avail \n"
					 + "\tInternational Roaming services it is mandatory to replace Normal SIM \n"
					 + "\twith International Roaming SIM and recharge of IR STV 57 or 167.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1499:
			System.out.println("\t₹1499		Data:			Validity:\n"
					+ "\t     		24 GB 			326 Days\n"
					+ "\tUnlimited free voice calls in home and national roaming including MTNL network roaming area of Delhi \n"
					+ "\tand Mumbai. The 100 Free SMS/daywill be applicable in home and national roaming including MTNL network \n"
					+ "\troaming area of Delhi and Mumbai.Base plan/All other tariff terms and Conditions as per Advance Per \n"
					+ "\tminute plan 94.Free data 24GB.Charges after freebies are as follows: Voice call charges: Local calls \n"
					+ "\tRs 1/min, STD calls Rs 1.3/min Video Calls : Local/STD:- Rs 2/min SMS: Local 80p/SMS, National: \n"
					+ "\tRs 1.20/ SMS International: Rs 5/SMS Data Charges 25p/MB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1515:
			System.out.println("\t₹1,515		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	365 Days\n"
					+ "\tUnlimited Data with speed reduced to 40/kbps after 2GB/day");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1999:
			System.out.println("\t₹1999		Data:			Validity:\n"
					+ "\t     		Unlimited 		365 Days\n"
					+ "\t600GB (regular) Data at high speed (Post which unlimited @ 40 Kbps) + U/ L voice + 100SMS/day + \n"
					+ "\tFree PRBT with unlimited song change option(30 days) + Lokdhun content (30 days) + EROS NOW Entertainment \n"
					+ "\tService. (30 days). Charges after freebies are as follows: Voice call charges: Local calls Rs 1/min, \n"
					+ "\tSTD calls Rs 1.3/min Video Calls: Local/STD:- Rs 2/min SMS: Local 80p/SMS, National: Rs 1.20/SMS \n"
					+ "\tInternational: Rs 5/SMS Data Charges 25p/MB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2000:
			System.out.println("\t₹2,000		Talktime:\n"
					+ "\t     		₹2,000\n"
					+ "\tFull Talk value offer equal to Rs.2,000");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2199:
			System.out.println("\t₹2,199		Validity:\n"
					 + "\t     		7 Days\n"
					 + "\tRoaming STV for UAE.200min Mobile Originated Call(Local).200min Mobile \n"
					 + "\tOriginated Call to India. 120 min Mobile Terminated Call.Data 1000MB.To avail \n"
					 + "\tInternational Roaming services it is is mandatory to replace Normal SIM with \n"
					 + "\tInternational Roaming SIM and recharge of IR STV 57 or 167.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2311:
			System.out.println("\t₹2,311		Validity:\n"
					 + "\t     		28 Days\n"
					 + "\tInternational roaming calls which includes outgoing/incoming local calls and calls\n"
					 + "\tback to India only: 200mins.Calls back to India @ Rs.10.90/ min.Outgoing local call \n"
					 + "\t@ Rs.4.6/min.Outgoing International call @ Rs.52.8/ min.Incoming call @ Rs.2/min.Outgoing \n"
					 + "\tSMS @ Rs.2/SMS. Free data 2GB.Data Charges beyond free Data@ Rs0.5/MB.To avail \n"
					 + "\tInternational Roaming services it is is mandatory to replace Normal SIM with International \n"
					 + "\tRoaming SIM and recharge of IR STV 57 or 167.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2399:
			System.out.println("\t₹2399		Data:			Validity:\n"
					+ "\t     		Unlimited(2GB/day) 	395 Days\n"
					+ "\tUnlimited voice Local/STD calls any net in Home LSA and national roaming incl. MTNL network in Mumbai \n"
					+ "\tand Delhi + Unlimited data (speed reduced to 40 kbps after 2GB/day) + 100 SMS/day including MTNL area \n"
					+ "\tMumbai and Delhi + Free PRBT for 30 days + Free EROS Now entertainment services for 30days+Lokdhun for 30 \n"
					+ "\tdaysCharges after freebies are as follows: Voice call charges: Local calls Rs 1/min, STD calls Rs 1.3/min \n"
					+ "\tVideo Calls : Local/ STD:- Rs 2/min SMS: Local 80p/SMS, National: Rs 1.20/SMS International: Rs 5/SMS \n"
					+ "\tData Charges 25p/MB.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
		
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2875:
			System.out.println("\t₹2,875		Validity:\n"
					 + "\t     		7 Days\n"
					 + "\tInternational Roaming STV for Mauritus. (This pack is valid for roaming into network \n"
					 + "\tof M/s MTML in Mauritus).Free Data/ Data Charges:-1GB (after free Data to be charged at \n"
					 + "\tRs.0.65/MB.Free Voice/ Voice charges:100 Free Mins to India and local outgoing and incoming.50\n"
					 + "\tFree SMSs.call back to India(Rs/min): Rs 15.6/min.Outgoing Local call (Rs/min): Rs 5.2/ \n"
					 + "\tmin.Outgoing International (Rs/min):Rs 52/min.Incoming call (Rs/min):Rs 11/min.Free SMS \n"
					 + "\t50.Outgoing SMS (Rs/SMS):-Rs 3.9/SMS.To avail International Roaming services it is is \n"
					 + "\tmandatory to replace Normal SIM with International Roaming SIM and recharge of IR STV 570r167\n");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2895:
			System.out.println("\t₹2,895		Validity:\n"
					 + "\t     		7 Days\n"
					 + "\tInternational Roaming STV for Bhutan. (This pack is valid for roaming into network of \n"
					 + "\tM/s B Mobile in Bhutan.).Free Data/ Data Charges:500MB after free data to be charged at \n"
					 + "\tRs.1.3/MB.Free Voice/ Voice charges:175 Free Mins to India and LOCAL outgoing and \n"
					 + "\tincoming.50 Free SMSs.call back to India(Rs/min):Rs 10.4/min.Outgoing Local call (Rs/min): \n"
					 + "\tRs 10.4/ min.Outgoing International (Rs/min):-Rs 54.6/min.Incoming call (Rs/ min):Rs \n"
					 + "\t4.1/min.Outgoing SMS (Rs/SMS):-Rs 2/SMS.To avail International Roaming services it is is \n"
					 + "\tmandatory to replace Normal SIM with International Roaming SIM and recharge of IR STV 570r167");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2999:
			System.out.println("\t₹2999		Data:			Validity:\n"
					+ "\t     		Unlimited(3GB/day) 	395 Days\n"
					+ "\tUnlimited voice Local/STD calls any net in Home LSA and national roaming incl. MTNL network in Mumbai \n"
					+ "\tand Delhi + Unlimited data (speed reduced to 40 kbps after 2GB/day) + 100 SMS/day including MTNL area \n"
					+ "\tMumbai and Delhi + Free PRBT for 30 days + Free EROS Now entertainment services for 30days+Lokdhun for \n"
					+ "\t30 daysCharges after freebies are as follows: Voice call charges: Local calls Rs 1/min, STD calls \n"
					+ "\tRs 1.3/min Video Calls : Local/ STD:- Rs 2/min SMS: Local 80p/SMS, National: Rs 1.20/SMS International: \n"
					+ "\tRs 5/SMS Data Charges 25p/MB.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 3495:
			System.out.println("\t₹3,495		Validity:\n"
					 + "\t     		7 Days\n"
					 + "\tSTV for Prepaid International Roaming.100min Mobile Originated Call (Local). 100min Mobile \n"
					 + "\tOriginated Call to India. 100min Mobile Terminated Call.Data 500MB.Please activate IR STV 57 \n"
					 + "\tbefore activation of this STV for enabling International Roaming facility.To avail International \n"
					 + "\tRoaming services it is is mandatory to replace Normal SIM with International Roaming SIM and recharge \n"
					 + "\tof IR STV 57 or 167.");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 3905:
			System.out.println("\t₹3,905		Validity:\n"
					 + "\t     		28 Days\n"
					 + "\tFree Data/Data Charges: 1.5GB/after freebies data to be charged @ Rs.0.65/MB.Free Voice/Voice \n"
					 + "\tCharges: 140 Free mins to India/Local outgoing and incoming and 50 sms free.Outgoing SMS charges \n"
					 + "\tbeyond free SMS @ Rs.3.9/SMS./-Call back to India (Rs./Min):-Rs.15.6/min.-Outgoing Local Call (Rs./Min): \n"
					 + "\tRs.5.2/min.-Outgoing International (Rs./Min):-Rs.52/ min.-Incoming call (Rs./Min):-Rs.11/min.-Outgoing \n"
					 + "\tSMS (Rs./SMS) :Rs.3.9/ SMS.To avail International Roaming services it is is mandatory to replace Normal \n"
					 + "\tSIM with International Roaming SIM and recharge of IR STV 57or167");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 4865:
			System.out.println("\t₹4,865		Validity:\n"
					 + "\t     		28 Days\n"
					 + "\tInternational Roaming STV for Bhutan. (This pack is valid for roaming into network \n"
					 + "\tof M/s B Mobile in Bhutan.).Free Data/ Data Charges 1GB after:free Data to be charged \n"
					 + "\tat Rs.1.3/MB.Free Voice/ Voice charges:-260 Free Mins to India and local outgoing and incoming.\n"
					 + "\t100 Free SMSs.call back to India(Rs/min):Rs 10.4/min.Outgoing Local call (Rs/min):Rs 10.4/ \n"
					 + "\tmin.Outgoing International (Rs/min): Rs 54.6/min.Incoming call (Rs/min):Rs 4.1/min.Outgoing SMS \n"
					 + "\t(Rs/SMS):-Rs2/SMS.To avail International Roaming services it is is mandatory to replace Normal \n"
					 + "\tSIM with International Roaming SIM and recharge of IR STV 570r167");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 5000:
			System.out.println("\t₹5,000		Talktime:\n"
					+ "\t     		₹5,000\n"
					+ "\tFull Talk value offer equal to Rs.5,000");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		default:
			System.out.println("Your Reacharge Amount : "+Variables.getPlanAmount());
			System.out.println("\t--------------------------------------------------------------------------------------------\n");
			break;
			
	}

	}
}	



