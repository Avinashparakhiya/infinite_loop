import java.util.Scanner;

class practice1 {
    public static void main(String[] args) {
        System.out.println("please enter the name");
        String str,q="qw";
        Scanner sc = new Scanner(System.in);


        while(!q.equals("q") && !q.equals("Q")){ //q!="q" //checks objects
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
            System.out.println("enter value q for exit and other key for continue");
        q=sc.nextLine();

        }
    }

}