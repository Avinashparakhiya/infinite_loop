import java.util.Scanner;

    class optimize_count_characterall {
        public static void main(String[] args) {

            String str="dqwerty";
            int ary[]=new int[26];
            int j;
            for (j = 0; j < str.length(); j++) {
                char c= str.charAt(j);
                int index= (c-'a');
                 ary[index]=ary[index]+1;
            }
            for(int i=0;i<26;i++){

                System.out.println("ary of "+(char)(i+'a')+" index=" +ary[i]);
            }

        }
    }










