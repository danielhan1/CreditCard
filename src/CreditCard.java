/**
 * 
 * @author Daniel Han
 *
 */
public class CreditCard 
{
	//fields
	private final int CARDNUM;
	private double limit;
	private double balance = 0;
	private double interestRate;
	private String holderName;
	
	
	//constructor
	public CreditCard(int cardnum, double limit1, double interestRate1, String holderName1)
	{
		CARDNUM = cardnum;
		limit = limit1;
		interestRate = interestRate1;
		holderName = holderName1;
		
	}
	//methods

	public void charge(double amt)
	{
		if(balance +  amt < limit)
{
		
		
		balance = balance + amt;
}
	
	}
	public void credit(double amt)
	{
		balance = balance - amt;
		
	}
	public void chargeInterest(double rate)
	{
		//
		
		balance = balance + rate * balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getName()
	{
		return holderName;
	}
	
	}

