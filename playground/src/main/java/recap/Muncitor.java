package recap;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 05/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Muncitor extends Angajat {

    private String meserie = "";

    public Muncitor() {
    }

    public Muncitor(String addNume, String addPrenume, int addVarsta, String meserie) {
        super(addNume, addPrenume, addVarsta);
        this.meserie = meserie;
    }

    public void afiseazaPostOcupat() {
        System.out.println("Postul: muncitor");
    }
}
