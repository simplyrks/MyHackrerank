import java.util.*;
import java.text.NumberFormat;
import java.util.Locale.Builder;
public class Calender { 
    public static void main(String[] args) 
    { String[] dates=new String[]{"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        
         Scanner sc=new Scanner(System.in);
         float n;
         n=sc.nextFloat();
          Locale INDIA = new Builder().setLanguage("en").build();
         NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.FRENCH);
          System.out.println("*******"+nf1.format(n) + "*******");

          NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
          System.out.println("*******"+nf2.format(n) + "*******");

          NumberFormat nf3 = NumberFormat.getCurrencyInstance(INDIA);
          System.out.println("*******"+nf3.format(n) + "*******");

          NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.CHINA);
          System.out.println("*******"+nf4.format(n) + "*******");


    } 
} 