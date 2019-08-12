package com.jannemange.games.texasweb;

public class getcard {
	static CardDeck deck = new CardDeck();
	public static String show_card() {
			Card card = deck.pop();
			return(52-deck.getSize() + " " + card.getRank() + " of " + card.getSuit() + " " + deck.getSize());
        }
	}

