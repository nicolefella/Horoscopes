//CS 201 Assignment 1 Part 2
//Nicole Fella

/** 
* This is the code for the Applet
**/

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JApplet;

public class HoroscopeApplet extends JApplet implements ActionListener
{
	HoroscopeEngine chosenHoroscope;
	JTextArea horoscopeArea;


	public HoroscopeApplet(HoroscopeEngine horoscopeParameter, String horoscopeName)
	{
		//assign parameter input to chosentHoroscope
		chosenHoroscope = horoscopeParameter;
		
		//create BorderLayout to hold the horoscope text area and the button to get the horoscope
		setLayout(new BorderLayout());
		add(createHoroscopeArea(), "Center");
		add(createHoroscopeButton(horoscopeName), "South");
	}

	public JTextArea createHoroscopeArea()
	{
		//instantiate JTextArea
		horoscopeArea = new JTextArea();
		return horoscopeArea;
	}

	public JButton createHoroscopeButton(String horoscopeButtonName)
	{
		//create a button with text "What's my __(type of horoscope)___?"
		JButton horoscopeButton = new JButton("What's my " + horoscopeButtonName + "?");

		//add action listener to this button
		horoscopeButton.addActionListener( this );

		//return the button 
		return horoscopeButton;
	}

	//this function is performed when the button is clicked
	public void actionPerformed(ActionEvent e)
	{
		//create string representation of horoscope
		String horoscope = chosenHoroscope.getHoroscope();
		//display string representaiton of horoscope 
		horoscopeArea.setText(horoscope);
	}
}//end of applet code.

//will be creating a .html file
//referenced this website to see if I could upload applet that way
//http://stackoverflow.com/questions/9921268/how-to-run-a-java-applet-in-web-browser

//I also tried looking at the source code on the link for the finished product from the assignment page
//I updated the html file to include code nearly identical to that

//Using Java API to create a .jar file to try embedding that into the html file
//http://docs.oracle.com/javase/tutorial/deployment/jar/build.html
//After, what seemed to be a successful, creation of .jar file --> applet would still not load through html file
