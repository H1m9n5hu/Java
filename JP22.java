import java.util.*;
import java.lang.*;

class JP22
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    String str1 = sc.next(), str2 = sc.next();
		    boolean flag = true;
		    for(int i = 0; i < str1.length(); i++)
		    {
		        if(str1.charAt(i) != str2.charAt(i) && str1.charAt(i) != '?' && str2.charAt(i) != '?')
		        {
		            flag = false;
		            break;
		        }
		    }
		    if(flag)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    t--;
		}
	}
}
