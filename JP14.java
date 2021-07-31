import java.util.*;
import java.lang.*;

class JP14
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    int coins = 0, N = sc.nextInt(), K = sc.nextInt();
		    for ( int i = 1; i <= K; i++ )
		        if ( N%i > coins )
		            coins = N%i;
		    System.out.println(coins);
		    t--;
		}
	}
}
