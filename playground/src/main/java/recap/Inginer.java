package recap;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 05/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Inginer extends Angajat {

    private final String specializare;

    public Inginer(String nume, String prenume, int varsta, String specializare) {
        super(nume, prenume, varsta);
        this.specializare = specializare;
    }

    public void afiseazaPostOcupat() {
        System.out.println("Postul: Inginer!");
    }

}
