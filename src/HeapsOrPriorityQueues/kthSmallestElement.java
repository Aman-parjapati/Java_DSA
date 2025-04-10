package HeapsOrPriorityQueues;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestElement {
    public static void main(String[] args) {

        // method 1 using min heap --> more time complexity
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {1,-2,4,8,-1,0};
        int k1 = 4;
        for(int ele : arr) pq.add(ele);  // add all the element
        for (int i = 0; i <k1-1; i++) pq.remove();
        System.out.println("peek element is: "+pq.peek());

        // using max heap
        PriorityQueue<Integer> rpq = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr1 = {1,-2,4,8,-1,0};
        int k = 4;
        for(int ele1 : arr1){
            rpq.add(ele1);
            if(rpq.size() > k) rpq.remove();
        }
        System.out.println("peek element is: "+rpq.peek());
    }
}