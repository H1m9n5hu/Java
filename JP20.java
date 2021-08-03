import java.util.*;
import java.lang.*;

class JP20
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), b = sc.nextInt();
		int Area = l*b;
		int perimeter = 2*(l + b);
		if ( Area > perimeter)
		{
		    System.out.println("Area");
		    System.out.println(Area);
		}
		else 
		{
		    if ( Area < perimeter )
		    {
		        System.out.println("Peri");
		        System.out.println(perimeter);
		    }
		    else
		    {
		        System.out.println("Eq");
		        System.out.println(Area);
		    }
		}
	}
}
