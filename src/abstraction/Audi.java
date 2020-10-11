package abstraction;

import Practice.abstraction.Color;
//concrete class
public class Audi extends Car  implements Color {

    String carModern = "X32";
    String modelYear= "2020";
    static double price= 65000;


    public static void carinfo(){
        System.out.println("THis is easy");
    }
    public boolean willbeYours(boolean availablity){
        boolean releseMonth= availablity;
        return releseMonth;
    }
    public void callit() {
        System.out.println("I tired");
    }

    public void doit() {
        System.out.println("Im bored");
    }

    public void getit() {
        System.out.println("I don;t want it");
    }

    public void lookIt() {
        System.out.println("who cares");
    }

    public void prit() {
        System.out.println("I'm overit");
    }


    public void navigation() {
        System.out.println("who is it");
    }

    public void bluetooth() {
        System.out.println("Good news");
    }

    public void display() {
        System.out.println("Hello Nebiyu");
    }
}
