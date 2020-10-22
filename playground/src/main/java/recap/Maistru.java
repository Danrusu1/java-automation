package recap;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 05/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Maistru extends Muncitor {

    private int subordonati = 0;

    public Maistru() {
    }

    public Maistru(String addNume, String addPrenume, int addVarsta, String meserie, int subordonati) {
        super(addNume, addPrenume, addVarsta, meserie);
        this.subordonati = subordonati;
    }

    @Override
    public void afiseazaPostOcupat() {
        System.out.println("Maistru");
        super.afiseazaPostOcupat();
    }
}
