package methods;

/**
 * Description: file created for PlanNetLearningJava
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 02/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

class Methods {

    //variabila globala sau de clasa
    static int methodVariable;

    public static void main(String[] args) {
        adunare();
    }

    public static void test() {
        methodVariable = 40;
    }


    public static void adunare() {
        int a = 30;
        int b = 40;
        int suma = a + b;
        System.out.println("Suma: " + suma);
    }


    public static void scadere() {
        int c = 100;
        int d = 50;
        int dif = c - d;
        System.out.println("Diferennta:" + dif);
    }


    public static int metodaInt(double a, double b) {
        double returedValue = a + b;
        return (int) returedValue;
    }

}
