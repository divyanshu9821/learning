package Notes.Algorithms;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        int arr[] = new int[elements];
        // input
        for(int i = 0;i<elements;i++)
            arr[i] = sc.nextInt();

        for(int i = 1;i<elements;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }


        //output
        for(int i = 0;i<elements;i++)
            System.out.print(arr[i]+" ");

        sc.close();    
    }
}
