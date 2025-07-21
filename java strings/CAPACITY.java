public class CAPACITY {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("hello world how are you");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        StringBuffer sb2 = new StringBuffer("helloo");
        sb2.append("world");
        System.out.println(sb2.capacity());
        StringBuilder a = new StringBuilder(150);
        System.out.println(a.capacity());
        a.append("helloo");
        System.out.println(a.capacity());
        a.trimToSize();
        a.setCharAt(2, 'a');
        System.out.println(a);
        System.out.println(a.capacity());
    }
}
