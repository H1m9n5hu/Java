import java.util.*;
import java.lang.*;

class JP23
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t != 0 )
		{
		    int N = sc.nextInt(), K = sc.nextInt();
		    
		    String forgotten_lang[] = new String[N];
			ArrayList <String> morden_lang = new ArrayList<>();

		    for(int i = 0; i < N; i++)
		        forgotten_lang[i] = sc.next();
			
			for(int i = 0; i < K; i++)
			{
			    int size = sc.nextInt();
			    for(int j = 0; j < size; j++)
			        morden_lang.add(sc.next());
			}
            
			for(int i = 0; i < N; i++)
			{
			    for(int j = 0; j < morden_lang.size(); j++)
			    {
			        if(forgotten_lang[i].equals(morden_lang.get(j)))
			        {
			            System.out.print("YES ");
			            break;
			        }
			        if(j == morden_lang.size() - 1)
			            System.out.print("NO ");
			    }
			}
            System.out.println();
            
			t--;
		}
	}
}


// This is second way to do this Question.
// import java.util.*;
// import java.lang.*;

// class JP23
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		int t = sc.nextInt();
// 		while( t != 0 )
// 		{
// 		    int N = sc.nextInt(), K = sc.nextInt();
		    
// 		    String forgotten_lang[] = new String[N];
// 			ArrayList <String> morden_lang = new ArrayList<>();

// 		    for(int i = 0; i < N; i++)
// 		        forgotten_lang[i] = sc.next();
			
// 			for(int i = 0; i < K; i++)
// 			{
// 			    int size = sc.nextInt();
// 			    for(int j = 0; j < size; j++)
// 			        morden_lang.add(sc.next());
// 			}
            
// 			for(int i = 0; i < N; i++)
// 			{
// 			    for(int j = 0; j < morden_lang.size(); j++)
// 			    {
// 			        if(forgotten_lang[i].equals(morden_lang.get(j)))
// 			        {
// 			            System.out.print("YES ");
// 			            break;
// 			        }
// 			        if(j == morden_lang.size() - 1)
// 			            System.out.print("NO ");
// 			    }
// 			}
//             System.out.println();
            
// 			t--;
// 		}
// 	}
// }