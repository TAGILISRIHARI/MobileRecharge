package com.pack;

public class PrintAirtelSelectedPack
{
	public void printingAirtelPack() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		System.out.println("\t\t\t\t======>  Your Pack Details  <======");
		System.out.println("\t\t\t\t======>       Airtel        <======");
		System.out.println("\t--------------------------------------------------------------------------------------------\n");

		int packAmout = Variables.getPlanAmount();
		switch(packAmout)
		{
		case 10:
			System.out.println("\t₹10		Talktime:\n"
					 + "\t     		₹7.47\n"
					 + "\tTalktime : 7.47");
			System.out.println("\t--------------------------------------------------------------------------------------------");

			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 19:
			System.out.println("\t₹19		Data:			Validity:\n"
					 + "\t     		1.0 GB per day		1 Day\n"
					 + "\tData : 1GB \n"
					 + "\tValidity: 1 day");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 20:
			System.out.println("\t₹20		Talktime:\n"
					 + "\t     		₹14.95\n"
					 + "\tTalktime : 14.95");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 29:
			System.out.println("\t₹29		Data:			Validity:\n"
					 + "\t     		2.0 GB per pack		1 Day\n"
					 + "\tData : 2GB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 49:
			System.out.println("\t₹49		Data:			Validity:\n"
					 + "\t     		6.0 GB per pack		1 Day\n"
					 + "\tData : 6GB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 58:
			System.out.println("\t₹58		Data:\n"
					 + "\t     		3.0 GB per pack\n"
					 + "\tData : 3GB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 65:
			System.out.println("\t₹65		Data:\n"
					 + "\t     		4.0 GB per pack\n"
					 + "\tData : 4GB \n"
					 + "\tValidity : Till your exiting pack");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 98:
			System.out.println("\t₹98		Data:\n"
					 + "\t     		5.0 GB per pack\n"
					 + "\tData : 5.0 GB \n"
					 + "\tValidity  : Current Pack valadity\n"
					 + "\tDetails   : Wynk Premium subscription for 30days\n"
					 + "\tAdditional Benefits :Wynk Music Premium" );
			System.out.println("\t--------------------------------------------------------------------------------------------");
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 99:
			System.out.println("\t₹99		Validity:\n"
					 + "\t     		2 Day\n"
					 + "\tData : Unlimited");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 100:
			System.out.println("\t₹100		Talktime:\n"
					 + "\t     		₹81.75\n"
					 + "\tTalktime : 81.75");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 118:
			System.out.println("\t₹118		Data:\n"
					 + "\t     		12.0 GB per pack\n"
					 + "\tData : 12GB");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 148:
			System.out.println("\t₹148		Data:\n"
					 + "\t     		15.0 GB per pack\n"
					 + "\tData : 15.0 GB \n"
					 + "\tValidity  : Till Your existing pack\n"
					 + "\tDetails   : Access to all 15+OTTs an Airtel Xstream Play(SonyLIV, Erosnow etc) for 28 days\n"
					 + "\tAdditional Benefits :Airtel Xstream Play" );
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 149:
			System.out.println("\t₹149		Data:\n"
					 + "\t     		1.0 GB per pack\n"
					 + "\tData : 1.0 GB \n"
					 + "\tDetails   : 15+ OTTs with Xstream Premium on Airtel Xstream App\n"
					 + "\tAdditional Benefits :Airtel Xstream Play" );
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 155:
			System.out.println("\t₹155		Data:			Validity:\n"
					 + "\t      		1.0 GB per pack		28 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 1GB \n"
					 + "\tSMS  : 300\n"
					 + "\tAdditional Benefits :Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 179:
			System.out.println("\t₹179		Data:			Validity:\n"
					 + "\t      		2.0 GB per pack		28 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 2GB \n"
					 + "\tSMS  : 300\n"
					 + "\tAdditional Benefits : Free Hellotunes,Wynk Music Free");
			System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator befor you proceed");

			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 181:
			System.out.println("\t₹181		Data:			Validity:\n"
					 + "\t     		1.0 GB per day		30 day\n"
					 + "\tData : 1GB/day");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 209:
			System.out.println("\t₹209		Data:			Validity:\n"
					 + "\t      		1.0 GB per pack		21 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 1GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 239:
			System.out.println("\t₹239		Data:			Validity:\n"
					 + "\t      		1.5 GB per pack		28 day\n"
					 + "\tCalls : Unlimited\n"
					 + "\tData : 1.5GB \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tValidity : 28 days\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 296:
			System.out.println("\t₹296		Data:			Validity:\n"
					 + "\t      		25.0 GB per pack		30 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 25GB \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 299:
			System.out.println("\t₹299		Data:			Validity:\n"
					 + "\t      		2.0 GB per day		28 days\n"
					 + "\tCalls : Unlimited\n"
					 + "\tData : 2GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tValidity : 28 days\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 301:
			System.out.println("\t₹301		Data:\n"
					 + "\t     		50.0 GB per pack\n"
					 + "\tData : 50GB \n"
					 + "\tValidity  : Current Pack validity\n"
					 + "\tDetails   :Wynk Premium subscription for 1Year\n"
					 + "\tAdditional Benefits :Wynk Music Premium" );
			System.out.println("\t--------------------------------------------------------------------------------------------");

			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 319:
			System.out.println("\t₹319		Data:			Validity:\n"
					 + "\t      		2.0 GB per day		1 month\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 2GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tValidity : 1 month\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay,Free Hellotunes,Wynk Music Free");
			System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator befor you proceed");

			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 359:
			System.out.println("\t₹359		Talktime:		Data:			Validity:\n"
					 + "\t    		₹5      		2.0 GB per day		1 month\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 3GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tTalktime : Rs.5\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 399:
			System.out.println("\t₹399		Data:			Validity:\n"
					 + "\t      		3.0 GB per day		28 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 3GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay,Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 455:
			System.out.println("\t₹455		Data:			Validity:\n"
					 + "\t      		6.0 GB per pack		84 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 6GB \n"
					 + "\tSMS  : 900\n"
					 + "\tDetails :Only Rs.152/month(approx)\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay,Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 479:
			System.out.println("\t₹479		Data:			Validity:\n"
					 + "\t      		1.5 GB per day		56 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 1.5GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 499:
			System.out.println("\t₹499		Data:			Validity:\n"
					 + "\t      		3.0 GB per day		28 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 3GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 500:
			System.out.println("\t₹500		Talktime:\n"
					 + "\t     		₹423.73\n"
					 + "\tTalktime : 423.73");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 519:
			System.out.println("\t₹519		Data:			Validity:\n"
					 + "\t      		1.5 GB per day		60 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming calls on any network in India\n"
					 + "\tData : 1.5GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay,Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 549:
			System.out.println("\t₹549		Data:			Validity:\n"
					 + "\t      		2.0 GB per day		56 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData : 2GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay,Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 649:
			System.out.println("\tInternational Roaming\n"
					+ "\t₹649		Validity:\n"
					 + "\t     		1 day\n"
					 + "\tDetails: 500 MB Data, 100mins IC+OG(Covers-US,Europe,Gulf & more -set1)\n"
					 + "\t         250 MB Data, 50 mins IC+OG(India + Local), 10 SMS(covers-Africa,Maldives &more-Set2)");
			System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator befor you proceed");

			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 666:
			System.out.println("\t₹666		Data:			Validity:\n"
					 + "\t      		1.5 GB per day		86 day\n"
					 + "\tCalls : Unlimited\n"
					 + "\tData : 1.5GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tValidity : 84 days\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstreamPlay,Apollo 24/7 Cricle, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 719:
			System.out.println("\t₹719		Data:			Validity:\n"
					 + "\t      		2.0 GB per day		84 day\n"
					 + "\tCalls : Unlimited\n"
					 + "\tData : 2GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 755:
			System.out.println("\tInternational Roaming\n"
					+ "\t₹755		Validity:\n"
					 + "\t     		5 day\n"
					 + "\tDetails: 1 GB Data(Covers-US,Europe,Gulf & more -set1)\n"
					 + "\t         500 MB Data(India + Local), 10 SMS(covers-Africa,Maldives &more-Set2)");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 756:
			System.out.println("\tInternational Roaming\n"
					+ "\t₹756		Validity:\n"
					 + "\t     		5 day\n"
					 + "\tDetails: 100mins IC+OG (India+Local), 20 SMS (Covers-US,Europe,Gulf & more -set1)\n"
					 + "\t         50mins IC+OG (India + Local), 10 SMS(covers-Africa,Maldives &more-Set2)");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 779:
			System.out.println("\t₹779		Data:			Validity:\n"
					 + "\t      		1.5 GB per day		90 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming calls on any network in India\n"
					 + "\tData : 2.5GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Apollo 24/7 Cricle, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 839:
			System.out.println("\t₹839		Data:			Validity:\n"
					 + "\t      		2.0 GB per day		84 day\n"
					 + "\tCalls : Unlimited calls local STD \n"
					 + "\tData : 2GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstremPlay, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 899:
			System.out.println("\tInternational Roaming\n"
					+ "\t₹899		Validity:\n"
					 + "\t     		10 day\n"
					 + "\tDetails: 1GB Data, 100mins IC+OG (India+Local), 20 SMS (Covers-US,Europe,Gulf & more -set1)\n"
					 + "\t         500 MB Data, 100mins IC+OG (India + Local), 10 SMS(covers-Africa,Maldives &more-Set2)");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 999:
			System.out.println("\t₹999		Data:			Validity:\n"
					 + "\t      		2.5 GB per day		84 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming  calls\n"
					 + "\tData : 2.5GB/day \n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Airtel XstremPlay, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1000:
			System.out.println("\t₹1,000		Talktime:\n"
					 + "\t     		₹847.46\n"
					 + "\tTalktime : 847.46");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 1799:
			System.out.println("\t₹1799		Data:			Validity:\n"
					 + "\t      		24 GB per pack		365 day\n"
					 + "\tCalls: Unlimited\n"
					 + "\tData : 24GB\n"
					 + "\tSMS  : 100SMS/day\n"
					 + "\tValidity: 365 days\n"
					 + "\tAdditional Benefits :Apollo 24/7 Cricle, Free Hellotunes");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2997:
			System.out.println("\tInternational Roaming\n"
					+ "\t₹2,997		Validity:\n"
					 + "\t     		365 day\n"
					 + "\tDetails: 2GB Data, 100mins IC+OG (India+Local), 20 SMS (Covers-US,Europe,Gulf & more -set1)\n"
					 + "\t         1 GB , 50mins IC+OG (India + Local), 10 SMS(covers-Africa,Maldives &more-Set2)");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2998:
			System.out.println("\tInternational Roaming\n"
					+ "\t₹2,998		Validity:\n"
					 + "\t     		30 day\n"
					 + "\tDetails: 5GB Data, 200mins IC+OG (India+Local), 20 SMS (Covers-US,Europe,Gulf & more -set1)\n"
					 + "\t         2.5 GB , 100mins IC+OG (India + Local), 10 SMS(covers-Africa,Maldives &more-Set2)");
			System.out.println("\t--------------------------------------------------------------------------------------------");
			
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 2999:
			System.out.println("\t₹2,999		Data:			Validity:\n"
					 + "\t      		2.0 GB per day		365 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming\n"
					 + "\tData : 2GB/day \n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Apollo 24/7 Cricle, Free Hellotunes,Wynk Music Free");
			System.out.println("\t--------------------------------------------------------------------------------------------");
	
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 3359:
			System.out.println("\t₹3359		Data:			Validity:\n"
					 + "\t     		2.5 GB per day		365 day\n"
					 + "\tCalls : Unlimited calls local STD & Roaming \n"
					 + "\tData  : 2.5GB/day\n"
					 + "\tSMS   : 100SMS/day\n"
					 + "\tAdditional Benefits :Unlimited 5G Data, Disney+Hotstar Mobile for 1 year, Apollo 24/7 Cricle" );
			System.out.println("\t--------------------------------------------------------------------------------------------");
	
			new VerifyPlan().verifyPlanValidOrNot();
			break;
		case 5000:
			System.out.println("\t₹5,000		Talktime:\n"
					 + "\t     		₹4,237.29\n"
					 + "\tTalktime : 4,237.29");
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
