package pack1;
public class A 
{
    private String PRIVATE= "Private Member";  /*private member ko hmlog sirf ussi 
                                               * class mai call kr skte hai*/   
    
    String DEFAULT= "Default Member";      /*Default member ko sirf hmlog same package
                                          *wle kahi bhi call ke skte hai*/
    
    protected String PROTECTED= "Protected Member";  /*protected ko hmlog child mai 
                                                     *call kr skte hai outside pack1 jaise 
                                                     *ki in class D*/
    
    public String Public= "Public Member";    /*public ko toh hmlog kahi bhi kr skte hai*/
    
static void Amethod()
{
	System.out.println("You can use Class A Propety");
}
}
