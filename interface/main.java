interface Computer{
    void compileCode();
}

class laptop implements Computer{
    public void compileCode(){
        System.out.println("5 errors detected");
    }
}
class desktop implements Computer{
    public void compileCode(){
        System.out.println("5 errors detected, 10 seconds faster");
    }
}

class developer{
    public void buildApps(Computer obj){
        System.out.println("building apps");
        obj.compileCode();
    }
}


public class main{
    public static void main(String args[]){

        //Computer obj = new laptop();
        Computer obj = new desktop();
        developer dev = new developer();
        dev.buildApps(obj);

    }
}