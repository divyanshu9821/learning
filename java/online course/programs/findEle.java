import java.util.Scanner;

class findEle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int arrSize = sc.nextInt();
    int array[] = new int[arrSize];
    System.out.println("Enter Elements below:");
    for(int i = 0;i<arrSize;i++){
      array[i] = sc.nextInt();
    }
    System.out.print("Enter Element you want to find: ");
    int ele = sc.nextInt();

    boolean present = false;
    System.out.print(ele+" present at index:");
    for(int i = 0;i<arrSize;i++){
      if(array[i]==ele){
        System.out.print(" "+i);
        present = true;
      }
    }
    if(!present) System.out.print(" N/A");
    System.out.println();

    sc.close();



  }
}
