/**
 * 
 * @author Daniel Han
 *
 */
public class CreditCard 
{
	//fields
	final int CARDNUM;
	double limit;
	double balance;
	double interestRate;
	String holderName;
	
	//constructor
	public CreditCard(int cardnum, double limit1, double balance1, double interestRate1, double holderName1)
	{
		CARDNUM = cardnum;
		limit = limit1;
		balance = balance1;
		interestRate = interestRate1;
		holderName = holderName1;
	}

}
