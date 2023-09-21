class medicalPractictioner{
    protected String name;
    void setName(String name){
        this.name = name;
    }
    void print(){
        System.out.println("Name of Practictioner: "+name);
    }
}

class doctor extends medicalPractictioner{
    protected String type;
    void setType(String type){
        this.type = type;
    }
    void print(){
        System.out.println("Name of doctor: "+name);
        System.out.println("Type of doctor: "+type);
    }
}

class surgen extends doctor{
    protected Boolean isSurgen  = false;
    void set(){
        isSurgen = true;
    }
    void print(){
        super.print();
        if(isSurgen){
            System.out.println("Doctor is surgen");
        }
        else System.out.println("Doctor is not surgen");
    }
}

class nurse extends medicalPractictioner{
    protected int experience;
    void setExperience(int exp){
        experience = exp;
    }
    void print(){
        super.print();
        System.out.println("Nursing Experience: "+experience);
    }
}


public class mutiHirInherit {
    public static void main(String[] args){
        surgen s = new surgen();
        s.setName("Vashisht");
        s.setType("Physician");
        s.print();
        System.out.println();
        
        nurse n = new nurse();
        n.setName("Priti");
        n.setExperience(3);
        n.print();
        System.out.println();
        
        s.set();
        s.print();
    }
    
}
