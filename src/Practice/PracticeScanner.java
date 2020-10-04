package Practice;

import java.util.Scanner;

public class PracticeScanner {
    static double discount1;
    static double coursefee2;
    static double total2 =0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        input.nextLine();
        System.out.println("Enter your age");
        input.nextDouble();
        System.out.println(" Enter course fee");
        double cfee =input.nextDouble();
        System.out.println("Course Fee : "+ cfee);
        System.out.println("Enter discount");
        double discount = input.nextDouble();
        System.out.println("This is your total " + (cfee * (discount)/100));
        double discount1 = input.nextDouble();
        Scanner input1= new Scanner (System.in);

        input.close();
        input1.close();


    }
}
