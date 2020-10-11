package Practice;

public class PracticeRecursion {

    static int count =0;

    public static void pplDisplay(){
        count++;
        if (count <10) {
            System.out.println("Hello, world!");
            pplDisplay();
        }
    }


    public static void main(String[] args) {
      PracticeRecursion.pplDisplay();

    }
}
