import java.util.*;
import java.lang.*;

class JP18
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		char character = sc.next().charAt(0);
		int asciiValue = character;
		if( character == 65 || character == 69 || character == 73 || character == 79 || character == 85 )
		    System.out.println("Vowel");
		else
		    System.out.println("Consonant");
	}
}