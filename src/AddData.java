import java.awt.Label;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;


public class  AddData 
{
	static String file_Phone_name="Mobiles.txt";
	
	static String Phone_name2;
	static String Phone_type2;
	static String Operating_system2;
	static int Price2;
	static String Memory2;
	static String Processor2;
	static String Screen_size2;
	static String Camera2;


	public static void myform() throws IOException
	{
	

	JPanel p = new JPanel(new SpringLayout());
	

	
		
	    JLabel Phone_name1 = new JLabel("Phone Name  ", JLabel.TRAILING);
	    p.add(Phone_name1);
	    JTextField Phone_name = new JTextField(10);
	  
	    p.add(Phone_name);
	
	    JLabel Phone_type1 = new JLabel("Phone Type  ", JLabel.TRAILING);
	    p.add(Phone_type1);
	    JTextField Phone_type = new JTextField(10);
	  
	    p.add(Phone_type);
	    
	    JLabel Operating_system1 = new JLabel("Operating System  ", JLabel.TRAILING);
	    p.add(Operating_system1);
	    JTextField Operating_system = new JTextField(10);
	 
	    p.add(Operating_system);
	    
	    JLabel Processor1 = new JLabel("Processor   ", JLabel.TRAILING);
	    p.add(Processor1);
	    JTextField Processor = new JTextField(10);
	  
	    p.add(Processor);
	    
	    JLabel Camera1 = new JLabel("Camera   ", JLabel.TRAILING);
	    p.add(Camera1);
	    JTextField Camera = new JTextField(10);
	   
	    p.add(Camera);
	    
	    JLabel Screen_size1 = new JLabel("Screen Size   ", JLabel.TRAILING);
	    p.add(Screen_size1);
	    JTextField Screen_size = new JTextField(10);
	  
	    p.add(Screen_size);
	    
	    JLabel Memory1 = new JLabel("Memory  ", JLabel.TRAILING);
	    p.add(Memory1);
	    JTextField Memory = new JTextField(10);
	  
	    p.add(Memory);
	    
	    JLabel Price1 = new JLabel("Price   ", JLabel.TRAILING);
	    p.add(Price1);
	    JTextField Price = new JTextField(10);
	
	    p.add(Price);
	    
	  

	SpringUtilities.makeCompactGrid(p,
	                                8, 2, //rows, cols
	                                6, 6,        //initX, initY
	                                6, 6);       //xPad, yPad
	

     
     int result = JOptionPane.showConfirmDialog(null, p, "Test",
    	        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    	    if (result == JOptionPane.OK_OPTION) 
    	    {
    	        System.out.println("hello");
    	        
    	      //  System.out.println(textField.getText());
    	        
    	    	
    	        
    	        Writefile data = new Writefile( file_Phone_name,true );
				
    			Phone_name2 =Phone_name.getText();
    			data.writeToFile(Phone_name2);
    			
    			Phone_type2=Phone_type.getText();
    			data.writeToFile(Phone_type2);
    			
    			Operating_system2=Operating_system.getText();
    			data.writeToFile(Operating_system2);
    			
    			Processor2=Processor.getText();
    			data.writeToFile(Processor2);
    			
    			Camera2=Camera.getText();
    			data.writeToFile(Camera2);
    			
    			Screen_size2=Screen_size.getText();
    			data.writeToFile(Screen_size2);
    			
    			Memory2=Memory.getText();
    			data.writeToFile(Memory2);
    			
    			Price2=Integer.parseInt(Price.getText());
    			data.writeToFile(Price2);
    	        

            
    	    } else {
    	        System.out.println("Cancelled");
    	    }
    	    
	}
	

	public static void main(String[] args) throws IOException 
	{

		myform();
	}

}
