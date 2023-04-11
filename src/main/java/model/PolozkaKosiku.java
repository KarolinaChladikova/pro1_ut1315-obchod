package model;

public class PolozkaKosiku {
    private Zbozi zbozi;
    private int pocet;

    public Zbozi getZbozi() {
        return zbozi;
    }

    public int getPocet() {
        return pocet;
    }

    public void setZbozi(Zbozi zbozi) {
        this.zbozi = zbozi;
    }

    public void setPocet(int pocet) {
        this.pocet = pocet;
    }

    public PolozkaKosiku(Zbozi zbozi, int pocet) {
        this.zbozi = zbozi;
        this.pocet = pocet;
    }

    public void zvysit() {
        ++pocet;
    }

    public void snizit() {
        --pocet;
    }
}
