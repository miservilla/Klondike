/**
 * @author Michael Servilla
 * @version date 2016-11-20
 */
public class Deck {

    private Card[] deck;
    private int numCards;

    public Deck(){
        int deckSize = 52;
        deck = new Card[deckSize];
        numCards = 0;



    }

    /**
     * Adds card to the top of this deck.
     * @param card
     */
    public void add(Card card){
        this.deck[numCards] = card;
        numCards++;

    }

    /**
     * Fills the deck with all the cards in a standard deck of cards.
     * The specific order does not matter as long as all the cards are there.
     *
     * You should not explicitly construct and add all 52 possible cards.
     * Use methods provided in the RANK and SUIT enums to examine all the
     * possible combinations.
     */
    public void fill(){

    }

    /**
     *
     * @param n
     * @return Returns the nth card in this deck, where card 0 is the one on the
     * bottom. Assumes the deck is not empty. Does not modify the deck.
     */
    public Card get(int n){
        return deck[n];
    }

    /**
     * Moves one card from the top of this deck to the top of the other deck.
     * @param other
     */
    public void move(Deck other){

    }

    /**
     * Moves the top n cards from the top of this deck to the top of the other
     * deck, maintaining their order so that the card that was on top of this
     * deck becomes the top card of the other deck.
     *
     * @param other
     * @param n
     */
    public void move(Deck other, int n){

    }

    /**
     *
     * @return Returns the number of cards in this deck.
     */
    public int size(){
        return numCards;
    }

    /**
     *
     * @return Returns the top card on this deck. Returns null if the deck is
     * empty. Does not modify the deck.
     */
    public Card getTop(){
        if (numCards > 0) {
            return deck[numCards - 1];
        } else return deck[numCards];
    }

    /**
     * Randomly reorders the cards in this deck. You may assume that this method
     * will only be called on a full deck of 52 cards if that makes it easier,
     * but ideally you would be able to correctly shuffle any non-empty deck.
     *
     * You may want to initially create this method with an empty body while you
     * work on the rest of the program.
     *
     * The instructors will not help you on this method. You must research
     * shuffling on your own. Even if you think you have a good idea how to do
     * this on your own, I recommend you at least do a quick Google search to
     * see how other folks have tackled the problem of shuffling an array.
     *
     * Mention in a comment in the method what source(s) you used when
     * researching shuffling algorithms. Include URLs for web pages, title and
     * author for books, names for people, etc.
     */
    public void shuffle(){

    }
}
