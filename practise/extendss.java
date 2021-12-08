package practise;

class a123{
    void class1()
    {
        System.out.println("calling 1");
    }
}
class b123 extends a123{
    void class2()
    {
        System.out.println("calling 2");
    }
}


public class extendss {
    public static void main(String[] args) {
        b123 call=new b123();
        call.class2();
        a123 calll=new a123();
        calll.class1();
    }
}
