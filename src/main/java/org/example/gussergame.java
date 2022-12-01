package org.example;

import java.util.Scanner;

class gusser {
     int gNum;
   final private Scanner sc = new Scanner(System.in);
    public void guesserNumber() //FETR00002
    {

        System.out.println("Take one Number in Mind");
        gNum = sc.nextInt();

    }
}

class player{
    int pNum;
    final private Scanner sc = new Scanner(System.in);//FETR00002
    public void pNumber()
    {

        System.out.println("Player Guess a Number");
        pNum = sc.nextInt();

    }
}


class umpire {
    private int numFromGusser;
    private int numFromPlayer1;
    private int numFromPlayer2;
    private int numFromPlayer3;

    public void collectNumbers()
    {
        gusser g = new gusser();
        g.guesserNumber();
        numFromGusser = g.gNum;
        player p1 = new player();
        p1.pNumber();
        numFromPlayer1 = p1.pNum;
        player p2 = new player();
        p2.pNumber();
        numFromPlayer2 = p2.pNum;
        player p3 = new player();
        p3.pNumber();
        numFromPlayer3 = p3.pNum;


    }

    public void result()
    {
        if (numFromPlayer1==numFromGusser)
        {
            if (numFromPlayer2==numFromPlayer1 && numFromPlayer3==numFromGusser)
                System.out.println("All Players Won!!!");
            else if (numFromPlayer2==numFromPlayer1) {
                System.out.println("Player 1 & 2 Won!!!");
            }
            else System.out.println("Player 1 Won!!!");
        }
        else if (numFromPlayer2==numFromGusser)
        {
            if (numFromPlayer3==numFromPlayer2)
                System.out.println("Player 2 & 3 Won!!!");
            else System.out.println("Player 2 Won!!!");
        }
        else if (numFromPlayer3==numFromGusser)
        {
            System.out.println("Player 3 Won!!!");
        }
        else System.out.println("All Players failed!"); //FETR00001

    }
}
public class gussergame {
    public static void main(String[] args) {
        umpire u = new umpire();
        u.collectNumbers();
        u.result();


    }
}
