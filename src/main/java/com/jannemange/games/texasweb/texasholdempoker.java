package com.jannemange.games.texasweb;

public class texasholdempoker {
	
    public static void main( String[] args )
    {
    	CardDeck deck = new CardDeck();
    	for (int i = 0; i < 52; i++) {
        	Card card = deck.pop();
        	System.out.println(52-deck.getSize() + " " + card.getRank() + " of " + card.getSuit() );
    	}

    }

}
