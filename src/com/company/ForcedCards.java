package com.company;

import java.util.Scanner;

public class ForcedCards {

    private static int[] bestPlay(int[] deck) {
        int[] answer = new int[3];

        int recentTotal = 0;
        int previousTotal = 0;

        int start = 0;
        int end = 0;
        int total = 0;



        for (int i=0; i<deck.length; i++) { //goes through every card
            for (int j = deck.length; j > 0; j--){ //goes through each possibility of cards
                for(int k = 0; k < j; k++){  //finds total??
                    recentTotal = recentTotal + deck[k];
                    total = recentTotal;
                    System.out.println(total);
                    /*if (recentTotal > previousTotal) {
                        start = deck[j];
                        end = deck[k];
                        total = recentTotal;
                    }*/
                }
            }
        }

        answer[0]=start;
        answer[1]=end;
        answer[2]=total;
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
