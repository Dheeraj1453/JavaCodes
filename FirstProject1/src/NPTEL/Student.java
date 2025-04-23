package NPTEL;
import java.util.Scanner;
public class Student 
{
private String name;
private int age;

//Your code
public Student(String name,int age)
{
  this.name=name;
  this.age=age;
}

public String getName()
{
  return name;
}
public int getAge()
{
  return(age);
}

//Main method
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter student name: ");
    String name = scanner.next();

    // System.out.print("Enter student age: ");
    int age = scanner.nextInt();

    Student student = new Student(name, age);

    System.out.print("Name: " + student.getName() + ", Age: " + student.getAge());

    scanner.close();
}
}
