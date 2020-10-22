package methods;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 03/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class IfElse {

    public static void main(String[] args) {
        verificaParitate(3);
        verificaParitate(40);
        verificaParitate(39);
    }

    public static void verificaParitate(int numar) {
        if (numar % 2 == 0) {
            System.out.println("Numar  par");
        } else {
            System.out.println("Numar impar");
        }
    }

}
