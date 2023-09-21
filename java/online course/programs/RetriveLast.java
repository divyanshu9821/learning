// 1. Write a Java program to retrieve, but not remove, the last element of a linked list.


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class RetriveLast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();
        System.out.print("No of elements? ");
        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
            System.out.print("insert: ");
            ll.add(sc.next()); // adding element in the list
        }


        Iterator<String> itr = ll.descendingIterator(); // point to the first element after reversing list
        System.out.println("\nLast element in linkedlist: "+itr.next()); // last element of the original list is now the first element
        sc.close();
    }
}

/* 
output:-

$ java lab/RetriveLast.java 
No of elements? 4
insert: 12
insert: 3
insert: 4
insert: 332

Last element in linkedlist: 332 
*/
