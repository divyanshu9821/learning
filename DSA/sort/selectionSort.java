package Notes.Algorithms;
import java.util.Scanner;

//select the smallest element at the start
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        int arr[] = new int[elements];
        for(int i = 0;i<elements;i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < elements - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < elements; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i<elements;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}
