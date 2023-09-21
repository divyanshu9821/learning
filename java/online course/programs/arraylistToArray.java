import java.util.ArrayList;
class arraylistToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        int arr[] = new int[al.size()];
        for(int i = 0;i<al.size();i++){
            arr[i] = al.get(i);
        }

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
