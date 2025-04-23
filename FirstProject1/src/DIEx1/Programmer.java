package DIEx1;

public class Programmer {
	  private LapTop lt;

	  public Programmer(LapTop lt) { //ye hmlog ne loose coupling kr liya constructor
		                             // k through aab Laptop class mai koi change kroge
		                             // programmer mai change krne ka zrurat nhi
		super();
		this.lt = lt;
	}

	public void writecode() {
		  boolean res= lt.start();
		  System.out.println("Writing the code...");
	  }
	}
