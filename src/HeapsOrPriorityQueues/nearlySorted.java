package HeapsOrPriorityQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class nearlySorted {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k= 3;
        List<Integer> list = new ArrayList<>();
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k) list.add(pq.remove());
        }
        while (!pq.isEmpty()) list.add(pq.remove());
        System.out.println("List: "+list);
    }
}
