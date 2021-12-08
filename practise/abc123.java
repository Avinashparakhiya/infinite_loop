package practise;

import java.util.Scanner;

public class abc123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month;
        System.out.println("enter the month");
        month=sc.nextInt();

        String season;
        if(month==12 || month==1 || month==2)
            season="winter";
        else if(month==3 || month==4 || month==5)
            season="spring";
        else if(month==6 || month==7 || month==7)
            season="summer";
        else if(month==8 || month==10 || month==11)
            season="authmn";
        else
            season="bogus month";
        System.out.println(season);
    }
}