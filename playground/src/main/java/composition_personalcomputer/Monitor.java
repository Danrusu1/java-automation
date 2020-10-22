package composition_personalcomputer;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 13/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Monitor {
    private final String model;
    private final String manufacturer;
    private final int size;
    private final Resolution resolution;

    public Monitor(String model, String manufacturer, int size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }
}
