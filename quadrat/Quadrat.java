package de.gfn.kursProjekte.quadrat;

    public class Quadrat{
        private int laenge = 0;
        private int breite = 0;
        private int hoehe = 0;

        public Quadrat(int laenge, int breite, int hoehe)
        {
            this.laenge = laenge;
            this.breite = breite;
            this.hoehe = hoehe;
        }


        public int getLaenge()
        {
            return laenge;
        }

        public void setLaenge(int laenge)
        {
            this.laenge = laenge;
        }

        public int getBreite()
        {
            return breite;
        }

        public void setBreite(int breite)
        {
            this.breite = breite;
        }

        public int getHoehe()
        {
            return hoehe;
        }

        public void setHoehe(int hoehe)
        {
            this.hoehe = hoehe;
        }

        public int getVolumen()
        {
            return this.laenge * this.breite * this.hoehe;
        }

        public int getSeitenLaenge()
        {
            return (this.laenge + this.breite + this.hoehe) * 4;
        }

        public int getOberflaeche()
        {
            //2·a·b+2·a·c+2·b·c
            return 2 * this.laenge * this.breite + 2 * this.laenge * this.hoehe + 2 * this.breite * this.hoehe;
        }

        @Override
        public String toString()
        {
            return "Quader{" +
                    "Laenge=" + laenge +
                    ", Breite=" + breite +
                    ", Hoehe=" + hoehe +
                    ", Volumen=" + getVolumen() +
                    ", Seitenlänge=" + getSeitenLaenge() +
                    ", Oberfläche=" + getOberflaeche() +
                    '}';
        }
    }


