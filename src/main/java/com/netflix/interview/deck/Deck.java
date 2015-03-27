package com.netflix.interview.deck;

import java.util.List;

public class Deck {
    
	// implement the Deck and supporting classes
    
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
        deck.printDeck();
        System.out.println("===== end of shuffled deck");
        
        // sort deck first by SUIT (CLUB, DIAMOND, HEART, SPADE) and
        // then by RANK (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, K, Q, A)
        deck.sort();
        
        // print the deck for debugging, should be ordered now
        System.out.println("===== start of ordered deck");
        deck.printDeck();
        System.out.println("===== end of ordered deck");
    }
}
