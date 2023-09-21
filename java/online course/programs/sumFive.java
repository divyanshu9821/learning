public class sumFive {
  public static void main(String[] args) {
    try{
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      int d = Integer.parseInt(args[3]);
      int e = Integer.parseInt(args[4]);
      System.out.println(a+b+c+d+e);
    }catch(ArrayIndexOutOfBoundsException error){
      System.out.println("\nerrorMsg: Enter 5 numbers");
    }
    catch(NumberFormatException error){
      System.out.println("\nerrorMsg: Enter only numeric values.");
    }
  }
}
