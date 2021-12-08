
import java.util.Scanner;

public class PRACTICE {
    int i;
    int j;

    public static int sum(int i, int j) {
        return i + j;
    }

    public static void main(String[] args) {
        while (true) {
            try {
                int i;
                int j;
                Scanner sc = new Scanner(System.in);
                System.out.println("enter first value :");
                i = sc.nextInt();
                System.out.println("enter the second value :");
                j = sc.nextInt();
                int res=  sum(i,j);

                System.out.println(res);
            } catch (Exception e) {
                System.out.println("enter only integer");
            }
        }
    }
}
