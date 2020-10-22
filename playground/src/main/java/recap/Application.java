package recap;

import java.util.ArrayList;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 05/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Application {

    public static void main(String[] args) {

        Angajat angajat = new Angajat("Rusu", "Dan", 21);
        Muncitor muncitor = new Muncitor("Ion", "Ionescu", 50, "Strungar");
        Maistru maistru = new Maistru("Radu", "Adrian", 50, "Fierar", 50);
        Inginer inginer = new Inginer("Frorin", "Ardelean", 50, "Mecanic");

//        angajat.afiseazaPostOcupat();
//        muncitor.afiseazaPostOcupat();
//        maistru.afiseazaPostOcupat();
//        inginer.afiseazaPostOcupat();

        Angajat a = new Maistru("Mircea", "Bravo", 22, "Fierar", 6);
//        a.afiseazaPostOcupat();

        ArrayList listaAngajati = new ArrayList();
        listaAngajati.add(angajat);
        listaAngajati.add(muncitor);
        listaAngajati.add(maistru);
        listaAngajati.add(inginer);
        listaAngajati.add(new Angajat("Ion", "Ion", 21));

        for (int i = 0; i < listaAngajati.size(); i++) {
            Object obj = listaAngajati.get(i);
            Angajat ang = (Angajat) obj;
            ang.afiseazaPostOcupat();
        }


    }
}
