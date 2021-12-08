import java.util.HashSet;

//class practise123{
//    public static void main(String[] args) {
//        int[]arr={1,2,2,5,8,6,8};
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]==arr[j])
//                {
//                   System.out.println("The duplicate element is = "+arr[j]);
//                }
//            }
//        }
//    }
//
//}
class practise123{
    public static void main(String[] args) {
       String abc="aabbccsss";
       char[]ch=abc.toCharArray();
       boolean flag=false;
        HashSet<Character>set=new HashSet<Character>();

        for(int i=0;i<abc.length();i++)
        {
            for(int j=i+1;j<abc.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    flag=true;
                    set.add(ch[j]);
                }
            }
        }
        System.out.println(set);

        if(flag==true){
            System.out.println("  yes");
        }
        else {
            System.out.println("No");
        }

    }
}