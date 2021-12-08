import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class arrays {
    public static void arrays(String[] args) {
            int a[] = new int[5];
            Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<6;i++)
        {
            System.out.println("enter number");
            a[i]=sc.nextInt();
        }
        for (i=0; i<6;i++)
            System.out.println(a[i]);
    }
} 
