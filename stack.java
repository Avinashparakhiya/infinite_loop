import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack();
        stack.push(10);
        stack.push(45);
        stack.push(11);
        int popp=stack.peek();

        System.out.println(popp);

   }
}
