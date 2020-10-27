package functional_programming;

import java.util.function.Function;

/**
 * Description: file created for java-automation
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 26/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class LambdaExpressionsExample {

    protected static Function<Integer, Integer> doSomething =
            x -> x * 2 + 1;

    protected static Function<String, Integer> getStringLength =
            String::length;

    public static void main(String[] args) {
//        Integer result = doSomething.apply(2);
//        System.out.println(result);
//
//        Integer elements = getStringLength.apply("Buna ziua");
//        System.out.println(elements);


        Function<Integer, Integer> absoluteValue =
                x -> {
                    if (x < 0) {
                        return -x;
                    } else {
                        return x;
                    }
                };
        System.out.println(absoluteValue.apply(-100));
    }
}
