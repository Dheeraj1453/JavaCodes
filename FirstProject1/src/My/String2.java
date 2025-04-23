package My;

public class String2 {
	public static void main(String args[]) {
		String str1="Hello";
		String str2="Hello";
		System.out.println(str1+" "+str2);
		str2 += " World";  /*String hmlog ka immutable hota hai agar hmlog scp 
		                     *mai same value ka value change krte hai toh
		                     *wo apna reference badal leta hai yani phle 
		                     *hello ko str1 & str2 dono dikha rhe the but
		                     * jb str2 ka value change kiye toh wo apna dusra
		                     *  object bna liya or phle wla hatt gya*/ 
		
		System.out.println(str1+" "+str2);
        String str3="Hello";
        str3+=" World";   /*yaha phle str3 Hello ko indicate kr rha tha
                          * but jaise hmlog value change kiye toh str3
                          * 1 new object bna lega jo new value ko indicate krega
                          * or purana value garbage mai chla jaega*/
        System.out.println(str3);
	}
	

}
