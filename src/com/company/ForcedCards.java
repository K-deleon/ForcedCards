package com.company;

import java.util.Scanner;

public class ForcedCards {

    private static int[] bestPlay(int[] deck) {
        int[] answer = new int[3];

        int findHigh[] = new int[deck.length-1];
        for (int i=0; i<numOfCards; i++) {
            cards[i] = sc.nextInt();
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfTestCases = sc.nextInt();

        for (int testCase=0; testCase < numOfTestCases; testCase++) {
            int numOfCards = sc.nextInt();
            int[] cards = new int[numOfCards];
            for (int i=0; i<numOfCards; i++) {
                cards[i] = sc.nextInt();
            }

            int[] results = bestPlay(cards);
            System.out.println(
                    "Start/Stop/Value: " +
                            results[0]+"/"+results[1]+"/"+results[2]
            );
        }

        sc.close();
    }



}
