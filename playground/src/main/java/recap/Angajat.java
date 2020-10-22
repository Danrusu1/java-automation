package recap;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 05/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Angajat {

    private String nume;
    private String prenume;
    private int varsta;

    public Angajat() {
    }

    public Angajat(String addNume, String addPrenume, int addVarsta) {
        this.nume = addNume;
        this.prenume = addPrenume;
        this.varsta = addVarsta;
    }

    public void afiseazaPostOcupat() {
        System.out.println("Postul nu este specificat!");
    }
}
