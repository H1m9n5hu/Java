import java.util.Scanner;
import java.lang.*;

class JP06
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    int sum = 0, N = sc.nextInt();
		    String str = Integer.toString(N);
		    for ( int i = 0; i < str.length(); i++ )
		        sum += str.charAt(i) - '0';
		      //  Statements which are mentioned below are also correct...
		      //  sum += Character.getNumericValue(str.charAt(i));
		      //  sum += Integer.parseInt(String.valueOf(str.charAt(i)));
		    System.out.println(sum);
		    t--;
		}
    }
}
