/**
 * BlackJack
 */
import java.util.Scanner;
public class BlackJack {

    public static void main(String[] args) throws InterruptedException {
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);

        boolean playing = true;

        while(playing){

            int playerTot = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
            int houseTot = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
            
            while(playerTot <= 21){
                Thread.sleep(300);
                System.out.println("player is showing " + playerTot);
                System.out.println("the house is showing " + houseTot + "\n");

                Thread.sleep(300);
                
                System.out.println("Would you like to hit or stand? \n1 for hit, 0 for stand\n");
                String choice = scnr.next();
                Thread.sleep(300);

                if (choice.equals("0") ){
                    break;
                
                }else if(choice.equals("1")){

                    Card nextCard = deck.drawCard();
                    System.out.println("player draws the " + nextCard.declareCard());
                    playerTot += nextCard.getValue(true);
                    Thread.sleep(300);
                
                }else{
                    System.out.println("not an option, try again");
                }
            
            }
            if (playerTot > 21){
                
                System.out.println("The player has busted!");
                Thread.sleep(300);
                
            }else{

                System.out.println("\nthe player stands with " + playerTot + " points");
                System.out.println("the house will play next\n");
                Thread.sleep(300);

                while (houseTot < 17){
                    Card nextCard = deck.drawCard();
                    System.out.println("house draws the " + nextCard.declareCard());
                    houseTot += nextCard.getValue(true);
                    Thread.sleep(300);
                }
                
                System.out.println("the house stands with " + houseTot + " points\n");
                Thread.sleep(300);

                if (houseTot > 21){
                
                    System.out.println("The house has busted!\nplayer wins!");
                
                }else if(playerTot > houseTot){

                    System.out.println("player wins!");

                }else if(houseTot > playerTot){

                    System.out.println("player wins!");

                }else if(houseTot == playerTot){

                    System.out.println("tie");

                }

            }
            Thread.sleep(300);
            System.out.println("do you want to play again? 1 for yes, 0 for no");
            String playerResponse = scnr.next();
            if(!playerResponse.equals("1")){
                playing = false;
            }

        }

        scnr.close();
    }
}