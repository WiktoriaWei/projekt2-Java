package projekt2;

import java.util.Date;
import java.util.UUID;

public class Daneproduktu {

        UUID ID; //zmienna UUID reprezentuje 128-bitową wartość, która jest unikalna, zapisana szesnastkowo
        Date wydanie;
        String autor;
        String wydawnictwo;
        int cena;
        String tytul;
        Date datawydania;
        boolean Wypozyczony;
        public Daneproduktu(Date wydanie, String autor, String wydawnictwo, int cena, String tytul)
        {
            this.ID = UUID.randomUUID(); //deklaruje losowe ID
            this.wydanie = wydanie;
            this.autor = autor;
            this.wydawnictwo = wydawnictwo;
            this.cena = cena;
            this.tytul = tytul;
        }
    public void wyp() //nadaje status wypozyczenia oraz date
    {
        if (this.Wypozyczony)
        {
            System.out.println("Wypozyczone:" + this.tytul);
        } else {
            this.Wypozyczony = true;
            this.datawydania = new Date();
        }
    }
    public void zwrot()  ////nadaje status zwrot oraz date
    {
        if (this.Wypozyczony)
        {
            this.Wypozyczony = false;
        }
        else {
            System.out.println("Zwrocona:" + this.tytul);
        }
    }

    public UUID getID() //zwraca ID
    {
        return this.ID;
    }


    public void informacje() //wyswietla podstawowe dane o produkcie
    {
        System.out.println("tytuł: "+this.tytul+"\n"+"wydanie: "+this.wydanie+"\n" +"autor:  " +this.autor+"\n"+ "wydawnictwo: "+ this.wydawnictwo+"\n"+"cena: "+ this.cena );
    }
}
