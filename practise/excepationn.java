package practise;

public class excepationn {
    public static void main(String[] args) {
        int i=2;
        int j=5;
        int c=i+j;
        try {
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(i+j+i);
        }
    }
}
