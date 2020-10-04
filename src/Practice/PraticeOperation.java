package Practice;

import java.sql.SQLOutput;

public class PraticeOperation {


//Assigment operation
    int number = 30;


    public static void main(String[] args) {
        String name= "KOnjo";
        System.out.println(name);

// equality and relational operation
        int num1 =50;
        if (num1 == 50){
            System.out.println("number 1 = 50 bibi");
//Arithmetric Operation
            int numb2 = 87;
            int numb3 =88;
            int numb4 = 202;
            int total = numb2 * numb3;
            int mean = (numb2+numb3/2);
            System.out.println(total);
            System.out.println(mean);
//conditional operation
            int num6=40;
            int num7=305;
        if(num6 == num7) {
                System.out.println("numbers are equal");
            }
        if( num6>=35 && num7 <=400 ){
            System.out.println("eqaul the statment");
        }
        if(num6>= 20 || num7==4){
            System.out.println("PraticeMethod.main");
        }

//unitary Operation
        int number=18;
            System.out.println(number++);//18
            System.out.println(number++);//19
            --number;
            System.out.println(--number);//18
            --number;
            System.out.println(number);//17
            number--;
            System.out.println(number);//17
        }
        for(int i=2; i<1; i--){
            System.out.println("Bella Konjo");
        }
    }
}
