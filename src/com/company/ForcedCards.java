package com.company;

import java.util.Scanner;

public class ForcedCards {

    private static int[] bestPlay(int[] deck) {
        int[] answer = new int[3];
        int[] totalTotals = new int[1000];

        int recentTotal = 0;
        int previousTotal = 0;

        int start = 0;
        int end = 0;
        int total = 0;

        int weirdDivide = 1;


        /*for (int i = 0; i < deck.length; i++) { //start point
            end = i;
            for (int j = i; j < deck.length; j++) { //goes through every card after start point
                recentTotal = recentTotal + deck[j];
                for (int k = i + 1; k < deck.length; k++) {  //implement subtraction
                    recentTotal = recentTotal + deck[k];
                    if (k != 0) {
                        weirdDivide = (k + 2) * (k + 1); //goes through 14 times before repeating
                    }
                    //System.out.println(weirdDivide);
                    total = recentTotal;
                    //System.out.println(total);
                    if (recentTotal > previousTotal) {
                        start = 0;
                        //end = deck[k];

                        //total = recentTotal;
                        }
                    }
                }
            }*/

        start = 0;
        for (int k = start; k < deck.length; k++) {
            for (int j = start; j < deck.length; j++) {
                total = (recentTotal + deck[j]);
                totalTotals[k] = total;
            }
        }
            total = recentTotal/(deck.length);
            answer[0] = start;
            answer[1] = end;
            answer[2] = total;
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
