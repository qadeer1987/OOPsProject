package Project2;

public class MarksTest {
    public static void main(String[] args) {
        // Student A
        A studentA = new A(80, 90, 95);
        double percentageA = studentA.getPercentage();
        System.out.println("Student A's average percentage: " + percentageA + "%");

        // Student B
        B studentB = new B(75, 85, 90, 80);
        double percentageB = studentB.getPercentage();
        System.out.println("Student B's average percentage: " + percentageB + "%");
    }
}
