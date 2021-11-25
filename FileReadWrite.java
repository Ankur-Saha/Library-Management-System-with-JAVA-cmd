import java.io.*;
import java.lang.*;


public class FileReadWrite {
	File folder;  
	File file;    
	private FileWriter writer; 

	public void createDirectory(){
		try{
			folder = new File("C:/Users/Administrator/Desktop/NP/files"); 
			folder.mkdir();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public void writeInFile(String s)
	{
		try{
			file = new File("Data.txt");
			file.createNewFile();
			writer = new FileWriter(file, true); 
			writer.write(s+"\r\n") ;
			writer.flush();
			writer.close();		
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}	
}