class student{
    private int age ;
    private String name;

    student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("my name is "+name+" and age is "+age);
    }
}

public class constructors {
    
    public static void main(String[] args) {
        student st = new student("ananyo", 18);
        st.show();
    }
}
