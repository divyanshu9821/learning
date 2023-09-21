import java.util.Scanner;

class myException extends Exception {
    myException() {
        System.out.println("Age must be greater than 18");
    }
}

class customException {
    public static void main(String[] args) throws myException {

        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
            sc.close();
            throw new myException();
        }
        else{
            System.out.println("you are eligible for flying");
        }
        sc.close();
    }
}
