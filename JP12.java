import java.util.*;
import java.lang.*;

class JP12
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    int N = sc.nextInt();
		    double result = Math.sqrt(N);
		    System.out.println(String.format("%.0f", Math.floor(result)));
		    t--;
		}
	}
}
