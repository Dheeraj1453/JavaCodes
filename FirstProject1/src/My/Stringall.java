package My;
import java.util.Scanner;
public class Stringall {
public static void main(String args[])
{
	//concat method use
	String ques[]= {"Your name: ","Your Age: ","Your Address: "};
	String first[]={"Dheeraj","20","Patna"};
	String sec[]={" Kumar","+1"," Bihar"};
	for(int i=0;i<ques.length;i++)
	{
		System.out.println(ques[i].concat(first[i])); /*concat method ka use hmlog
		                                           *2 string ko jorne mai krte hai*/
	System.out.println(ques[i].concat(first[i].concat(sec[i])));
	}
	//Contains method use
	String url[]= {"https://www.Gmail.com","https://www.Facebook.com","https://www.upse.ac.in"};
    for(int i=0;i<url.length;i++)
    {
    	if(url[i].contains("com"))  //contains method check krta hai wo string contain hai ki nhi
    	{
    		System.out.println(url[i]);
    	}
    }
    //codePointAt method use
    String Name="Dheeraj Kumar Jha";
    System.out.println(Name.codePointAt(0)); //it give the ASCII code of the character placed at that index
    System.out.println(Name.codePointAt(3));
    
    //Strip Method use
    String name="   Dheeraj Kumar Jha   ";
    System.out.println(name.strip());  //Strip method remove the starting and ending space 

    //replace method use
    System.out.println(Name.replace(" ","\t")); /*replace method replace kr deta hai
                                              *old string ko new se jaise yaha
                                              *space replace ho jaega tab se (tab 8bit blank space contain 
                                              *jrta hai)*/
    System.out.println(Name.replace("Kumar",""));
    System.out.println(Name.replace("Dheeraj Kumar Jha","DHERAH KUMAR JHA"));
}
}
