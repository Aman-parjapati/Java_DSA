package HeapsOrPriorityQueues;

import java.util.Arrays;

class Student implements Comparable<Student> {
    int rno;
    double perc;
    String name;
    Student(int rno, double perc, String name){
        this.rno = rno;
        this.perc = perc;
        this.name = name;
    }
    public int compareTo(Student s){
        return this.rno - s.rno;  // compares the rno with each other and sorts it
        // similarly for others like for double and string , but in string use charAt(0) for comparing 1st char and charAt(1)
        // for 2 char
    }
}
public class customComparator {
    public static void print(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name+" ");
            System.out.print(arr[i].perc+" ");
            System.out.println(arr[i].rno);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(1, 95.0, "aman");
        s[1] = new Student(2, 96.0, "chirkut");
        s[2] = new Student(3, 97.0, "chitrakut");
        s[3] = new Student(4, 98.0, "amanChirkut");
        print(s);
        Arrays.sort(s);
        print(s);
    }
}
