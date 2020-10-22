package methods;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 03/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Exercitii {

    public static void main(String[] args) {

        String myString1 = "Ana are mere ";
        String myString2 = "verzi";

        String trei = myString1 + myString2;
        System.out.println(trei);
        System.out.println(trei.toUpperCase());
        System.out.println(trei.toLowerCase());
        System.out.println(trei.replace("Ana", "Maria"));
    }
}
