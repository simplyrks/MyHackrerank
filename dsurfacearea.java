import java.util.*;

class dsurfacearea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int i=0,j=0;
        int[][] A = new int[H][W];
        for(i=0;i<H;i++)
        {
            for(j=0;j<W;j++)
            {
                A[i][j]=sc.nextInt();
            }

        }
        int r = A.length;
        int c = A[0].length;
        int toparea = 0;
        int sidearea = 0;
        int extraarea = 0;
         if(r>=2 && c>=2)
        {
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        if(A[i][j]!=0 )
                        toparea+=1;
                    }
                }
                    toparea*=2;
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        if((i==0 && j==0) || (i==0 && j==c-1) || (i==r-1 && j==0) || (i==r-1 && j==c-1) )       {
                            sidearea=sidearea+A[i][j];
                            sidearea=sidearea+A[i][j];
                        }
                        else
                        {
                            if(i==0 || j==0 || i==r-1 || j==c-1)
                            sidearea=sidearea+A[i][j];
                        }
                    }
                }
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        if(i==0 && j==0)
                        {
                            if(A[i][j]>A[i+1][j])
                            {
                                extraarea = extraarea+(A[i][j]-A[i+1][j]);
                            }
                            if(A[i][j]>A[i][j+1])
                            {
                                extraarea = extraarea+(A[i][j]-A[i][j+1]); 
                            }
                        }
                        if(i==0 && j==c-1)
                        {
                            if(A[i][j]>A[i+1][j])
                            {
                                extraarea = extraarea+(A[i][j]-A[i+1][j]);
                            }
                            if(A[i][j]>A[i][j-1])
                            {
                                extraarea = extraarea+(A[i][j]-A[i][j-1]); 
                            }
                        }
                        if(i==r-1 && j==0)
                        {
                            if(A[i][j]>A[i-1][j])
                            {
                                extraarea = extraarea+(A[i][j]-A[i-1][j]);
                            }
                            if(A[i][j]>A[i][j+1])
                            {
                                extraarea = extraarea+(A[i][j]-A[i][j+1]); 
                            }
                        }
                        if(i==r-1 && j==c-1)
                        {
                            if(A[i][j]>A[i-1][j])
                            {
                                extraarea = extraarea+(A[i][j]-A[i-1][j]);
                            }
                            if(A[i][j]>A[i][j-1])
                            {
                                extraarea = extraarea+(A[i][j]-A[i][j-1]); 
                            }
                        }
                        if(i==0 && (j>0 && j<c-1))
                        {
                            if(A[i][j]>A[i][j-1])
                                extraarea = extraarea+(A[i][j]-A[i][j-1]); 
                            if(A[i][j]>A[i][j+1])
                                extraarea = extraarea+(A[i][j]-A[i][j+1]); 
                            if(A[i][j]>A[i+1][j])
                                extraarea = extraarea+(A[i][j]-A[i+1][j]); 
                        }
                        if(j==0 && (i>0 && i<r-1))
                        {
                            if(A[i][j]>A[i+1][j])
                                extraarea = extraarea+(A[i][j]-A[i+1][j]); 
                            if(A[i][j]>A[i-1][j])
                                extraarea = extraarea+(A[i][j]-A[i-1][j]); 
                            if(A[i][j]>A[i][j+1])
                                extraarea = extraarea+(A[i][j]-A[i][j+1]); 
                        }
                        if(j==c-1 && (i>0 && i<r-1))
                        {
                            if(A[i][j]>A[i+1][j])
                                extraarea = extraarea+(A[i][j]-A[i+1][j]); 
                            if(A[i][j]>A[i-1][j])
                                extraarea = extraarea+(A[i][j]-A[i-1][j]); 
                            if(A[i][j]>A[i][j-1])
                                extraarea = extraarea+(A[i][j]-A[i][j-1]);
                        }
                        if(i==r-1 && (j>0 && j<c-1))
                        {
                            if(A[i][j]>A[i][j-1])
                                extraarea = extraarea+(A[i][j]-A[i][j-1]); 
                            if(A[i][j]>A[i][j+1])
                                extraarea = extraarea+(A[i][j]-A[i][j+1]); 
                            if(A[i][j]>A[i-1][j])
                                extraarea = extraarea+(A[i][j]-A[i-1][j]); 
                        }
                        if(i!=0 && j!=0 && i!=r-1 && j!=c-1)
                        {
                            if(A[i][j]>A[i][j-1])
                                extraarea = extraarea+(A[i][j]-A[i][j-1]); 
                            if(A[i][j]>A[i][j+1])
                                extraarea = extraarea+(A[i][j]-A[i][j+1]); 
                            if(A[i][j]>A[i-1][j])
                                extraarea = extraarea+(A[i][j]-A[i-1][j]); 
                            if(A[i][j]>A[i+1][j])
                                extraarea = extraarea+(A[i][j]-A[i-1][j]); 
                        }
                        

                    }
                }
        }
        else{
            if(r==1 && c==1)
            {
                toparea=2;
                sidearea=A[0][0]*4;
            }
        }
        int surfacearea = toparea+extraarea+sidearea;
        System.out.println("Surface Area = "+surfacearea);
    }
}