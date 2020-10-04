public class PracticeMethod {
    //Access modifier return type  method name (){}
    public void helen(){
        System.out.println("this is need an object to work");
    }
        public static void display (){
            System.out.println("THis is method!!");
            System.out.println("MEthod is a block of code");
            System.out.println("How would you call this method?");
        }
        // return w/o parameter
    public static int dome(){
       int nn= 20;
       int ju= 30;
       int total = nn*ju;

        System.out.println("Hello beautiful baby girl" +total);
        return total;
    }
///dynamic parameterize
    public static int dohelp(int number1, int number2){
        int juju= number1;
        int fifi =number2;
        int total2 = juju*fifi;

        System.out.println("this is plain one " + total2);
        return total2;
    }
//method with no retue=rn value with parameterize
    public static void main(String[] args) {
        PracticeMethod.display();
        PracticeMethod obj = new PracticeMethod();
        obj.helen();

        PracticeMethod.dome();
        PracticeMethod.dohelp(67,78);

    }




}
