package com.pack;

public class GetRandomNumber 
{
	static public int getSixdigitOTP()
	{
		int upper = 111111;
		int lower = 999999;
		int range = (upper-lower)+1;
		
		int otp = (int)(Math.random()*range)+lower;
			
		return otp;	
	}
	
	static public long getRefNo()
	{
		long upper = 111111111111L;
		long lower = 999999999999L;
		long range = (upper-lower)+1;
		long refNo = (long)(Math.random()*range)+lower;
		return refNo;
	}
	static public long getTransId()
	{
		long upper = 111111111L;
		long lower = 999999999L;
		long range = (upper-lower)+1;
		long transID = (long)(Math.random()*range)+lower;
		return transID;
	}

}
