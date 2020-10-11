package Practice.abstraction;

public interface Color {
    //Variable
    String types="Blue";
    int colorQty=10;
    boolean homeColor=true;

    //Method w/o body is called abstract method
    public void callit();
    public void doit();
    public void getit();
    public void lookIt();
    public void prit();

    public static int colorpallet(int colorQty){
        int totalcolor = 1*colorQty;
        return totalcolor;
    }


}
