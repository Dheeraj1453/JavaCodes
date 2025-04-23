package Intrface;
/*Interface pure abstract ko bolteh hai.
 * Interface mai sbhi variable 'public static final'
 * hi hota hai ya toh likhdo ya by default
 *Interface ko hmlog kisi class mai use krenge toh wo hmlog implement krenge.
 *Interface ko or aage badhana hoga dusre class mai toh usko bhi extends hi krenge.
 */
public interface demo   //interface class
{
	public static final float interest=4.0f;
	public float compute(float t,float p);
	public void displaydeposite();
	public void displaywithdrawal();
}

//implementing interface class in saving
class saving implements demo  
{

	@Override
	public float compute(float t, float p) {
		return p*interest*t/100;
	}

	@Override
	public void displaydeposite() 
	{
		System.out.println("Deposit Limit is 10Lakhs");
	}

	@Override
	public void displaywithdrawal()
	{
		System.out.println("Withdrawal Limit is 5Lakhs");
	}}
	
	//implenting interface class in current
	class Current implements demo
	{

		@Override
		public float compute(float t, float p) {
			return p*interest*t/100;
		}

		@Override
		public void displaydeposite() {
			System.out.println("Deposit Limit is 20Lakhs");
		}

		@Override
		public void displaywithdrawal() {
			System.out.println("Withdrawl limit is 10Lakhs");
		}
		
	}
