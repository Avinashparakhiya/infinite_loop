import java.util.HashMap;
import java.util.Map;

class hashmap_countword_without_split {
    public static void main(String[] args) {
        String str="avinash";
        StringBuilder temp=new StringBuilder(" ");
        String [] ary=new String[4];
        int index=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if(c==' '){

               ary[index]=temp.toString();
               index=index+1;
                temp=new StringBuilder("");
            }
            else{
                temp.append(c);
            }

        }
        ary[index]=temp.toString();
        index=index+1;
        temp=new StringBuilder(" ");

        //----------------------
        Map<String, Integer> summap = new HashMap<>();
        for (String word : ary) {
            if (summap.containsKey(word))
                summap.put(word, summap.get(word) + 1);
            else
                summap.put(word, 1);
        }
        System.out.println(summap);
    }
}
