import java.util.Scanner;

class concatString {

    String createStringFromStringArr(String[] words) {
        String sentence = "";
        for (int i = 0; i < words.length; i++) {
            sentence += words[i];
        }
        return sentence;
    }

    void inputStringArray(Scanner sc) {
        
        // input string array
        System.out.print("Enter no of words: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter word: ");
            words[i] = sc.next();
        }
        
        // method call
        String sentence = createStringFromStringArr(words);
        
        // printing
        System.out.println(sentence);  
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        concatString obj = new concatString();
        System.out.println("This program will run 3 times");
        for(int i = 0;i<3;i++){
            obj.inputStringArray(sc);
            System.out.println();
            sc.nextLine();
        }
        sc.close();
    }
}