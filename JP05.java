import java.util.Scanner;

class JP05
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int j, l = 0;
        for ( int i = 0; i < n; i++ )
        {
            j = sc.nextInt();
            if ( j%k == 0 )
                l++;
        }
        System.out.println(l);
    }
}