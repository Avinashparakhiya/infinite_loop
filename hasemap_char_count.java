import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hasemap_char_count {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
        hasemap_char_count.str(str);
    }

    public static void str(String str) {
        Map<Character, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (sumMap.containsKey(c)) {
                sumMap.put(c, sumMap.get(c) + 1);
            } else {
                sumMap.put(c, 1);
            }
        }
        System.out.println(sumMap);

    }
}
