package functional_programming;

import java.util.function.BiFunction;

/**
 * Description: file created for java-automation
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 26/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class BiFunctionalExpressionsExample {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(32, 32));

        TriFunctionExample<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;
        System.out.println(addThree.apply(1, 2, 3));

        NoArgFunction<String> sayHello = () -> "Hello!";
        System.out.println(sayHello.apply());

    }
}
