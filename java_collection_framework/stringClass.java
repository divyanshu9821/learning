
public class stringClass {
    public static void main(String[] args) {
        String str;
        // convert string to interger
        str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        // convert integer to string
        number = 123;
        str = Integer.toString(number);
        System.out.println(str.length());

        // compare two strings
        String name1 = "Tony";
        String name2 = "Tony";

        if (name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        //substring
        String name = "Divyanshu singhal";
        System.out.println(name.substring(0, 9));
    }
}
