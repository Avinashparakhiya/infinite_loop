import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hasmap_word_count {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the something");
        str = sc.nextLine();
        sumword(str);
    }

    public static void sumword(String str) {
        int count = 0;
        int i = 0;
        Map<String, Integer> summap = new HashMap<>();
        String[] words = str.split(" ");
//        while (true) {
            for (String word : words) {
                if (summap.containsKey(word))
                    summap.put(word, summap.get(word) + 1);
                else
                    summap.put(word, 1);
            }
            System.out.println(summap);
        }
//            break;
        }
