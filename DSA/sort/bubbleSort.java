package Notes.Algorithms;
//putting the largest element at each loop
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        int arr[] = new int[elements];
        for(int i = 0;i<elements;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<elements-1;i++){
            for(int j = 0;j<elements-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0;i<elements;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}