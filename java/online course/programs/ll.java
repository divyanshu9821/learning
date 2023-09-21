import java.util.Iterator;
import java.util.LinkedList;
class ll{
    public static void main(String[] args) {
        LinkedList<String> dll= new LinkedList<String>();
        dll.add("Div");
        dll.add("shubh");
        dll.add("nik");
        dll.add("abhi");
        LinkedList<String> newDll = new LinkedList<>(dll);
        
        while(!newDll.isEmpty()){
            System.out.println(newDll.removeFirst());
        }

        System.out.println();
        
        Iterator<String> it = dll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }        
    }
}