 //static use
 //main method how it works and signature
 //how object and class works


  class A{

    static  A obj=new A();

   static int x=10;


   static void method(){
        System.out.println("hello method1");
    }
}




 class printdemo {
    public static void main(String[] args) {

        System.out.println(A.x);
        A.method();

//
//       A.obj.method();
//       System.out.println("qwertyui");


    }
}
