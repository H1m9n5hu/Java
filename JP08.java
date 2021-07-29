import java.util.Scanner;
import java.lang.*;
import java.math.BigInteger;

class JP08
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    int n = sc.nextInt();
		    BigInteger fact = new BigInteger("1");
		    for ( int i = 1; i <= n; i++ )
		        fact = fact.multiply(BigInteger.valueOf(i));
		    System.out.println(fact);
		    t--;
		}
	}
}
