import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;

class JP09
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int arr[] = new int[N];
	    for(int i = 0; i < N; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(int i = 0; i < N; i++)
            System.out.println(arr[i]);
	}
}
