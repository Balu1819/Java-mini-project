import java.io.*;

public class ReadFile {

	String path;
	
	public ReadFile(String file_path) 
	{
		path= file_path;
	}
	
	int Readlines() throws IOException
	{
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aline;
		int numberOfLines =0;
		
		
		while ( ( aline = bf.readLine() ) != null ) 
		{
			numberOfLines++;
		}
		
		bf.close();
		return numberOfLines;
	}
	
	public String[] Openfile() throws IOException
	{
		FileReader fr = new FileReader(path);
		BufferedReader textreader = new BufferedReader(fr);
		
		int numberOfLines=Readlines();
		String[] textData = new String[numberOfLines];
		
		int i;

		for (i=0; i < numberOfLines; i++) 
		{
			textData[i] = textreader.readLine();
		}
		
		textreader.close( );
		return textData;
	}

}
