

public class immutable {
    public static void main(String[] args) {
        String s1 = "pw";
        String s2 ="pw";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
    }
}
