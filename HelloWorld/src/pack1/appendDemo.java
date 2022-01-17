package pack1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class appendDemo {
	public static void main(String args[]) throws IOException{
	// In order to append text to a file, you need to open
	// file into append mode, you do it by using 
	// FileReader and passing append 
	FileWriter fw = null;
	BufferedWriter bw = null; 
	PrintWriter pw = null;
	
	try {
		fw = new FileWriter("names.txt", true); 
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw);
		
		pw.println("Shane"); 
		pw.println("Root");
		pw.println("Ben");
		
		System.out.println("Data Successfully appended into file");
		pw.flush();
	}
	
	finally {
		try { 
			pw.close();
			bw.close(); fw.close(); 
			} 
		catch (IOException io) {
			// can't do anything
			} 
		} 
	// in Java 7 you can do it easily using try-with-resource
	// statement as shown below 	
	try (FileWriter f = new FileWriter("names.txt", true);
	BufferedWriter b = new BufferedWriter(f);	
	PrintWriter p = new PrintWriter(b);)
			{
	 p.println("appending text into file");
	 p.println("Gaura"); p.println("Bori");
	 } 
 	catch (IOException i)
	 { 
 		i.printStackTrace(); 
 	}
 	}
	
	}
	
	

