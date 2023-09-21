import java.util.Scanner;
class sumOfSquareArr{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int arrSize = sc.nextInt();
    System.out.println("\nEnter "+arrSize+" elements below:-");
    int arr[] = new int[arrSize];
    int ans = 0;
    for(int i = 0;i<arrSize;i++){
      arr[i] = sc.nextInt();
      ans+=(arr[i]*arr[i]);
    }
    System.out.println("\nSOS: "+ans);
    System.out.println();
    sc.close();
  }
}