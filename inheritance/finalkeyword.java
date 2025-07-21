class Animal1{ //final type class cannot be inherited
    final int age =19;// final variable cannot be changed in child class
    public void sleep(){//final method cannot be overridden
        //age= 21;
        System.out.println("the animal is sleeping");
    }
}

class tiger1 extends Animal1{

}

public class finalkeyword {

    public static void main(String[] args) {
        tiger1 t = new tiger1();
        t.sleep();
        Animal1 a = new Animal1();
        a.sleep();
    }
}
