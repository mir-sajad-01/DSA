public class _89_tillingprob {
    public static int tillingprob(int n) {
        if (n == 0|| n==1) {
            return 1;
        }
        // vertical
        int vertical = tillingprob(n - 1);
        // horizontal
        int horizontal = tillingprob(n - 2);
        int total = vertical + horizontal ;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(tillingprob(4));
    }
}
/* 
Absolutely, let's break it down step by step:

The initial call is tillingprob(4).

It makes two recursive calls:
tillingprob(3)
tillingprob(2)
Both of these calls have both vertical and horizontal parts.
Focus on the tillingprob(2) call:

It makes a vertical call to tillingprob(1), which returns 1.
It also makes a horizontal call to tillingprob(0), which returns 1.
The total for tillingprob(2) is 1 (from vertical) + 1 (from horizontal) = 2.
The total value of 2 is used in the calculation of the total for the original call tillingprob(4).

Now, let's go back to the tillingprob(3) call:

It makes a vertical call to tillingprob(2), which returns 2 (the total from the previous step).
It also makes a horizontal call to tillingprob(1), which returns 1.
The total for tillingprob(3) is 2 (from vertical) + 1 (from horizontal) = 3.
The total value of 3 is used in the calculation of the total for the original call tillingprob(4).

Finally, for the original call tillingprob(4):

It adds the total from the vertical call (tillingprob(3)), which is 3.
It adds the total from the horizontal call (tillingprob(2)), which is 2.
The final result for tillingprob(4) is 3 + 2 = 5.
I hope this step-by-step breakdown helps clarify the sequence of calculations. If you have further questions or need additional clarification, feel free to ask!*/