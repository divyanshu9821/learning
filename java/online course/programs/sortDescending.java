import java.util.Scanner;

public class sortDescending {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int arrSize = sc.nextInt();
    int array[] = new int[arrSize];
    System.out.println("Enter Elements below:");
    for(int i = 0;i<arrSize;i++){
      array[i] = sc.nextInt();
    }

    for(int i = 0;i<array.length;i++){
      for(int j = 0;j<array.length;j++){
        if(array[i]>array[j]){
          int temp  =array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    System.out.print("Elements in Descending order:");
    for (int i = 0; i < array.length; i++) {
      System.out.print(" "+array[i]);
    }
        sc.close();

  }
}
