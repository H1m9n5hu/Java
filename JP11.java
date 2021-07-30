import java.util.*;
import java.lang.*;

class JP11
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while( t != 0 )
	    {
	        int N = sc.nextInt();
	        String str1 = "", str = Integer.toString(N);
	        for(int i = str.length() - 1; i >= 0; i--)
	            str1 += str.charAt(i);
            N = Integer.parseInt(str1);
            System.out.println(N);
	        t--;
	    }
	}
}
