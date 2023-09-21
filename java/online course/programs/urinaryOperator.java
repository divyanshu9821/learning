public class urinaryOperator {
  public static void main(String[] args){
    int num = 5;
    System.out.println("\nCurrent Value: "+ num);
    System.out.println("\npost increment applied: "+ num++);
    System.out.println("value NOT changed, as value assigned BEFORE increasing by 1");
    System.out.println("value changes now: "+num);

    System.out.println("\nCurrent Value: "+ num);
    System.out.println("\npre increment applied: "+ ++num);
    System.out.println("value changed, as value assigned AFTER increasing by 1");

    System.out.println("\nCurrent Value: "+ num);
  }
}
