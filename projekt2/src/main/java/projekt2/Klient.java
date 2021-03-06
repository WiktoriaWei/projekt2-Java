package projekt2;

import java.util.Date;
import java.util.UUID;
import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String adres;
    private int wiek;
    private Date datazapisu;
    private UUID ID;

    public ArrayList<Wypożyczenie> getWypozyczone()
    {
        return wypozyczone;
    }

    private ArrayList<Wypożyczenie> wypozyczone;

    public Klient(String imie, String nazwisko, String adres, int wiek)
    {
        ID = UUID.randomUUID();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wiek = wiek;
        datazapisu = new Date();
        wypozyczone = new ArrayList<>();

    }

    public void wyp(UUID IDproduktu, long date) //metoda dodaje nowe wypozyczenie do listy
    {
        wypozyczone.add(new Wypożyczenie( IDproduktu, ID, date));
    }

    public void zwrot(UUID IDproduktu) //metoda usuwa wypozyczenie z listy
    {
        for( Wypożyczenie element: wypozyczone)
        if(element.getIDproduktu() == IDproduktu) //ten element podpowiedziala java
        {
            wypozyczone.remove(IDproduktu);
        }
    }

    public UUID getID()
    {
        return ID;
    }

    Wypożyczenie getWypozyczenie(UUID IDproduktu) //nadaje status do zwrotu ksiazce wypozyczonej
    {
        Wypożyczenie dozwrotu = null;
        for (Wypożyczenie wyp : wypozyczone)
        {
            if (IDproduktu == wyp.getIDproduktu())
            {
                dozwrotu = wyp;
            }
        }
        return dozwrotu;
    }

    boolean dlug(Wypożyczalnia wypożyczalnia) //sprawdza czy klient ma dlug
    {
        for (Wypożyczenie wyp : wypozyczone)
        {
            if (wypożyczalnia.zaplata(wyp.getBorrowData(), wypożyczalnia.getCurrentDate()) > 0.f)
            {
                return true;
            }
        }
        return false;
    }
}