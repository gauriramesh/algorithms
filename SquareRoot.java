import java.util.ArrayList;

public class SquareRoot {
    public static int sqrt(int x) {
        if( x < 0 ) {
            return -1;
        }
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        for(int i = 1; i <= x; i++) {
            sequence.add(i);
        }
        int low = 0;
        int high = sequence.size() - 1;
        double mid = Math.floor((low + high) /2);
        while(low <= high) {
            mid = Math.floor((low + high) /2);
            if(sequence.get((int) mid) * sequence.get((int) mid) == x) {
                return sequence.get((int)mid);
            }
            else if(sequence.get((int) mid) * sequence.get((int) mid) < x) {
                low = (int) mid + 1;
                return (int) mid;
            }
            else if(sequence.get((int) mid) * sequence.get((int) mid) > x) {
                high = (int) mid -1;
            }
        }

        return -1;

    }

    public static void main(String [] args) {
        System.out.println(sqrt(8));
    }
}
