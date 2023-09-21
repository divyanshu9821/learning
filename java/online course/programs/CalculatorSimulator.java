import java.util.Scanner;

class CountryNotValidException extends Exception {
    CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {
    Double calculateTax(String empName, double empSal, boolean isIndian)
            throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
        if (empName.equals(null) || empName.equals(""))
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        if (isIndian == false)
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");

        if (empSal >= 100000)
            return empSal * 0.08;
        if (empSal >= 50000 && empSal < 100000)
            return empSal * 0.06;
        if (empSal >= 30000 && empSal < 50000)
            return empSal * 0.05;
        if (empSal >= 10000 && empSal < 30000)
            return empSal * 0.04;

        throw new TaxNotEligibleException("The employee does not need to pay tax");
    }
}

public class CalculatorSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaxCalculator tc = new TaxCalculator();
        System.out.print("No of TestCases? ");
        int TestCases = sc.nextInt();
        for (int i = 0; i < TestCases; i++) {
            
            String name;
            boolean indian;
            double salary;
            System.out.print("Name? ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Salary? ");
            salary = sc.nextDouble();
            System.out.print("isIndian?[y/n] ");
            if (sc.next().charAt(0) == 'y')
                indian = true;
            else
                indian = false;
            System.out.println();
            try {
                double tax = tc.calculateTax(name, salary, indian);
                System.out.printf("Tax amount is %.2f\n", tax);
            } catch (EmployeeNameInvalidException enie) {
                // System.out.print();
                enie.printStackTrace();
            } catch (TaxNotEligibleException tnee) {
                // System.out.println();
                tnee.printStackTrace();
            } catch (CountryNotValidException cnve) {
                // System.out.println();
                cnve.printStackTrace();
            }
            System.out.println();

        }
        sc.close();
    }
}

// output
/* 
No of TestCases? 4
Name? Ron
Salary? 34000
isIndian?[y/n] n

CountryNotValidException: The employee should be an Indian citizen for calculating tax        at TaxCalculator.calculateTax(CalculatorSimulator.java:27)
        at CalculatorSimulator.main(CalculatorSimulator.java:65)

Name? Tim
Salary? 1000
isIndian?[y/n] y

TaxNotEligibleException: The employee does not need to pay tax    
        at TaxCalculator.calculateTax(CalculatorSimulator.java:38)
        at CalculatorSimulator.main(CalculatorSimulator.java:65)  

Name? Jack
Salary? 55000 
isIndian?[y/n] y

Tax amount is 3300.00

Name?
Salary? 30000
isIndian?[y/n] y

EmployeeNameInvalidException: The employee name cannot be empty   
        at TaxCalculator.calculateTax(CalculatorSimulator.java:25)
        at CalculatorSimulator.main(CalculatorSimulator.java:65)  

*/
