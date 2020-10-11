package abstraction;

public abstract class Car {

   String modernCar= "Tesla";
   double modernPRice= 45000;

   // Abstract Method
   public abstract void navigation();
   public abstract void bluetooth();
   public abstract void display();


    public void dualClimateControl(){

        System.out.println("I hate my life");
    }


}
