package generics;

import java.util.*;

class Student implements Comparable<Student>{
    int marks;
    int age;
    String name;

    Student(int age, int marks, String name){
        this.age=age;
        this.marks= marks;
        this.name = name;
    }

    public int getdata(){
        return marks;
    }

    public int getage(){
        return age;
    }

    public String getname(){
        return name;
    }
        public String toString(){
            return "marks :"+marks+" - age: "+age+" -name: "+name;
        }

        public int compareTo(Student a){
            if(this.age > a.age)
            return 1;
            else
            return -1;
        }


    }

public class compare3 {
    public static void main(String[] args) {
        Student s1 = new Student(18,98,"rohan");
        Student s2 = new Student(21,54,"mahi");
        Student s3 = new Student(12,48,"rahul");

        List<Student> st = new ArrayList<Student>();

        st.add(s1);
        st.add(s2);
        st.add(s3);

        System.out.println(st);

        Collections.sort(st);
        System.out.println(st);
    }
}
