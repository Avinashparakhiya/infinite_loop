import java.util.Scanner;

public class swap_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("before value of i= ");
        i = sc.nextInt();
        int j = 0;
        System.out.println("before value of j= ");
        j = sc.nextInt();
        while (true) {
            int temp;
            temp = i;
            i = j;
            j = temp;
            System.out.println("now value of I= " + i);
            System.out.println("now value of J= " + j);
            break;
        }

    }
}
