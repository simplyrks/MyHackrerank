import java.util.*;
import java.lang.*;
import java.lang.Object;
import java.util.Arrays; 
import java.lang.String;
import java.util.Collections;
public class lexicographical 
{

    public static void main(String[] args) 
    {

        String smallest = "";
        String largest = "";
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the String");
        String s=sc.next();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String l[] = new String[s.length()-2];

        for(i=0;i<s.length()-k+1;i++)
        {
            l[i]=s.substring(i,i+k);
            System.out.println("**"+l[i]+"**");
        }
        Arrays.sort(l);
        System.out.println(Arrays.toString(l));

         for(i=0;i<l.length;i++)
        {
            
            System.out.println("**"+l[i]+"**");
        }

        
        
    }
}

