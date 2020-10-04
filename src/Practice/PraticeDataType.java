package Practice;

public class PraticeDataType {

    byte qty=74;
    short number = 22323;
    long tranactionalNumber = 3040123l;
    int age=23;
    float salary = 12312.23f;
    double yearlysalary = 19221.87;

    boolean isavaible = true;
    char size = 'l';

    String name= "helen";

    public static  void main(String[] args) {

        PraticeDataType heli = new PraticeDataType();
        System.out.println(heli.age);
        System.out.println(heli.isavaible);
        System.out.println(heli.name);
        System.out.println(heli.number);
        System.out.println(heli.size);
        System.out.println(heli.qty);
        System.out.println(heli.salary);
        System.out.println(heli.tranactionalNumber);
        System.out.println(heli.yearlysalary);

    }
}
