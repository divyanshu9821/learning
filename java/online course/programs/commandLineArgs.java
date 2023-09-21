class commandLineArgs {
  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int add = a + b;
      int sub = a - b;
      int mul = a * b;
      int div = a / b;
      int mod = a % b;
      System.out.println("Addition: " + add);
      System.out.println("Subtraction: " + sub);
      System.out.println("Multiplication: " + mul);
      System.out.println("Division: " + div);
      System.out.println("Remainder: " + mod);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Msg! Pass two numbers in command line arguments");
    } catch(NumberFormatException e){
      System.out.println("Msg! Pass only numbers in command line arguments");
    }
  }
}