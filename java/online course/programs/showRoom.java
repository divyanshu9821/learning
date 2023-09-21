class showRoom {
    String name;
    long mobno;
    double cost;
    double amount;
    
    showRoom(){}

    void input(String name, long mobno, double cost){
        this.mobno = mobno;
        this.name = name;
        this.cost = cost;
    }

    void calculate(double cost){
        double discount;
        if(cost<=10000) discount = 0.05;
        else if(cost>10000&&cost<=20000) discount = 0.1;
        else if(cost>20000&&cost<=35000) discount = 0.15;
        else discount = 0.2;
        this.amount = cost-(cost*discount);
    }

    void display(){
        calculate(cost);
        System.out.println("Customer name\t: "+name);
        System.out.println("Mobile Number\t: "+mobno);
        System.out.println("Payable Amount\t: "+amount);
    }

    public static void main(String[] args){
        showRoom sr = new showRoom();
        sr.input("Nik", 1234567890, 50000);
        sr.display();
    }
}
