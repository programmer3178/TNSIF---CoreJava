package com.tnsif.finalconcept;

/**
 *
 * @author sys
 */
public final class FinalClass {

    void show() {
        System.out.println("Final class cannot be inherited");
    }
}

/*Cannot create child class from Final class
Ex: String, Wrapper Classes, System, Scanner, Number are final classes.
class FinalChildClass extends FinalClass{ } is not possible */
