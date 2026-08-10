public class _88_removedup {
    public static void removedup(String str , int indx , StringBuilder newstr , boolean map[]){
        if ( indx == str.length()){
            System.out.println(newstr);
            return ;
        }
        char curchar = str.charAt(indx);
        if (map[curchar-'a'] == true ){
           // duplicate 
           removedup(str , indx+1 , newstr , map);
        }
        else{
            map[curchar-'a'] = true;
            removedup(str,indx+1,newstr.append(curchar),map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollage";
        removedup(str,0,new StringBuilder(""), new boolean[26]);
    }
}
