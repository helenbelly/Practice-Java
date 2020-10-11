package Practice;

public class PracticeExceptionHandling {


    int div;

    public int dodivision(int num7, int num1) {

        //Arithmetric exception
        try {
            this.div = num7 / num1;
            System.out.println("dision is divion" + div);
        } catch (Exception e) {
            System.out.println("who minus who");
        }
        return div;
    }

    public static void main(String[] args) throws InterruptedException {

        PracticeExceptionHandling PracticExceptionHandling2 = new PracticeExceptionHandling();
        PracticExceptionHandling2.dodivision(30, 0);
        //        try {
//            PracticeExceptionHandling.dodivision(20, 30);
//        } catch (Exception e) {
//            System.out.println("I.m so tired");

//        }
        //thread exception
//        Thread.sleep(5000);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException in) {
            System.out.println("This is Interrupted");
        }
    }
}