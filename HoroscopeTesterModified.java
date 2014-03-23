//CS 201 Assignment 1 part 1e
//Nicole Fella

/** 
 * Modify Horoscope Tester to test MohoscopeEngine
 * take a single argument from command line to determine
 * which type of horoscope to generate
 **/


public class HoroscopeTesterModified
{
	//testing through main method
	public static void main(String[] args)
	{
		//declare variable for HoroscopeEngine object
		HoroscopeEngine myHoroscope;

		//if there are no arguments passed, default to NumberscopeEngine
		if (args.length == 0)
			myHoroscope = new NumberscopeEngine();

		//otherwise, test MohoscopeEngine
		else
			myHoroscope = new MohoscopeEngine();
		
		//test Horoscope
		System.out.println(myHoroscope.getHoroscope());
	}
}