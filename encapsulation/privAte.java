class student{
    private int age ;
    private String name;
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
        System.out.println("my name is "+name+" and i am "+age+" years old");
    }
}

public class privAte {
    public static void main(String[] args){

        student am = new student();
        am.setAge(21);
        int age = am.getAge();
        System.out.println(age);


    }
}
