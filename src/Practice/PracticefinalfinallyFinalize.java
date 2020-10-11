package Practice;

public class PracticefinalfinallyFinalize {

    final String name = "Helen";
     int div;
    public int getDivision(int num1, int num2){
        try{
            this.div= num1/num2;
            System.out.println("Good Morning");
        }catch(Exception e){
            System.out.println("Wrong");
        }finally {
            System.out.println("HEy Beautiful!!");
        }
        return div;
    }

    public static void main(String[] args) {
        PracticefinalfinallyFinalize to = new PracticefinalfinallyFinalize();
        to.getDivision(23,0);
        System.gc();
    }

}
