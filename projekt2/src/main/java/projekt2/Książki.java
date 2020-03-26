package projekt2;

import java.util.Date;

public class Książki extends Daneproduktu{
    int iloscstron;

    public Książki(Date wydanie, String autor, String wydawnictwo, int cena, String tytul, int iloscstron)
    {
        super(wydanie, autor, wydawnictwo, cena, tytul);
        this.iloscstron = iloscstron;
    }
}
