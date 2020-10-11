package abstraction;

import Practice.abstraction.Color;

public class Test {

    public static void main(String[] args) {


        Audi lux=new Audi();
        lux.callit();
        lux.doit();
        lux.getit();
        lux.lookIt();
        lux.prit();

        Color.colorpallet(23);
        lux.willbeYours(true);
        Audi.carinfo();
        lux.bluetooth();

    }









}
