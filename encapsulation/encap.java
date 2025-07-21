class student{
    private int age;//instance variable
    private String name;// instance variable
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("my name is "+name+" my age is"+age);
    }
    
}

public class encap {
    public static void main(String[] args) {
        student obj = new student();
        student obj1 = new student();
        obj.setAge(21);
        obj.setName("Ananyo");
        obj1.setAge(18);
        obj1.setName("hello");
        obj.show();
        obj1.show();
        int stud1Age = obj.getAge();
        System.out.println(stud1Age);
    }
}
