package Practice;

public class PraticeAcessModifier {
    public void getmomma(){
        System.out.println("good morning");

    }
    private void getcrazy(){
        System.out.println("Happy Birthday");
    }

      protected void getloose(){
          System.out.println("Llooking at my self like wow");
      }
      void getnoise(){
        System.out.println("Lord help me");
    }

    public static void main(String [] args){
        PraticeAcessModifier gabby = new PraticeAcessModifier();
        gabby.getcrazy();
        gabby.getcrazy();
        gabby.getloose();
        gabby.getmomma();
        gabby.getnoise();
        NestedClassPractice bella = new NestedClassPractice();
        System.out.println(bella.number2);
    }
}
