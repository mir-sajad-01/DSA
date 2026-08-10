public class _182_Tries {
    public static class node {
        node children[] = new node[26];
        boolean eow = false; // eow = end of word

        node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static node root = new node();

    public static void insert(String word) {
        node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int indx = word.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){
        node curr = root ;
        for( int level = 0 ; level < key.length();level++ ){
            int indx = key.charAt(level) - 'a';
            if(curr.children[indx] == null){
                return false;
            }
            curr = curr.children[indx];
        }
        return curr.eow == true;
    }
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for( int i = 1 ; i<= key.length();i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] = { "i", "like" , "sam", "samsung", "mobile", "ice" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("child"));
        System.out.println(search("there"));
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}