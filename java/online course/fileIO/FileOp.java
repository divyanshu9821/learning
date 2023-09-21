package fileIO;

import java.io.FileReader;
import java.io.FileWriter;

public class FileOp {
    public static void main(String[] args) {
        try{

            FileReader fr = new FileReader("D:\\a_study\\Computer_Programs\\anudipFoundation\\fileIO\\input.txt");
            FileWriter fw = new FileWriter("D:\\a_study\\Computer_Programs\\anudipFoundation\\fileIO\\output.txt",false);
            int i = 0;
            while((i = fr.read())!=-1){
                char c = (char)i;
                fw.append(c);
            }
            fw.close();
            fr.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("copy of input from one file to another");
    }
}