import java.util.Scanner;

class Toogle{
    String name;
    Toogle(String name){
        this.name = name;
    }

    public String toString(){
        String str = "";
        for(int i = 0;i<this.name.length();i++){
            char c = this.name.charAt(i);
            if(c>='A' && c<='Z')
                str+=(char)(c+32);

            else if(c>='a' && c<='z')
                str+=(char)(c-32);
        }

        return str;
    }
}

class toogleCharacter{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Toogle t;
    System.out.print("\nString? ");
    String s = sc.next();
    t = new Toogle(s);
    System.out.println(t);
    System.out.println();
    sc.close();
    }
}