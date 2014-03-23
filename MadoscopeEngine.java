//CS 201 Assignment 1 Part 1f
//Nicole Fella 

import java.util.StringTokenizer;

/**
* Implements HoroscopeEngine for MadoscopeEngine
* There will be 3 templates to choose from
* with placeholders where
* @ is for adjectives, # is for nouns, and % is for verbs
**/

public class MadoscopeEngine implements HoroscopeEngine
{
	//instance properties 
	
	//adjectives, nouns, and verbs below are courtesy of Chris Garry
	
	//list of possible adjectives to replace @
	String[] adjs = {"groovy", "flatulent", "dirty", "smelly"};
	//list of possible nouns to replace #
	String[] nouns = {"baby", "dungbeetle", "koala", "ukulele"};
	//list of possible verbs to replace %
	String[] verbs = {"slap", "kiss", "punch", "massage"};

	//list of possible templates
	String[] templates = {"Today is going to be a @ day. Be sure to % a #!", 
		"It looks like your # is going to %, making you feel @ today.", 
		"Today you will % a # and feel @!"};


	//method to pick one of 3 templates
	public String pickTemplate()
	{
		int rand = (int)(Math.random()*3);
		//set chosenTemplate  according to random number generated 
		String chosenTemplate = templates[rand];
		//return the template chosen
		return chosenTemplate;
	}

	//method to determine which adjectives, nouns and verbs to use
	public String[] pickMados()
	{
		//create an array of strings to store the mados into 
		String[] mados = new String[3];
		//randomly pick an adj mado, and store in first index of array
		mados[0] = adjs[(int)(Math.random()*4)];
		//randomly pick noun mado, and store in second index of array
		mados[1] = nouns[(int)(Math.random()*4)];
		//randomly pick verb mado, and store in third index of array'
		mados[2] = verbs[(int)(Math.random()*4)];
		//return mados string
		return mados;
	}

	//method getHoroscope
	public String getHoroscope()
	{
		//assign template by running method pickTemplate
		String template = pickTemplate();

		//assign mados by running method pickMados
		String[] mados = pickMados();

		//referenced http://docs.oracle.com/javase/7/docs/api/java/lang/String.html

		//check for index of @ symbol and replace with mados word
		int indexOfAdj = template.indexOf("@");
		template = template.substring(0, indexOfAdj) + mados[0] 
			+ template.substring(indexOfAdj+1, template.length());

		//check for index of # symbol and replace with mados word
		int indexOfNoun = template.indexOf("#");
		template = template.substring(0, indexOfNoun) + mados[1]
			+ template.substring(indexOfNoun+1, template.length());

		//check for index of % symbol and replace with mados word
		int indexOfVerb = template.indexOf("%"); 
		template = template.substring(0, indexOfVerb) + mados[2]
			+ template.substring(indexOfVerb+1, template.length());

		return template;

	}
}