import java.util.*;
import java.lang.*;

class JP17
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    int M = sc.nextInt(), N = sc.nextInt(), K = sc.nextInt();
		    if(M > N)
		    {
		        for(int i = 1; i <= K; i++)
		        {
		            N++;
		            if(M == N)
		            {
		                System.out.println(0);
		                break;
		            }
		        }
		        if(M > N)
		            System.out.println(M-N);
		    }
		    else
		    {
		        if(M < N)
		        {
		            for(int i = 1; i <= K; i++)
		            {
		                M++;
		                if(M == N)
		                {
		                    System.out.println(0);
		                    break;
		                }
		            }
		            if(M < N)
		                System.out.println(N-M);
		        }
		        else
		            System.out.println(0);
		    }
		    t--;
		}
	}
}
