package model;

import java.util.ArrayList;
import java.util.List;

public class Kosik {
    private List<PolozkaKosiku> seznamPolozek;

    public Kosik() {
        seznamPolozek = new ArrayList<>();
    }

    public void pridej(Zbozi zbozi) {
        // TODO: ošetřit, aby se nepřidalo 2x jedno stejné zboží (samo si to najde a zvýší počet nebo nedovolí,
        //  aby šlo zboží znovu přidat), např aby pod sebou nebyl 1x rohlík a 1x rohlík, ale aby se k prvnímu rohlíku
        //  přidal ten druhý
        seznamPolozek.add(new PolozkaKosiku(zbozi, 1));
    }

    public void odeber(int index) {
        seznamPolozek.remove(index);
    }

    public void zvysit(int index) {
        // TODO: ošetřit, aby nešel zvýšit počet, na vyšší číslo, než je počet na skaldu (jestliže je 10 produktů na skladu,
        //  nemůže být v košíku více než 10
        seznamPolozek.get(index).zvysit();
    }

    public void snizit(int index) {
        // TODO: ošetřit, aby počet nešel do záporných čísel, při 0 aby položka zmizela, popřípadě aby nebylo možné nechat číslo
        //  spadnout na nulu
        seznamPolozek.get(index).snizit();
    }
    public void vysypat() {
        seznamPolozek.clear();
    }
}
