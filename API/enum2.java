package API;

enum result{
    PASS ,
    FAIL ,
    ABSENT;

    int marks;

    // public static final result PASS = new result();

    // public static final result FAIL = new result();

    // public static final result ABSENT = new result();

    result(){
        System.out.println("Constructor inside the enum");
    }

    void setMarks(int marks){
        this.marks = marks;
    }
    void getMarks(){
        System.out.println(marks);
    }
}

public class enum2 {
    public static void main(String[] args) {
        
    // result.PASS.setMarks(50);
    // result.PASS.getMarks();

    // result.ABSENT.getMarks();

    // result.FAIL.setMarks(30);
    // result.FAIL.getMarks();

    result r = result.FAIL;

    switch (r) {
        case PASS:  System.out.println("Passed");
                        break;
        case FAIL : System.out.println("failed!");
        break;
        case ABSENT: System.out.println("absent on the day of exam");
        break;
    
        default: System.out.println("invalid input or condition");
            break;
    }
    }
}
