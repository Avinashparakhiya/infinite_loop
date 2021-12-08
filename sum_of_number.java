import java.util.Scanner;

public class sum_of_number {
    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the number of sum");
        i=sc.nextInt();
        System.out.println(sumMethod(i));
           }

    public static int sumMethod(int sum){

        if(sum!=-11) {
            return sum + sumMethod(sum - 1);
        }
        else
            return sum;

    }
}

