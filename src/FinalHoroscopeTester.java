//CS201 Assignment 1 Part 1g
//Nicole Fella

/** 
* Final Horoscope Tester Modification
* used to test MadoscopeEngine if arg passed through 
**/

public class FinalHoroscopeTester
{
	//testing through main method
	public static void main(String[] args)
	{
		//declare variable for HoroscopeEngine object
		HoroscopeEngine myHoroscope;

		//if there are no arguments passed, default to NumberscopeEngine
		if (args.length == 0)
			myHoroscope = new NumberscopeEngine();

		//otherwise, test MadoscopeEngine
		else
			myHoroscope = new MadoscopeEngine();
		
		//test Horoscope
		System.out.println(myHoroscope.getHoroscope());
	}
}