package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class maxFreq_inArr {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,3,5,6,5,3,3,3,3,4,5};
        Map<Integer, Integer> mp = new HashMap<>();
        for (int fre : arr){
            if (!mp.containsKey(fre)){
                mp.put(fre, 1);
            }
            else {
                mp.put(fre, mp.get(fre)+1);
            }
        }
        System.out.println(mp.entrySet());
        int anskey = -1, maxfreq = 0;
        for(var e : mp.entrySet()){
            if(e.getValue() > maxfreq){
                maxfreq = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.println(anskey);
    }
}
