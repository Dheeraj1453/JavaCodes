package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.Scanner;
import java.util.regex.*;

public class hasNext {

    public static void main(String[] args) {
    	 Scanner scanner= new Scanner(System.in);
         int no=1;
         while(scanner.hasNext())
         {
          String name= scanner.nextLine();
          System.out.println(no+" "+name);
          no++;
     }}
 }