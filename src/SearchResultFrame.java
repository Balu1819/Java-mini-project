import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchResultFrame extends JFrame implements ActionListener
{
	 JList list;
	 JPanel p1,p2;
	 JLabel image;
	 Button displaygallary;
	 String imagename;
	 String classes[] = {"lg_4x.jpg","samsung_s_advance.jpg","xperia_s.jpg","samsung_s3.jpg","xperia_sola.jpg","samsung_s2.jpg","xperia_ray.jpg"};
	 Icon graphics[] = {new ImageIcon(classes[0]),new ImageIcon(classes[1]),new ImageIcon(classes[2]),new ImageIcon(classes[3]),new ImageIcon(classes[4]),new ImageIcon(classes[5]),new ImageIcon(classes[6])};

	 static String path="Mobiles.txt";
	String file_name="Mobiles.txt";
	static JPanel displayresult = new JPanel(new SpringLayout());

    public SearchResultFrame() throws IOException 
    {

    	super("Search Result");
    	setSize(900,500);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	image = new JLabel();
    	
    	displaygallary = new Button("Display Phone Image Gallary");
    	displaygallary.setLocation(200, 100);
		
    	FileReader fr = new FileReader(path);
    	BufferedReader textreader = new BufferedReader(fr);
    	
    	int numberOfLines = Readlines();
    	String[] textData = new String[numberOfLines];
    	
    	int i,phoneno;
    	
    	String name = JOptionPane.showInputDialog("Enter Phone Name to be searched :");

    	for (i=0; i < numberOfLines; i=i+8) 
    		{
    			phoneno=i/8;
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
    				    
    				    switch(phoneno)
    				    {
    				    	case 0:imagename="lg_4x";
    				    			break;
    				    	case 1:imagename="samsungsadvance";
				    				break;
    				    	case 2:imagename="xperias";
				    				break;
    				    	case 3:imagename="samsungs3";
				    				break;
    				    	case 4:imagename="xperiasola";
				    				break;
    				    	case 5:imagename="samsungs2";
				    				break;
    				    	case 6:imagename="xperiaray";
				    				break;
    				    }
    				  
                        image.setIcon(graphics[phoneno]);

    				SpringUtilities.makeCompactGrid(displayresult,
    				                                8, 2, 	
    				                                6, 6,        
    				                                6, 6);       
    			}
    			else
    			{
    				for(int l=0; l<7; l++)
    				textData[i] = textreader.readLine();
    			}
    		}
		
    	displayresult.setBorder(BorderFactory.createTitledBorder("Phone Details "));
    	

    	p2 = new JPanel();
    	p2.setBorder(BorderFactory.createTitledBorder("Phone Image "));
    	p2.add(image);
    	
    	p2.add(displaygallary);
        displaygallary.addActionListener(this);
    	
    	Container pane = getContentPane();
    	setContentPane(pane);

    	GridLayout grid = new GridLayout(1,2);
    	pane.setLayout(grid);
    
    	pane.add(displayresult);
    	pane.add(p2);

    	setVisible(true);
    }
    
	
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
	
	public void actionPerformed(ActionEvent ae) 
	{
		String str = ae.getActionCommand();
		
		if(str.equals("Display Phone Image Gallary"))
		{
			System.out.println("display gallary");
			
			SlideShow issjb = new SlideShow(imagename);
		}
	}
    

    public static void main (String[] args) throws IOException 
    {
    	SearchResultFrame diujl = new SearchResultFrame();
	}
}
