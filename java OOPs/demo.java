class calc{
    public int add(int n1, int n2){
        int result=0;
        result =n1+n2;
        return result;
    }
    public int add(int n1, int n2, int n3){
        int res = n1+n2+n3;
        return res;
    }
    public double add( double n1, double n2){
        double sum = n1 + n2;
        return sum;
    }
}

public class demo{
    public static void main(String[] args){

        calc obj1 = new calc();
        int sum= obj1.add(4,5);
        System.out.println(sum);
        int sum1 = obj1.add(5,6,7);
        System.out.println(sum1);
        System.out.println(obj1.add(3.6,9.6));
        System.out.println(obj1.add(8,9,10));
    }
}