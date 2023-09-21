import java.util.Scanner;

class countWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence below:-");
        String sentence = sc.nextLine();
        char charArr[] = sentence.toCharArray();
        int wordCount = 1;
        for (int i = 1; i < charArr.length; i++) {
            if (charArr[i - 1] == ' ' && charArr[i] != ' ')
            wordCount++;
        }
        System.out.println("--------------------");
        if (charArr.length == 0)
        wordCount = 0;
        System.out.print("Word count: ");
        System.out.println(wordCount);
        System.out.println("--------------------");
        sc.close();
    }
}