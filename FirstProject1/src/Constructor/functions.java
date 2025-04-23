package Constructor;
class functions 
{
	void sum2(int i,int j)      //function 1 to add 2 number
	{
		System.out.println(i+j);
	}
	void sum3(int i,int j,int k)  //function 2 to add 3 number
	{
		System.out.println(i+j+k);
	}
	void sum4(int i,int j,int k,int l)   //function 3 to add 4 number
	{
		System.out.println(i+j+k+l);
	} 
	
	/*yaha hmlog dusra class nhi bnenge kyuki hmlog variable sbko argument
	 * mai hi pass kiye hain or koi instance variable nhi hai toh wo dusre
	 * class mai wo value aa hi nhi skta*/
	
public static void main(String args[])
{
	functions ob= new functions();
	ob.sum2(14, 15);    //call sum2 function
	ob.sum3(45,18,07);   //call sum3 function
	ob.sum4(190,457,798,98);  //call sum4 function 
}}
