package methods;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 03/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class InlocuireLitereMariCuLitereMici {

    public static void main(String[] args) {
        String text = "Ana Are Sute De Mere Si De Lubenite";

        String textToLowerCases = inlocuieste(text);
        System.out.println(textToLowerCases);


        System.out.println(inlocuiesteToUpper(text));
    }

    public static String inlocuieste(String text) {
        String textNou = text.toLowerCase();
        return textNou;
    }

    public static String inlocuiesteToUpper(String text) {
        String textNou = text.toUpperCase();
        return textNou;
    }


}
