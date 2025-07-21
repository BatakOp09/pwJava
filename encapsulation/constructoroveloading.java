class student{
    private String name ;
    private int age;

    public student(){
        this("ananyo",21);
        System.out.println("default constructor is being called");
        name = "ratul";
        age = 19;
    }
    public student(String name){
        this();
        this.name = name;
        age =20;
    }
    public student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("my name is :"+name+" and  my age is : "+age);
    }
}

public class constructoroveloading {
    public static void main(String[] args) {
        //student s1 = new student();
        //s1.display();

        student st = new student("sambit");
        st.display();


    }
}
