import java.util.*;

class JP04
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int x;
		float y;
		x = sc.nextInt();
		y = sc.nextFloat();
		
		float z = 0;
		if ( x%5 == 0 && x != 0 && (x + 0.50f) <= y )
		{
		    z = y - x - 0.50f;
		}
	    else
	    {
	        z = y;
	    }
	    
	    System.out.println( String.format("%.2f", z) );
	}
}
