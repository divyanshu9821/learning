public class validUser {
  public static void main(String args[]){
    
    try{
      
      String enteredName = args[0];
      String validName = "divyanshu";
      
      if(enteredName.equals(validName)){
        System.out.println("User name is valid");
      }
      else{
        System.out.println("User name is NOT valid");
      }

    } catch(ArrayIndexOutOfBoundsException e){
      
      System.out.println("errorMsg: Please enter User Name");

    }  
  }
}