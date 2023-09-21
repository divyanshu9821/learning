import java.util.Scanner;

class martrixSubtraction {

  int[][] inputArray() {
    Scanner sc = new Scanner(System.in);
    int matrix[][] = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("(" + i + "," + j + "): ");
        matrix[i][j] = sc.nextInt();
      }
    }
        sc.close();

    return matrix;
  }

  void matrixSub(int[][] a, int[][] b) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        int sub = a[i][j] - b[i][j];
        System.out.print("\t" + sub);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    martrixSubtraction obj = new martrixSubtraction();
    System.out.println("**Using 3X3 matrix**");
    System.out.println("\nEnter first matrix elements");
    int matrixA[][] = obj.inputArray();
    System.out.println("\nEnter Second matrix elements");
    int matrixB[][] = obj.inputArray();
    System.out.println("\n Subtraction of Matrix A and B (A - B):-\n");
    obj.matrixSub(matrixA, matrixB);
  }
}
