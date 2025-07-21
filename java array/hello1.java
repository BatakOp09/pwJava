

    class calc{
        public int add(int num[]){
            int result=0;
            for (int i : num) {
            result = result + i;
            }
            return result;
        }
    }

    public class hello1{
    public static void main(String[] args) {
        calc obj = new calc();
        int result = obj.add(new int[]{5,5,5,5,5,5});
        System.out.println(result);
    }
    }
