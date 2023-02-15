import java.util.Random;
public class Deck {
    Random rand = new Random();
    
    public Card drawCard(){
        String suit = null;
        int value = (rand.nextInt(13) + 1);
        int suitVal = (rand.nextInt(4) + 1);

        switch(suitVal) {
            case 1:
                suit = "Spades";
                break;
            case 2:
                suit = "Clubs";
                break;
            case 3:
                suit = "Hearts";
                break;
            case 4:
                suit = "Diamonds";
                break;
        }

    return new Card(value, suit);
    }
}
