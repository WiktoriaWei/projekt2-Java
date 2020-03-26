package projekt2;


import java.util.Date;

public class Audiobooki extends Daneproduktu
{
    String lektor;

    public Audiobooki(Date wydanie, String autor, String wydawnictwo, int cena, String tytul, String lektor)
    {
        super(wydanie, autor, wydawnictwo, cena, tytul);
        this.lektor = lektor;
    }
}