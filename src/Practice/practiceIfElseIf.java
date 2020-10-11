package Practice;

import java.util.Scanner;

public class practiceIfElseIf {


    public static void main(String[] args) {
        practiceIfElseIf.agecalculator();
    }
        public static void agecalculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age =input.nextInt();

        if(age>=0 && age <= 12){
            System.out.println("You wish we were this young");
        }else if( age >= 12&& age<= 24){
            System.out.println("you are super cool");
        }else if (age>=24 && age<=34){
            System.out.println("You are an adult");
        }else {
            System.out.println("you are old");
        }
    }
}
