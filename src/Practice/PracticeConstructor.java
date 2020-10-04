package Practice;

public class PracticeConstructor {
    /**
     * Access Modifier classname() {}
     */
//deflaut
    String name;
    String address;
    String contactNAme;



    public PracticeConstructor() {
        System.out.println("HEllo, beautiful!");
    }
    public PracticeConstructor(String name) {
        //initiiaze a global value ;
        this.name = name;
        System.out.println(this.name);
    }

    public PracticeConstructor (String name, int number1) {
        int number = number1;
        this.name = name;
        System.out.println("THIS IS THE BEAUTIFUL  "+ this.name + "my age is  "+ number);


    }
    public static void main(String[] args) {
        //you 0r constructor is empty by defluat
        int num1 = 29;

        PracticeConstructor a = new PracticeConstructor();
        PracticeConstructor oj = new PracticeConstructor("helen"); //Argument passing inside parameter
        PracticeConstructor bb = new PracticeConstructor("Konjit", 30);

    }
}
