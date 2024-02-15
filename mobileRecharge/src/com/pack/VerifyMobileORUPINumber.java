package com.pack;

public class VerifyMobileORUPINumber 
{
	static public int countMobileNumber(long num)
	{
		int count =0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	
	static public int countCardNumber(long num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count; 
	}
	static public int countCardTwoNumber(int num)
	{
		int count = 0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
}
