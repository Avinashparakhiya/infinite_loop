public class count_chracter {
    public static void main(String[] args) {
        String str = "avinash";
        char a = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                count++;
        }
        System.out.println();
    }
}