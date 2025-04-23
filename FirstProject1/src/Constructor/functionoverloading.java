package Constructor;
public class functionoverloading 
{
	/*Agar sbhi function ka name same ho but argument diff. ho,
	 * ya datatype diff. ho ya sequence diff ho tb isko hmlog kahte
	 * hai function overloading*/
	
	void sum(int i,int j)      //function 1 to add 2 number
	{
		System.out.println(i+j);
	}
	void sum(int i,int j,int k)  //function 2 to add 3 number
	{
		System.out.println(i+j+k);
	}
	void sum(int i,int j,int k,int l)   //function 3 to add 4 number
	{
		System.out.println(i+j+k+l);
	} 
	
	/*yaha hmlog dusra class nhi bnenge kyuki hmlog variable sbko argument
	 * mai hi pass kiye hain or koi instance variable nhi hai toh wo dusre
	 * class mai wo value aa hi nhi skta*/
	
public static void main(String args[])
{
	functionoverloading ob= new functionoverloading();
	ob.sum(20, 15);    //call sum function which has 2 argument
	ob.sum(45,18,07);   //call sum function which has  argument
	ob.sum(110,457,798,98);  //call sum function which has 4 argument
}}
