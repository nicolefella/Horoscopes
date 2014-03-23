//CS201 Assignment1 Part2
//Nicole Fella

import javax.swing.JFrame;
import java.awt.GridLayout;

public class HoroscopeGUI
{
	public static void main(String[] args)	
	{
		//create JFrame for HoroscopeDisplay panels to go into
		JFrame horoscopeFrame = new JFrame();

		//create frame size
		horoscopeFrame.setSize(800,200);

		//set layout so horoscopes are layed out in a vertical fashion
		horoscopeFrame.setLayout(new GridLayout(3,1));

		//add horoscope panels using HoroscopeDisplay class
		horoscopeFrame.add(new HoroscopeDisplay(new NumberscopeEngine(), "Numberscope"));
		horoscopeFrame.add(new HoroscopeDisplay(new MohoscopeEngine(), "Mohoscope"));
		horoscopeFrame.add(new HoroscopeDisplay(new MadoscopeEngine(), "Madoscope"));
		
		//make horoscope visible
		horoscopeFrame.setVisible(true);
	}
}