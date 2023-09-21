
abstract class shape{
    abstract void area();
}

class circle extends shape{
    void area(){
        int radius = 5;
        System.out.println("Area of circle:- "+((22/7)*radius*radius));
    }
}

class square extends shape{
    void area(){
        int side = 5;
        System.out.println("Area of sqaure:- "+(side*side));;
    }
}

class triangle extends shape{
    void area(){
        int base = 5;
        int height = 5;
        System.out.println("Area of triangle:- "+(0.5*base*height));
    }
}

class driver{
    public static void main(String[] args){
        circle c = new circle();
        square s = new square();
        triangle t = new triangle();
        c.area();
        s.area();
        t.area();
    }
}