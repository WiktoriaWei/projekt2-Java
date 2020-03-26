package projekt2;
import java.util.Date;

public class Filmy extends Daneproduktu{
    int dlugosc;


    public Filmy(Date wydanie, String autor,String wydawnictwo, int cena, String tytul, int dlugosc)
    {
        super(wydanie, autor, wydawnictwo, cena, tytul);
        this.dlugosc = dlugosc;
    }
}

