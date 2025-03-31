package HeapsOrPriorityQueues;

class MinHeap{
    private int[] arr;
    private int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num){
        arr[size++] = num;
        upheapify(size-1);
    }
    public int remove() throws Exception{
        if(size == 0) throw new Exception("Heap is nulla!");
        int peek = arr[0];
        swap(0, size-1);
        size--;
        downheapify(0);
        return peek;
    }
    public void upheapify(int idx){
        if(idx == 0) return;
        int parent = (idx-1)/2;
        if(arr[idx] < arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public void downheapify(int i){
        if(i>=size) return;
        int leftchild = (2*i + 1), rightchild = (2*i + 2);
        int minIdx = i;
        if(leftchild < size && arr[leftchild] < arr[minIdx]) minIdx = leftchild;
        if(rightchild < size && arr[rightchild] < arr[minIdx]) minIdx = rightchild;
        if(i == minIdx) return;
        swap(i, minIdx);
        downheapify(minIdx);
    }
    public int peek() throws Exception{
        if(size == 0) throw new Exception ("Heap is nulla!");
        return arr[0];
    }
    public int size(){
        return size;
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
public class HeapImplementation {
    public static void main(String[] args) throws Exception{
        MinHeap pq = new MinHeap(10);
//        System.out.println(pq.peek());
        pq.add(2);
        pq.add(3);
        pq.remove();
        pq.add(5);
        System.out.println("size: "+pq.size());
        System.out.println("peek: "+pq.peek());
    }
}
