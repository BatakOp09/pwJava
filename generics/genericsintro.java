package generics;

import java.util.*;

class student{
    private String name;
    private int age;

}

class employee{
    private String name;
    private int age;

}



public class genericsintro {
    public static void main(String[] args) {
        
        student st = new student();
        student st1 = new student();

        employee e = new employee();


        ArrayList<student> al = new ArrayList<student>();

        al.add(st);
        al.add(st1);
        //al.add(e);  compilation error


        String ar[] = new String[10];
        ar[0] ="hello";
        ar[1] ="shivaay";
        ar[2] = "ggwp";

        String name = ar[0];
        String name1 =ar[2];


        ArrayList<String> al1 = new ArrayList<String>();

        al1.add(name);
        //al1.add(23); compilation error due to typesafety applied by generics
        al1.add("qtieee");




    }
}
