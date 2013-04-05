import java.io.*;

public class Writefile {

	private	String path;
	private boolean append_to_file=false;
		
	public Writefile(String file_path) 
	{
		path=file_path;
	}
	
	public Writefile( String file_path , boolean append_value )
	{

		path = file_path;
		append_to_file = append_value;

	}
	
	public void writeToFile( String textLine ) throws IOException 
	{
		FileWriter write = new FileWriter( path , append_to_file);
		PrintWriter print_line = new PrintWriter( write );
		
		print_line.printf("%s" + "%n",textLine);
		
		print_line.close();
	}
	
	
	
	public void writeToFile( int textLine ) throws IOException 
	{
		FileWriter write = new FileWriter( path , append_to_file);
		PrintWriter print_line = new PrintWriter( write );
		
		print_line.printf("%s" + "%n",textLine);
		
		print_line.close();
	}
	

}
