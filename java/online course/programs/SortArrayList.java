// 3. Write a Java program to sort a given array list.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating array list
        ArrayList<String> al = new ArrayList<String>();
        System.out.print("\nSize of ArrayList? ");
        // input size of arraylist
        int size = sc.nextInt();
        // take elements from user and put into arraylist
        for(int i = 0;i<size;i++){
            System.out.print("insert: ");
            al.add(sc.next());
        }
        // sort function provided by collection framework
        Collections.sort(al);
        System.out.println("\nAfter sorting the arraylist");
        System.out.println(al);
        sc.close();
    }
}


/* 
output: -

$ java lab/SortArrayList.java

Size of ArrayList? 5
insert: 34
insert: 78
insert: 56
insert: 45
insert: 12

After sorting the arraylist
[12, 34, 45, 56, 78]       

 */