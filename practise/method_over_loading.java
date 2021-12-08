package practise;
class overloading{
    public void result(int i,int j){
        System.out.println(i+j);
    }
    public void result(int i,int j,int z){
        System.out.println(i+j+z);
    }
}





public class method_over_loading {
    public static void main(String[] args) {
        overloading aaa=new overloading();
        aaa.result(6,9,9        );
        System.out.println(aaa);
    }
}
