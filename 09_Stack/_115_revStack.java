import java.util.*;

public class _115_revStack {
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int indx = 0;
        while (indx < str.length()) {
            s.push(str.charAt(indx));
            indx++;
        }
        StringBuilder sb = new StringBuilder("");
        while (!s.empty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverse(str));
    }
}
