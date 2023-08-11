#include <iostream>
using namespace std;

/*
    constructors
    destructor
    getter function
    setter function
    operator overloading
*/



class kid
{
    // these members have private access it means they can only be accessed inside the class
    int age;
    string name;
    bool gender;

public:
    /* 
    
    'constructor' is a special kind of function with name same as class name without type that execute as soon as object is created, it is the first method to run.

    there are three types of constructor:-
    --> default constructor
    --> parameterized constructor
    --> copy constructor

    when the object of class is created it first calls the constructor.

    if there is no constructor is explictly defined than a default constructor is called.

    copy constructor is use to copy the data of one object to another.
    
    there are two copy constructor inbuilt or user defined
    --> inbuilt copy constructor is shallow copy constructor (in this only members get copied but the pointer these members have or the location these are pointing to does not get copied)
    --> user defined copy constructor is deep copy constructor(it copies members as well as pointers too)
    
    */

    // default constructor
    kid()
    {
        cout << "default constructor" << endl;
    }

    // parameterized constructor
    kid(string nm, int g, bool gndr)
    {
        this->name = nm;
        this->age = g;
        this->gender = gndr;
        cout << "parametrized constructor" << endl;
    }

    // copy constructor
    kid(kid &obj)
    {
        this->age = obj.age;
        this->gender = obj.gender;
        this->name = obj.name;
        cout << "copy constructor" << endl;
    }

    /*

    'destrutor' is the function called after the main function executes completely or after the main function returns.
    this function is to destroy the objects.
    use '~' tilde sign before the destructor name (same as class name)
    
    */

    // destructor
    ~kid()
    {
        cout << "destructor called" << endl;
    }

    // set name for the particular kid object
    void set_name(string nm)
    {
        this->name = nm;
    }

    // set age for the particular kid object
    void set_age(int g)
    {
        if (g < 1)
            cout << "Invalid Input";
        else
            this->age = g;
    }

    // set gender for particular kid object
    // 0 for male, 1 for female
    void set_gender(bool gndr)
    {
        this->gender = gndr;
    }

    // function to input details like name, age, gender for kid object all at ones
    void set_info(string nm, int g, bool gndr)
    {
        this->name = nm;
        this->age = g;
        this->gender = gndr;
        if (gndr < 0)
        {
            cout << "Invalid age" << endl;
            this->name = "";
            this->age = 0;
            this->gender = NULL;
            cout << "No entry recorded, please enter all details again carefully" << endl;
        }
    }

    // function with type string return the name of kid
    string get_name()
    {
        return name;
    }

    // function with type int return the age of kid
    int get_age()
    {
        return age;
    }

    // function with type string return the gender of kid
    string get_gender()
    {
        if (!gender)
            return "Male";
        else
            return "Female";
    }

    // function with type string return the complete info about the kid regarding name, age, gender
    string get_info()
    {
        string nm = name;
        string ag = to_string(age);
        string gdr;
        if (!gender)
            gdr = "Male";
        else
            gdr = "Female";

        return nm + ", " + ag + ", " + gdr;
    }

    //operator overloading is a concept in oops where operator is explicity defined to perform special operations
    bool operator == (kid &obj){
        if(this->name == obj.name && this->age == obj.age && this->gender == obj.gender)
            return true;
        return false;    
    }

};

class student : kid
{
    string course;
};

int main()
{
    // int n = 0;
    // cin>>n;
    // kid registry[n+1];
    // for(int i = 0;i<n;i++){
    //     string name; cin>>name;
    //     int age; cin>>age;
    //     bool gender; cin>>gender;
    //     registry[i].set_info(name,age,gender);
    // }

    // for(int i = 0;i<n;i++){
    //     cout<<registry[i].get_info()<<endl;
    // }

    kid k1; // default
    kid k2("kavya", 12, 0); // parameterized const.
    // kid k3(k2); // copy const.
    // cout<<k3.get_info();

    if(k1==k2)
        cout<<"same"<<endl;
    else    
        cout<<"Not same"<<endl;    

    return 0;    
}

// destructor is called after the main function ends