public class mutable {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("ananyo");
        sb.append(" Mitra");
        System.out.println(sb);

        //sb = new StringBuffer("sachin");// not possible due to final keyword has impact on reference not mutablility.
        System.out.println(sb);

        
    }
}
