package de.gfn.kursProjekte.rechner;

public class BinaerHexaRechnerTest {
    public static void main(String[] args) {
        BinaerRechner.addBinaer(0b111, 0b110); // 7 + 6 expected output 1101
        BinaerRechner.subtractBinaer(111, 110); // 7 - 6 expected output 1
        BinaerRechner.divideBinaer(110, 10);   // 6/ 2 expected output 11
        BinaerRechner.productBinaer(111, 110);  // 7*6 expected output 101010
       HexaRechner.addHexa(0x0b10001, 0x0b0001);
    }

//decode methode andere zahlensysteme aus string zu lesen
}



