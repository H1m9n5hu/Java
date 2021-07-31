import java.util.*;
import java.lang.*;

class JP16
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		    if ( (a == b && c == d) || (a == c && b == d) || (a == d && b == c) )
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		    t--;
		}
	}
}
