import java.util.ArrayList;

class arrayToArraylist {
    public static void main(String[] args){
        int arr[]  = {1,2,3,4,5};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            al.add(arr[i]);
        }

        System.out.println(al);
    }    
}
