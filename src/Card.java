import javax.swing.*;

/**
 * @author Michael Servilla
 * @version date 2016-11-20
 */
public class Card {

    public Card(Rank rank, Suit suit){

    }

    /**
     *
     * @return Returns the rank of this card: one of ACE through KING.
     */
    public Rank getRank(){
        return null;
    }

    /**
     *
     * @return Returns the suit of this card, one of CLUBS, SPADES, HEARTS,
     * or DIAMONDS.
     */
    public Suit getSuit(){
        return null;
    }

    /**
     *
     * @return Returns true if the card is face-up, false if not.
     */
    public boolean isFaceUp(){
        return false;
    }

    /**
     *
     * @return Returns true if the card is black, false if not.
     * Note: clubs and spades are black, hearts and diamonds are red.
     */
    public boolean isBlack(){
        return false;
    }

    /**
     * Sets the face-up status of the card.
     * @param faceUp
     */
    public void setFaceUp(boolean faceUp){

    }
}
