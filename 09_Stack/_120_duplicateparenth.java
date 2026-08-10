import java.util.*;

public class _120_duplicateparenth {
    public static boolean isduplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                s.push(ch);
            }
            // closing
            else if (ch == ')') {
                if (s.isEmpty()) {
                    return true;
                }
                s.pop();
                if (!s.isEmpty() && s.peek() == '(') {
                    return true;
                }

            } else {
                continue;
            }
        }
        return s.size() > 0;
    }

    public static void main(String[] args) {
        // valid string
        String str = "(((a + b ))))";// true;
        System.out.println(isduplicate(str));
    }
}
