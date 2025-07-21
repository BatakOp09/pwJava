interface A{
    int num=6;// public static final
    void show();// public and abstract
}

public class demo{

public static void main(String args[]){
    System.out.println(A.num);
   // A.num= 6; cannot assign a value to a public static final variable
    //A obj = new A(); is an abstract and cannot be instantiated i.e, cannot create an object of interface
}
}
