package arrays;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 09/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Day1 {

    public static void main(String[] args) {

        int myVarName = 30;  //  |30|
        //int array[] = {1,2,3,4};
        //char myCharArray[] = new char[10];
        //long myLongArray[] = new long[200];


        //array declaration and init
        int[] myArray = new int[5];    // |0|0|0|0|0|
        int lungime = myArray.length;
        System.out.println("Lungime: " + lungime);
        myArray[1] = 40;
        System.out.println("myArray[1] = " + myArray[1]); //  |0|40|0|0|0|
        myArray[2] = 50;
        myArray[3] = 60;


        // t1 index = 1, 1 < 10, 1+1
        // t2 index = 2, 2 < 10, 2+1
        // t3 index = 3, 3 < 10, 3+1
        //..........................
        // t9 index = 9, 9 < 10, 9+1
        // nn index = 10, 10 < 10....ne oprim deoarece conditia a returnat false


        char[] myCharArray = {'A', 'B', 'C', 'D'};
        System.out.println("la poz 0 avem: " + myCharArray[0]);

        printeazaArray(myCharArray);


    }

    public static void printeazaArray(char[] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }
}
