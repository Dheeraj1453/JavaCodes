package ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class throwsdemo 
{
    static void readFile() throws IOException //without writing anything in txt how we can read hence it produce
                                          //Exception which is throws to main method
    {
      FileReader fr=new FileReader("demo.txt");
      fr.close();
    }    
    static void writeFile() throws FileNotFoundException  //Similarily w/o writing what we can print and it also throws exception
    {
    	PrintWriter pw=new PrintWriter("demo.txt");
    	pw.flush();
    	pw.close();
    	
    }
    
    //main method
     public static void main(String[] args) 
     {
		System.out.println("exception demo");
	try {
		readFile();
		writeFile();
		}
	catch(IOException eb)
	{
		System.out.println("No Input");
	}
	catch(Exception e) {	
		System.out.println("File Not Found");
	}
}
}
