/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
// Name - Dev Dev 
// Student Number - 991733936
import javax.swing.JOptionPane;
import java.util.Random;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random num1 = new Random();
            int indx1 = num1.nextInt(13)+1;
            c.setValue(indx1);
            
            Random num2 = new Random();
            int indx2 = num2.nextInt(4);
            c.setSuit(Card.SUITS[indx2]);
            
            magicHand[i] = c;
            System.out.println(c.getSuit()+" "+c.getValue());
        }
        /* String value = JOptionPane.showInputDialog("Enter a Card value (1-13)");
        int realValue  = Integer.parseInt(value);
        
        String suit = JOptionPane.showInputDialog("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades)");
        int realSuit = Integer.parseInt(suit);
        
        boolean k = false;
        String [] arr = {"Hearts", "Diamonds", "Clubs", "Spades"}; // I made this array because the Static variable have different position for Clubs and Spades
        for (int i=0; i<magicHand.length;i++){
            if (realValue == magicHand[i].getValue() && arr[realSuit].equals(magicHand[i].getSuit()) ){
                System.out.println("Congratulations, Your Card is in the Magic Hand");
                k = true;
            }
        }
        if (k == false){
            System.out.println("Sorry, your card is not in the magic Hand");
        } */

        Card luckycard = new Card();
        luckycard.setValue(3);
        luckycard.setSuit("Diamonds");
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
