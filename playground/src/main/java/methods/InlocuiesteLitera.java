package methods;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 03/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class InlocuiesteLitera {


    public static void main(String[] args) {
        String ana = "Ana are mere";
        inlocuieste(ana, "e", "G");
        inlocuieste(ana, "e", "DDD");
        inlocuieste(ana, "e", "XXX");

        float a = 40.88f;
        double xx = 30.4 + 0.5;

    }

    public static void inlocuieste(String text, String litera, String cu) {
        String textNou = text.replaceAll(litera, cu);
        System.out.println(textNou);
    }


}
