import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sort_elementarray {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter Element");
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String stop = "w";

        while (!stop.equals("q")) {
            int x = sc.nextInt();
            list.add(x);


//            stop=covert_into_long.next();
//        }
            int array[] = new int[list.size()];


//        i = sc.nextInt();
//        System.out.println("After Sorting Element");
            // int[] array = new int[i];
            for (int j = 0; j < list.size(); j++) {
                array[j] = list.get(j);
            }
            Arrays.sort(array);
            System.out.println("After Sorting Element");
            for (int element : array) {
                System.out.println(element);
            }

        }
    }
}