/**
 * @author Michael Servilla
 * @version date 2016-11-20
 */
public class Card {

    private Rank rank;
    private Suit suit;
    private boolean faceUp = true;


    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;

    }

    /**
     *
     * @return Returns the rank of this card: one of ACE through KING.
     */
    public Rank getRank(){
        return this.rank;
    }

    /**
     *
     * @return Returns the suit of this card, one of CLUBS, SPADES, HEARTS,
     * or DIAMONDS.
     */
    public Suit getSuit(){
        return this.suit;
    }

    /**
     *
     * @return Returns true if the card is face-up, false if not.
     */
    public boolean isFaceUp(){
        if (this.faceUp){
            return true;
        }
        return false;
    }

    /**
     *
     * @return Returns true if the card is black, false if not.
     * Note: clubs and spades are black, hearts and diamonds are red.
     */
    public boolean isBlack(){
        if (this.suit == Suit.CLUBS || this.suit == Suit.SPADES){
            return true;
        }
        return false;
    }

    /**
     * Sets the face-up status of the card.
     * @param faceUp
     */
    public void setFaceUp(boolean faceUp){
        this.faceUp = faceUp;

    }
}
