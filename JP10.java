import java.util.*;
import java.lang.*;

class JP10
{
    
    private static int func(int N)
    {
        int result = 0;
        while( N != 0 )
        {
            if( N%10 == 4 )
                result++;
            N = N/10;
        }
        return result;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0; i < N; i++)
		    arr[i] = sc.nextInt();
		for(int i = 0; i < N; i++)
		    System.out.println(func(arr[i]));
	}
}
