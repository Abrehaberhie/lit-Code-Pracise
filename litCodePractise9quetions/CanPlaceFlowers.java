package litCodePractise9quetions;

import java.util.List;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		
        int[] flowerbed= {2,65,8,2,9,8};
        Boolean result = canPlaceFlowers(flowerbed, 20);
        
        System.out.println(result);
        
	
	

}
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n==0) return true;
        for (int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && (i==0||flowerbed[i-1]==0)&&(i==flowerbed.length-1 || flowerbed[i+1]==0)){
                n--;
                if (n==0) return true;
                flowerbed[i]=1;
            }
        }
        return false;

}
}
