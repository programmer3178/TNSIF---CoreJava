package com.tnsif.finalconcept;

/**
 *
 * @author sys
 */
public class FinalVariableDemo {

    final int x = 100;
    final static int y;
    final static int z = 300;

    static void change() {
        //x = 10;
        //y = 200;
    }

    static {
        y = 20;
        System.out.println("Value of y is" + y);
    }

    @Override
    public String toString() {
        return "FinalVariable [x = " + x + "y=" + y + "]";
    }

}
