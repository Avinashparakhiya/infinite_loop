 class aa{
     int x;


    public void method1() {

        System.out.println(x);
        x++;
    }
}
class callingmethod{
    public static void main(String[] args) {
        aa abc=new aa();
        for(int i=0;i<10;i++) {
            abc.method1();
        }

        System.out.println("helo");

        aa abc2=new aa();
            abc2.method1();


    }
}