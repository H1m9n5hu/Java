// Program to find Sum of N Natural numbers by using wrapper class( When we run our program on command prompt )
public class JP03 {
	public static void main ( String [] args ) {
		int Sum = 0;
		for ( int i = 0; i < args.length; i++ )
			Sum += Integer.parseInt ( args [ i ] );
		System.out.println ( "Sum of " + args.length + " Natural numbers is " + Sum );
	}
}