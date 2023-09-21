// 2. Write a Java program to join two linked lists.
import java.util.LinkedList;
import java.util.Scanner;

public class JoinTwoLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>(); // list 1
        LinkedList<String> ll2 = new LinkedList<String>(); // list 2

        System.out.print("\nNo of elements in List 1? ");
        int sizeList1 = sc.nextInt();
        // insert element in list 1
        for (int i = 0; i < sizeList1; i++) {
            System.out.print("insert: ");
            ll.add(sc.next());

        }

        System.out.print("\nNo of elements in List 2? ");
        int sizeList2 = sc.nextInt();
        // inserting element in list 2
        for (int i = 0; i < sizeList2; i++) {
            System.out.print("insert: ");
            ll2.add(sc.next());
        }

        System.out.println("\nBefore merger");
        System.out.println("List 1: "+ll);
        System.out.println("List 2: "+ll2);
        ll.addAll(ll2); // adding list 2 to list 1
        ll2.clear(); // removing all the element from list 2
        
        System.out.println("\n-----After merging-----");
        System.out.println(ll);
        sc.close();
    }
}

/* 
output:-

$ java lab/JoinTwoLL.java

No of elements in List 1? 5
insert: 45
insert: 5
insert: 3
insert: r
insert: e

No of elements in List 2? 3
insert: dfd
insert: df
insert: ff

Before merger
List 1: [45, 5, 3, r, e]
List 2: [dfd, df, ff]

-----After merging-----
[45, 5, 3, r, e, dfd, df, ff]

 */
