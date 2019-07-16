import java.util.*;
class time
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		char[] c = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            c[i] = s.charAt(i); 
        }
        if(c[8]=='A' || c[8]=='a')
        {
        	if(c[0]=='1' && c[1]=='2')
        	{	
        		c[0]='0';
        		c[1]='0';
        	}
        	c[8]=' ';
        	c[9]=' ';
        	String string = new String(c);
        	System.out.println(string);
        }
        else
        {
        	int h1 = s.charAt(0);
        	int h2 = s.charAt(1)-48;
        	System.out.println("h1 = "+h1);
			System.out.println("h2 = "+h2);
        	int hh = h1*10+h2;
			System.out.println("int hh = "+hh);
        	hh = hh+12;
        	h2=hh%10;
        	hh=hh/10;
        	h1=hh;
        	System.out.println("new h1 = "+h1);
			System.out.println("new h2 = "+h2);
        	c[0]=(char)(h1+'0');
        	c[1]=(char)(h2+'0');
			System.out.println(c[0]);
			System.out.println(c[1]);
        	c[8]=' ';
        	c[9]=' ';
        	String string = new String(c);
        	System.out.println(string);

        }
	}
}