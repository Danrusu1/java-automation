package data_types;

/**
 * Description: file created for PlanNetLearningJava
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 02/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

class Application {

    public static void main(String[] args) {
        //2 tipuri de  date 1. primitive 2. obiecte

        //boolean -> 0 sau 1; true sau false
        //char
        //byte
        //short
        //int
        //long
        //float
        //double
        //void


        byte maxValue = Byte.MAX_VALUE;
        byte minValue = Byte.MIN_VALUE;

        System.out.println("MaxByte: " + maxValue);
        System.out.println("MinByte: " + minValue);

        //declara o varoiabila in Java
        boolean boolTrue;
        boolTrue = true;
        boolean boolFalse = false;

        int numar = 1;
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("MaxInt: " + intMax);
        System.out.println("MinInt: " + intMin);


        byte overflow = (byte) (Byte.MAX_VALUE + 1);
        System.out.println("Overflow: " + overflow);


        int a = 30;
        int b = 40;
        int suma = a + b;
        System.out.println("Suma: " + suma);


        int c = 100;
        int d = 50;
        int dif = c - d;
        System.out.println("Diferennta:" + dif);

        int e = 100;
        int f = 20;
        int rez = e / f;
        System.out.println("Rez: " + rez);

        int no1 = 101;
        int no2 = 20;
        // 101 : 20 = 5 (rest: 1)
        // no1%no2; % -> modulo
        int rest = no1 % no2;
        System.out.println("Rest: " + rest);
    }

}
