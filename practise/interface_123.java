package practise;

    class test implements a,b{
         public void display1()
        {
            System.out.println("interface 1");
        }
        public void display2()
        {
            System.out.println("interface 2");
        }
    }

    class interface_123{
     public  static void main(String[] args) {
            test t=new test();
            t.display1();
            t.display2();
        }
    }
