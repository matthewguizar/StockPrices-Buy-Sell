import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        System.out.println(best(new int[]{7,9,5,6,3,2}));
    }

    public static String best(int[] prices){
        int maxDiff = 0;
        int lowestSoFar = 0;
        int biggest = Arrays.stream(prices).max().getAsInt();
        
        
        for (int i = 0; i < prices.length; i++) {
            if ( (lowestSoFar == 0 ) || (prices[i] < lowestSoFar) ){
                lowestSoFar = prices[i];
            }
           int diff = prices[i] - lowestSoFar;

            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff + " - buy at " + (biggest - lowestSoFar) + ", sell at " + biggest;
    }
}