import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.tree.*;

public class DisplayLikeIWant extends JApplet 
{
	JTree tree;
	JTextField jtf;
	
		public DisplayLikeIWant()
		{
			
				Container contentPane = getContentPane();
				
				contentPane.setLayout(new BorderLayout());
				
				
				DefaultMutableTreeNode top = new DefaultMutableTreeNode("Mobiles");
		
				String file_name="Mobiles.txt";
				

				try
				{
					ReadFile file = new ReadFile( file_name );
					String[ ] aryLines = file.Openfile( );
					
					int i;
					
					DefaultMutableTreeNode start1 = new DefaultMutableTreeNode();
					
					for ( i=0; i < aryLines.length; i++ ) 
					{
						System.out.println( aryLines[ i ] );
						
						DefaultMutableTreeNode start = new DefaultMutableTreeNode(aryLines[i]);
						
						if(i%8==0)
						start1 = new DefaultMutableTreeNode(aryLines[i]);
						
						if(i%8==0)
						{
							
							top.add(start1);
							
							
						}
						else
						{
							
							start1.add(start);
						}
					}
					
				}
				catch ( IOException e ) 
				{
					System.out.println( "Sorry dude! File does not exist!! Dont be like Chinmay, Check your spellings. Ha ha ha" );
				}
		
				
				
				tree = new JTree(top);
				
				
				int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
				int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
				JScrollPane jsp = new JScrollPane(tree, v, h);
				
				
				contentPane.add(jsp, BorderLayout.CENTER);

				jtf = new JTextField("", 20);
				contentPane.add(jtf, BorderLayout.SOUTH);
				
				
				tree.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent me) { doMouseClicked(me);} } );
		
		}
		
		void doMouseClicked(MouseEvent me) 
		{
			TreePath tp = tree.getPathForLocation(me.getX(), me.getY());
			if(tp != null)
				jtf.setText(tp.toString());
			else
				jtf.setText("");
		}
		
		
}