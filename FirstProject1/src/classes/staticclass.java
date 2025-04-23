package classes;
class test
{
	static class staticnested   //Static class
	{
		static int i=45;
		void nonstat() //non static method
		{
			System.out.println("Instance method of Static class");
		}
		
		static void stat() //Static method
		{
			System.out.println("Static method of static class");
		}
	}
}

//main class
public class staticclass 
{
public static void main(String args[])
{
	test.staticnested.stat();  //static class call krne k liye uska obj nhi bnana hoga class k name se hi usko call kr skte hai
    test.staticnested ob= new test.staticnested();   //static class k non static method ko call krne k liye obj bnana hoga 
    ob.nonstat();
    System.out.println(test.staticnested.i);
}
}
