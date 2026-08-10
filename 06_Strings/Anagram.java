import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if(!map.containsKey(ch)){
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }
}


// class Solution {
//     public boolean isAnagram(String s, String t) {

//         if(s.length() != t.length()){
//             return false;
//         }

//         int[] count = new int[26];

//         for(int i = 0; i < s.length(); i++){
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }

//         for(int i = 0; i < 26; i++){
//             if(count[i] != 0){
//                 return false;
//             }
//         }

//         return true;
//     }
// }