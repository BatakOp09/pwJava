

class Animal{
    public void identity(){ // inherited method
        System.out.println("i am a animal");
    }
    public void eat(){// overidden method
        System.out.println("i am omivorous");
    }
}

class tiger extends Animal{
    public void eat(){ //overidding method
        System.out.println("i am carnivorous");
    }
    void behaviour(){ //specialized method
        System.out.println("i am very agressive");
    }
}
class deer extends Animal{
    public void eat(){ //overridding method
        System.out.println("i am herbivorous");
    }
    void behaviourDeer(){  //specialized method
        System.out.println("i am very calming in nature");
    }
}

public class typesofmethods {
    public static void main(String[] args) {
        deer d = new deer();
        d.identity();
        d.eat();
        d.behaviourDeer();

        tiger t = new tiger();
        t.identity();
        t.eat();
        t.behaviour();
    }
    
}
