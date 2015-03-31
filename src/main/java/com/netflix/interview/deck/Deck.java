package com.netflix.interview.deck;

import java.util.List;

public class Deck {
    
    // Implement the Deck and supporting classes considering OO design
    // using hints in the main method below.  You are free to design
    // the Deck and Cards as you see fit and rework main if required.
    //
    // For those who are not familar with Cards and Decks:
    //
    //   Cards have two properties - Suit and Rank
    //
    //     Suit is the shape of the symbol on the card and there
    //     are four symbols - Club, Diamond, Heart, Spade.
    //
    //     Rank is the "number" on the card.  Numbers start at
    //     2 and go through 10 and then go through special cards
    //     of Jack (11), Queen (12), King (13), Ace (14).
    //
    //     If it helps you, you could simplify this down to
    //     ranks of 1 through 13 with each of these ranks in
    //     four colors - once in red, once in blue, once in green,
    //     and once in black
    //
    //     Therefore, there are 4 * 13 = 52 Unique Cards 
    //
    //  Decks are simply a collection of these 52 unique cards
    //
    //     Card (2, Clubs), Card (2, Diamonds), Card (2, Hearts), Card (2, Spades)
    //     Card (3, Clubs), Card (3, Diamonds), Card (3, Hearts), Card (3, Spades)
    //     ... 4, 5, 6, 7, 8, 9, 10, Jack, Queen
    //     Card (King, Clubs), Card (King, Diamonds), Card (King, Hearts), Card (King, Spades)
    //     Card (Ace, Clubs), Card (Ace, Diamonds), Card (Ace, Hearts), Card (Ace, Spades)
    //
    //     or simplified using 1-13 and colors (if you choose):
    //
    //     Card (1, Green), Card (1, Blue), Card (1, Red), Card (1, Black)
    //     So Card (2, Green), Card (2, Blue), Card (2, Red), Card (2, Black)
    //     ... 3, 4, 5, 6, 7, 8, 9, 10, 11
    //     So Card (12, Green), Card (12, Blue), Card (12, Red), Card (12, Black)
    //     So Card (13, Green), Card (13, Blue), Card (13, Red), Card (13, Black)

 
    public static void main(String args[]) {
        // create a new Deck of 52 cards
        Deck deck = new Deck();
        
        // return a list of the contained cards
        List<Card> cards = deck.getCards();
        
        // are the first and last card equal (likely not!)
        System.out.println("are the card equal, " + cards.get(0).equals(cards.get(51)));
        
        // shuffle the deck of cards
        deck.shuffle();
        
        // print the deck for debugging, should be random
        System.out.println("===== start of shuffled deck");
        deck.printDeck(); // printDeck can be done in any way that shows cards
        System.out.println("===== end of shuffled deck");
        
        // sort deck first by SUIT (CLUB, DIAMOND, HEART, SPADE) and
        // then by RANK (2, 3, 4, 5, 6, 7, 8, 9, 10, J, K, Q, A)
        deck.sort();
        
        // print the deck for debugging, should be ordered now
        System.out.println("===== start of ordered deck");
        deck.printDeck();
        System.out.println("===== end of ordered deck");
    }
}
