import java.util.ArrayList;
import java.util.Collections;

public class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //adding elements in list
        list.add(2);
        list.add(3);
        list.add(7);
        System.out.println(list);

        
        //getting elements from the list
        System.out.println(list.get(1));

        //add element in between
        list.add(1,9);
        System.out.println(list);

        //set element in list
        list.set(3,0);//this will replace the element
        System.out.println(list);

        //delete element from the list
        list.remove(2);
        System.out.println(list);

        //to get the size of list
        System.out.println(list.size());

        //sort list
        Collections.sort(list);
        System.out.println(list);
        
    }   
}