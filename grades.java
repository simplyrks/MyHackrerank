import java.util.Scanner;
class grades{
	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int i=0;

			int[] grades = new int[n];

			for(i=0;i<n;i++)
			{
				grades[i]=scan.nextInt();
			}

         for(i=0;i<grades.length;i++)
         {
             if(grades[i]>=38 && grades[i]<=40)
             grades[i]=40;
             else
             {
                 if(grades[i]>40)
                 {
                     int a=0;
                    a = grades[i]%10;
                    if(a+1 == 5 || a+1==10)
                    grades[i]+=1;
                    if(a+2==5 || a+2==10)
                    grades[i]+=2;
                 }
             }
         }

			for(i=0;i<n;i++)
			{
				System.out.println("grades["+(i+1)+"] = "+grades[i]);
			}
         
	}
}