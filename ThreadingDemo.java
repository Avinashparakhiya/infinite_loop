import org.w3c.dom.ls.LSOutput;

public class ThreadingDemo{
    public static void main(String[] args)throws InterruptedException {
    thread1 test=new thread1();
    test.start();
    test.join();

        try
        {
            Thread.sleep(1000);
        } catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println();
        thread2 test2=new thread2();
        test2.start();
    }
}


class thread1 extends Thread {
    public void run() {
        String str = "i am avinash";
        for (int i = 0; i < str.length(); i++)
        {
            try
            {
                Thread.sleep(100);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.print(str.charAt(i));
        }
    }
}

class thread2 extends Thread{
    public void run(){
        String str="--after 2nd string print";
        for(int i=0;i<str.length();i++)
        {
        try
        {
        Thread.sleep(100);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
            System.out.print(str.charAt(i));
        }
    }
}
