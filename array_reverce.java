import java.util.Arrays;
import java.util.Scanner;

public class array_reverce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the character");
        int[] a = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(a));


        for(int i=0;i<a.length/2;i++)
        {
            int front =i;
            int end=a.length-1-i;

            int temp=a[front];
            a[front]=a[end];
            a[end]=temp;


        }
        System.out.println(Arrays.toString(a));


    }
}
