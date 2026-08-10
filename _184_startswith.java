public class _184_startswith {

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

    public static void findprefix(node root, String ans) {
        if (root == null) {
            return;
        }
        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findprefix(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }
    public static boolean startswith (String prefix){  // O(L)
        node curr = root;
        for ( int i = 0 ;i < prefix.length();i++ ){
            int indx = prefix.charAt(i) - 'a';
            if(curr.children[indx]== null){
                return false;
            }
            curr = curr.children[indx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "apple","app","mango","man","woman" };
        String prefix1 = "app";
        String prefix2 = "moon";
        for(int i = 0 ;i<words.length ;i++){
            insert(words[i]);
        }
        System.out.println(startswith(prefix1));
        System.out.println(startswith(prefix2));
    }
}
