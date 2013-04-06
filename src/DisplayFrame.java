import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DisplayFrame implements ActionListener
{

  public void display()
  {
    JFrame frame = new JFrame("Swing Frame");
    JPanel mainpanel = new JPanel();
    JButton buttontable, buttontree;
    
    frame.add(mainpanel);

    buttontable= new JButton("Display in tabular form");
    buttontable.addActionListener(new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		JFrame frame = new JFrame ("Displaying Records");
    		frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
    		frame.getContentPane().add(new DisplayData());
    		frame.pack();
    		frame.setVisible(true);
    	  }	
    });
    
    buttontree= new JButton("Display in tree form");
    buttontree.addActionListener(new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		JFrame frame = new JFrame ("Displaying Records");
    		frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
    		frame.getContentPane().add(new DisplayTree());
    		frame.pack();
    		frame.setVisible(true);
    	  }	
    });

    mainpanel.add(buttontable);
    mainpanel.add(buttontree);

  
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frame.setSize(500, 100); 
    frame.setVisible(true); 
  }


public void actionPerformed(ActionEvent e) 
{
	System.out.println("display dataa");
	
}

}