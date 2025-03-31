package Hashmap;

import java.util.HashMap;
import java.util.LinkedList;

public class Hashing_Implementation {
    public static class myhashmap<K, V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float LOAD_FACTOR = 0.75f;

        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;

        private LinkedList<Node>[] Buckets;

        private void initBuckets(int N){
            Buckets = new LinkedList[N];
            for (int i = 0; i < Buckets.length; i++) {
                Buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key){
            int hc = key.hashCode();
            return Math.abs(hc)%Buckets.length;
        }

//      traverses the ll and looks for a node with key, if found  it returns it's idx else return null
        private int searchInBucket(LinkedList<Node> ll, K key){
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node>[] oldbuckets = Buckets;
            n = 0;
            initBuckets(oldbuckets.length * 2);
            for(var bucket : oldbuckets){
                for(var node : bucket){
                    put(node.key, node.value);
                }
            }
        }

        public  myhashmap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity(){
            return Buckets.length;
        }

        public float load(){
            return (float) n/ Buckets.length;
        }

        int size(){
            return n;
        }

        void put(K key, V value){
            int bi =HashFunc(key);
            LinkedList<Node> currbucket = Buckets[bi];
            int ei = searchInBucket(currbucket, key);
            if(ei == -1){ // key doesn't exists, insert a new node
                Node node = new Node(key, value);
                currbucket.add(node);
                n++;
            } else {  // update case
                Node currNode = currbucket.get(ei);
                currNode.value = value;
            }
            if(n >= Buckets.length * LOAD_FACTOR)  {
                rehash();
            }
        }

        V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = Buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if((ei != -1)){  // key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            // key doesn't exists
            return null;
        }

        V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = Buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1){
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove();
                n--;
                return  val;
            }
            // key doesn't exists
            return null;
        }

    }


    public static void main(String[] args) {
        myhashmap<String, Integer> mp = new myhashmap<>();
        mp.put("aman", 18);
        mp.put("akp", 19);
        mp.put("naman", 20);
        mp.put("chocho", 50);

        System.out.println("Testing get:");
        System.out.println(mp.get("aman"));
        System.out.println(mp.get("naman"));
        System.out.println(mp.get("akp"));
        System.out.println(mp.get("chaman"));
        System.out.println();

        System.out.println("Testing size:");
        System.out.println(mp.size());
        System.out.println();

        System.out.println("Testing remove:");
        System.out.println(mp.remove("aman"));
        System.out.println(mp.remove("chaman"));

        System.out.println(mp.size());
        System.out.println("capacity: "+mp.capacity());
        System.out.println("Load factor: "+mp.load());
    }
}
