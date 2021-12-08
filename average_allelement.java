import java.util.Scanner;

public class average_allelement {
    public static void main(String[] args) {
    int[]array1=new int[]{1,2,3,4,5,6,7,8,9,0};
    int sum=0;
    for(int i=0;i<array1.length;i++)
        sum=sum+array1[i];
    float average=sum/array1.length;
        System.out.println(""+average);

        }
    }