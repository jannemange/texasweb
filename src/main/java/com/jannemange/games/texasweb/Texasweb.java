package com.jannemange.games.texasweb;

public class Texasweb {
	
	static CardDeck deck = new CardDeck();
	
	public static String getCard() {
		Card card = deck.pop();
//		return(52-deck.getSize() + " " + card.getRank() + " of " + card.getSuit() + " " + deck.getSize());
		return(card.getRank() + " of " + card.getSuit() + " " + deck.getSize());

	}

	public static Boolean ShuffleDeck() {
		deck.Shuffle();
		return true;
	}

}

