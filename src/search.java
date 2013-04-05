import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;


public class search 
{
	static String path="Mobiles.txt";
	
	String file_name="Mobiles.txt";
	
	static JPanel displayresult = new JPanel(new SpringLayout());
	
	static String Phone_name;
	static String Phone_type;
	static String Operating_system;
	static int Price;
	static String Memory;
	static String Processor;
	static String Screen_size;
	static String Camera;
	
	
	static int Readlines() throws IOException
	{
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aline;
		int numberOfLines = 0;
		
		
		while ( ( aline = bf.readLine() ) != null ) 
		{
			numberOfLines++;
		}
		
		bf.close();
		return numberOfLines;
	}
	
	static void findme() throws IOException
	{
	FileReader fr = new FileReader(path);
	BufferedReader textreader = new BufferedReader(fr);
	
	int numberOfLines = Readlines();
	String[] textData = new String[numberOfLines];
	
	int i;
	
	String name = JOptionPane.showInputDialog("Enter Phone Name to be searched :");

	for (i=0; i < numberOfLines; i=i+8) 
		{
			textData[i] = textreader.readLine();
		
			if(name.equals(textData[i]))
			{
			    	System.out.println(textData[i]);
			 	    	
			    	JLabel Phone_name1 = new JLabel("Phone Name - ", JLabel.TRAILING);
				    displayresult.add(Phone_name1);
				    JLabel Phone_name2 = new JLabel(textData[i], JLabel.TRAILING);
				    displayresult.add(Phone_name2);
				
				    JLabel Phone_type1 = new JLabel("Phone Type - ", JLabel.TRAILING);
				    displayresult.add(Phone_type1);
				    JLabel Phone_type2 = new JLabel(textreader.readLine(), JLabel.TRAILING);
				    displayresult.add(Phone_type2);
				    
				    JLabel Operating_system1 = new JLabel("Operating System - ", JLabel.TRAILING);
				    displayresult.add(Operating_system1);
				    JLabel Operating_system2 = new JLabel(textreader.readLine(), JLabel.TRAILING);
				    displayresult.add(Operating_system2);
				    
				    JLabel Processor1 = new JLabel("Processor - ", JLabel.TRAILING);
				    displayresult.add(Processor1);
				    JLabel Processor2 = new JLabel(textreader.readLine(), JLabel.TRAILING);
				    displayresult.add(Processor2);
				    
				    JLabel Camera1 = new JLabel("Camera - ", JLabel.TRAILING);
				    displayresult.add(Camera1);
				    JLabel Camera2 = new JLabel(textreader.readLine(), JLabel.TRAILING);
				    displayresult.add(Camera2);
				    
				    JLabel Screen_size1 = new JLabel("Screen Size - ", JLabel.TRAILING);
				    displayresult.add(Screen_size1);
				    JLabel Screen_size2 = new JLabel(textreader.readLine(), JLabel.TRAILING);
				    displayresult.add(Screen_size2);
				    
				    JLabel Memory1 = new JLabel("Memory - ", JLabel.TRAILING);
				    displayresult.add(Memory1);
				    JLabel Memory2 = new JLabel(textreader.readLine(), JLabel.TRAILING);
				    displayresult.add(Memory2);
				    
				    JLabel Price1 = new JLabel("Price (Rs) - ", JLabel.TRAILING);
				    displayresult.add(Price1);
				    JLabel Price2 = new JLabel(textreader.readLine(), JLabel.TRAILING);
				    displayresult.add(Price2);

				//Lay out the panel.
				SpringUtilities.makeCompactGrid(displayresult,
				                                8, 2, //rows, cols
				                                6, 6,        //initX, initY
				                                6, 6);       //xPad, yPad
			    	
			    	
				     JFrame frame = new JFrame("Match Result!");
				     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				     displayresult.setOpaque(true);  //content panes must be opaque
				     frame.setContentPane(displayresult);
				     
				     frame.pack();
				     frame.setVisible(true);

			}
			else
			{
				for(int l=0; l<7; l++)
				textData[i] = textreader.readLine();
			}
		}
	
	}
	
	
	public static void main(String[] args) throws IOException 
	{

		findme();
	}
}
