//string builder class has all the features of normal string class with additional functions
//like setCharAt append delete insert
public class stringBuilderClass {
    public static void main(String[] args) {
        //one difference between string and stringbuilder is that we need to create an object using stringBuilder class.
        StringBuilder str = new StringBuilder("hello");
        // setCharAt function replace the char at index i with char passed in argument
        str.setCharAt(2, 'a');
        System.out.println(str);

        // append function add new char or string at the end.
        str.append(" brother");
        System.out.println(str);

        // delete function delete the string from start index to end index and end index is not included
        str.delete(1,4);
        System.out.println(str);

        // insert function insert the string at index i
        str.insert(2, "not");
        System.out.println(str);

        
        

    }
}