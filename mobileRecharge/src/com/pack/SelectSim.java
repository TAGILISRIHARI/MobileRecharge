package com.pack;

public class SelectSim  extends Variables
{
	public void selectingSim() throws Exception
	{
		
		System.out.println("\t-------------------------------------------------------");
		System.out.println("\n\tSelect your SIM {operator} type \n"
				+ "\t1. Jio\n"
				+ "\t2. Airtel\n"
				+ "\t3. V!\n"
				+ "\t4. BSNL\n"
				+ "\t5. Change Mobile Number\n"
				+ "\t6. Exit\n");
		goToSelectedSim();
			
		
		
	}
	public void goToSelectedSim() throws Exception
	{
		
		int userOption = GetUserOptionForSwitchCase.gettingOption();
		switch (userOption)
		{
		case 2:
			setOperator("Airtel");
			new Airtel().getRechargePacksAirtel();
			break;
		case 1:
			setOperator("Jio");
			new Jio().getRechargePacksJio();
			break;
		case 4:
			setOperator("BSNL");
			new BSNL().getRechargePacksBSNL();
			break;
		case 3:
			setOperator("V!");
			new Vi().getRechargePacksVi();
			break;
		case 5:
			new MainClass().getMobileNumber(0);
			break;
		case 6:
			printExitMeassage.userExitedWasDone();
			break;
		default:
			System.out.println("\t-------------------------------------------------------");
			System.out.println("\tPlease Choose a valid option");
			selectingSim();
			break;
		}
	}

}
