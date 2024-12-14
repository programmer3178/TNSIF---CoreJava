package com.tnsif.staticconcept;

/**
 *
 * @author sys
 */
public class EmployeeDemo {

    public static void main(String[] args) {
        Employee e = new Employee("Shriteja", 101);
        System.out.println(e);

        Employee e1 = new Employee("Shastry", 102);
        System.out.println(e1);

        System.out.println(Employee.ecompany);

        Employee.ecompany = "Accenture";
        System.out.println(e1);
        System.out.println(e);

        Employee e2 = new Employee("xyz", 103);
        System.out.println(e2);

        System.out.println(Employee.ecompany);

    }

}
