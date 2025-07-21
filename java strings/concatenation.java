public class concatenation {
    public static void main(String[] args) {
        String s1 = new String("pw");
        s1=s1.concat("skills");
        //System.out.println(s1);

        String s2 ="pwjava";
        String s3 = s2.concat("skills");
        String s4 = new String("pwjava");
        s4=s4.concat("skill");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        String s5 ="pw";
        String s6 ="pw"+"java";
        String s7 ="pw"+"java"+"kol";
        String s8 = s5+s7;
        System.out.println(s8);
        System.out.println(s7);

        String s9 = "pw"+100+99;
        System.out.println(s9);
    }
}
