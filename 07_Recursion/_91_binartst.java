public class _91_binartst {
    public static void binst ( int n, int lastpalace , String st){
        if ( n==0){
            System.out.println(st);
            return ;
        }
        binst(n-1,0,st+"0");
        if ( lastpalace == 0 ){
            binst(n-1, 1,st+"1");
        }
    }
    public static void main(String[] args) {
        binst (3 , 0 , "" );
    }
}
/* 
Initial Call from main():

binst(4, 0, "") is called from the main() method.
Parameters: n = 4, lastpalace = 0, st = "".
First Recursive Call (binst(3, 0, "0")):

Parameters: n = 3, lastpalace = 0, st = "0".
Inside the method:
It calls binst(2, 0, "00").
It also checks lastpalace == 0, then calls binst(2, 1, "01").
Second Recursive Call (First Branch) (binst(2, 0, "00")):

Parameters: n = 2, lastpalace = 0, st = "00".
Inside the method:
It calls binst(1, 0, "000").
It also checks lastpalace == 0, then calls binst(1, 1, "001").
Third Recursive Call (First Branch) (binst(1, 0, "000")):

Parameters: n = 1, lastpalace = 0, st = "000".
Inside the method:
It calls binst(0, 0, "0000").
Since n is 0, it prints "0000".
Fourth Recursive Call (Second Branch) (binst(1, 1, "001")):

Parameters: n = 1, lastpalace = 1, st = "001".
Inside the method:
It calls binst(0, 0, "0010").
Since n is 0, it prints "0010".
Backtrack to Previous Call (binst(2, 0, "00")):

The second recursive call finished, now it continues with the remaining code in the method.
It has no more code to execute, so it returns to its caller.
Fifth Recursive Call (Second Branch of First Recursive Call) (binst(2, 1, "01")):

Parameters: n = 2, lastpalace = 1, st = "01".
Inside the method:
It calls binst(1, 0, "010").
It also checks lastpalace == 0, then calls binst(1, 1, "011").
Similar recursion happens as we saw earlier.
Backtrack to Previous Call (binst(3, 0, "0")):

The second recursive call finished, now it continues with the remaining code in the method.
It has no more code to execute, so it returns to its caller.
Backtrack to Initial Call (binst(4, 0, "")):

Both recursive calls have finished.
It has no more code to execute, so it returns to the main() method.
This process continues until all recursive calls are complete, printing all possible binary strings of length 4
*/