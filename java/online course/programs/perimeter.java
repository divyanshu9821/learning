class perimeter {
    void calculatePerimeter(int side){
        System.out.println("square: "+(4*side));
    }

    void calculatePerimeter(int length, int breadth){
        System.out.println("rectangle: "+(2*(length+breadth)));
    }

    void calculatePerimeter(double radius){
        System.out.println("circle: "+(2*radius*3.14));
    }
}

class driver{
    public static void main(String[] args){

        perimeter p= new perimeter();
        System.out.println("Perimeters:-");
        p.calculatePerimeter(5);
        p.calculatePerimeter(5,10);
        p.calculatePerimeter(2.5);   
        System.out.println();
    }
}
