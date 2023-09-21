// 6. Write a Java program to convert a linked list to an array list.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LLToAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating linkedlist
        LinkedList<String> ll = new LinkedList<String>();
        System.out.print("\nSize of linkedlist? ");
        // input size of linkedlist
        int size = sc.nextInt();
        // inputing elements 
        for(int i = 0;i<size;i++){
            System.out.print("insert: ");
            ll.add(sc.next());
        }

        // creating arraylist from the linkedlist elements
        ArrayList<String> al = new ArrayList<>(ll);
        ll.clear(); // removing all the elements from the linkedlist
        // printing the array list
        System.out.println("\nArraylist after being converted from linkedlist");
        System.out.println(al);
        
        
        
        
        sc.close();
    }
}

/*
output:- 


$ java lab/LLToAL.java

Size of linkedlist? 5
insert: 1
insert: 2
insert: 3
insert: 3
insert: 4

Arraylist after being converted from linkedlist
[1, 2, 3, 3, 4]

*/