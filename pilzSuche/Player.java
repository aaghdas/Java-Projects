package de.gfn.kursProjekte.pilzSuche;

import java.util.Scanner;

public class Player {

    private final Scanner scanner = new Scanner(System.in);
    private int[] guess;
    public Player() {
        this.guess = new int[2];
    }

    public int[] guessPosition() {
        System.out.println("gib die x Koordinate ein! Die Ganzzahlen zwischen 0 und 9 sind erlaubt");
        int x = scanner.nextInt();
        System.out.println("gib die y Koordinate ein! Die Ganzzahlen zwischen 0 und 9 sind erlaubt");
        int y = scanner.nextInt();
        guess[0] = x;
        guess[1] = y;
        return guess;
    }

    public int compare(int[] guess, String[][] gameField) {
        int countRoundWin = 0;
        loop:
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (gameField[guess[0]][guess[1]]==null) {
                    System.out.print("keine pilze hier :( ");
                    break loop;
                }
                else if (gameField[guess[0]][guess[1]].equals("x")) {

                    countRoundWin++;
                    System.out.println("du hast eine pilze gefunden :) ");
                    break loop;
                } else  {
                    countRoundWin--;
                    System.out.println("du hast eine giftige pilze gefunden ;(( ");
                    break loop;
                }
            }
        }
        /* Test for round result
        System.out.println(countWin);
        */
        return countRoundWin;
    }

    public void start() {
        int round = 0;
        int countTotalWin = 0;
        int countRoundWin = 0;
        int[] guess = new int[2];
        int restTry = 10;

        Board board = new Board();
        String[][] gameField =  board.koordinateMushrooms();
        board.printBoard();
        System.out.println();
        System.out.println("**************************************");
        System.out.println();


        while (round < 10) {
            guess = guessPosition();
            countRoundWin = compare(guess, gameField);
            if (countRoundWin == -1) {
                countTotalWin = countTotalWin + countRoundWin + 1;
                round = 10;

            } else {
                countTotalWin = countTotalWin + countRoundWin;
                round++;
                restTry = 10 - round;
                System.out.printf("Noch %d Versuche! \n", restTry);
            }
        }
        System.out.println("Game zu Ende!");
        System.out.printf("Du hast insgesamt %d Pilzen gefunden!", countTotalWin);

    }

    public void moreGames() {
        int gameCount =0;
        moreGame:while(true){
            if(gameCount == 0) {
                start();
                gameCount ++;
            }else{
                System.out.println("Möchtest du nochmal spielen? ja/nein");
                String input = scanner.next().toLowerCase().trim();
                switch (input) {
                    case "ja":
                        start();
                        gameCount++;
                        break;
                    case "nein":
                        break moreGame;
                }
            }

        }
    }
}






