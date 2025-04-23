package My;

public class String1 {
	public static void main(String args[]) {
		/*String is a collection of Characters
		 * It has Two types:- 1.Immutable:-String class
		 *                    2.Mutable:- a)StringBuilder  b)StringBuffer
		 */
		char a[]=new char[10];  //Primitive stack
		String str1= "Hello World";   //String constaint Pool mai ye value chla jaega jisme duplicate value nhi hoga agar duplicate hua toh 1 hi reference ko dono value de dega
		String str2= "Hello World";   // ye scp mai hi bnega but 1 hi reference ye value ko dikaega kyuki ye same hai str1 k
		String str3= new String("Hello World");  //new String use krne par sara heap mai bnega isme same value k bhut sare bn skte h
		String str4= new String("Hello World");  //Heap mai duplicate bn skta hai or sara alag reference rhega
 	    System.out.println(str1==str2);  // == ye wla reference btata hai ki dono ka reference same hai yaha par ye scp mai bna hai or value bhi same hai yani dono ka reference same hoga
 	    System.out.println(str3==str4);  // yaha str3 and str4 heap mai bna toh dono ka value same rhega firbhi dono ka reference alag hota hai heap mai yani false aaega
 	    System.out.println(str1==str4);  // yaha toh 1 value scp or dusra heap mai toh reference same nhi so skta
 	    System.out.println(str3.equals(str4)); //.equals() ye wla value compare krta hai yaha str3 & str4 dono ka value same hai toh true aaega
 	    System.out.println(str1.equals(str4)); //yaha str1 scp mai and str4 heap mai but dono ka value same hai isliye true aaega
	}
	
	
	

}
