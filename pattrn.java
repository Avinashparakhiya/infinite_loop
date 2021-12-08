import java.util.Scanner;

public class pattrn {
    public static void main(String[] args) {
        int n, m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Number");
        while(true) {
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("cxcx");
        }
    }
}
