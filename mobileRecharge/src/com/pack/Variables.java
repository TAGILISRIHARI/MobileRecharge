package com.pack;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.ArrayList;
import java.util.Collections;


public class Variables //ClassA
{
	 static public int userOption;
	
	 static private long mobileNumber;
	 static private long  upiNumber;
	 static private long creditCardNumber;
	 static private long debitCardNumber;
	 static private int cvv;
	 static private int monthOfCard;
	 static private int yearOFCard; 
	 static private int planAmount;
	 static private String upiPlatform;
	 
	 static public String operator;

	 
	 LocalDateTime myDateObj = LocalDateTime.now();
	 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//	 curennt system date and time
	 String formattedDate = myDateObj.format(myFormatObj);
//	 current month type int
	 int currentMonth = myDateObj.getMonthValue();
//	 current year format [YY]
	 int currentYear = (myDateObj.getYear()%100);


	public static String getOperator() {
		return operator;
	}

	public static void setOperator(String operator) {
		Variables.operator = operator;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		Variables.mobileNumber = mobileNumber;
	}

	public long getUpiNumber() {
		return upiNumber;
	}

	public void setUpiNumber(long upiNumber) {
		Variables.upiNumber = upiNumber;
	}

	public static long getCreditCardNumber() {
		return creditCardNumber;
	}

	public static void setCreditCardNumber(long creditCardNumber) {
		Variables.creditCardNumber = creditCardNumber;
	}

	public static int getCvv() {
		return cvv;
	}

	public static void setCvv(int cvv) {
		Variables.cvv = cvv;
	}

	public static int getMonthOfCard() {
		return monthOfCard;
	}

	public static void setMonthOfCard(int monthOfCard) {
		Variables.monthOfCard = monthOfCard;
	}

	public static long getDebitCardNumber() {
		return debitCardNumber;
	}

	public static void setDebitCardNumber(long debitCardNumber) {
		Variables.debitCardNumber = debitCardNumber;
	}

	public static int getYearOFCard() {
		return yearOFCard;
	}

	public static void setYearOFCard(int yearOFCard) {
		Variables.yearOFCard = yearOFCard;
	}

	public static int getPlanAmount() {
		return planAmount;
	}

	public static void setPlanAmount(int planAmount) {
		Variables.planAmount = planAmount;
	}

	public static int getUserOption() {
		return userOption;
	}

	public static void setUserOption(int userOption) {
		Variables.userOption = userOption;
	}

	
	public static String getUpiPlatform() {
		return upiPlatform;
	}

	public static void setUpiPlatform(String upiPlatform) {
		Variables.upiPlatform = upiPlatform;
	}

	static public ArrayList<Integer> allSimRechargePlans(String s)
	{
		ArrayList<Integer> rechargePlansAirtel= new ArrayList<Integer>();
		ArrayList<Integer> rechargePlansJio   = new ArrayList<Integer>();
		ArrayList<Integer> rechargePlansBSNL  = new ArrayList<Integer>();
		ArrayList<Integer> rechargePlansVi    = new ArrayList<Integer>();
		
		ArrayList<Integer> noPlan = new ArrayList<Integer>();
		noPlan.add(0);
		
		switch (s)
			{
			case "Airtel":
				Collections.addAll(rechargePlansAirtel,10, 19, 20, 29, 49, 58, 65, 98, 99, 100, 118, 148, 148, 149, 155, 179, 181,209, 239, 296, 299, 301, 319, 359, 399, 455, 479, 499, 500,519, 549, 649, 666, 699, 719, 755, 756, 779, 839, 899, 999, 1000, 1799, 2997, 2998, 2999, 3359, 5000);
				return rechargePlansAirtel;
				
			case "Jio":
				Collections.addAll(rechargePlansJio, 10, 15, 19, 20, 25, 26, 29, 50, 61, 62, 75, 86, 91, 100, 121, 122, 123, 125, 149, 152, 179, 181, 182, 186, 199, 219, 222, 223, 239, 241, 249, 259, 269, 296, 299, 301, 328, 349, 388, 399, 444, 479, 499, 501, 529, 533, 589, 598, 666, 667, 719, 739, 749, 758, 789, 805, 806, 808, 895, 909, 999, 1000, 1099, 1101, 1102, 1234, 1499, 2499, 2545, 2999, 3178, 3225, 3226,3327, 3662, 4999);
				return rechargePlansJio;
				
			case "BSNL":
				Collections.addAll(rechargePlansBSNL, 10, 16, 18, 19, 20, 23, 30, 31, 35, 36, 37,48, 49, 50, 57, 65, 73, 87, 94, 97, 98, 99, 100, 105, 107, 118, 120, 139, 147, 150, 151, 153, 167, 181, 184, 185, 186, 187,197, 198, 199,200, 201, 209, 220, 228, 229, 239, 247,251, 269, 279,  298, 299, 319, 347, 396, 397, 398, 399, 401, 411, 439, 485, 497, 499, 500, 511, 550, 599, 659, 666, 696, 705, 769, 788, 797, 895, 898, 997, 999, 1000, 1100, 1198, 1199, 1359, 1379, 1499, 1515, 1999, 2000, 2199, 2311, 2399, 2875, 2895, 2999, 3495, 3905, 4865, 5000);
				return rechargePlansBSNL;
				
			case "V!":
				Collections.addAll(rechargePlansVi, 10, 17, 19, 20, 24, 25, 27, 29, 30,  39, 49, 50, 57, 75, 82, 98, 99, 100, 108, 118,  151, 155, 181, 195, 198, 199, 204, 209, 219, 224, 232, 239, 269, 295, 296, 298, 299, 319, 329, 359, 368, 399, 409, 418, 459, 475, 479, 495, 499, 500, 537, 539, 599, 601, 666, 695, 699, 719, 755, 839, 901, 902, 903, 949, 995, 999, 1066, 1199, 1495, 1799, 2388, 2695, 2998, 2999, 3099, 3495, 4695, 5195, 6995);
				return rechargePlansVi;
			}
			
		return noPlan;
		
		
		
	}
		

}