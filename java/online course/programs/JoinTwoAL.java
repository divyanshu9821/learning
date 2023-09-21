// 7. Write a Java program to join two array lists.
import java.util.ArrayList;
import java.util.Scanner;

public class JoinTwoAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al1 = new ArrayList<String>(); // arraylist 1
        ArrayList<String> al2 = new ArrayList<String>(); // arraylist 2

        System.out.print("\nArraylist 1 size? ");
        int size1 = sc.nextInt(); // input size of arraylist 1
        // inputing elements in arraylist 1
        for (int i = 0; i < size1; i++) {
            System.out.print("insert in al1: ");
            al1.add(sc.next());
        }

        System.out.print("\nArraylist 2 size? ");
        int size2 = sc.nextInt(); // input size of arraylist 2
        // inputing elements in arraylist 2
        for (int i = 0; i < size2; i++) {
            System.out.print("insert in al2: ");
            al2.add(sc.next());
        }
        System.out.println("\nBefore merger");
        System.out.println("List 1: "+al1);
        System.out.println("List 2: "+al2);

        al1.addAll(al2); // insert array list 2 to array list 1
        al2.clear();// removing all the elements from array list 2
        System.out.println("\n::After merging two arraylist::");
        System.out.println(al1); // printing arraylist 1
        sc.close();
    }
}

/*
output:- 

$ java lab/JoinTwoAL.java 

Arraylist 1 size? 3
insert in al1: 1
insert in al1: 2
insert in al1: 3

Arraylist 2 size? 4
insert in al2: 1
insert in al2: 2
insert in al2: 3
insert in al2: 4

Before merger
List 1: [1, 2, 3]
List 2: [1, 2, 3, 4]

::After merging two arraylist::
[1, 2, 3, 1, 2, 3, 4] 

*/
