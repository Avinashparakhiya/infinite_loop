import java.util.Scanner;

public class unlimited_loop {
    public static void main(String[] args) {
        String str;
        System.out.println("Please enter the Sentence");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        for(int i=0;i<500000000
                ;i++)
        {
            System.out.println(str);
        }
    }
 }