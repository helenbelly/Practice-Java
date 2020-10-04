package Practice;

public class ObjectPractice {

    public static void main(String[] args) {
        System.out.println("helloo");
        PraticeDataType dataType1 = new PraticeDataType();
        dataType1.size = 'M';
        System.out.println(dataType1.size);
        //dataType1.name= "Bella";
        String kName = dataType1.name = "Bella";
        System.out.println(kName);
    }

}
