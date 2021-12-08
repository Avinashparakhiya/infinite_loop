import java.util.Locale;
import java.util.Scanner;

public class live_claa_study_preferances {
    public static void main(String[] args) {
        String str;
        System.out.println("enter your sentance");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int i,v=0,c=0;

        for(i=0;i<str.length();i++)
        {

         char chr=str.charAt(i);

         if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
         v++;
         else if((chr>=97 && chr<=122 ) ||  ( chr>=65 && chr<=90))
         c++;
        }
        System.out.println("your sentance in vowel is= " +v + "your centanc in consltance is " +c);
    }
}

    //public static void main(String[] args) {
    //    System.out.println(" hello good morning avinash");
  //  }
//}
