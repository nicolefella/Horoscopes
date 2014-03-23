//CS201 Assignment 1 Part 2
//Nicole Fella

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
* GUI element that displays text
**/
public class HoroscopeDisplay extends JPanel implements ActionListener
{
	HoroscopeEngine chosenHoroscope;
	JTextArea horoscopeArea;

	public HoroscopeDisplay(HoroscopeEngine horoscopeParameter, String horoscopeName)
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
}