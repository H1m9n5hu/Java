import java.util.*;
import java.lang.*;

class JP19
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 ) 
		{
		    int R = sc.nextInt();
		    int x1 = sc.nextInt(), y1 = sc.nextInt();
		    int x2 = sc.nextInt(), y2 = sc.nextInt();
		    int x3 = sc.nextInt(), y3 = sc.nextInt();
		    double d1, d2, d3;
		    d1 = Math.sqrt( Math.pow( (x2 - x1), 2 ) + Math.pow( (y2 - y1), 2 ) );
		    d2 = Math.sqrt( Math.pow( (x3 - x2), 2 ) + Math.pow( (y3 - y2), 2 ) );
		    d3 = Math.sqrt( Math.pow( (x3 - x1), 2 ) + Math.pow( (y3 - y1), 2 ) );
		    // int i = 0;
		    // if( d1 <= R )
		    //     i++;
		    // if( d2 <= R )
		    //     i++;
		    // if( d3 <= R )
		    //     i++;
		    // if( i >= 2 )
		    //     System.out.println("yes");
		    // else
		    //     System.out.println("no");
            if( (d1 <= R && d2 <= R && d3 <= R) || (d1 <= R && d2 <= R && d3 > R) || (d1 > R && d2 <= R && d3 <= R) || (d1 <= R && d2 > R && d3 <= R) )
                System.out.println("yes");
            else
                System.out.println("no");
		    t--;
		}
	}
}
