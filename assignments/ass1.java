class calc{
    public int add(int a, int b){
        int r = a+b;
        return r;
    }
    public int add(int a, int b, int c){
        int res = a+b+c;
        return res;
    }
    public int add(int a, int b, int c, int d){
        int res = a+b+c+d;
        return res;
    }
}

public class ass1 {
    public static void main(String[] args) {
        calc obj1 = new calc();
        int sum1 = obj1.add(2,4);
        int sum2 = obj1.add(3,4,6);
        int sum3 = obj1.add(4,5,8,6);
        System.out.println(sum1+" "+sum2+" "+sum3);
    }
    
}
