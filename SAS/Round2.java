package SAS;

import java.util.HashMap;
import java.util.Map;

public class Round2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 7, 5, 8, -1};
        int target = 7;	 
        
        Map<Object, Object> map = new HashMap<>();
        for(int num: arr){ // 2
            int c = target - num; // 5
            
            if(map.containsKey(c)){ // check 5 0
                System.out.println( c + " " + num);
            }
            map.put(num, 1); // 2
        }
        
        
    }
}
