package projekt2;

import java.util.Date;

public class Ebooki  extends Daneproduktu{
    int wielkosc;

    public Ebooki(Date wydanie, String autor, String wydawnictwo, int cena, String tytul, int wielkosc)
    {
        super(wydanie, autor, wydawnictwo, cena, tytul);
        this.wielkosc = wielkosc;
    }
}
