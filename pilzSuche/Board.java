package de.gfn.kursProjekte.pilzSuche;

public class Board {
    //Instanzvariable deklarieren
    private String[][] gameField;


    //Klasenkonstruktur für flexible Spielfeldgröße
    public Board(int size) {
        gameField = new String[size][size];
    }

    //Klassenkonstruktir für feste Spielfeldgröße 10*10
    public Board() {
        gameField = new String[10][10];
    }

    public String[][] getField(){
        return gameField;
    }
    public int generateRandomNumber(){
        int rn = (int) (Math.random() * 10);
        return rn;
    }

    public String[][] koordinateMushrooms() {
        int i = 0;
        int j = 0;
        normalMushrum:while (true) {
            //generiert eine Ganzzahl zwischen 0 und 9: random zwischen 0-1 exklusive 1; mal 10 zwischen 0-10 exk.10=>int 0-9
            int x = generateRandomNumber();
            int y = generateRandomNumber();
            gameField[x][y] = "x";
            i++;
            if( i == 7) break normalMushrum;
        }
            poisenMushroom: while(true){
                int x = generateRandomNumber(), y = generateRandomNumber();

                if(gameField[x][y] == null)  {
                    gameField[x][y] = "p";
                    j++;
                }
                if(j==3){
                    break poisenMushroom;
                }
            }

        return this.gameField;
        }

    public void printBoard(){
        for(String[] row: gameField){
            for(String cell: row){
                if(cell == null){
                    System.out.print(" . ");
                }else if(cell.equals("x")){
                    System.out.print(" § ");
                }else{
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }
}


