import java.util.Random;

public class random_numbergenrate {
    public static void main(String[] args) {
        Random rnumber=new Random();
        System.out.println("random numbergenrate below");
        for(int i=0;i<1;i++)
        {
            System.out.print("  "+rnumber.nextInt(10));
        }
    }
}
