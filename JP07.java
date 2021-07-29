import java.util.Scanner;
import java.lang.*;

class JP07
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    int sum = 0, N = sc.nextInt();
		    String str = Integer.toString(N);
		    sum = str.charAt(0) - '0' + str.charAt(str.length()-1) - '0';
		    System.out.println(sum);
		    t--;
		}
    }
}