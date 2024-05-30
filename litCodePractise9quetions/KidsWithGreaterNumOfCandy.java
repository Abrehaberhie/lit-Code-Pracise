package litCodePractise9quetions;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreaterNumOfCandy {

	public static void main(String[] args) {
        int[] candies = {13, 32, 3, 2,4,6,23, 5};
        
        List<Boolean> result = kidsWithCandies(candies, 20);
        System.out.println(result);
    }
    
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++) {
            if((candies[i] + extraCandies) >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}


