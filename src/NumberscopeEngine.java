//CS 201 Assignment 1 Part 1b
//Nicole Fella

/** 
*implement HoroscopeEngine with new horoscope NumberscopeEngine
**/
public class NumberscopeEngine implements HoroscopeEngine
{
	//instance fields randOne and randTwo to be used later
	int randOne;
	int randTwo;

	//create parts of sentence to be used in concatinated String for horoscope
	String[] numberscopeArray = {"Today is the perfect day to spot ", 
		" falling leaves and ", " cups of coffee."};

	//initialize concatinated String
	String concatNumberscope = "";

	public String getHoroscope()
	{
		//randomize numbers between 0 and 10
		randOne = (int)(Math.random()*10);
		randTwo = (int)(Math.random()*10);

		//update concatinated String according to random numbers generated 
		concatNumberscope = numberscopeArray[0] + randOne 
			+ numberscopeArray[1] + randTwo + numberscopeArray[2];
		//return String to method
		return concatNumberscope;
	}
}
