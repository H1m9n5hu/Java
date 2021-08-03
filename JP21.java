import java.util.*;
import java.lang.*;

class JP21
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
			String str = sc.next();
			int numberOfA = 0, numberOfB = 0;
			for(int i = 0; i < str.length(); i++)
				if(str.charAt(i) == 'a')
					numberOfA++;
				else
					numberOfB++;
			if(numberOfA <= numberOfB)
				System.out.println(numberOfA);
			else
				System.out.println(numberOfB);
			t--;
		}
	}
}