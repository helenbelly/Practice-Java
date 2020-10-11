package Practice;

import java.util.Scanner;

public class PracticeSwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your love serial number");
        int love = input.nextInt();
        PracticeSwitchCase.firstNAme(love);
    }
public static void firstNAme(int love) {

    String firstNAme;

    switch (love) {
        case 1:
            firstNAme = "Nebiyu";
            break;
        case 2:
            firstNAme = "Helen";
            break;
        case 3:
            firstNAme = "Bella";
            break;
        case 4:
            firstNAme = "Gabriella";
            break;
        case 5:
            firstNAme = "Mom";
            break;
        case 6:
            firstNAme = "Papi";
            break;
        default:
            firstNAme = "Try again";
            break;
    }
    System.out.println("Good Luck" + firstNAme);
}
    }

