// Write a Program to display all the Armstrong number between 10 to 1000

class armstrong10to1000 {

  protected void checkArmStrong(int num) {
    int temp = num;
    int sumOfCubes = 0;

    while (temp > 0) {
      int cu = temp % 10;
      sumOfCubes += (cu * cu * cu);
      temp /= 10;
    }

    if (sumOfCubes == num) {
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    armstrong10to1000 obj = new armstrong10to1000();

    System.out.println("All the ARMSTRONG Numbers from 10 to 1000\n");
    for (int num = 10; num <= 1000; num++) {
      obj.checkArmStrong(num);
    }
    System.out.println();
  }
}
