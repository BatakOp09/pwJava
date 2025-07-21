 class oops {
    int num;//instance variable
    String name ="hello";//instance variable
    public static void main(String args[]){

        oops a = new oops();

        oops b = new oops();

        b.num=10;
        b.name= "bye bye";

        System.out.println(b.num);
        System.out.println(b.name);

        System.out.println("-----------------------------------------------------------");

        System.out.println(a.name);
        System.out.println(a.num);// instance variable has default values  
    }
}
