package Practice;

public class NestedClassPractice {

    int number1 =30;
    int number2 =40;

    public static void main(String[] args) {
        NestedClassPractice bel = new NestedClassPractice();
        System.out.println(bel.number1);
        WorkingHard more = new WorkingHard();
        System.out.println(more.helenn);
        System.out.println(WorkingHard.words);
    }
        public static class WorkingHard{
            String helenn="Konjit";
            static String words = "genius";


    }
}
