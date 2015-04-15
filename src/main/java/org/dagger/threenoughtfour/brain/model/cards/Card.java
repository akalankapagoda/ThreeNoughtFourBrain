package org.dagger.threenoughtfour.brain.model.cards;

/**
 * Created by Akalanka on 4/15/15.
 */
public class Card {

    private Suit suit;

    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

}
