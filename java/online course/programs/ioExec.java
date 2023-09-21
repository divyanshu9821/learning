import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class ioExec {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Error! File not present in current directory");
        }
    }
}
