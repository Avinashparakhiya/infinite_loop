import java.util.Scanner;

public class word_count {
    public static void main(String[] args) {
        String str;
        System.out.println("enter your sentance");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int i,count=0;
        if(str.charAt(0)!=' ')
        count++;
        for(i=0;i<str.length()-1;i++)
        {
         if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
         count++;
        }
        System.out.println("your sentance in total word is =" +count);
    }
}
