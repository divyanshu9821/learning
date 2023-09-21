interface LibraryUser {
    abstract public void registerAccount();

    abstract public void requestBook();
}

class KidUser implements LibraryUser {
    int age;
    String bookType;
    KidUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }
    public void registerAccount() {
        if (age < 12)
            System.out.println("You have successfully registered under a Kids Account");
        else
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }

    public void requestBook() {
        if (bookType.toLowerCase().equals("kids"))
            System.out.println("Book Issued successfully, please return the book within 10 days");
        else
            System.out.println("Oops, you are allowed to take only kids books");
    }
}

class AdultUser implements LibraryUser{
    int age;
    String bookType;
    AdultUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }
    public void registerAccount() {
        if (age > 12)
            System.out.println("You have successfully registered under an Adult Account");
        else
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }

    public void requestBook() {
        if (bookType.toLowerCase().equals("fiction"))
            System.out.println("Book Issued successfully, please return the book within 7 days");
        else
            System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}

class Driver{
    public static void main(String[] args) {

        KidUser kid = new KidUser(10,"kids");
        kid.registerAccount(); // true
        kid.requestBook(); // true
        System.out.println();

        KidUser kid2 = new KidUser(18,"Fiction");
        kid2.registerAccount(); // false
        kid2.requestBook(); // false
        System.out.println();

        KidUser kid3 = new KidUser(5,"Fiction");
        kid3.registerAccount(); // true
        kid3.requestBook(); // false
        System.out.println();

        AdultUser adult = new AdultUser(5,"kids");
        adult.registerAccount(); // false
        adult.requestBook(); // false
        System.out.println();

        AdultUser adult2 = new AdultUser(23,"Fiction");
        adult2.registerAccount(); // true
        adult2.requestBook(); // true
        System.out.println();

        AdultUser adult3 = new AdultUser(5,"Fiction");
        adult3.registerAccount(); // false
        adult3.requestBook(); //true
        System.out.println();
    }    
}
