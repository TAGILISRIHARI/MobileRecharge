package com.pack;

public abstract class printExitMeassage 
{
	//if a method is abstarct then the class should be abstarct if no we get C.E
	//their is not compularsy of having atleast one abstarct method in abstract class
	//abstarct class can have both normal methods and abstarct methods
	//we connot we create object for abstarct classes, if we want to do it should be done in next class [child class for abstarct class]
	//if a class inheriting abstrcat class it should provide abstaract method implementation body 
	static public void  userExitedWasDone()
	{
		System.out.println("\n\t=================================================================");
		System.out.println("\t\t\t         Exit was Successfull");
		System.out.println("\t\t\t           Java is awesome");
		System.out.println("\t=================================================================");
		
	}

}
