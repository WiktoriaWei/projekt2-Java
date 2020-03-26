package projekt2;

import java.util.Date;


public class start {
    public static void main(String[] args)  throws Exception {
        Wypożyczalnia wei = new Wypożyczalnia();
        Płyty mf = new Płyty(new Date(01,01,01), "Thomas Bergersen", "TSFH", 50, "SkyWorld" , "muzyka filmowa");
        Książki fantasy = new Książki(new Date(02,02,02), "Tolkien", " W ", 100, "Silmarillion", 312);
        Filmy MARVEL = new Filmy(new Date(03,03,03),"Russo", "Disney", 54, "Avengers", 130);
        Ebooki prog = new Ebooki(new Date(04,04,04),"Deitel Paul","Helion",160,"Programowanie w Javie",40);
        Audiobooki bajki = new Audiobooki(new Date(05,05,05),"Philip Pullman","Albatros",32,"Basnie braci Grimm","Czubowna");
        wei.addDaneproduktu(fantasy); //deklaruje i dodaje dane o produktach
        wei.addDaneproduktu(mf);
        wei.addDaneproduktu(MARVEL);
        wei.addDaneproduktu(prog);
        wei.addDaneproduktu(bajki);
        System.out.println("zasoby wypożyczalni:");
        MARVEL.informacje(); //wyswietlam te dane
        fantasy.informacje();
        mf.informacje();
        prog.informacje();
        bajki.informacje();

        Klient W = new Klient("Wiktoria", "Weichbrodt", "Wroclaw", 21);
        wei.addUzytkownik(W);
        Klient J = new Klient("Jan", "Kowalski", "Warszawa", 34);
        wei.addUzytkownik(J); //deklaruje i dodaje dane klientow
        long dw= wei.wyp(W.getID(), mf.getID()); //nadaje date wypozyczeniu
        wei.wyp(W.getID(), prog.getID());//na przykladzie ebooka
        Thread.sleep(1000);
        long dz= wei.zwrot(W.getID(), prog.getID()); //nadaje date zwrotu
        System.out.println(wei.zaplata( dw,dz)); //wyswietlam kwote do zaplaty
    }
}