package com.tnsif.staticconcept.staticblockmethod;

/**
 *
 * @author sys
 */
public class MyClass {

    private int section;
    private static int srNo;

    //static block
    static {
        System.out.println("---------------Within Static Block----------------");
        srNo = 100;
    }

    //Default constructor
    public MyClass() {
        System.out.println("-----------Within Default Constuctor----------");
        srNo++;
        section++;
    }

    @Override
    public String toString() {
        return "MyClass[Serial No=" + srNo + ",Section=" + section + "]";
    }

//static method
    static void display() {
        //System.out.println("Section:" +section); //You can't acess non-static members inside the static method
        System.out.println("Serial No:" + srNo);
    }
}
