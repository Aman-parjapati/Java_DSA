package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirst_K_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.print("Enter the no. u want to reverse: ");
        int idx = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <idx; i++) {
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        for (int i = 0; i <q.size()-idx; i++) {
            q.add(q.poll());
        }

        System.out.println(q);
    }
}
