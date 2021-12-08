import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        int n;
        String yes;
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the number");
        n = sc.nextInt();
        while (true) {
            for (int i = 1; i <= n; i++) {

                System.out.print("*");
            }


            System.out.println("Please enter 'yes' to continue or press 'no' exit the programm");
            yes = sc.next();
            if (yes.equals("YES")) {
                break;
            }
        }
    }
}


