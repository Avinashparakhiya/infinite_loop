import java.util.Scanner;

public class break_continue {
    public static void main(String[] args) {
        int i;
        int j;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number first");
                i = sc.nextInt();
                System.out.println("Enter the number second");
                j = sc.nextInt();
                int c = i + j;
                System.out.println("sum is  :" + c);
            } catch (Exception e) {
                System.out.println("enter only Integer not allowed String" + e);
                continue;


            }
        }
    }
}
