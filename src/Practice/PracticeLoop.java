package Practice;

import java.util.Scanner;

public class PracticeLoop {

    public static void main(String[] args) {
//for loop
        for (int m = 0; m < 5; m++) {
            System.out.println("***");
        }
        //Nested loop
        for (int i = 2; i < 5; i++) {
            System.out.print("**");
            for (int a = 0; a < i; ++a) {
                System.out.print("*");

                for (int y = 0; y <= a; ++y) {
                    System.out.println();
                }
            }
        }


        //NEsted for loop
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value");
        int rowNumber = input.nextInt();

        for (int k = 1; k <= rowNumber; k++) {
            for (int b = 1; b <= k; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        //While loop
        int age = 34;
        int qty = 35;
        while (age > 33) {
            System.out.println("Get your life");
            age--;
        }
        System.out.println();
        //Nested while loop
        int age1 = 34;
        while (age1 > 30) {
            System.out.println("*******");
            age1--;
            int qty2 = 33;
            while (qty2 > 30) {
                System.out.println("***");
                qty2--;

            }
        }
            //do while loop
        int titi =50;
        do{
            System.out.println("***************");
            titi--;
        }while (titi>45);
    }
}