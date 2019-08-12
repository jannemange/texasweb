package com.jannemange.games.texasweb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDeck {
	private List<Card> cards;
	private Random random;

	public CardDeck() {
		this(new Random());
	}

	public CardDeck(Random random) {
		this.random = random;
		createCardDeck();
	}

	private void createCardDeck() {
		cards = new ArrayList<Card>();
		for (CardSuit suit : CardSuit.values()) {
			for (CardRank rank : CardRank.values()) {
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	public void ShuffleCardDeck() {
		cards.clear();
		for (CardSuit suit : CardSuit.values()) {
			for (CardRank rank : CardRank.values()) {
				cards.add(new Card(suit, rank));
			}
		}
	}
	

	public Card pop() {
		return cards.remove(random.nextInt(cards.size()));
	}

	public int getSize() {
		return cards.size();
	}
	
	public Boolean Shuffle() {
		cards.clear();
		for (CardSuit suit : CardSuit.values()) {
			for (CardRank rank : CardRank.values()) {
				cards.add(new Card(suit, rank));
			}
		}
		return true;
	}


}
