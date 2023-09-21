class Record {
    int id;
    String name;
    long phone;
    String email;

    Record(int id, String name, long phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return id+"--"+name+"--"+phone+"--"+email;
    }

}

class indexOut {
    public static void main(String[] args) {
        Record students[] = new Record[2];
        students[0] = new Record(1, "abc", 1234567890, "abc@email.com");
        students[1] = new Record(2,"xyz",987654321,"xyz@email.com");
        System.out.println();
        try{
            for (int i = 0; i <= students.length; i++) {
                System.out.println(students[i]+"\n");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error! Accessing invalid memory location");
        }

    }
}
