package practise;

import java.util.Arrays;
import java.util.Scanner;

public class arrayss {
    public static void main(String[] args) {
        int []abc={1,2,300};
        int []xyz={4,5,6};
        int []ccc=new int[abc.length+xyz.length];
        int c=0;
        for(int i=0;i<abc.length;i++)
        {
            ccc[i]=abc[i];
            c++;
        }
        for(int j=0;j<xyz.length;j++)
        {
            ccc[c++]=xyz[j];
        }
        for(int i=0;i<ccc.length;i++)
        {
            System.out.println(ccc[i]);
        }


    }
}