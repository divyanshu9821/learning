import java.util.StringTokenizer;
class stringTokenizerClass{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("java is a programming language");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
