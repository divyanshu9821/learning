import java.util.Scanner;

class stringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char charArr[] = str.toCharArray();
        int arrLen = charArr.length;
        
        for (int i = 0; i < (arrLen / 2); i++) {
            char temp = charArr[i];
            charArr[i] = charArr[arrLen - i - 1];
            charArr[arrLen - i - 1] = temp;
        }

        str = "";
        for (int i = 0; i < arrLen; i++)
            str += charArr[i];
        System.out.print("\nReverse: " + str);
        System.out.println();
        sc.close();
    }
}