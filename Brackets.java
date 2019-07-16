import java.util.*;
class Solution{
  static final int MAX = 1000; 
   static int top; 
   static char a[] = new char[MAX]; // Maximum size of Stack 
  
    static boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    static void Stack() 
    { 
        top = -1; 
    } 
  
    static boolean push(char x) 
    { 
        if (top >= (MAX-1)) 
        { 
           // System.out.println("Stack Overflow"); 
            return false; 
        } 
        else
        { 
            a[++top] = x; 
            //System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    static char pop() 
    { 
        if (top < 0) 
        { 
            //System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else
        { 
            char x = a[top--]; 
            return x; 
        } 
    } 

  
  public static void main(String []argh)
  {
        int i;
        char c ='k';
        int flag = 0;
    Scanner sc = new Scanner(System.in);
     
      String input=sc.next();
            //Complete the code
            if(input.length()%2==1)
            {
                System.out.println("false due to odd length");
            }

            else
            {
                for(i=0;i<input.length();i++)
                {
                   if(input.charAt(i)=='{' || input.charAt(i)=='[' ||input.charAt(i)=='(')
                  {
                      push(input.charAt(i));
                      System.out.println("pushed :- "+input.charAt(i));
                  }
                   else
                   {
                       if(input.charAt(i)=='}')
                       {
                            c=pop();
                            System.out.println("Found "+input.charAt(i)+" and popped :- "+c);
                       
                            if(c!='{')
                            {
                                flag=1;
                                    break;
                            }
                       }

                       if(input.charAt(i)==']')
                       {
                        c=pop();
                            System.out.println("Found "+input.charAt(i)+" and popped :- "+c);

                        //System.out.println(c+"**[[[");
                        //System.out.println(input.charAt(i)+"**]]]");
                        if(c!='[')
                            {
                                flag=1;
                                break;
                            }
                       }

                        if(input.charAt(i)==')')
                        {
                            c=pop();
                            System.out.println("Found "+input.charAt(i)+" and popped :- "+c);

                            //System.out.println(c+"**(((");
                            //System.out.println(input.charAt(i)+"**(((");
                            if(c!='(')
                            {
                                flag=1;
                                break;
                            }
                        }
                    }
                }
                if(isEmpty())
                {
                    if(flag==1)
                    System.out.println("false");
                    else
                    System.out.println("true");
                }
                else
                System.out.println("false");
            }
    return ;
    
  }

}


