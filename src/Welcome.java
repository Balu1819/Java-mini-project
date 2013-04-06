import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;


public class Welcome extends Applet implements ActionListener
{
	Button button1,button2,button3;
	Image img;
	MediaTracker tr,bg;
	
	public void init()
	{
		setLayout(null);
		button1=new Button("Add a new Entry");
		button1.setBounds(300, 350, 160, 60);
		add(button1);
	    button1.addActionListener(this);
	    
	   button2=new Button("Display all");
	   button2.setBounds(600, 350, 160, 60);
		add(button2);
		 button2.addActionListener(this);
	
	    
	    button3=new Button("Search for a phone");
	    button3.setBounds(900, 350, 160, 60);
		add(button3);
	    button3.addActionListener(this);
	}


	public void paint(Graphics g) 
	{
		bg = new MediaTracker(this);
		img = getImage(getCodeBase(), "bg.jpg");
		bg.addImage(img,0);
		g.drawImage(img, 0, 0, this);
		
		tr = new MediaTracker(this);
		img = getImage(getCodeBase(), "main page.jpg");
		tr.addImage(img,0);
		g.drawImage(img, 0, 0, this);
	} 
	
	public void actionPerformed(ActionEvent ae) 
	{
		String str = ae.getActionCommand();
		
		if(str.equals("Add a new Entry"))
		{
			System.out.println("adddata");
			
			AddData a = new AddData();
			try {
				a.myform();
			} 
			catch (IOException e) 
			{
				System.out.println("Error in welcome file!!");
			}
		}
		else if(str.equals("Display all")) 
		{
			System.out.println("display data");
			DisplayFrame x = new DisplayFrame();
			x.display();
			
		}
		else  
		{
					
			search a = new search();
			try 
			{
				SearchResultFrame diujl = new SearchResultFrame();
			} 
			catch (IOException e) 
			{
				System.out.println("Error in welcome file!!");
			}
		}
	}
	
	


}
