import java.util.Scanner;

class salaryCalc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter you salary: ");
    double base = sc.nextDouble();
    double da = base*0.12;
    double hra = base*0.13; 
    double pf = base*0.15;
    double gross = base+da+hra+pf;

    System.out.println("\nBase salary:\t\t"+base);
    System.out.println("Dearness Allowance:\t"+da);
    System.out.println("House Rent Allowance:\t"+hra);
    System.out.println("Provident Fund:\t\t"+pf);
    System.out.println("\nGROSS SALARY:\t\t"+gross);
    sc.close();
  }
}
