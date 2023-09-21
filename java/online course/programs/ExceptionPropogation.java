import java.util.Scanner;

public class ExceptionPropogation{

    public static void empty(){
        Scanner sc = new Scanner(System.in);
        String check = sc.next();
        System.out.println(check.charAt(0));
        sc.close();
    }

    public static void main(String[] args){
        try{
            empty();
        }catch(NullPointerException n){
            System.out.println("Empty String");
        }
    }    
    
}