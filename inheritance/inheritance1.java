
class human{ //parent class/ base class / super class
    private String name;
     int age ;
    
    human(){
        System.out.println("parent class constructor!");

    }

    void sleep(){
        System.out.println("students need sleep ");
        age=18;
        System.out.println(age);
    }
}

class student extends human{ // child class / sub class / derived class
    //public student(){
    //super();                    by default the student constructor is created during object creation and super method is used to call the constructor of the parent class
    //}
       void display(){
        System.out.println("the age of the student is :" + age);
        //System.out.println("the name of the student is :"+name); // private members does not participate in inheritance

       }
}

public class inheritance1{
    public static void main(String[] args) {
        student st = new student();
        st.sleep();
        st.display();
    }
}
