package com.pack;

import java.util.ArrayList;

public class VerifyPlan extends PaymentOptions
{		
		//Methodover Loading
		//after printing the plan this method is called to procedd for payments
		public void verifyPlanValidOrNot() throws Exception
		{
			super.allPaymentOption();
		}
		
		//verifying is plan is valid or not
		public void verifyPlanValidOrNot(int count)  throws Exception
		{
			String operator = Variables.getOperator();
			
			if(count<3)
			{
				System.out.println("\n\tDisclaimer: We support most types of recharges, but please check with your operator before you proceed");

				int planAmount = GetUserOptionForSwitchCase.gettingPlanAmount();
				
				ArrayList<Integer> planList = new ArrayList<Integer>();
				
				//based on the operator you selected in starting, the operator packs prizes only will store in planList
				switch(operator)
				{
				case "Airtel":
					planList.addAll(Variables.allSimRechargePlans(operator));
					break;
				case "Jio":
					planList.addAll(Variables.allSimRechargePlans(operator));
					break;
				case "BSNL":
					planList.addAll(Variables.allSimRechargePlans(operator));
					break;
				case "V!":
					planList.addAll(Variables.allSimRechargePlans(operator));
					break;
				default:
					System.out.println("\t-------------------------------------------------------");
					System.out.println("\tSomething went wrong redirecting to main page");
					MainClass.startingPoint();
				
				}
				//count is for checking if user entering correct of no , if enters wrong plan 3 times then he cannot proceed further 
				//he will be redirect back
					if(planList.contains((Object)planAmount))
					{
						System.out.println("\t--------------------------------------------------------------------------------------------\n");
						System.out.print("\tVerifying Plan ");
						Thread.sleep(1000);
						System.out.print("⌛");
						Thread.sleep(500);
						System.out.print("⏳");
						Thread.sleep(500);
						System.out.print("⌛");
						Thread.sleep(1000);
						System.out.print("⏳\n");
						
						switch (operator) 
						{
						case "Airtel":
							new PrintAirtelSelectedPack().printingAirtelPack();
							break;
						case "Jio":
							new PrintJioSelectedPack().printingJioPack();
							break;
						case "BSNL":
							new PrintBSNLSelectedPack().printingBSNLPack();
							break;
						case "V!":
							new PrintViSelectedPack().printingViPack();
							break;
						default:
							System.out.println("\t-------------------------------------------------------");
							System.out.println("Something went wrong redirecting to main page");
							MainClass.startingPoint();
						}
						
					}
					else
					{
						
						count++;//count increasing ,when it is count=2 you will be redirected to respective operator details
						System.out.println("\t--------------------------------------------------------------------------------------------\n");
						System.out.print("\tVerifying Plan ");
						Thread.sleep(1000);
						System.out.print("⌛");
						Thread.sleep(500);
						System.out.print("⏳");
						Thread.sleep(500);
						System.out.print("⌛");
						Thread.sleep(1000);
						System.out.print("⏳\n");
						System.out.println("\t-------------------------------------------------------");
						System.out.println("\tPlan is not valid");
						this.verifyPlanValidOrNot(count);
						
					}
				
			}
			//if user enter 3 wrong attemps then he will redirect to its respective operator pack
			else
			{
				System.out.println("\n\t=========================================================================");
				System.out.println("\tYour have entered maximum number of wrong attempts, Redirecting back");
				System.out.println("\t===========================================================================");
				switch (operator)
				{
				case "Airtel":
					new Airtel().getRechargePacksAirtel();
					break;
				case "Jio":
					new Jio().getRechargePacksJio();
					break;
				case "BSNL":
					new BSNL().getRechargePacksBSNL();
					break;
				case "V!":
					new Vi().getRechargePacksVi();
					break;
				default:
					new SelectSim().selectingSim();
					break;
					
				}
			}
			
			
		
			
		
		
		}
		
	
	
	

}
