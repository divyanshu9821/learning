// 5. Write a Java program to iterate a linked list in reverse order.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class printReverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();
        System.out.print("\nNo of elements? ");
        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
            System.out.print("insert: ");
            ll.add(sc.next()); // adding element in the linkedlist
        }
        
        System.out.println("\n::Reverse order of linkedlist::");        
        Iterator<String> itr = ll.descendingIterator(); // point to the first element after reversing list
        while(itr.hasNext()){ // true if element is present
            System.out.print(itr.next()+" "); // print element
        }
        sc.close();
    }
}
/* output:-

$ java lab/printReverse.java 

No of elements? 7
insert: 56
insert: 5
insert: 454
insert: 43
insert: 65                                  
insert: 6
insert: 5343

::Reverse order of linkedlist::
5343 6 65 43 454 5 56

 */