import java.util.Date;

public class data_and_time{
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println(date.toLocaleString());
    }
}
