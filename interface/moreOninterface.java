interface x{
    int num = 6;
    void show();
}

interface a{
    void abc();
}

class b implements a,x{
    public void show(){

        System.out.println("inside show");
    }
    public void abc(){
        System.out.println("inside abc");
    }
}



public class moreOninterface{
    public static void main (String args[]){
        b obj = new b();
        obj.show();
        obj.abc();

    }
}