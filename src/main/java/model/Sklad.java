package model;

import java.util.ArrayList;
import java.util.List;

public class Sklad {
    private List<Zbozi> seznamZbozi;

    public Sklad() {
        seznamZbozi = new ArrayList<>();
    }

    public void pridejZbozi(Zbozi zbozi) {
        seznamZbozi.add(zbozi);
    }

    public Zbozi getZbozi(int index) {
        return seznamZbozi.get(index);
    }

    public void smazatZbozi(int index) {
        seznamZbozi.remove(index);
    }

    public void smazVsechnoZbozi() {
        seznamZbozi.clear();
    }

}
