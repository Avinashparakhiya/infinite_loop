

public class recurstion {
    public static void main(String[] args) {
        int n = 1;
        call(n);
    }

    public static void call(int n) {
//        int n;
        if (n == 8)
        {
            return;
        }
        System.out.println(n);
        call(n+1);
    }
}
