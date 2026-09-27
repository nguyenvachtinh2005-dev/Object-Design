/*******************************************************************************
 * Solitaire
 * 
 * Copyright (C) 2025 by Martin P. Robillard
 * 
 * See: https://github.com/prmr/Solitaire
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see http://www.gnu.org/licenses/.
 *******************************************************************************/
package ca.mcgill.solitaire.cards;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a deck of 52 cards in random order.
 */
public class Deck {
	private CardStack aCards;

	/**
	 * Creates a new deck of 52 cards, shuffled.
	 */
	public Deck() {
		shuffle();
	}

	/**
	 * Reinitializes the deck with all 52 cards, and shuffles them.
	 */
	public void shuffle() {
		List<Card> cards = new ArrayList<>();
//		for (Suit suit : Suit.values()) {
//			for (Rank rank : Rank.values()) {
//				cards.add(Card.get(rank, suit));
//			}
//		}
		// Cách 1 em tắt/xóa colection
		//Collections.shuffle(cards);
		
		// cách 2 em xếp mặt định các lá bài
		cards.add(Card.get(Rank.ACE, Suit.CLUBS));
		cards.add(Card.get(Rank.TWO, Suit.CLUBS));
		cards.add(Card.get(Rank.THREE, Suit.CLUBS));
		cards.add(Card.get(Rank.FOUR, Suit.CLUBS));
		cards.add(Card.get(Rank.FIVE, Suit.CLUBS));
		cards.add(Card.get(Rank.SIX, Suit.CLUBS));
		cards.add(Card.get(Rank.SEVEN, Suit.CLUBS));
		cards.add(Card.get(Rank.EIGHT, Suit.CLUBS));
		cards.add(Card.get(Rank.NINE, Suit.CLUBS));
		cards.add(Card.get(Rank.TEN, Suit.CLUBS));
		cards.add(Card.get(Rank.JACK, Suit.CLUBS));
		cards.add(Card.get(Rank.QUEEN, Suit.CLUBS));
		cards.add(Card.get(Rank.KING, Suit.CLUBS));

		cards.add(Card.get(Rank.ACE, Suit.DIAMONDS));
		cards.add(Card.get(Rank.TWO, Suit.DIAMONDS));
		cards.add(Card.get(Rank.THREE, Suit.DIAMONDS));
		cards.add(Card.get(Rank.FOUR, Suit.DIAMONDS));
		cards.add(Card.get(Rank.FIVE, Suit.DIAMONDS));
		cards.add(Card.get(Rank.SIX, Suit.DIAMONDS));
		cards.add(Card.get(Rank.SEVEN, Suit.DIAMONDS));
		cards.add(Card.get(Rank.EIGHT, Suit.DIAMONDS));
		cards.add(Card.get(Rank.NINE, Suit.DIAMONDS));
		cards.add(Card.get(Rank.TEN, Suit.DIAMONDS));
		cards.add(Card.get(Rank.JACK, Suit.DIAMONDS));
		cards.add(Card.get(Rank.QUEEN, Suit.DIAMONDS));
		cards.add(Card.get(Rank.KING, Suit.DIAMONDS));

		cards.add(Card.get(Rank.ACE, Suit.HEARTS));
		cards.add(Card.get(Rank.TWO, Suit.HEARTS));
		cards.add(Card.get(Rank.THREE, Suit.HEARTS));
		cards.add(Card.get(Rank.FOUR, Suit.HEARTS));
		cards.add(Card.get(Rank.FIVE, Suit.HEARTS));
		cards.add(Card.get(Rank.SIX, Suit.HEARTS));
		cards.add(Card.get(Rank.SEVEN, Suit.HEARTS));
		cards.add(Card.get(Rank.EIGHT, Suit.HEARTS));
		cards.add(Card.get(Rank.NINE, Suit.HEARTS));
		cards.add(Card.get(Rank.TEN, Suit.HEARTS));
		cards.add(Card.get(Rank.JACK, Suit.HEARTS));
		cards.add(Card.get(Rank.QUEEN, Suit.HEARTS));
		cards.add(Card.get(Rank.KING, Suit.HEARTS));

		cards.add(Card.get(Rank.ACE, Suit.SPADES));
		cards.add(Card.get(Rank.TWO, Suit.SPADES));
		cards.add(Card.get(Rank.THREE, Suit.SPADES));
		cards.add(Card.get(Rank.FOUR, Suit.SPADES));
		cards.add(Card.get(Rank.FIVE, Suit.SPADES));
		cards.add(Card.get(Rank.SIX, Suit.SPADES));
		cards.add(Card.get(Rank.SEVEN, Suit.SPADES));
		cards.add(Card.get(Rank.EIGHT, Suit.SPADES));
		cards.add(Card.get(Rank.NINE, Suit.SPADES));
		cards.add(Card.get(Rank.TEN, Suit.SPADES));
		cards.add(Card.get(Rank.JACK, Suit.SPADES));
		cards.add(Card.get(Rank.QUEEN, Suit.SPADES));
		cards.add(Card.get(Rank.KING, Suit.SPADES));
		aCards = new CardStack(cards);
	}

	/**
	 * Places pCard on top of the deck.
	 * 
	 * @param pCard The card to place on top of the deck.
	 * @pre pCard !=null
	 */
	public void push(Card pCard) {
		assert pCard != null;
		aCards.push(pCard);
	}

	/**
	 * Draws a card from the deck and removes the card from the deck.
	 * 
	 * @return The card drawn.
	 * @pre !isEmpty()
	 */
	public Card draw() {
		assert !isEmpty();
		return aCards.pop();
	}

	/**
	 * @return True iff there are no cards in the deck.
	 */
	public boolean isEmpty() {
		return aCards.isEmpty();
	}
}