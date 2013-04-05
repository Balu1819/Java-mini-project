//Simple Image Slide show using JButton
//by: http://java-program-sample.blogspot.com
//File: imageSlideShowJbutton.java

//Java Extension Packages
import javax.swing.*;
//Java Core Packages
import java.awt.*;
import java.awt.event.*;

public class SlideShow extends JFrame 
{

	
	 JButton b1,b2,b3;
	 JPanel panel, panel2;
	 JLabel images;
	 Icon front,back,coveroff;
	 String firstimage,secondimage,thirdimage;

	
	public SlideShow(String imagename) 
	{
	
	super("Phone Image Gallary");

	
	setSize(900,600);

	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	firstimage = imagename+"1";
	secondimage = imagename+"2";
	thirdimage = imagename+"3";

	images = new JLabel("Waiting for Image");

	
	front = new ImageIcon(firstimage+".jpg");
	back = new ImageIcon(secondimage+".jpg");
	coveroff = new ImageIcon(thirdimage+".jpg");
	

	panel = new JPanel();
	panel2 = new JPanel();

	
	b1 = new JButton("front");
	b2 = new JButton("Back");
	b3 = new JButton("Coveroff");
	

	
	b1.setHorizontalAlignment(SwingConstants.LEFT);
	b2.setHorizontalAlignment(SwingConstants.LEFT);
	b3.setHorizontalAlignment(SwingConstants.LEFT);
	

	Container pane = getContentPane();

	
	GridLayout grid = new GridLayout(3,1);

	
	panel.setLayout(grid);
	panel.add(b1);
	panel.add(b2);
	panel.add(b3);


	
	GridLayout grid2 = new GridLayout(1,1);

	
	panel2.setLayout(grid2);
	panel2.add(images);

	
	b1.addActionListener(
		new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				images.setText(null);
				images.setIcon(front);
				}
			}
		);

	
	b2.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					images.setText(null);
					images.setIcon(back);
					}
				}
		);

	
	b3.addActionListener(
		new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				images.setText(null);
				images.setIcon(coveroff);
				}
			}
		);

	
	pane.add(panel, BorderLayout.WEST);
	pane.add(panel2, BorderLayout.EAST);

	setContentPane(pane);
	setVisible(true);
	}

	public static void main(String[] args) 
	{
	SlideShow issjb = new SlideShow("lg_4x");
	}
}
