import java.util.Scanner;

public class uppercaseandlowercase {
    public static void main(String[]args){
        String str;
        Scanner sc=new Scanner(System.in);
        int u=0,l=0,sp=0,spc=0;
        System.out.println("Enter the Sentence");
        str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i)>='A'&& str.charAt(i)<='Z')
            {
                u++;
            }
            if(str.charAt(i)>='a'&& str.charAt(i)<='z')
            {
                l++;
            }
            if(str.charAt(i)>=33 && str.charAt(i)<=47)
            {
                spc++;
            }
            if(str.charAt(i)==32)
            {
                sp++;
            }
        }
        System.out.println("uper case latter   "   +u);
        System.out.println("lower case latter   "   +l);
        System.out.println("total spical characters   "   +spc);
        System.out.println("total space   "   +sp);

    }
}
