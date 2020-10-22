package composition_personalcomputer;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 13/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Application {
    /**
     * Create a single room of a house using composition.
     * Think about the things that should be included in the room.
     */

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePc = new PC(theCase, monitor, motherboard);

        thePc.getTheCase().pressPowerButton();
        thePc.getMotherboard().loadProgram("Windows 1.0");
        thePc.getMonitor().drawPixelAt(1500, 1200, "red");


        //case
        // monitor
        //motherboard
    }
}
