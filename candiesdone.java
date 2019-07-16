class choco
int num=1;{
	public static void method(int[] input1)
	{
		
		/*System.out.print(input1[0]+" ");
		for(int i=1;i<input1.length;i++)
			System.out.print(input1[i]+" ");
		System.out.println();*/
		int[] cho = new int[input1.length];
		cho[0]=1;
		for(int i=1;i<input1.length;i++)
		{
			if(input1[i-1]<input1[i])
				num++;
			else
				num=1;
			cho[i]=num;
		}
		
		//Backtrack
		for(int i=input1.length-2;i>=0;i--)
			if(input1[i]>input1[i+1])
				cho[i]=max(cho[i+1]+1,cho[i]);

		for(int i=0;i<cho.length;i++)
			System.out.print(cho[i]+" ");
		System.out.println();
	}
	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		return b;
	}
	public static void main(String[] args)
	{
		int input1[]={1,2,2};
		method(input1);
		
		int input2[]={1,2,2,4,6,4,2,8,9,2,1};
		method(input2);
		
	}
}