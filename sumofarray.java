import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner xxx=new Scanner(System.in);
       int size,i,sum=0;
        System.out.println("enter size of array");
        size=xxx.nextInt();
        int a[]=new int[size];
        for(i=0;i<size;i++)
        {
            System.out.println("enter no");
            a[i]=xxx.nextInt();
        }

    }
}
