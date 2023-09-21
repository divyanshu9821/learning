// 4. Write a Java program to replace the second element of an ArrayList with the specified element.
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceSecond {
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
        // print current arraylist
        System.out.println("\nYour arraylist:-\n"+al);

        // input new element
        System.out.print("\nNew element? ");
        String newEle = sc.next();

        System.out.println("\n::ArrayList after replaces the old element with the new one::");
        // using set method to put new element in the 1st index, here 1st index is the second place at there is 0 based indexing
        al.set(1,newEle);

        // print arraylist after updation
        System.out.println(al);
        sc.close();
    }
}

/* 
output:-

$ java lab/ReplaceSecond.java

Size of ArrayList? 5
insert: 1
insert: 2
insert: 3
insert: 4
insert: 5

Your arraylist:-
[1, 2, 3, 4, 5]

New element? 7

::ArrayList after replaces the old element with the new one::
[1, 7, 3, 4, 5]

*/