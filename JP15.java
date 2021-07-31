import java.util.*;
import java.lang.*;

class JP15
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    int turns = 0, X = sc.nextInt();
		    if( X%5 == 0 )
		    {
		        while( X%10 != 0 )
		        {
		            X *= 2;
		            turns++;
		        }
		        System.out.println(turns);
		    }
		    else
		        System.out.println(-1);
		    t--;
		}
	}
}
