import java.util.Scanner;

public class inserstion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 0, 8, 6, 3};
        int temp, j, i;
        for (i = 0; i < a.length; i++) {
            int index=i;
            for (j = i-1; j >= 0; j--) {
                if (a[j] > a[index]) {
                    temp = a[index];
                    a[index] = a[j];
                    a[j] = temp;

                    index=j;
                }

            }
        }
       for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
