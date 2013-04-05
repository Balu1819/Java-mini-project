import java.awt.*;
import java.io.IOException;
import javax.swing.*;

import java.io.*;

	public class DisplayData  extends JApplet
	{
	    public DisplayData()
	    {
	    	Container contentPane = getContentPane();
	    	contentPane.setLayout(new BorderLayout());
	    	final String[] colHeads = { "Phone Name", "Phone Type", "Operating System","Processor","Camera","Screen Size","Memory" ,"Price"};
	    	int var;
	    	 String DATA[][];
	         DATA=new String[100][100];
	         int linecount = 0;
	    	
	        try {

	        	BufferedReader bf = new BufferedReader(new FileReader("Mobiles.txt"));            
                
                 String line;

                
               int i=0,j=0;

               	DATA=new String[100][100];
	           	 
               
               	while (( DATA[i][j]= bf.readLine()) != null)
	             {
	                   linecount++;
	                     j++;
	                   
	                     if(j==8)
	                     {
	                    	 i=i+1;
	                         j=0;
	                     }
	                     
	                
	                    
	                    
	              }
               
               var=linecount/8;
 
            bf.close();
        }
        catch (IOException e) {
            System.out.println("IO Error Occurred: " + e.toString());
        }
    
	        var=linecount/6;
	        
	      final Object[][] data=new Object[100][8];
	      
		    for(int i=0;i<var;i++)
		    {
		    	for(int j=0;j<8;j++)
		    	{
		    		data[i][j]= DATA[i][j];
		    		
		    	}
		    }
	    	
	    
	    
		    JTable table = new JTable(data, colHeads);
		    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		    JScrollPane jsp = new JScrollPane(table, v, h);
		    contentPane.add(jsp, BorderLayout.CENTER);
	    }
}