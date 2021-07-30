import java.util.*;
import java.lang.*;

class JP13
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		    if( A >= C && A >= B )
		        if( B >= C )
		            System.out.println(B);
		        else
		            System.out.println(C);
		    else
		        if( B >= C && B >= A )
		            if( A >= C)
		                System.out.println(A);
		            else
		                System.out.println(C);
	            else
	                if( A >= B )
	                    System.out.println(A);
	                else
	                    System.out.println(B);
		    t--;
		}
	}
}
