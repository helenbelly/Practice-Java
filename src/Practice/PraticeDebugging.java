package Practice;

public class PraticeDebugging {


    public static void main(String[] args) {

        int num2=34;
        int num3=45;
        int sum=num2+num3;
        System.out.println("this is debuggin"+ sum);
        PraticeDebugging.doPattern();
    }
    public static void doPattern(){

        int age =34;
        while(age>33){
            System.out.println("Get your life");
            age--;
        }
        System.out.println();
    }
}
