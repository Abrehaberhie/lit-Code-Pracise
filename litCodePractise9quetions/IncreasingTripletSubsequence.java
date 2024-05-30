package litCodePractise9quetions;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		int[] x= {2,6,7,8};
	boolean y=	increasingTriplet(x);
	System.out.println(y);
	}
	
	public static boolean increasingTriplet(int[] nums) {
        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;
        
        for(int k:nums){
            if(k<=i){
                i=k;
            }
            else if(k<=j){
                j=k;
            }
            else{
                return true;
            }
        }
        
        return false;
    }

}
