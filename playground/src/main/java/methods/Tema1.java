package methods;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 03/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Tema1 {

//    Write a Java program to print the sum of two numbers.
//    Test Data:
//            74 + 36
//    Expected Output :
//            110

    public static void main(String[] args) {
        int suma = add(74, 36);
        printText(suma);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void printText(int suma) {
        System.out.println(suma);
    }


}
