package practise123;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicate123 {
    public static void main(String[] args) {
        String  str="aaavinash";
        char[]ch=str.toCharArray();
        boolean flage=false;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(ch[i]==ch[j])
                {   flage=true;
                    set.add(ch[j]);
                }
            }
        }
      System.out.println(set);
    }
}
