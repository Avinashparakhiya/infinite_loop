import java.util.HashMap;

public class has_map {
    public static void main(String[] args) {
        HashMap<String,Integer>object=new HashMap<String,Integer>();
        object.put("one",1);
        object.put("two",2);
        object.put("three",3);
        System.out.println(object.keySet());
        System.out.println(object.get("three"));

    }
}
