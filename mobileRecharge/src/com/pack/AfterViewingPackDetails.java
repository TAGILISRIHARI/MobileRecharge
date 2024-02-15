package com.pack;

public class AfterViewingPackDetails 
{
//	method to procced after seeing all packs
	static public void getOptionFromUser() throws Exception
	{
		System.out.println("\t--------------------------------------------------------------------------------------------\n");
		System.out.println("\t\t\t\t======> Confrim Your Recharge Plan to Proceed  <======\n");

		System.out.println("\t---------------------------------------------------------------------------------------------");
		System.out.println("\n\t1.Select Your Plan Amount\n"
				+ "\t2.Get All Pack Details List\n"
				+ "\t3.Change Operator\n"
				+ "\t4.Go Back to Main Menu\n"
				+ "\t5.Exit\n");
		
//		Calling a method to get number that method return type is int and stores in variable userIput
		int userOption = GetUserOptionForSwitchCase.gettingOption();
		
		switch (userOption)
		{
		case 1:
//			if user select option 1  calls to verifyPlanValidOrNot() method
			new VerifyPlan().verifyPlanValidOrNot(0);
			break;
		case 2:
//			User selects option 2 then based on what he selected his operator type returns their
			String operator = Variables.getOperator().toLowerCase();
			
			switch(operator)
			{
			case "airtel":
				new Airtel().getRechargePacksAirtel();
				break;
			case "jio":
				new Jio().getRechargePacksJio();
				break;
			case "bsnl":
				new BSNL().getRechargePacksBSNL();
				break;
			case "v!":
				new Vi().getRechargePacksVi();
				break;
			default:
				System.out.println("\t-------------------------------------------------------");
				System.out.println("\n\t1.Unknow Error occured you have been redirecting to Main Page\n");
				MainClass.startingPoint();
				break;
			}
			break;
		case 3:
//			Change Operator
			new SelectSim().selectingSim();
			break;
		case 4:
//			Go Back to Main Menu
			MainClass.startingPoint();
			break;
		case 5:
//			Exit
			printExitMeassage.userExitedWasDone();
			break;
		default:
//			Other than above options again caling same method
			System.out.println("\t-------------------------------------------------------");
			System.out.println("\tSelect a valid option \n");
			getOptionFromUser();
			break;
			
		}
		
	}

}
