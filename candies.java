import java.util.*;

class candies{
    static int candies(int n, int[] arr) 
    {
            
            
            int[] c = new int[n];
            int i=0;
            int  sum=0;
            if(arr[0]<arr[1])
            c[0] = 1;
            else
            c[0]=2;
            for(i=1;i<n;i++)
            {
                if(arr[i]>arr[i-1])
                {
                    c[i] = c[i-1]+1;
                }
                else
                {
                    c[i]=1;
                }

            } 
            for(i=n-1;i<=0;i++)
            {
                if(arr[i]>arr[i-1])
                {
                    if(c[i]<c[i-1])
                    c[i]=c[i]+1;
                }
            }
            for(i=0;i<n;i++)
            {
                System.out.println("c["+i+"] = "+c[i]+"   arr["+i+"] = "+arr[i]);
            }
            System.out.println("----------------------------------------------------");
            for(i=0;i<n-1;i++)
            {
                if(arr[i+1]<arr[i])
                {
                    if(c[i+1]>=c[i])
                    c[i]=c[i]+1;
                }
            }
            for(i=0;i<n;i++)
            {
                System.out.println("c["+i+"] = "+c[i]+"   arr["+i+"] = "+arr[i]);
            }
            System.out.println("----------------------------------------------------");
            for(i=1;i<n;i++)
            {
                if(arr[i]<arr[i-1])
                {
                    if(c[i]>c[i-1])
                    c[i]=c[i]-1;
                }
            }
            for(i=0;i<n;i++)
            {
                System.out.println("c["+i+"] = "+c[i]+"   arr["+i+"] = "+arr[i]);
            }
            for(i=0;i<n;i++)
            {
                
                sum = sum+c[i];
            }
            return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i=0;
        int[] arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int result = candies(n,arr);

        System.out.println("Result = "+result);
    }
}