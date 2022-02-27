package array_copy;

import java.util.Arrays;

public class Array_copy {

    public static void main(String[] args) {
       
        int[] ar = {1,2,3,4,5};
        
        int[] ar2 = {1,2,3,4,5,6,7,8,9,10};
        
        System.arraycopy(ar, 2, ar2, 4, 3);
        
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));
        
    }
    
}
