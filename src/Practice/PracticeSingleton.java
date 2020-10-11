package Practice;

public class PracticeSingleton {

    String pplNsme= "Bella";
    String givenName;
    int age;
    int year;

    private PracticeSingleton(){

    }
    //Create an Instance variable or object
    public static PracticeSingleton lord = new PracticeSingleton();
    //return a class
    public static PracticeSingleton getLord(){
     return lord;
    }


    public static void main(String[] args) {
        PracticeSingleton is=PracticeSingleton.getLord();
        System.out.println(is.pplNsme);



    }

}
