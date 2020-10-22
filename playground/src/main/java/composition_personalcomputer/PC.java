package composition_personalcomputer;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 13/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class PC {

    private final Case aCase;
    private final Monitor monitor;
    private final Motherboard motherboard;

    public PC(Case aCase, Monitor monitor, Motherboard motherboard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public Case getTheCase() {
        return aCase;
    }


    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
