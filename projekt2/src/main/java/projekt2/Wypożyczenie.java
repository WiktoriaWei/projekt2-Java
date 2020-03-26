package projekt2;

import java.util.Date;
import java.util.UUID;

    public class Wypożyczenie {
        private long borrowData; //przepraszam za zmienne w róznych językach, ale już mi brakowało pomysłów
        private UUID IDproduktu;
        private UUID IDuzytkownika;


        public Wypożyczenie(UUID IDproduktu,UUID IDuzytkownika, long borrowData)
        {
            this.borrowData = borrowData;
            this.IDproduktu = IDproduktu;
            this.IDuzytkownika = IDuzytkownika;
        }

        public long getBorrowData()
        {
            return borrowData;
        }

       public UUID getIDproduktu()
       {
           return IDproduktu;
       }

       public UUID getIDuzytkownika()
        {
            return IDuzytkownika;
        }
    }

