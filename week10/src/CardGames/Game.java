package CardGames;

/**
 * Created by shuxford on 26/03/2016.
 */
public class Game {
    Deck d;
    Hand[] hands;
    String cardChanges = "";

    int scores[];

    final int NUMBER_OF_HANDS, CARDS_IN_A_HAND;
    int maxScore;

    //CONSTRUCTORS
    public Game(int initNumberOfHands, int initCardsInAHand){
        NUMBER_OF_HANDS = initNumberOfHands; //input parameter required in multiple methods
        CARDS_IN_A_HAND = initCardsInAHand; //input parameter required in multiple methods

        d = new Deck();
        d.fill(); d.shuffle();

        if (NUMBER_OF_HANDS * CARDS_IN_A_HAND <= d.getCardsLeft()) {
            hands = new Hand[NUMBER_OF_HANDS];

            for (int i = 0; i < NUMBER_OF_HANDS; i++) {
                hands[i] = new Hand(CARDS_IN_A_HAND);
            }
        }
    }

    //ACCESSORS
    //not required

    //MUTATORS
    //not required

    //OTHER METHODS
    public void play(){
        scores = new int[NUMBER_OF_HANDS]; //elements are auto=init to 0

        dealCards();

        processAHand();
        //GAME LOGIC

        //sum card values for each hand
        for (int i = 0; i < NUMBER_OF_HANDS; i++){

            for (int j = 0; j < CARDS_IN_A_HAND; j++){
                scores[i] += hands[i].getCard(j).getValue();
            }
        }

        //find max score
        maxScore = scores[0];
        for (int i = 1; i < scores.length; i++){
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
    }
    private void processAHand(){
        /*
        for each card in the hand passed
        if value <=7
            if Math.Random() <0.75
                deal a card
                accumulate class level report string on replacements
                replace card
         */
        for (int i = 0; i < NUMBER_OF_HANDS; i++) {
            for (int j = 0; j < CARDS_IN_A_HAND; j++) {
                if (hands[i].getCard(j).getValue() <= 7 && Math.random() <= 0.75) {
                    Card newCard = d.deal();

                    // Track changes to hand
                    cardChanges += "hand #" + i + " card #" + j + " " + hands[i].getCard(j).toString() ;
                    cardChanges += " replaced by " + newCard.toString();
                    cardChanges += " (score change " + (newCard.getValue() - hands[i].getCard(j).getValue()) + ")\n";
                    hands[i].acceptCardAt(newCard, j);
                }
            }
        }
        System.out.println(cardChanges);
    }

    private void dealCards(){
        for (int i = 0; i < NUMBER_OF_HANDS; i++){
            for (int j = 0; j < CARDS_IN_A_HAND; j++){
                hands[i].acceptCard(d.deal());
            }
        }
    }

    public String toString(){
        String retVal = "";

        for (int i = 0; i < NUMBER_OF_HANDS; i++){
            retVal += "\nHand #" + i + ", Score:" + scores[i] + "\n";
            retVal += hands[i].toString();
        }

        retVal += "\n\n";
        //allow for ties
        for (int i = 0; i < NUMBER_OF_HANDS; i++) {
            if (scores[i] == maxScore)
                retVal += "Hand #" + i + " wins with a score of " + maxScore + "\n";
        }

        return retVal;
    }
}
