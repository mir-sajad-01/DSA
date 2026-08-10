import java.util.*;

public class _168_WeakesSoldier {
    public static class row implements Comparable<row> {
        int soldiers;
        int indx;

        row(int soldiers, int indx) {
            this.soldiers = soldiers;
            this.indx = indx;
        }

        public int compareTo(row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.indx - r2.indx;
            } else {
                return this.soldiers - r2.soldiers;
            }
        }
    }

    public static void main(String[] args) {
        int army[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };
                int k = 2;
        PriorityQueue<row> pq = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new row(count, i));
        }
        for ( int i= 0 ;i<k ;i++){
            System.out.println("R"+pq.remove().indx);
        }
    }
}
