package oop;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 29/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Application {

    public static void main(String[] args) {

        Animal caine1 = new Animal();
        Animal caine2 = new Animal();
        Animal caine3 = new Animal();
        Animal caine4 = new Animal();

        caine1.varsta = 33;

        System.out.println("Nr instante: " + Animal.count);
    }

}
