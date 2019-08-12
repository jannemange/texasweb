package com.jannemange.games.texasweb;

import java.io.Serializable;

public class Card {

	private CardSuit suit;
	private CardRank rank;
	
	public Card(CardSuit suit, CardRank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public CardSuit getSuit() {
		return suit;
	}
	
	public CardRank getRank() {
		return rank;
	}
}
