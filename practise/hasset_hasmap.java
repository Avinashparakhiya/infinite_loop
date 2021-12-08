package practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class hasett{
    public void aa(){
        HashSet<String>abc=new HashSet<>();
        abc.add("mr");
        abc.add("avinash");
        abc.add("parakhiya");
        abc.add("parakhiya");
        System.out.println(abc);

    }
}
class hasmapp{
    public void bb(){
        HashMap<String,Integer>has_map=new HashMap<String,Integer>();
        has_map.put("avinas",1);
        has_map.put("abhishek",2);
        has_map.put("papa",3);
        has_map.put("mom",4);
        for(String i: has_map.keySet())
        {
            System.out.println("name = "+i+" mobile no = "+ has_map.get(i));
        }

    }
}
class hasset_hasmap{
    public static void main(String[] args) {
        hasett aaa=new hasett();
        aaa.aa();
        hasmapp bbb=new hasmapp();
        bbb.bb();

    }
}
