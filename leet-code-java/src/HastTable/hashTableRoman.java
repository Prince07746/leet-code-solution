package HastTable;
import java.util.HashMap;

public class hashTableRoman {
    public static void main(String[] args){

        System.out.println(romanToInt("IXXV"));

    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            if ( i < s.length()- 1 && current < romanMap.get(s.charAt(i+1))) {
                number -= current;
            } else {
                number += current;
            }
        }

        return number;
    }
}
