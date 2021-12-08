import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a,b,c;
        String str;
        char chr;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no1");
        a=sc.nextInt();
        System.out.println("enter no2");
        b= sc.nextInt();
        System.out.println("+.sum\n-.sub\n*.multiply\n/.division");
        System.out.println("select your oprator");
        str=sc.next();
        chr=str.charAt(0);
        switch (chr)
        {
            case'+':c=a+b;
            {System.out.println("sum"+c);}
            break;
            case'-':c=a-b;
            {System.out.println("sub"+c);}
            break;
            case'*':c=a*b;
            {System.out.println("multipal"+c);}
            break;
            case'/':c=a/b;
            {System.out.println("division"+c);}
            break;
    }
}
}