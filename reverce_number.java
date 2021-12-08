import java.util.Scanner;

import static java.lang.System.in;

public class reverce_number {
    public static void main(String[] args) {
        int number=0,tempNum;
        int rNumber=0;
        System.out.println("enter your number and press enter");
        Scanner sc=new Scanner(in);
//        tempNum=number=in.nextInt();
        while(number!=0)
        {
            rNumber=rNumber*10;
            rNumber=rNumber+number%10;
            number=number/10;
        }
//        System.out.println("reverce of input number"+tempNum+"is :"+rNumber);
    }
}
