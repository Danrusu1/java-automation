package functional_programming;

import java.util.function.Function;

/**
 * Description: file created for java-automation
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 26/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class FirstClassFunctions {

    protected static class MyMath {
        static Integer triple(Integer x) {
            return x*3;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println(result);
    }
}
