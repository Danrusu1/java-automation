package start_03;

import java.util.Scanner;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 07/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Tema3 {

//    Sa se printeze in consola steagul americii
//    Printati in consola urmatoarea propozitie pe mai multe randuri: "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
//    Suma tuturor numerelor pana la 20.
//    Numaratoarea inversa;
//    Numarati din 3 in 3
//    Inlocuim litera "x" cu litera "X" intr-un cuvant


//	* Sa se scrie o metoda care primeste ca parametru un numar natural x si apoi  afiseaza: ( // n = 21304)
//    Cifrele numarului sunt: 4, 0, 3, 1, 2
//    Suma cifrelor este: 10


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numele: ");

        String numeleIntrodus = scanner.nextLine();
        int lungimeNume = numeleIntrodus.length();
        System.out.println("Lungime: " + lungimeNume);

        char ultimulCaracter = numeleIntrodus.charAt(lungimeNume - 1);

        System.out.println("Ultimul caracter din nume este: " + ultimulCaracter);

//        if ( (ultimulCaracter == 'a') || numeleIntrodus.equals("Carmen") ) {
//            System.out.println("Numele introdus este de fata");
//        } else {
//            System.out.println("Numele introdus este de baiat");
//        }

        switch (ultimulCaracter) {
            case 'a':
            case 'ã':
                System.out.println("Numele introdus este de fata");
                break;
            default:
                System.out.println("Nu ai introdus un nume");
        }
    }


    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }


    public static boolean sumOfTwo(int x, int y, int z) {
//        if ( (x+y) == z || (y+z) == x || (x+z) == y) {
//            return true;
//        }
//        return false;
        return ((x + y) == z || (y + z) == x || (x + z) == y);
    }


    public static void citesteNumar(int x) {
        int rest = 0;
        String finalString = "Cifrele numarului sunt: ";
        int suma = 0;

        do {
            rest = x % 10;
            suma += rest;
            finalString = finalString + rest + ", ";
            x = x / 10;
        } while (x > 0);

        System.out.println(finalString);
        System.out.println("Suma cifrelor este: " + suma);
    }


}
