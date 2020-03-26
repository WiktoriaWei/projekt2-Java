package projekt2;

import java.util.Date;

public class Płyty extends Daneproduktu{
    String rodzaj;

    public Płyty(Date wydanie, String autor, String wydawnictwo, int cena, String tytul, String rodzaj)
    {
        super(wydanie, autor, wydawnictwo, cena, tytul);
        this.rodzaj = rodzaj;
    }
}
