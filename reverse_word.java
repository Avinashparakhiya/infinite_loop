public class reverse_word {
    public static void main(String[] args) {
        String str="avinash nareshbhai parakhiya";
        StringBuilder res=new StringBuilder(" ");
        StringBuilder temp=new StringBuilder(" ");
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if(c==' '){

               res= temp.append(res);
                temp=new StringBuilder(" ");
            }
            else{
                temp.append(c);
            }


        }
        res= temp.append(res);
        System.out.println(res);
    }
}
