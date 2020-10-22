package oop;

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 29/09/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class Animal {

    public static int count = 0;
    float varsta;
    private int picioare;
    private int cap;
    private String culoare;
    private boolean carnivor;

    public Animal() {
        count++; // adaugam +1 la count
    }

    public Animal(int picioare) {
        this.picioare = picioare;
    }

    public Animal(int picioare, int cap, String culoare, boolean carnivor, float varsta) {
        this.picioare = picioare;
        this.cap = cap;
        this.culoare = culoare;
        this.carnivor = carnivor;
        this.varsta = varsta;
    }


    public int getPicioare() {
        return picioare;
    }

    public void setPicioare(int picioare) {
        this.picioare = picioare;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean isCarnivor() {
        return carnivor;
    }

    public void setCarnivor(boolean carnivor) {
        this.carnivor = carnivor;
    }

    public float getVarsta() {
        return varsta;
    }

    public void setVarsta(float varsta) {
        if (varsta < 0) {
            System.out.println("Nu exista varta");
        } else if (varsta > 60) {
            System.out.println("Animalul nu traieste 60 de ani ");
        } else if (varsta > 0 && varsta <= 60) {
            this.varsta = varsta;
        }
    }
}
