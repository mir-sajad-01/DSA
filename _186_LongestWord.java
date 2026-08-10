public class _186_LongestWord {
        static class node {
            node[] children = new node[26];
            boolean eow = false;
            int freq;
    
            node() {
                for (int i = 0; i < children.length; i++) {
                    children[i] = null;
                }
                freq = 1;
            }
        }
    
        public static node root = new node();
    
        public static void insert(String word) {
            node curr = root;
            for (int i = 0; i < word.length(); i++) {
                int indx = word.charAt(i) - 'a';
                if (curr.children[indx] == null) {
                    curr.children[indx] = new node();
                } else {
                    curr.children[indx].freq++;
                }
                curr = curr.children[indx];
            }
            curr.eow = true;
        }
    
        public static String ans = "";
        public static void longestWord(node root, StringBuilder temp){
            if (root == null){
                return;
            }
            for(int i =0 ;i<26; i++){
                if(root.children[i] != null && root.children[i].eow == true){
                    char ch = (char)(i+'a');
                    temp.append(ch);
                    if(temp.length()>ans.length()){
                        ans = temp.toString();
                    }
                    longestWord(root.children[i],temp);
                    temp.deleteCharAt(temp.length()-1); // backtrack
                }
            }
        }
        public static void main(String[] args) {
         
            String words[] = {"a","banana","app","appl","ap","apple","apply"};
            for(int i = 0 ;i<words.length ;i++){
                insert(words[i]);
            }
            longestWord(root,new StringBuilder(""));
            System.out.println(ans);
        }
    }
    
